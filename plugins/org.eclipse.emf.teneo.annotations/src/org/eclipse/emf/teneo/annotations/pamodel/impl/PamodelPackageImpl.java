/**
 * <copyright>
 * </copyright>
 *
 * $Id: PamodelPackageImpl.java,v 1.10 2006/09/06 21:59:49 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedETypedElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pamodel.util.PamodelValidator;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PamodelPackageImpl extends EPackageImpl implements PamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotatedEModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotatedModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotatedEPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotatedEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotatedEStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotatedEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotatedEDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotatedEReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotatedETypedElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PamodelPackageImpl() {
		super(eNS_URI, PamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PamodelPackage init() {
		if (isInited) return (PamodelPackage)EPackage.Registry.INSTANCE.getEPackage(PamodelPackage.eNS_URI);

		// Obtain or create and register package
		PamodelPackageImpl thePamodelPackage = (PamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new PamodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PannotationPackageImpl thePannotationPackage = (PannotationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PannotationPackage.eNS_URI) instanceof PannotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PannotationPackage.eNS_URI) : PannotationPackage.eINSTANCE);

		// Create package meta-data objects
		thePamodelPackage.createPackageContents();
		thePannotationPackage.createPackageContents();

		// Initialize created meta-data
		thePamodelPackage.initializePackageContents();
		thePannotationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePamodelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PamodelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePamodelPackage.freeze();

		return thePamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotatedEModelElement() {
		return pAnnotatedEModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEModelElement_AnnotatedElement() {
		return (EReference)pAnnotatedEModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEModelElement_Transient() {
		return (EReference)pAnnotatedEModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotatedModel() {
		return pAnnotatedModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedModel_PaEPackages() {
		return (EReference)pAnnotatedModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotatedEPackage() {
		return pAnnotatedEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEPackage_PaModel() {
		return (EReference)pAnnotatedEPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEPackage_AnnotatedEPackage() {
		return (EReference)pAnnotatedEPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEPackage_PaEClasses() {
		return (EReference)pAnnotatedEPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEPackage_SequenceGenerators() {
		return (EReference)pAnnotatedEPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEPackage_TableGenerators() {
		return (EReference)pAnnotatedEPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEPackage_PaEDataTypes() {
		return (EReference)pAnnotatedEPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotatedEClass() {
		return pAnnotatedEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_PaEPackage() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_AnnotatedEClass() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_PaEStructuralFeatures() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_AttributeOverrides() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_DiscriminatorColumn() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_DiscriminatorValue() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_Embeddable() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_MappedSuperclass() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_Entity() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_IdClass() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_Inheritance() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_PrimaryKeyJoinColumns() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_SecondaryTables() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_Table() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_TableGenerator() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEClass_AssociationOverrides() {
		return (EReference)pAnnotatedEClassEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotatedEStructuralFeature() {
		return pAnnotatedEStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEStructuralFeature_PaEClass() {
		return (EReference)pAnnotatedEStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEStructuralFeature_AnnotatedEStructuralFeature() {
		return (EReference)pAnnotatedEStructuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotatedEAttribute() {
		return pAnnotatedEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEAttribute_AnnotatedEAttribute() {
		return (EReference)pAnnotatedEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEAttribute_Basic() {
		return (EReference)pAnnotatedEAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEAttribute_Enumerated() {
		return (EReference)pAnnotatedEAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEAttribute_GeneratedValue() {
		return (EReference)pAnnotatedEAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEAttribute_Id() {
		return (EReference)pAnnotatedEAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEAttribute_Lob() {
		return (EReference)pAnnotatedEAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEAttribute_Temporal() {
		return (EReference)pAnnotatedEAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEAttribute_Version() {
		return (EReference)pAnnotatedEAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotatedEDataType() {
		return pAnnotatedEDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEDataType_AnnotatedEDataType() {
		return (EReference)pAnnotatedEDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEDataType_Basic() {
		return (EReference)pAnnotatedEDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEDataType_Enumerated() {
		return (EReference)pAnnotatedEDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEDataType_GeneratedValue() {
		return (EReference)pAnnotatedEDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEDataType_Id() {
		return (EReference)pAnnotatedEDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEDataType_Lob() {
		return (EReference)pAnnotatedEDataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEDataType_Temporal() {
		return (EReference)pAnnotatedEDataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEDataType_Version() {
		return (EReference)pAnnotatedEDataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEDataType_PaEPackage() {
		return (EReference)pAnnotatedEDataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotatedEReference() {
		return pAnnotatedEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEReference_AnnotatedEReference() {
		return (EReference)pAnnotatedEReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEReference_Embedded() {
		return (EReference)pAnnotatedEReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEReference_EmbeddedId() {
		return (EReference)pAnnotatedEReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEReference_ManyToMany() {
		return (EReference)pAnnotatedEReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEReference_ManyToOne() {
		return (EReference)pAnnotatedEReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEReference_MapKey() {
		return (EReference)pAnnotatedEReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEReference_OneToOne() {
		return (EReference)pAnnotatedEReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEReference_OrderBy() {
		return (EReference)pAnnotatedEReferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedEReference_PrimaryKeyJoinColumns() {
		return (EReference)pAnnotatedEReferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotatedETypedElement() {
		return pAnnotatedETypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedETypedElement_AttributeOverrides() {
		return (EReference)pAnnotatedETypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedETypedElement_JoinTable() {
		return (EReference)pAnnotatedETypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedETypedElement_OneToMany() {
		return (EReference)pAnnotatedETypedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedETypedElement_SequenceGenerator() {
		return (EReference)pAnnotatedETypedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedETypedElement_TableGenerator() {
		return (EReference)pAnnotatedETypedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedETypedElement_JoinColumns() {
		return (EReference)pAnnotatedETypedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotatedETypedElement_Column() {
		return (EReference)pAnnotatedETypedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PamodelFactory getPamodelFactory() {
		return (PamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pAnnotatedEModelElementEClass = createEClass(PANNOTATED_EMODEL_ELEMENT);
		createEReference(pAnnotatedEModelElementEClass, PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT);
		createEReference(pAnnotatedEModelElementEClass, PANNOTATED_EMODEL_ELEMENT__TRANSIENT);

		pAnnotatedModelEClass = createEClass(PANNOTATED_MODEL);
		createEReference(pAnnotatedModelEClass, PANNOTATED_MODEL__PA_EPACKAGES);

		pAnnotatedEPackageEClass = createEClass(PANNOTATED_EPACKAGE);
		createEReference(pAnnotatedEPackageEClass, PANNOTATED_EPACKAGE__PA_MODEL);
		createEReference(pAnnotatedEPackageEClass, PANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE);
		createEReference(pAnnotatedEPackageEClass, PANNOTATED_EPACKAGE__PA_ECLASSES);
		createEReference(pAnnotatedEPackageEClass, PANNOTATED_EPACKAGE__SEQUENCE_GENERATORS);
		createEReference(pAnnotatedEPackageEClass, PANNOTATED_EPACKAGE__TABLE_GENERATORS);
		createEReference(pAnnotatedEPackageEClass, PANNOTATED_EPACKAGE__PA_EDATA_TYPES);

		pAnnotatedEClassEClass = createEClass(PANNOTATED_ECLASS);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__PA_EPACKAGE);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__ANNOTATED_ECLASS);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__DISCRIMINATOR_VALUE);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__EMBEDDABLE);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__MAPPED_SUPERCLASS);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__ENTITY);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__ID_CLASS);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__INHERITANCE);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__SECONDARY_TABLES);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__TABLE);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__TABLE_GENERATOR);
		createEReference(pAnnotatedEClassEClass, PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES);

		pAnnotatedEStructuralFeatureEClass = createEClass(PANNOTATED_ESTRUCTURAL_FEATURE);
		createEReference(pAnnotatedEStructuralFeatureEClass, PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS);
		createEReference(pAnnotatedEStructuralFeatureEClass, PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE);

		pAnnotatedEAttributeEClass = createEClass(PANNOTATED_EATTRIBUTE);
		createEReference(pAnnotatedEAttributeEClass, PANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE);
		createEReference(pAnnotatedEAttributeEClass, PANNOTATED_EATTRIBUTE__BASIC);
		createEReference(pAnnotatedEAttributeEClass, PANNOTATED_EATTRIBUTE__ENUMERATED);
		createEReference(pAnnotatedEAttributeEClass, PANNOTATED_EATTRIBUTE__GENERATED_VALUE);
		createEReference(pAnnotatedEAttributeEClass, PANNOTATED_EATTRIBUTE__ID);
		createEReference(pAnnotatedEAttributeEClass, PANNOTATED_EATTRIBUTE__LOB);
		createEReference(pAnnotatedEAttributeEClass, PANNOTATED_EATTRIBUTE__TEMPORAL);
		createEReference(pAnnotatedEAttributeEClass, PANNOTATED_EATTRIBUTE__VERSION);

		pAnnotatedEReferenceEClass = createEClass(PANNOTATED_EREFERENCE);
		createEReference(pAnnotatedEReferenceEClass, PANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE);
		createEReference(pAnnotatedEReferenceEClass, PANNOTATED_EREFERENCE__EMBEDDED);
		createEReference(pAnnotatedEReferenceEClass, PANNOTATED_EREFERENCE__EMBEDDED_ID);
		createEReference(pAnnotatedEReferenceEClass, PANNOTATED_EREFERENCE__MANY_TO_MANY);
		createEReference(pAnnotatedEReferenceEClass, PANNOTATED_EREFERENCE__MANY_TO_ONE);
		createEReference(pAnnotatedEReferenceEClass, PANNOTATED_EREFERENCE__MAP_KEY);
		createEReference(pAnnotatedEReferenceEClass, PANNOTATED_EREFERENCE__ONE_TO_ONE);
		createEReference(pAnnotatedEReferenceEClass, PANNOTATED_EREFERENCE__ORDER_BY);
		createEReference(pAnnotatedEReferenceEClass, PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMNS);

		pAnnotatedETypedElementEClass = createEClass(PANNOTATED_ETYPED_ELEMENT);
		createEReference(pAnnotatedETypedElementEClass, PANNOTATED_ETYPED_ELEMENT__ATTRIBUTE_OVERRIDES);
		createEReference(pAnnotatedETypedElementEClass, PANNOTATED_ETYPED_ELEMENT__JOIN_TABLE);
		createEReference(pAnnotatedETypedElementEClass, PANNOTATED_ETYPED_ELEMENT__ONE_TO_MANY);
		createEReference(pAnnotatedETypedElementEClass, PANNOTATED_ETYPED_ELEMENT__SEQUENCE_GENERATOR);
		createEReference(pAnnotatedETypedElementEClass, PANNOTATED_ETYPED_ELEMENT__TABLE_GENERATOR);
		createEReference(pAnnotatedETypedElementEClass, PANNOTATED_ETYPED_ELEMENT__JOIN_COLUMNS);
		createEReference(pAnnotatedETypedElementEClass, PANNOTATED_ETYPED_ELEMENT__COLUMN);

		pAnnotatedEDataTypeEClass = createEClass(PANNOTATED_EDATA_TYPE);
		createEReference(pAnnotatedEDataTypeEClass, PANNOTATED_EDATA_TYPE__ANNOTATED_EDATA_TYPE);
		createEReference(pAnnotatedEDataTypeEClass, PANNOTATED_EDATA_TYPE__BASIC);
		createEReference(pAnnotatedEDataTypeEClass, PANNOTATED_EDATA_TYPE__ENUMERATED);
		createEReference(pAnnotatedEDataTypeEClass, PANNOTATED_EDATA_TYPE__GENERATED_VALUE);
		createEReference(pAnnotatedEDataTypeEClass, PANNOTATED_EDATA_TYPE__ID);
		createEReference(pAnnotatedEDataTypeEClass, PANNOTATED_EDATA_TYPE__LOB);
		createEReference(pAnnotatedEDataTypeEClass, PANNOTATED_EDATA_TYPE__TEMPORAL);
		createEReference(pAnnotatedEDataTypeEClass, PANNOTATED_EDATA_TYPE__VERSION);
		createEReference(pAnnotatedEDataTypeEClass, PANNOTATED_EDATA_TYPE__PA_EPACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PannotationPackage thePannotationPackage = (PannotationPackage)EPackage.Registry.INSTANCE.getEPackage(PannotationPackage.eNS_URI);

		// Add supertypes to classes
		pAnnotatedEPackageEClass.getESuperTypes().add(this.getPAnnotatedEModelElement());
		pAnnotatedEClassEClass.getESuperTypes().add(this.getPAnnotatedEModelElement());
		pAnnotatedEStructuralFeatureEClass.getESuperTypes().add(this.getPAnnotatedETypedElement());
		pAnnotatedEAttributeEClass.getESuperTypes().add(this.getPAnnotatedEStructuralFeature());
		pAnnotatedEReferenceEClass.getESuperTypes().add(this.getPAnnotatedEStructuralFeature());
		pAnnotatedETypedElementEClass.getESuperTypes().add(this.getPAnnotatedEModelElement());
		pAnnotatedEDataTypeEClass.getESuperTypes().add(this.getPAnnotatedETypedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(pAnnotatedEModelElementEClass, PAnnotatedEModelElement.class, "PAnnotatedEModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotatedEModelElement_AnnotatedElement(), ecorePackage.getENamedElement(), null, "annotatedElement", null, 1, 1, PAnnotatedEModelElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEModelElement_Transient(), thePannotationPackage.getTransient(), null, "transient", null, 0, 1, PAnnotatedEModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pAnnotatedModelEClass, PAnnotatedModel.class, "PAnnotatedModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotatedModel_PaEPackages(), this.getPAnnotatedEPackage(), this.getPAnnotatedEPackage_PaModel(), "paEPackages", null, 0, -1, PAnnotatedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pAnnotatedEPackageEClass, PAnnotatedEPackage.class, "PAnnotatedEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotatedEPackage_PaModel(), this.getPAnnotatedModel(), this.getPAnnotatedModel_PaEPackages(), "paModel", null, 0, 1, PAnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEPackage_AnnotatedEPackage(), ecorePackage.getEPackage(), null, "annotatedEPackage", null, 1, 1, PAnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEPackage_PaEClasses(), this.getPAnnotatedEClass(), this.getPAnnotatedEClass_PaEPackage(), "paEClasses", null, 0, -1, PAnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEPackage_SequenceGenerators(), thePannotationPackage.getSequenceGenerator(), null, "sequenceGenerators", null, 0, -1, PAnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEPackage_TableGenerators(), thePannotationPackage.getTableGenerator(), null, "tableGenerators", null, 0, -1, PAnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEPackage_PaEDataTypes(), this.getPAnnotatedEDataType(), this.getPAnnotatedEDataType_PaEPackage(), "paEDataTypes", null, 0, -1, PAnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pAnnotatedEClassEClass, PAnnotatedEClass.class, "PAnnotatedEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotatedEClass_PaEPackage(), this.getPAnnotatedEPackage(), this.getPAnnotatedEPackage_PaEClasses(), "paEPackage", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_AnnotatedEClass(), ecorePackage.getEClass(), null, "annotatedEClass", null, 1, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_PaEStructuralFeatures(), this.getPAnnotatedEStructuralFeature(), this.getPAnnotatedEStructuralFeature_PaEClass(), "paEStructuralFeatures", null, 0, -1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_AttributeOverrides(), thePannotationPackage.getAttributeOverride(), null, "attributeOverrides", null, 0, -1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_DiscriminatorColumn(), thePannotationPackage.getDiscriminatorColumn(), null, "discriminatorColumn", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_DiscriminatorValue(), thePannotationPackage.getDiscriminatorValue(), null, "discriminatorValue", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_Embeddable(), thePannotationPackage.getEmbeddable(), null, "embeddable", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_MappedSuperclass(), thePannotationPackage.getMappedSuperclass(), null, "mappedSuperclass", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_Entity(), thePannotationPackage.getEntity(), null, "entity", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_IdClass(), thePannotationPackage.getIdClass(), null, "idClass", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_Inheritance(), thePannotationPackage.getInheritance(), null, "inheritance", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_PrimaryKeyJoinColumns(), thePannotationPackage.getPrimaryKeyJoinColumn(), null, "primaryKeyJoinColumns", null, 0, -1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_SecondaryTables(), thePannotationPackage.getSecondaryTable(), null, "secondaryTables", null, 0, -1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_Table(), thePannotationPackage.getTable(), null, "table", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_TableGenerator(), thePannotationPackage.getTableGenerator(), null, "tableGenerator", null, 0, 1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEClass_AssociationOverrides(), thePannotationPackage.getAssociationOverride(), null, "associationOverrides", null, 0, -1, PAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pAnnotatedEStructuralFeatureEClass, PAnnotatedEStructuralFeature.class, "PAnnotatedEStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotatedEStructuralFeature_PaEClass(), this.getPAnnotatedEClass(), this.getPAnnotatedEClass_PaEStructuralFeatures(), "paEClass", null, 0, 1, PAnnotatedEStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEStructuralFeature_AnnotatedEStructuralFeature(), ecorePackage.getEStructuralFeature(), null, "annotatedEStructuralFeature", null, 1, 1, PAnnotatedEStructuralFeature.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pAnnotatedEAttributeEClass, PAnnotatedEAttribute.class, "PAnnotatedEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotatedEAttribute_AnnotatedEAttribute(), ecorePackage.getEAttribute(), null, "annotatedEAttribute", null, 1, 1, PAnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEAttribute_Basic(), thePannotationPackage.getBasic(), null, "basic", null, 0, 1, PAnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEAttribute_Enumerated(), thePannotationPackage.getEnumerated(), null, "enumerated", null, 0, 1, PAnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEAttribute_GeneratedValue(), thePannotationPackage.getGeneratedValue(), null, "generatedValue", null, 0, 1, PAnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEAttribute_Id(), thePannotationPackage.getId(), null, "id", null, 0, 1, PAnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEAttribute_Lob(), thePannotationPackage.getLob(), null, "lob", null, 0, 1, PAnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEAttribute_Temporal(), thePannotationPackage.getTemporal(), null, "temporal", null, 0, 1, PAnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEAttribute_Version(), thePannotationPackage.getVersion(), null, "version", null, 0, 1, PAnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pAnnotatedEReferenceEClass, PAnnotatedEReference.class, "PAnnotatedEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotatedEReference_AnnotatedEReference(), ecorePackage.getEReference(), null, "annotatedEReference", null, 1, 1, PAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEReference_Embedded(), thePannotationPackage.getEmbedded(), null, "embedded", null, 0, 1, PAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEReference_EmbeddedId(), thePannotationPackage.getEmbeddedId(), null, "embeddedId", null, 0, 1, PAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEReference_ManyToMany(), thePannotationPackage.getManyToMany(), null, "manyToMany", null, 0, 1, PAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEReference_ManyToOne(), thePannotationPackage.getManyToOne(), null, "manyToOne", null, 0, 1, PAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEReference_MapKey(), thePannotationPackage.getMapKey(), null, "mapKey", null, 0, 1, PAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEReference_OneToOne(), thePannotationPackage.getOneToOne(), null, "oneToOne", null, 0, 1, PAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEReference_OrderBy(), thePannotationPackage.getOrderBy(), null, "orderBy", null, 0, 1, PAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEReference_PrimaryKeyJoinColumns(), thePannotationPackage.getPrimaryKeyJoinColumn(), null, "primaryKeyJoinColumns", null, 0, -1, PAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pAnnotatedETypedElementEClass, PAnnotatedETypedElement.class, "PAnnotatedETypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotatedETypedElement_AttributeOverrides(), thePannotationPackage.getAttributeOverride(), null, "attributeOverrides", null, 0, -1, PAnnotatedETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedETypedElement_JoinTable(), thePannotationPackage.getJoinTable(), null, "joinTable", null, 0, 1, PAnnotatedETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedETypedElement_OneToMany(), thePannotationPackage.getOneToMany(), null, "oneToMany", null, 0, 1, PAnnotatedETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedETypedElement_SequenceGenerator(), thePannotationPackage.getSequenceGenerator(), null, "sequenceGenerator", null, 0, 1, PAnnotatedETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedETypedElement_TableGenerator(), thePannotationPackage.getTableGenerator(), null, "tableGenerator", null, 0, 1, PAnnotatedETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedETypedElement_JoinColumns(), thePannotationPackage.getJoinColumn(), null, "joinColumns", null, 0, -1, PAnnotatedETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedETypedElement_Column(), thePannotationPackage.getColumn(), null, "column", null, 0, 1, PAnnotatedETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pAnnotatedEDataTypeEClass, PAnnotatedEDataType.class, "PAnnotatedEDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotatedEDataType_AnnotatedEDataType(), ecorePackage.getEDataType(), null, "annotatedEDataType", null, 1, 1, PAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEDataType_Basic(), thePannotationPackage.getBasic(), null, "basic", null, 0, 1, PAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEDataType_Enumerated(), thePannotationPackage.getEnumerated(), null, "enumerated", null, 0, 1, PAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEDataType_GeneratedValue(), thePannotationPackage.getGeneratedValue(), null, "generatedValue", null, 0, 1, PAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEDataType_Id(), thePannotationPackage.getId(), null, "id", null, 0, 1, PAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEDataType_Lob(), thePannotationPackage.getLob(), null, "lob", null, 0, 1, PAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEDataType_Temporal(), thePannotationPackage.getTemporal(), null, "temporal", null, 0, 1, PAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEDataType_Version(), thePannotationPackage.getVersion(), null, "version", null, 0, 1, PAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPAnnotatedEDataType_PaEPackage(), this.getPAnnotatedEPackage(), this.getPAnnotatedEPackage_PaEDataTypes(), "paEPackage", null, 0, 1, PAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// teneo/internal/PersistenceMapping
		createPersistenceMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (pAnnotatedEModelElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "PAnnotationElementCommutes"
		   });			
		addAnnotation
		  (pAnnotatedModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtMostOnePackage DistinctGenerators"
		   });		
		addAnnotation
		  (pAnnotatedEPackageEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtMostOneEClass"
		   });						
		addAnnotation
		  (pAnnotatedEClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "SameEFeatures EPackageCommutes ProperPrimaryKey EntityOrEmbeddableOrMappedSuper\tOverriddenAreDefined ProperInheritance ProperDiscriminator SingleTableForSingleStrategy ProperPKJoin"
		   });					
		addAnnotation
		  (pAnnotatedEStructuralFeatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "EClassCommutes TransientNotAnnotated"
		   });				
		addAnnotation
		  (pAnnotatedEAttributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "NotAnnotatedAsBasic GeneratedOnId DefinedGenerator IdOnEntityOrMappedSuper"
		   });			
		addAnnotation
		  (pAnnotatedEReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "NotAnnotatedAsEmbed AssociationAgreeWithReference AssociationWellFormed"
		   });			
		addAnnotation
		  (pAnnotatedETypedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "EClassCommutes TransientNotAnnotated"
		   });		
		addAnnotation
		  (pAnnotatedEDataTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "NotAnnotatedAsBasic GeneratedOnId DefinedGenerator IdOnEntityOrMappedSuper"
		   });		
	}

	/**
	 * Initializes the annotations for <b>teneo/internal/PersistenceMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPersistenceMappingAnnotations() {
		String source = "teneo/internal/PersistenceMapping";			
		addAnnotation
		  (getPAnnotatedEModelElement_AnnotatedElement(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });				
		addAnnotation
		  (getPAnnotatedEPackage_PaModel(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });		
		addAnnotation
		  (getPAnnotatedEPackage_AnnotatedEPackage(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });		
		addAnnotation
		  (getPAnnotatedEPackage_PaEClasses(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });		
		addAnnotation
		  (getPAnnotatedEPackage_PaEDataTypes(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });			
		addAnnotation
		  (getPAnnotatedEClass_PaEPackage(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });		
		addAnnotation
		  (getPAnnotatedEClass_AnnotatedEClass(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });		
		addAnnotation
		  (getPAnnotatedEClass_PaEStructuralFeatures(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });			
		addAnnotation
		  (getPAnnotatedEStructuralFeature_PaEClass(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });		
		addAnnotation
		  (getPAnnotatedEStructuralFeature_AnnotatedEStructuralFeature(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });			
		addAnnotation
		  (getPAnnotatedEAttribute_AnnotatedEAttribute(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });			
		addAnnotation
		  (getPAnnotatedEReference_AnnotatedEReference(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });				
		addAnnotation
		  (getPAnnotatedEDataType_AnnotatedEDataType(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });		
		addAnnotation
		  (getPAnnotatedEDataType_PaEPackage(), 
		   source, 
		   new String[] {
			 "ignore", "true"
		   });
	}

	/**
	 * {@see PamodelPackage#pAnnotationReference(EClass, EClass)}
	 */
	public EReference pAnnotationReference(EClass paElementEClass, EClass pAnnotationEClass) {
		if (PamodelPackage.eINSTANCE.getPAnnotatedEModelElement().isSuperTypeOf(paElementEClass) &&
			PannotationPackage.eINSTANCE.getPAnnotation().isSuperTypeOf(pAnnotationEClass))
			for (Iterator i = paElementEClass.getEAllReferences().iterator(); i.hasNext(); ) {
				EReference r = (EReference) i.next();
				if (r.getEReferenceType() == pAnnotationEClass)
					return r;
			}
		return null;
	}

} //PamodelPackageImpl
