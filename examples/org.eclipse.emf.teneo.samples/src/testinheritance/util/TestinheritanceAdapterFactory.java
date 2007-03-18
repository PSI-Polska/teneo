/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestinheritanceAdapterFactory.java,v 1.1.2.2 2007/03/18 22:34:03 mtaal Exp $
 */
package testinheritance.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import testinheritance.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see testinheritance.TestinheritancePackage
 * @generated
 */
public class TestinheritanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestinheritancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestinheritanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TestinheritancePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestinheritanceSwitch modelSwitch =
		new TestinheritanceSwitch() {
			public Object caseSomeResource(SomeResource object) {
				return createSomeResourceAdapter();
			}
			public Object caseSomeBaseClass(SomeBaseClass object) {
				return createSomeBaseClassAdapter();
			}
			public Object caseSomeOtherBaseClass(SomeOtherBaseClass object) {
				return createSomeOtherBaseClassAdapter();
			}
			public Object caseNameValuePair(NameValuePair object) {
				return createNameValuePairAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link testinheritance.SomeResource <em>Some Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testinheritance.SomeResource
	 * @generated
	 */
	public Adapter createSomeResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testinheritance.SomeBaseClass <em>Some Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testinheritance.SomeBaseClass
	 * @generated
	 */
	public Adapter createSomeBaseClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testinheritance.SomeOtherBaseClass <em>Some Other Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testinheritance.SomeOtherBaseClass
	 * @generated
	 */
	public Adapter createSomeOtherBaseClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testinheritance.NameValuePair <em>Name Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testinheritance.NameValuePair
	 * @generated
	 */
	public Adapter createNameValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TestinheritanceAdapterFactory
