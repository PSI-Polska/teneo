/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEPackageValidator.java,v 1.3 2008/04/23 15:44:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.hibernate.hbannotation.FilterDef;
import org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator;
import org.eclipse.emf.teneo.hibernate.hbannotation.NamedQuery;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;

/**
 * A sample validator interface for
 * {@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage}. This doesn't really do
 * anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HbAnnotatedEPackageValidator {
	boolean validate();

	boolean validateHbGenericGenerators(EList<GenericGenerator> value);

	boolean validateHbTypeDef(EList<TypeDef> value);

	boolean validateHbNamedQuery(EList<NamedQuery> value);

	boolean validateFilterDef(EList<FilterDef> value);
}
