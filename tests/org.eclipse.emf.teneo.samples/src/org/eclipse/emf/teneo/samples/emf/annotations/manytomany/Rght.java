/**
 * <copyright>
 * </copyright>
 *
 * $Id: Rght.java,v 1.5 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.manytomany;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rght</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght#getCntr <em>Cntr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage#getRght()
 * @model extendedMetaData="name='Rght' kind='elementOnly'"
 * @generated
 */
public interface Rght extends EObject {
	/**
	 * Returns the value of the '<em><b>Cntr</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getRght <em>Rght</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cntr</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cntr</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage#getRght_Cntr()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getRght
	 * @model opposite="rght" resolveProxies="false" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@ManyToMany(fetch=LAZY cascade={MERGE,PERSIST} targetEntity=\"Cntr\" mappedBy=\"rght\" indexed=\"false\")\n\t\t\t\t\t\t@JoinTable(name=\"RightCenter\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='cntr'"
	 * @generated
	 */
	EList<Cntr> getCntr();

} // Rght
