/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonaeTypeImpl.java,v 1.1 2006/07/11 16:57:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personae Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaeTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaeTypeImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaeTypeImpl#getPersonaGroup <em>Persona Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaeTypeImpl extends EObjectImpl implements PersonaeType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PlayPackage.eINSTANCE.getPersonaeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, PlayPackage.PERSONAE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTitle() {
		return ((FeatureMap)getGroup()).list(PlayPackage.eINSTANCE.getPersonaeType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPersona() {
		return ((FeatureMap)getGroup()).list(PlayPackage.eINSTANCE.getPersonaeType_Persona());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPersonaGroup() {
		return ((FeatureMap)getGroup()).list(PlayPackage.eINSTANCE.getPersonaeType_PersonaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PlayPackage.PERSONAE_TYPE__GROUP:
					return ((InternalEList)getGroup()).basicRemove(otherEnd, msgs);
				case PlayPackage.PERSONAE_TYPE__PERSONA_GROUP:
					return ((InternalEList)getPersonaGroup()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PlayPackage.PERSONAE_TYPE__GROUP:
				return getGroup();
			case PlayPackage.PERSONAE_TYPE__TITLE:
				return getTitle();
			case PlayPackage.PERSONAE_TYPE__PERSONA:
				return getPersona();
			case PlayPackage.PERSONAE_TYPE__PERSONA_GROUP:
				return getPersonaGroup();
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
			case PlayPackage.PERSONAE_TYPE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection)newValue);
				return;
			case PlayPackage.PERSONAE_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection)newValue);
				return;
			case PlayPackage.PERSONAE_TYPE__PERSONA:
				getPersona().clear();
				getPersona().addAll((Collection)newValue);
				return;
			case PlayPackage.PERSONAE_TYPE__PERSONA_GROUP:
				getPersonaGroup().clear();
				getPersonaGroup().addAll((Collection)newValue);
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
			case PlayPackage.PERSONAE_TYPE__GROUP:
				getGroup().clear();
				return;
			case PlayPackage.PERSONAE_TYPE__TITLE:
				getTitle().clear();
				return;
			case PlayPackage.PERSONAE_TYPE__PERSONA:
				getPersona().clear();
				return;
			case PlayPackage.PERSONAE_TYPE__PERSONA_GROUP:
				getPersonaGroup().clear();
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
			case PlayPackage.PERSONAE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case PlayPackage.PERSONAE_TYPE__TITLE:
				return !getTitle().isEmpty();
			case PlayPackage.PERSONAE_TYPE__PERSONA:
				return !getPersona().isEmpty();
			case PlayPackage.PERSONAE_TYPE__PERSONA_GROUP:
				return !getPersonaGroup().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //PersonaeTypeImpl
