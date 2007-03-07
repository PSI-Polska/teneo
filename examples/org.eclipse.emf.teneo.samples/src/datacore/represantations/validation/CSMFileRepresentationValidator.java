/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMFileRepresentationValidator.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.represantations.validation;


/**
 * A sample validator interface for {@link datacore.represantations.CSMFileRepresentation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CSMFileRepresentationValidator {
	boolean validate();

	boolean validateLocation(String value);
}
