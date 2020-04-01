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
 * $Id: EContainerAccessor.java,v 1.6 2010/02/04 10:53:07 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.econtainer;

import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerAware;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.hibernate.property.access.spi.Getter;
import org.hibernate.property.access.spi.PropertyAccess;
import org.hibernate.property.access.spi.PropertyAccessStrategy;
import org.hibernate.property.access.spi.Setter;

/**
 * Creates the getter and setter for eContainer members.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class EContainerAccessor
		implements PropertyAccess, PropertyAccessStrategy, ExtensionPoint, ExtensionManagerAware {

	private ExtensionManager extensionManager;

	/**
	 * @param extensionManager
	 *          the extensionManager to set
	 */
	public void setExtensionManager(ExtensionManager extensionManager) {
		this.extensionManager = extensionManager;
	}

	public Getter getGetter() {
		final EContainerPropertyHandler handler = extensionManager
				.getExtension(EContainerPropertyHandler.class);
		handler.initialize();
		return handler;
	}

	public Setter getSetter() {
		final EContainerPropertyHandler handler = extensionManager
				.getExtension(EContainerPropertyHandler.class);
		handler.initialize();
		return handler;
	}

	public PropertyAccessStrategy getPropertyAccessStrategy() {
		return this;
	}

	public PropertyAccess buildPropertyAccess(Class arg0, String arg1) {
		return this;
	}
}