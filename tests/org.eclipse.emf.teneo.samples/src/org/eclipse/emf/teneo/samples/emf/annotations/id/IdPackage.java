/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdPackage.java,v 1.5 2007/11/15 14:48:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.id;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.IdFactory
 * @model kind="package"
 *        annotation="teneo.jpa appinfo='\t\t\t@SequenceStyleGenerator(name=\"StyleGENERATOR\" sequenceName=\"myOtherSequenceName\" optimizer=HILO initialValue=5 incrementSize=25)\n\t\t\t@SequenceStyleGenerator(name=\"StyleGENERATOR2\" sequenceName=\"myOtherSequenceName\" initialValue=5 incrementSize=25)\n\t\t\t@SequenceGenerator(name=\"GENERATOR\" sequenceName=\"mySequenceName\" initialValue=10 allocationSize=100)\n\t\t\t@SequenceGenerator(name=\"GENERATORTWO\" sequenceName=\"myOtherSequenceName\" initialValue=5 allocationSize=50)'"
 * @generated
 */
public interface IdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "id";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/id";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "id";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdentityIDImpl <em>Identity ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdentityIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getIdentityID()
	 * @generated
	 */
	int IDENTITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Identity ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SimpleIDImpl <em>Simple ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SimpleIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getSimpleID()
	 * @generated
	 */
	int SIMPLE_ID = 1;

	/**
	 * The feature id for the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ID__AUTO_ID = 0;

	/**
	 * The number of structural features of the '<em>Simple ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ID_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.TableIDImpl <em>Table ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.TableIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getTableID()
	 * @generated
	 */
	int TABLE_ID = 2;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Table ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ID_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.TableGeneratorIDImpl <em>Table Generator ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.TableGeneratorIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getTableGeneratorID()
	 * @generated
	 */
	int TABLE_GENERATOR_ID = 3;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Table Generator ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_ID_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.AutoIDImpl <em>Auto ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.AutoIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getAutoID()
	 * @generated
	 */
	int AUTO_ID = 4;

	/**
	 * The feature id for the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ID__AUTO_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ID__NAME = 1;

	/**
	 * The number of structural features of the '<em>Auto ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ID_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.OtherTableGeneratorIDImpl <em>Other Table Generator ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.OtherTableGeneratorIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getOtherTableGeneratorID()
	 * @generated
	 */
	int OTHER_TABLE_GENERATOR_ID = 5;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_TABLE_GENERATOR_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Other Table Generator ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_TABLE_GENERATOR_ID_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SequenceIDImpl <em>Sequence ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SequenceIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getSequenceID()
	 * @generated
	 */
	int SEQUENCE_ID = 6;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Sequence ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ID_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SequenceStyleIDImpl <em>Sequence Style ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SequenceStyleIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getSequenceStyleID()
	 * @generated
	 */
	int SEQUENCE_STYLE_ID = 7;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STYLE_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Sequence Style ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STYLE_ID_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.IdentityID <em>Identity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.IdentityID
	 * @generated
	 */
	EClass getIdentityID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.IdentityID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.IdentityID#getMyid()
	 * @see #getIdentityID()
	 * @generated
	 */
	EAttribute getIdentityID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.SimpleID <em>Simple ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.SimpleID
	 * @generated
	 */
	EClass getSimpleID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.SimpleID#getAutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.SimpleID#getAutoID()
	 * @see #getSimpleID()
	 * @generated
	 */
	EAttribute getSimpleID_AutoID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.TableID <em>Table ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.TableID
	 * @generated
	 */
	EClass getTableID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.TableID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.TableID#getMyid()
	 * @see #getTableID()
	 * @generated
	 */
	EAttribute getTableID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.TableGeneratorID <em>Table Generator ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Generator ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.TableGeneratorID
	 * @generated
	 */
	EClass getTableGeneratorID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.TableGeneratorID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.TableGeneratorID#getMyid()
	 * @see #getTableGeneratorID()
	 * @generated
	 */
	EAttribute getTableGeneratorID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.AutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.AutoID
	 * @generated
	 */
	EClass getAutoID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.AutoID#getAutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.AutoID#getAutoID()
	 * @see #getAutoID()
	 * @generated
	 */
	EAttribute getAutoID_AutoID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.AutoID#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.AutoID#getName()
	 * @see #getAutoID()
	 * @generated
	 */
	EAttribute getAutoID_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.OtherTableGeneratorID <em>Other Table Generator ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Table Generator ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.OtherTableGeneratorID
	 * @generated
	 */
	EClass getOtherTableGeneratorID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.OtherTableGeneratorID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.OtherTableGeneratorID#getMyid()
	 * @see #getOtherTableGeneratorID()
	 * @generated
	 */
	EAttribute getOtherTableGeneratorID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.SequenceID <em>Sequence ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.SequenceID
	 * @generated
	 */
	EClass getSequenceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.SequenceID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.SequenceID#getMyid()
	 * @see #getSequenceID()
	 * @generated
	 */
	EAttribute getSequenceID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.SequenceStyleID <em>Sequence Style ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Style ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.SequenceStyleID
	 * @generated
	 */
	EClass getSequenceStyleID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.SequenceStyleID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.SequenceStyleID#getMyid()
	 * @see #getSequenceStyleID()
	 * @generated
	 */
	EAttribute getSequenceStyleID_Myid();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdFactory getIdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdentityIDImpl <em>Identity ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdentityIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getIdentityID()
		 * @generated
		 */
		EClass IDENTITY_ID = eINSTANCE.getIdentityID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY_ID__MYID = eINSTANCE.getIdentityID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SimpleIDImpl <em>Simple ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SimpleIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getSimpleID()
		 * @generated
		 */
		EClass SIMPLE_ID = eINSTANCE.getSimpleID();

		/**
		 * The meta object literal for the '<em><b>Auto ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ID__AUTO_ID = eINSTANCE.getSimpleID_AutoID();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.TableIDImpl <em>Table ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.TableIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getTableID()
		 * @generated
		 */
		EClass TABLE_ID = eINSTANCE.getTableID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ID__MYID = eINSTANCE.getTableID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.TableGeneratorIDImpl <em>Table Generator ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.TableGeneratorIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getTableGeneratorID()
		 * @generated
		 */
		EClass TABLE_GENERATOR_ID = eINSTANCE.getTableGeneratorID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR_ID__MYID = eINSTANCE.getTableGeneratorID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.AutoIDImpl <em>Auto ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.AutoIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getAutoID()
		 * @generated
		 */
		EClass AUTO_ID = eINSTANCE.getAutoID();

		/**
		 * The meta object literal for the '<em><b>Auto ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_ID__AUTO_ID = eINSTANCE.getAutoID_AutoID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_ID__NAME = eINSTANCE.getAutoID_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.OtherTableGeneratorIDImpl <em>Other Table Generator ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.OtherTableGeneratorIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getOtherTableGeneratorID()
		 * @generated
		 */
		EClass OTHER_TABLE_GENERATOR_ID = eINSTANCE.getOtherTableGeneratorID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_TABLE_GENERATOR_ID__MYID = eINSTANCE.getOtherTableGeneratorID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SequenceIDImpl <em>Sequence ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SequenceIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getSequenceID()
		 * @generated
		 */
		EClass SEQUENCE_ID = eINSTANCE.getSequenceID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_ID__MYID = eINSTANCE.getSequenceID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SequenceStyleIDImpl <em>Sequence Style ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.SequenceStyleIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdPackageImpl#getSequenceStyleID()
		 * @generated
		 */
		EClass SEQUENCE_STYLE_ID = eINSTANCE.getSequenceStyleID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_STYLE_ID__MYID = eINSTANCE.getSequenceStyleID_Myid();

	}

} //IdPackage
