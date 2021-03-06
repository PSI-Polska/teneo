/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicValidator.java,v 1.1 2007/02/08 23:09:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.basic.validation;


/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BasicValidator {
	boolean validate();

	boolean validateMyOptionalBasic(String value);
	boolean validateMyVersion(long value);
	boolean validateMyTransient(String value);
}
