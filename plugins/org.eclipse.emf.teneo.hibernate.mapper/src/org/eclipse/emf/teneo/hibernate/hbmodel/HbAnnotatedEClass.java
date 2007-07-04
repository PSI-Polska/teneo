/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEClass.java,v 1.8 2007/07/04 19:31:48 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete;
import org.eclipse.emf.teneo.hibernate.hbannotation.Proxy;
import org.eclipse.emf.teneo.hibernate.hbannotation.Where;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Hb Annotated EClass</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbCache <em>Hb Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbOnDelete <em>Hb On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbWhere <em>Hb Where</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbProxy <em>Hb Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage#getHbAnnotatedEClass()
 * @model
 * @generated
 */
public interface HbAnnotatedEClass extends PAnnotatedEClass {
	/**
	 * Returns the value of the '<em><b>Hb Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Cache</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Cache</em>' containment reference.
	 * @see #setHbCache(Cache)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage#getHbAnnotatedEClass_HbCache()
	 * @model containment="true"
	 * @generated
	 */
	Cache getHbCache();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbCache <em>Hb Cache</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Cache</em>' containment reference.
	 * @see #getHbCache()
	 * @generated
	 */
	void setHbCache(Cache value);

	/**
	 * Returns the value of the '<em><b>Hb On Delete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb On Delete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb On Delete</em>' reference.
	 * @see #setHbOnDelete(OnDelete)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage#getHbAnnotatedEClass_HbOnDelete()
	 * @model
	 * @generated
	 */
	OnDelete getHbOnDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbOnDelete <em>Hb On Delete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb On Delete</em>' reference.
	 * @see #getHbOnDelete()
	 * @generated
	 */
	void setHbOnDelete(OnDelete value);

	/**
	 * Returns the value of the '<em><b>Hb Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Where</em>' containment reference.
	 * @see #setHbWhere(Where)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage#getHbAnnotatedEClass_HbWhere()
	 * @model containment="true"
	 * @generated
	 */
	Where getHbWhere();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbWhere <em>Hb Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Where</em>' containment reference.
	 * @see #getHbWhere()
	 * @generated
	 */
	void setHbWhere(Where value);

	/**
	 * Returns the value of the '<em><b>Hb Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Proxy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Proxy</em>' reference.
	 * @see #setHbProxy(Proxy)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage#getHbAnnotatedEClass_HbProxy()
	 * @model
	 * @generated
	 */
	Proxy getHbProxy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbProxy <em>Hb Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Proxy</em>' reference.
	 * @see #getHbProxy()
	 * @generated
	 */
	void setHbProxy(Proxy value);

} // HbAnnotatedEClass
