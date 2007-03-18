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
 *   Martin Taal
 * </copyright>
 *
 * $Id: MultipleInheritanceAction.java,v 1.1.2.2 2007/03/18 22:34:31 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

import testinheritance.NameValuePair;
import testinheritance.SomeResource;
import testinheritance.TestinheritanceFactory;
import testinheritance.TestinheritancePackage;

/**
 * Tests nullable enum and enum as id
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1.2.2 $
 */
public class MultipleInheritanceAction extends AbstractTestAction {
	/**
	 * Constructor.
	 * 
	 * @param arg0
	 */
	public MultipleInheritanceAction() {
		super(TestinheritancePackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		store.disableDrop();
		try {
			Resource res = null;
			try {
				res = store.getResource();
				res.load(Collections.EMPTY_MAP);
		        SomeResource someResource = TestinheritanceFactory.eINSTANCE.createSomeResource();
		        someResource.setAnotherProperty(42);
		        someResource.setProperty("foo");
		        NameValuePair nv = TestinheritanceFactory.eINSTANCE.createNameValuePair();
		        nv.setName("foo1");
		        nv.setValue("bar");
		        someResource.getNameValuePairs().add(nv);
				res.getContents().add(someResource);
				res.save(null);
			} finally {
			}
			SomeResource someResource;
			try {
				res = store.getResource();
				res.load(Collections.EMPTY_MAP);
				someResource = TestinheritanceFactory.eINSTANCE.createSomeResource();
		        someResource.setAnotherProperty(13);
		        someResource.setProperty("baz");
				res.getContents().add(someResource);
				res.save(null);
			} finally {
			}
			try {
				res = store.getResource();
				res.load(Collections.EMPTY_MAP);
				assertNotNull(res.getContents());
				assertEquals(3, res.getContents().size());
		        someResource = (SomeResource)res.getContents().get(1);
		        assertNotNull(someResource);
		        NameValuePair nv = TestinheritanceFactory.eINSTANCE.createNameValuePair();
		        nv.setName("foo1");
		        nv.setValue("bar");
		        someResource.getNameValuePairs().add(nv);
				res.save(null);
			} finally {
			}
		} catch (IOException e) {
			throw new StoreTestException("IOException", e);
		}
	}
}
