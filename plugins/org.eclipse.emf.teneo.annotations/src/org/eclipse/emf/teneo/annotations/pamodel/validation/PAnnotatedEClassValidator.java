/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEClassValidator.java,v 1.3 2009/08/21 10:16:53 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;

import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.EAVMapping;
import org.eclipse.emf.teneo.annotations.pannotation.Embeddable;
import org.eclipse.emf.teneo.annotations.pannotation.Entity;
import org.eclipse.emf.teneo.annotations.pannotation.IdClass;
import org.eclipse.emf.teneo.annotations.pannotation.Inheritance;
import org.eclipse.emf.teneo.annotations.pannotation.MappedSuperclass;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PAnnotatedEClassValidator {
	boolean validate();

	boolean validatePaEPackage(PAnnotatedEPackage value);
	boolean validateModelEClass(EClass value);

	boolean validateAnnotatedEClass(EClass value);
	boolean validatePaEStructuralFeatures(EList<PAnnotatedEStructuralFeature> value);
	boolean validateAttributeOverrides(EList<AttributeOverride> value);
	boolean validateDiscriminatorColumn(DiscriminatorColumn value);
	boolean validateDiscriminatorValue(DiscriminatorValue value);
	boolean validateEmbeddable(Embeddable value);
	boolean validateMappedSuperclass(MappedSuperclass value);
	boolean validateEntity(Entity value);
	boolean validateIdClass(IdClass value);
	boolean validateInheritance(Inheritance value);
	boolean validatePrimaryKeyJoinColumns(EList<PrimaryKeyJoinColumn> value);
	boolean validateSecondaryTables(EList<SecondaryTable> value);
	boolean validateTable(Table value);
	boolean validateTableGenerator(TableGenerator value);
	boolean validateAssociationOverrides(EList<AssociationOverride> value);

	boolean validateEavMapping(EAVMapping value);
}
