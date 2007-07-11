/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEStructuralFeatureValidator.java,v 1.2 2007/07/11 17:15:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.validation;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pannotation.ForeignKey;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PAnnotatedEStructuralFeatureValidator {
	boolean validate();

	boolean validatePaEClass(PAnnotatedEClass value);
	boolean validateAnnotatedEStructuralFeature(EStructuralFeature value);

	boolean validateForeignKey(ForeignKey value);
}
