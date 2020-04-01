/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: VersionPropertyHandler.java,v 1.8 2010/11/11 10:28:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.property.access.spi.Getter;
import org.hibernate.property.access.spi.PropertyAccess;
import org.hibernate.property.access.spi.PropertyAccessStrategy;
import org.hibernate.property.access.spi.Setter;

/**
 * Reads the version from the internal version cache.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class VersionPropertyHandler
		implements Getter, Setter, PropertyAccess, PropertyAccessStrategy, ExtensionPoint {
	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -7004553329654520847L;

	/**
	 * Reads the version from the versioncache
	 */
	public Object get(Object owner) throws HibernateException {
		return IdentifierCacheHandler.getInstance().getVersion(owner);
	}

	/**
	 * Reads the version from the versioncache
	 */
	@SuppressWarnings("rawtypes")
	public Object getForInsert(Object owner, Map mergeMap, SharedSessionContractImplementor session)
			throws HibernateException {
		return IdentifierCacheHandler.getInstance().getVersion(owner);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMember()
	 */
	public Member getMember() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMethod()
	 */
	public Method getMethod() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMethodName()
	 */
	public String getMethodName() {
		return null;
	}

	/** Returns Integer.class */
	@SuppressWarnings("rawtypes")
	public Class getReturnType() {
		return Integer.class;
	}

	/** Sets the version in the internal version cache */
	public void set(Object target, Object value, SessionFactoryImplementor factory)
			throws HibernateException {
		IdentifierCacheHandler.getInstance().setVersion(target, value);
	}

	public Getter getGetter() {
		return this;
	}

	public Setter getSetter() {
		return this;
	}

	public PropertyAccessStrategy getPropertyAccessStrategy() {
		return this;
	}

	public PropertyAccess buildPropertyAccess(Class arg0, String arg1) {
		return this;
	}
}