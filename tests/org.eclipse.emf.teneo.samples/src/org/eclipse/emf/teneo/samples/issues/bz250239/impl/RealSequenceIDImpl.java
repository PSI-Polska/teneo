/**
 * <copyright>
 * </copyright>
 *
 * $Id: RealSequenceIDImpl.java,v 1.1 2008/10/27 13:18:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz250239.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz250239.Bz250239Package;
import org.eclipse.emf.teneo.samples.issues.bz250239.RealSequenceID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Sequence ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.RealSequenceIDImpl#getMyid <em>Myid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealSequenceIDImpl extends EObjectImpl implements RealSequenceID {
	/**
	 * The default value of the '{@link #getMyid() <em>Myid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyid()
	 * @generated
	 * @ordered
	 */
	protected static final long MYID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMyid() <em>Myid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyid()
	 * @generated
	 * @ordered
	 */
	protected long myid = MYID_EDEFAULT;

	/**
	 * This is true if the Myid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean myidESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealSequenceIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz250239Package.Literals.REAL_SEQUENCE_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMyid() {
		return myid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyid(long newMyid) {
		long oldMyid = myid;
		myid = newMyid;
		boolean oldMyidESet = myidESet;
		myidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz250239Package.REAL_SEQUENCE_ID__MYID, oldMyid, myid, !oldMyidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMyid() {
		long oldMyid = myid;
		boolean oldMyidESet = myidESet;
		myid = MYID_EDEFAULT;
		myidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz250239Package.REAL_SEQUENCE_ID__MYID, oldMyid, MYID_EDEFAULT, oldMyidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMyid() {
		return myidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz250239Package.REAL_SEQUENCE_ID__MYID:
				return new Long(getMyid());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bz250239Package.REAL_SEQUENCE_ID__MYID:
				setMyid(((Long)newValue).longValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Bz250239Package.REAL_SEQUENCE_ID__MYID:
				unsetMyid();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Bz250239Package.REAL_SEQUENCE_ID__MYID:
				return isSetMyid();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (myid: ");
		if (myidESet) result.append(myid); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RealSequenceIDImpl
