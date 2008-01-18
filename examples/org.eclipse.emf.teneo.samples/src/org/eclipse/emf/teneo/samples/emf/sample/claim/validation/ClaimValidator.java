/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimValidator.java,v 1.1 2008/01/18 06:20:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ClaimValidator {
	boolean validate();

	boolean validateClaimCompositeKey(ClaimCompositeKey value);
	boolean validateBillingName(String value);
	boolean validateClaimGroupVSPId(String value);
	boolean validateClaimStatus(String value);
	boolean validateClaimLine(EList<ClaimLine> value);
}
