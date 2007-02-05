/**
 * <copyright>
 * </copyright>
 *
 * $Id: UKAddressImpl.java,v 1.2 2007/02/05 16:13:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.UKAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UK Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.UKAddressImpl#getPostcode <em>Postcode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.UKAddressImpl#getExportCode <em>Export Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UKAddressImpl extends AddressImpl implements UKAddress {
	/**
	 * The default value of the '{@link #getPostcode() <em>Postcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcode() <em>Postcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcode()
	 * @generated
	 * @ordered
	 */
	protected String postcode = POSTCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExportCode() <em>Export Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportCode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EXPORT_CODE_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getExportCode() <em>Export Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportCode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger exportCode = EXPORT_CODE_EDEFAULT;

	/**
	 * This is true if the Export Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exportCodeESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UKAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.UK_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcode(String newPostcode) {
		String oldPostcode = postcode;
		postcode = newPostcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.UK_ADDRESS__POSTCODE, oldPostcode, postcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getExportCode() {
		return exportCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportCode(BigInteger newExportCode) {
		BigInteger oldExportCode = exportCode;
		exportCode = newExportCode;
		boolean oldExportCodeESet = exportCodeESet;
		exportCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.UK_ADDRESS__EXPORT_CODE, oldExportCode, exportCode, !oldExportCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExportCode() {
		BigInteger oldExportCode = exportCode;
		boolean oldExportCodeESet = exportCodeESet;
		exportCode = EXPORT_CODE_EDEFAULT;
		exportCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExtensionPackage.UK_ADDRESS__EXPORT_CODE, oldExportCode, EXPORT_CODE_EDEFAULT, oldExportCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExportCode() {
		return exportCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionPackage.UK_ADDRESS__POSTCODE:
				return getPostcode();
			case ExtensionPackage.UK_ADDRESS__EXPORT_CODE:
				return getExportCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionPackage.UK_ADDRESS__POSTCODE:
				setPostcode((String)newValue);
				return;
			case ExtensionPackage.UK_ADDRESS__EXPORT_CODE:
				setExportCode((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExtensionPackage.UK_ADDRESS__POSTCODE:
				setPostcode(POSTCODE_EDEFAULT);
				return;
			case ExtensionPackage.UK_ADDRESS__EXPORT_CODE:
				unsetExportCode();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtensionPackage.UK_ADDRESS__POSTCODE:
				return POSTCODE_EDEFAULT == null ? postcode != null : !POSTCODE_EDEFAULT.equals(postcode);
			case ExtensionPackage.UK_ADDRESS__EXPORT_CODE:
				return isSetExportCode();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (postcode: ");
		result.append(postcode);
		result.append(", exportCode: ");
		if (exportCodeESet) result.append(exportCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UKAddressImpl
