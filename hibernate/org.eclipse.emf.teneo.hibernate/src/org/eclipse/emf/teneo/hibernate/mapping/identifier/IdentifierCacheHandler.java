/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * IdentifierCacheHandler.getInstance().java,v 1.5 2007/02/08 23:11:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.identifier;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Implements two maps for caching identifier and version information. Internally uses
 * weakreferences and periodic purge actions to clean the maps.
 * <p>
 * Because of memory leaks this class has been extended by supporting the EObject case:
 * When the Key of the idMap is an EObject (that has no equals() method by design), each
 * time a new version of this object is being added to this map, it is being added as a
 * second entry (and it does not overwrite the old entry). This behavior has caused massive
 * memory leaks - so in order to fix that, IdentifierCacheHandler.Key#equals and
 * IdentifierCacheHandler.Key#hashcode have been modified. Right now when the Key is an
 * EObject and it has the 'id' attribute (which represents the database id), the uniqueness
 * of the Key is being based on this id and the name of the given EObject. Thanks to it, we
 * no longer have duplicates in the idMap.
 *
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.21 $
 */
public class IdentifierCacheHandler {

	private static final Log LOG = LogFactory.getLog(IdentifierCacheHandler.class);

	private static final int DEFAULT_PURGING_PERIOD = 60;
	private static final String PURGING_PROPERTY = "org.eclipse.teneo.hibernate.identifierPurgingPeriod";
	private static final int PURGING_PERIOD = Integer.parseInt(System.getProperty(PURGING_PROPERTY,
			"" + DEFAULT_PURGING_PERIOD));
	private static final String ID_FEATURE_NAME = "id";

	private static final IdentifierCacheHandler INSTANCE = new IdentifierCacheHandler();

	private Map<Key, Object> idMap = new ConcurrentHashMap<Key, Object>();
	private Map<Key, Object> versionMap = new ConcurrentHashMap<Key, Object>();

	private IdentifierCacheCleaningRunnable idCacheCleaner;
	private IdentifierCacheCleaningRunnable versionCacheCleaner;

	public static IdentifierCacheHandler getInstance() {
		return INSTANCE;
	}

	private IdentifierCacheHandler() {
		// private to prevent instantiation
		startPurgingThreads();
	}

	private void startPurgingThreads() {
		idCacheCleaner = startPurgingThread(idMap, "teneoHibernateIdMapPurging", PURGING_PERIOD,
				PURGING_PERIOD);
		versionCacheCleaner = startPurgingThread(versionMap, "teneoHibernateVersionMapPurging",
				PURGING_PERIOD / 2,
				PURGING_PERIOD);
		LOG.info("Started teneo purging threads with period " + PURGING_PERIOD);
	}

	private IdentifierCacheCleaningRunnable startPurgingThread(Map<Key, Object> map, String name, int initialDelay, int period) {
		ScheduledExecutorService ex = Executors.newSingleThreadScheduledExecutor(new LoggingThreadFactory(name));
		final IdentifierCacheCleaningRunnable runnable = new IdentifierCacheCleaningRunnable(map, name);
		ex.scheduleAtFixedRate(runnable, initialDelay, period,
				TimeUnit.SECONDS);
		return runnable;
	}

	/** Clear the identifier cache */
	public void clear() {
		idMap.clear();
		versionMap.clear();
	}

	public Map<Key, Object> getIdMap() {
		return idMap;
	}

	public Map<Key, Object> getVersionMap() {
		return versionMap;
	}

