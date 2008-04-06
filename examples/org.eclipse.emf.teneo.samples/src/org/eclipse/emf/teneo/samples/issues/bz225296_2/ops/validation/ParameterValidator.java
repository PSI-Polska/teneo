/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterValidator.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.validation;

import java.util.Date;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParameterValidator {
	boolean validate();

	boolean validateId(long value);
	boolean validateModified(Date value);
	boolean validateRevision(int value);
	boolean validateKey(String value);
	boolean validateValue(String value);
}
