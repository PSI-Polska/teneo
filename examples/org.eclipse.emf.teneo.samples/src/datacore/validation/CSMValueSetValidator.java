/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMValueSetValidator.java,v 1.1 2007/03/07 23:34:07 mtaal Exp $
 */
package datacore.validation;

import datacore.CSMType;

/**
 * A sample validator interface for {@link datacore.CSMValueSet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CSMValueSetValidator {
	boolean validate();

	boolean validateDataType(CSMType value);
}
