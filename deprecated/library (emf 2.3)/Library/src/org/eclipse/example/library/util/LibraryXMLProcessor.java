/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryXMLProcessor.java,v 1.1 2008/04/01 07:29:07 mtaal Exp $
 */
package org.eclipse.example.library.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.example.library.LibraryPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		LibraryPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the LibraryResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new LibraryResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new LibraryResourceFactoryImpl());
		}
		return registrations;
	}

} //LibraryXMLProcessor
