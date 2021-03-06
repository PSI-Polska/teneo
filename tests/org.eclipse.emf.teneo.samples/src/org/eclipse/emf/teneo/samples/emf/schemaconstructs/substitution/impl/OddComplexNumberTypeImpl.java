/**
 * <copyright>
 * </copyright>
 *
 * $Id: OddComplexNumberTypeImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.OddComplexNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Odd Complex Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OddComplexNumberTypeImpl extends ComplexNumberImpl implements OddComplexNumberType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OddComplexNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SubstitutionPackage.eINSTANCE.getOddComplexNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE__VALUE:
				return getValue();
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE__UNIT:
				return getUnit();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE__VALUE:
				setValue((BigInteger)newValue);
				return;
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE__UNIT:
				setUnit((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		}
		return eDynamicIsSet(eFeature);
	}

} //OddComplexNumberTypeImpl