	/** Get an identifier from the cache */
	public Object getID(Object obj) {
		final Object id = idMap.get(createIdMapKey(obj));
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("ID for object " + obj.getClass().getName() + " not found in id cache");
			}
			return null;
		}
		if (id instanceof WeakReference<?>) {
			return ((WeakReference<?>) id).get();
		}
		return id;
	}

	/** In case the object is an EObject, we look for its id and use the Key constructor that
	 * supports the id attribute. */
	private Key createIdMapKey(Object obj) {
		if (obj instanceof EObject) {
			EObject eObject = (EObject) obj;
			EStructuralFeature idFeature = eObject.eClass().getEStructuralFeature(ID_FEATURE_NAME);

			if (idFeature != null) {
				Object idValue = eObject.eGet(idFeature);
				if (idValue != null) {
					return new Key(obj, idValue);
				}
			}
		}
		return new Key(obj);
	}

	/** Set an identifier in the cache */
	public void setID(Object obj, Object id) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Setting id: " + id + " for object " + obj.getClass().getName() + " in idcache ");
		}

		Key key = new Key(obj, id);
		if (id == null) { // actually a remove of the id
			idMap.remove(key);
		} else if (useWeakReference(id)) {
			idMap.put(key, new WeakReference<Object>(id));
		} else {
			// since java.util.concurrent.ConcurrentHashMap.putVal method changes only the value,
			// and in our case the key can be changed (e.g. the key is an EObject and one its
			// attribute has been changed - but its id remains the same), we not only have to use the
			// java.util.Map.put method, but also remove the given entry - so that we have a new
			// version of the EObject as the key
			idMap.remove(key);
			idMap.put(key, id);
		}

		// also set the id in the resource
		// disabled for now
		// if (false && obj instanceof EObject) {
		// final EObject eobj = (EObject) obj;
		// final Resource res = eobj.eResource();
		// if (res != null && res instanceof XMLResource) {
		// if (log.isDebugEnabled()) {
		// log.debug("Setting id " + id.toString() + " in resource " +
		// res.getClass().getName());
		// }
		// ((XMLResource) res).setID(eobj, id.toString());
		// }
		// }
	}

	/** Gets a version from the cache */
	public Object getVersion(Object obj) {
		final Object version = versionMap.get(new Key(obj));
		if (version == null) {
			return version;
		}
		return version;
	}

	private boolean useWeakReference(Object id) {
		if (Number.class.isAssignableFrom(id.getClass())) {
			return false;
		}
		if (String.class.isAssignableFrom(id.getClass())) {
			return false;
		}
		return true;
	}

	/** Sets a version in the cache */
	public void setVersion(Object obj, Object version) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Setting version: " + version + " for object " + obj.getClass().getName()
					+ " in idcache ");
		}
		if (version == null) {
			versionMap.remove(new Key(obj));
		} else {
			versionMap.put(new Key(obj), version);
		}
	}

	/** Dumps the idmap */
	public void dumpID() {
		dumpContents(idMap);
	}

	/** Dumps the content of the passed map */
	private void dumpContents(Map<Key, Object> map) {
		Iterator<Key> it = map.keySet().iterator();
		while (it.hasNext()) {
			Key key = it.next();
			key.weakRef.get();
		}
	}

	/**
	 * Own implementation of the key in the hashmap to override the equals method. Equality for this
	 * cache is real memory location equality
	 */

	protected static class Key {
		/** The real object as a weakreference */
		private final WeakReference<Object> weakRef;

		/** The hashcode of the stored object */
		private final int hashcode;

		/** The id of the stored object */
		private Object id;

		/** Constructor, used when storing entries in the versionMap */
		Key(Object keyObject) {
			weakRef = new WeakReference<Object>(keyObject);
			hashcode = keyObject.hashCode();
		}

		/** Constructor, used for storing entries in the idMap */
		Key(Object keyObject, Object id) {
			weakRef = new WeakReference<Object>(keyObject);
			this.id = id;

			// since we have no equals and hashcode methods overridden in EObjects,
			// there is no other way of telling if Keys are equal than by comparing
			// the value of both EObject's id attribute.
			if (keyObject instanceof EObject) {
				// the hashcode is based on the type of the object and its id
				hashcode = Objects.hash(((EObject)keyObject).eClass().getName(), id);
			} else {
				hashcode = keyObject.hashCode();
			}
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object arg0) {
			assert (arg0 != null);
			assert (arg0 instanceof Key);

			final Key key0 = (Key) arg0;
			final Object obj0 = key0.weakRef.get();
			final Object obj1 = weakRef.get();

			// weakreference already gone compare on keys itself
			if (obj0 == null || obj1 == null) {
				return this == key0;
			}

			// since we have no equals and hashcode methods overridden in EObjects,
			// there is no other way of telling if Keys are equal than by comparing
			// the value of both EObject's id attribute (when it exists).
			if (obj0 instanceof EObject && obj1 instanceof EObject) {
				EObject eObject0 = (EObject) obj0;
				EObject eObject1 = (EObject) obj1;

				if (eObject0.eClass().equals(eObject1.eClass())) {
					EStructuralFeature idFeature = eObject0.eClass().getEStructuralFeature(ID_FEATURE_NAME);

					if (idFeature != null) {
						Object id0 = eObject0.eGet(idFeature);
						if (id0 != null && id != null) {
							return id0.equals(id);
						}
					}
				}
			}

			// still present compare on values
			// equals call should maybe also be done but goes wrong for
			// featuremap entries
			// which are equal if their values and featuremap are equal
			// identifier and version caching are only usefull in case of object
			// equality
			// because it uses weak references and the first level cache of hb
			// should
			// ensure that only one instance of a certain object is present.
			// There should always be one instance anyway in one session
			// otherwise
			// references between objects can be set wrong (or at least there is
			// a great
			// change that they go wrong).
			return obj0 == obj1;
		}

		/** The hashcode of the enclosed object is returned */
		@Override
		public int hashCode() {
			return hashcode;
		}

		/** Returns true if the weakReference is not yet gc'ed */
		public boolean isValid() {
			return weakRef.get() != null;
		}
	}

	public IdentifierCacheCleaningRunnable getIdCacheCleaner() {
		return idCacheCleaner;
	}

	public IdentifierCacheCleaningRunnable getVersionCacheCleaner() {
		return versionCacheCleaner;
	}
}