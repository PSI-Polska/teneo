/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: DefaultExtensionManager.java,v 1.1 2007/07/11 14:41:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.extension;

import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.classloader.ClassLoaderStrategy;

/**
 * Manages a set of extensions. Currently for each extension point there will always be only one
 * extension instance.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class DefaultExtensionManager implements ExtensionManager {

	private static Log log = LogFactory.getLog(DefaultExtensionManager.class);

	// Uses the default for now
	private ConcurrentHashMap<String, Extension> extensionRegistry = new ConcurrentHashMap<String, Extension>();

	// The instances of the extensions
	private ConcurrentHashMap<String, ExtensionPoint> extensionInstances =
			new ConcurrentHashMap<String, ExtensionPoint>();

	public DefaultExtensionManager() {
		ExtensionUtil.registerDefaultExtensions(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.extension.ExtensionManager#registerExtension(org.eclipse.emf.teneo.extension.Extension)
	 */
	public void registerExtension(Extension extension) {
		// check if there is already a non-default plugin registered with the same name
		if (extension.isDefaultExtension()) {
			final Extension currentExtension = extensionRegistry.get(extension.getPoint());
			if (currentExtension != null && !currentExtension.isDefaultExtension()) {
				log.debug("Not registering extension " + extension);
				log.debug("There is already a user plugin defined: " + currentExtension);
				return;
			}
		}
		if (extension.getPoint() == null) {
			throw new TeneoExtensionException("Point of extension may not be null");
		}
		if (extension.getClassName() == null) {
			throw new TeneoExtensionException("Classname of extension: " + extension.getPoint() + " may not be null");
		}
		log.debug("Registering " + extension);
		extensionRegistry.put(extension.getPoint(), extension);

		// remove any instances for this extension
		extensionInstances.remove(extension.getPoint());
	}

	public void registerExtension(String point, String className) {
		final Extension currentExtension = extensionRegistry.get(point);
		if (currentExtension == null) {
			throw new TeneoExtensionException("No default extension found using point: " + point +
					" is the point value correct?");
		}
		final Extension newExtension = new Extension();
		newExtension.setPoint(point);
		newExtension.setClassName(className);
		newExtension.setDefaultExtension(false);
		newExtension.setSingleton(currentExtension.isSingleton());
		registerExtension(newExtension);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.extension.ExtensionManager#getExtension(java.lang.String)
	 */
	public ExtensionPoint getExtension(String point) {
		log.debug("Searching extension " + point);
		final Extension extension = extensionRegistry.get(point);
		if (extension == null) {
			throw new TeneoExtensionException("Extension point " + point + " not registered");
		}

		if (extension.isSingleton()) {
			final ExtensionPoint extensionInstance = extensionInstances.get(point);
			if (extensionInstance != null) {
				log.debug("Found instance " + extensionInstance.getClass().getClass());
				return extensionInstance;
			}
		}

		// get the clz
		final Class<?> clz;
		// see if the classloader strategy was already registered
		final ClassLoaderStrategy cls =
				(ClassLoaderStrategy) extensionInstances.get(ClassLoaderStrategy.class.getName());
		try {
			if (cls != null) { // already there use it to load the class
				clz = cls.getClassLoader().loadClass(extension.getClassName());
			} else {
				// not there try to find it in the extension registry
				final Extension clsExtension = extensionRegistry.get(ClassLoaderStrategy.class.getName());
				if (clsExtension == null) {
					// not there use the default classloader
					clz = ClassLoaderResolver.classForName(extension.getClassName());
				} else {
					// create the classloader extension and register it
					final Class<?> clsClass = ClassLoaderResolver.classForName(clsExtension.getClassName());
					ClassLoaderStrategy clsInstance = null;
					try {
						clsInstance = (ClassLoaderStrategy) clsClass.newInstance();
						extensionInstances.put(clsExtension.getPoint(), clsInstance);
					} catch (Exception e) {
						throw new TeneoExtensionException("Exception while instantiating class " + clsClass.getName(),
							e);
					}
					// now get the class we were looking for
					clz = clsInstance.getClassLoader().loadClass(extension.getClassName());
				}
			}
		} catch (ClassNotFoundException e) {
			throw new TeneoExtensionException("Class not found: " + extension.getClassName(), e);
		}

		// check if this class indeed implements ExtensionPoint
		if (!(ExtensionPoint.class.isAssignableFrom(clz))) {
			throw new TeneoExtensionException("The requested extension " + clz.getName() +
					" does not implement the interface " + ExtensionPoint.class.getName());
		}

		try {
			final ExtensionPoint extensionInstance = (ExtensionPoint) clz.newInstance();
			log.debug("Created extensionPoint instance: " + extensionInstance.getClass().getName());
			if (extensionInstance instanceof ExtensionManagerAware) {
				((ExtensionManagerAware) extensionInstance).setExtensionManager(this);
			}
			if (extensionInstance instanceof ExtensionInitializable) {
				log.debug("Initializing extension " + extensionInstance.getClass().getName());
				((ExtensionInitializable) extensionInstance).initializeExtension();
			}
			if (extension.isSingleton()) {
				log.debug("Caching extension instance as singleton " + extension);
				extensionInstances.put(point, extensionInstance);
			}
			return extensionInstance;
		} catch (Exception e) {
			throw new TeneoExtensionException("Exception while instantiating: " + extension.getClassName(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.extension.ExtensionManager#getExtension(java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	public <T> T getExtension(Class<T> clz) {
		return (T) getExtension(clz.getName());
	}
}