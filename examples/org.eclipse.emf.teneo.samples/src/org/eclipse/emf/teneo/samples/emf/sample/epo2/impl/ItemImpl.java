/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemImpl.java,v 1.2 2006/11/07 10:22:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.epo2.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.Item;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.ItemImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.ItemImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.ItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.ItemImpl#getUSPrice <em>US Price</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.ItemImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.ItemImpl#getShipDate <em>Ship Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.ItemImpl#getPartNum <em>Part Num</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends EObjectImpl implements Item {
	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUSPrice() <em>US Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int US_PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUSPrice() <em>US Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSPrice()
	 * @generated
	 * @ordered
	 */
	protected int usPrice = US_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipDate() <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHIP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipDate() <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipDate()
	 * @generated
	 * @ordered
	 */
	protected Date shipDate = SHIP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartNum() <em>Part Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNum()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNum() <em>Part Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNum()
	 * @generated
	 * @ordered
	 */
	protected String partNum = PART_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EPO2Package.eINSTANCE.getItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaseOrder getOrder() {
		if (eContainerFeatureID != EPO2Package.ITEM__ORDER) return null;
		return (PurchaseOrder)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(PurchaseOrder newOrder) {
		if (newOrder != eContainer || (eContainerFeatureID != EPO2Package.ITEM__ORDER && newOrder != null)) {
			if (EcoreUtil.isAncestor(this, newOrder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EPO2Package.PURCHASE_ORDER__ITEMS, PurchaseOrder.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOrder, EPO2Package.ITEM__ORDER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPO2Package.ITEM__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPO2Package.ITEM__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPO2Package.ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUSPrice() {
		return usPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUSPrice(int newUSPrice) {
		int oldUSPrice = usPrice;
		usPrice = newUSPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPO2Package.ITEM__US_PRICE, oldUSPrice, usPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPO2Package.ITEM__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getShipDate() {
		return shipDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipDate(Date newShipDate) {
		Date oldShipDate = shipDate;
		shipDate = newShipDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPO2Package.ITEM__SHIP_DATE, oldShipDate, shipDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartNum() {
		return partNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartNum(String newPartNum) {
		String oldPartNum = partNum;
		partNum = newPartNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPO2Package.ITEM__PART_NUM, oldPartNum, partNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case EPO2Package.ITEM__ORDER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, EPO2Package.ITEM__ORDER, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case EPO2Package.ITEM__ORDER:
					return eBasicSetContainer(null, EPO2Package.ITEM__ORDER, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case EPO2Package.ITEM__ORDER:
					return eContainer.eInverseRemove(this, EPO2Package.PURCHASE_ORDER__ITEMS, PurchaseOrder.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case EPO2Package.ITEM__ORDER:
				return getOrder();
			case EPO2Package.ITEM__PRODUCT_NAME:
				return getProductName();
			case EPO2Package.ITEM__QUANTITY:
				return new Integer(getQuantity());
			case EPO2Package.ITEM__US_PRICE:
				return new Integer(getUSPrice());
			case EPO2Package.ITEM__COMMENT:
				return getComment();
			case EPO2Package.ITEM__SHIP_DATE:
				return getShipDate();
			case EPO2Package.ITEM__PART_NUM:
				return getPartNum();
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
			case EPO2Package.ITEM__ORDER:
				setOrder((PurchaseOrder)newValue);
				return;
			case EPO2Package.ITEM__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case EPO2Package.ITEM__QUANTITY:
				setQuantity(((Integer)newValue).intValue());
				return;
			case EPO2Package.ITEM__US_PRICE:
				setUSPrice(((Integer)newValue).intValue());
				return;
			case EPO2Package.ITEM__COMMENT:
				setComment((String)newValue);
				return;
			case EPO2Package.ITEM__SHIP_DATE:
				setShipDate((Date)newValue);
				return;
			case EPO2Package.ITEM__PART_NUM:
				setPartNum((String)newValue);
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
			case EPO2Package.ITEM__ORDER:
				setOrder((PurchaseOrder)null);
				return;
			case EPO2Package.ITEM__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case EPO2Package.ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case EPO2Package.ITEM__US_PRICE:
				setUSPrice(US_PRICE_EDEFAULT);
				return;
			case EPO2Package.ITEM__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case EPO2Package.ITEM__SHIP_DATE:
				setShipDate(SHIP_DATE_EDEFAULT);
				return;
			case EPO2Package.ITEM__PART_NUM:
				setPartNum(PART_NUM_EDEFAULT);
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
			case EPO2Package.ITEM__ORDER:
				return getOrder() != null;
			case EPO2Package.ITEM__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case EPO2Package.ITEM__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case EPO2Package.ITEM__US_PRICE:
				return usPrice != US_PRICE_EDEFAULT;
			case EPO2Package.ITEM__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case EPO2Package.ITEM__SHIP_DATE:
				return SHIP_DATE_EDEFAULT == null ? shipDate != null : !SHIP_DATE_EDEFAULT.equals(shipDate);
			case EPO2Package.ITEM__PART_NUM:
				return PART_NUM_EDEFAULT == null ? partNum != null : !PART_NUM_EDEFAULT.equals(partNum);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (productName: ");
		result.append(productName);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", USPrice: ");
		result.append(usPrice);
		result.append(", comment: ");
		result.append(comment);
		result.append(", shipDate: ");
		result.append(shipDate);
		result.append(", partNum: ");
		result.append(partNum);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
