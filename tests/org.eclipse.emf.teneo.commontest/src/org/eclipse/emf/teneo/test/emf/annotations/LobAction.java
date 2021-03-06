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
 * $Id: LobAction.java,v 1.8 2009/05/06 16:01:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.Random;

import org.eclipse.emf.teneo.samples.emf.annotations.lob.LobFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.lob.LobPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.lob.Person;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Simple test for Lob.
 */
public class LobAction extends AbstractTestAction {
	private static final String ADDRESS = "Amsterdamseweg 123, 4567AZ Amsterdam";

	private static final long ID = 1;

	private static final String NAME = "Jan Janssen";

	private static final byte[] PHOTO = new byte[64 * 1024];
	
	private static final byte[] bytes = new byte[10000];

	static {
		// Populate PHOTO with random bytes.
		new Random().nextBytes(PHOTO);
	}

	public LobAction() {
		super(LobPackage.eINSTANCE);
	}
	
	@Override
	public void doAction(TestStore store) {
		
		for (int i = 0; i < 10000; i++) {
			bytes[i] = (byte)(i % 100);
		}

		storePerson(store);
		testPerson(store);
	}

	private void storePerson(TestStore store) {
		store.beginTransaction();

		final Person person = LobFactory.eINSTANCE.createPerson();
		person.setId(ID);
		person.setName(NAME);
		person.setAddress(ADDRESS);
		person.setPhoto(PHOTO);
		
		for (int i = 0; i < 10; i++) {
			person.getTexts().add(new String(bytes));
		}
		store.store(person);
		store.commitTransaction();
	}

	private void testPerson(TestStore store) {
		store.beginTransaction();

		final Person person = store.getObject(Person.class);
		assertEquals(ID, person.getId());
		assertEquals(NAME, person.getName());
		assertEquals(ADDRESS, person.getAddress());
		final byte[] photo = person.getPhoto();
		assertEquals(PHOTO.length, photo.length);
		for (int i = 0; i < photo.length; i++) {
			assertEquals(PHOTO[i], photo[i]);
		}

		for (int i = 0; i < 10; i++) {
			assertEquals(person.getTexts().get(i), new String(bytes));
		}
		
		store.commitTransaction();
	}
}
