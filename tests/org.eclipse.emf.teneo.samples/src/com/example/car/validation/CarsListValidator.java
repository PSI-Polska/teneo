/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarsListValidator.java,v 1.1 2007/08/10 20:17:32 mtaal Exp $
 */
package com.example.car.validation;

import com.example.car.CarLink;
import com.example.car.CarType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link com.example.car.CarsList}. This doesn't really do
 * anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CarsListValidator {
	boolean validate();

	boolean validateCarType(EList<CarType> value);

	boolean validateCarLink(EList<CarLink> value);
}
