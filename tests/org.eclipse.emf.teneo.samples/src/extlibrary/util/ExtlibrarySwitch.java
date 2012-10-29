/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtlibrarySwitch.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary.util;

import extlibrary.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see extlibrary.ExtlibraryPackage
 * @generated
 */
public class ExtlibrarySwitch {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ExtlibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtlibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = ExtlibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it
	 * yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it
	 * yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					(EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it
	 * yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ExtlibraryPackage.BOOK: {
			Book book = (Book) theEObject;
			Object result = caseBook(book);
			if (result == null)
				result = caseCirculatingItem(book);
			if (result == null)
				result = caseItem(book);
			if (result == null)
				result = caseLendable(book);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.LIBRARY: {
			Library library = (Library) theEObject;
			Object result = caseLibrary(library);
			if (result == null)
				result = caseAddressable(library);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.WRITER: {
			Writer writer = (Writer) theEObject;
			Object result = caseWriter(writer);
			if (result == null)
				result = casePerson(writer);
			if (result == null)
				result = caseAddressable(writer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.ITEM: {
			Item item = (Item) theEObject;
			Object result = caseItem(item);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.LENDABLE: {
			Lendable lendable = (Lendable) theEObject;
			Object result = caseLendable(lendable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.CIRCULATING_ITEM: {
			CirculatingItem circulatingItem = (CirculatingItem) theEObject;
			Object result = caseCirculatingItem(circulatingItem);
			if (result == null)
				result = caseItem(circulatingItem);
			if (result == null)
				result = caseLendable(circulatingItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.PERIODICAL: {
			Periodical periodical = (Periodical) theEObject;
			Object result = casePeriodical(periodical);
			if (result == null)
				result = caseItem(periodical);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.AUDIO_VISUAL_ITEM: {
			AudioVisualItem audioVisualItem = (AudioVisualItem) theEObject;
			Object result = caseAudioVisualItem(audioVisualItem);
			if (result == null)
				result = caseCirculatingItem(audioVisualItem);
			if (result == null)
				result = caseItem(audioVisualItem);
			if (result == null)
				result = caseLendable(audioVisualItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.BOOK_ON_TAPE: {
			BookOnTape bookOnTape = (BookOnTape) theEObject;
			Object result = caseBookOnTape(bookOnTape);
			if (result == null)
				result = caseAudioVisualItem(bookOnTape);
			if (result == null)
				result = caseCirculatingItem(bookOnTape);
			if (result == null)
				result = caseItem(bookOnTape);
			if (result == null)
				result = caseLendable(bookOnTape);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.VIDEO_CASSETTE: {
			VideoCassette videoCassette = (VideoCassette) theEObject;
			Object result = caseVideoCassette(videoCassette);
			if (result == null)
				result = caseAudioVisualItem(videoCassette);
			if (result == null)
				result = caseCirculatingItem(videoCassette);
			if (result == null)
				result = caseItem(videoCassette);
			if (result == null)
				result = caseLendable(videoCassette);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.BORROWER: {
			Borrower borrower = (Borrower) theEObject;
			Object result = caseBorrower(borrower);
			if (result == null)
				result = casePerson(borrower);
			if (result == null)
				result = caseAddressable(borrower);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.PERSON: {
			Person person = (Person) theEObject;
			Object result = casePerson(person);
			if (result == null)
				result = caseAddressable(person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.EMPLOYEE: {
			Employee employee = (Employee) theEObject;
			Object result = caseEmployee(employee);
			if (result == null)
				result = casePerson(employee);
			if (result == null)
				result = caseAddressable(employee);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtlibraryPackage.ADDRESSABLE: {
			Addressable addressable = (Addressable) theEObject;
			Object result = caseAddressable(addressable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Book</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBook(Book object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Library</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Writer</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Writer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWriter(Writer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Item</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Lendable</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Lendable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLendable(Lendable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Circulating Item</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Circulating Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCirculatingItem(CirculatingItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Periodical</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Periodical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePeriodical(Periodical object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Audio Visual Item</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Audio Visual Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAudioVisualItem(AudioVisualItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Book On Tape</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Book On Tape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBookOnTape(BookOnTape object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Video Cassette</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Video Cassette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVideoCassette(VideoCassette object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Borrower</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Borrower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBorrower(Borrower object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Person</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Employee</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEmployee(Employee object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Addressable</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Addressable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddressable(Addressable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch, but this is the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} // ExtlibrarySwitch
