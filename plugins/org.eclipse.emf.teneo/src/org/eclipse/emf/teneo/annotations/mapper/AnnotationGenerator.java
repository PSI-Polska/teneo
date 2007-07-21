/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: AnnotationGenerator.java,v 1.1 2007/07/12 12:55:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerAware;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;

/**
 * Adds default annotations to an existing pamodel. Default annotations are added on the basis of
 * the emf type information. It sets the default annotations according to the ejb3 spec.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class AnnotationGenerator implements ExtensionPoint, ExtensionManagerAware {

	// The logger
	protected static final Log log = LogFactory.getLog(AnnotationGenerator.class);

	protected PersistenceOptions persistenceOptions;

	// the extension manager
	private ExtensionManager extensionManager;

	// Convenience link to pamodel factory
	private final PannotationFactory aFactory = PannotationFactory.eINSTANCE;

	// The annotated model which is being processed
	private PAnnotatedModel annotatedModel;

	// The annotators
	private EClassAnnotator eClassAnnotator;
	private EDataTypeAnnotator eDataTypeAnnotator;

	/**
	 * Adds default annotations to a pamodel, the method is synchronized because globals are set.
	 * Not necessary because this class should always be used single threaded but okay.
	 */
	public synchronized void map(PAnnotatedModel annotatedModel, PersistenceOptions po) {

		persistenceOptions = po;

		// check if the emodelresolver has been set, if not then
		// use the ERuntime as the default
		try {
			if (EModelResolver.instance() == null) { // fails anyway but this
				// will not be optimised
				// away
				// set the eruntime as the default emodel resolver!
				ERuntime.setAsEModelResolver();
			}
		} catch (IllegalStateException e) {
			// not set, set the eruntime as the emodel resolver!
			ERuntime.setAsEModelResolver();
		}

		final List<PAnnotatedEPackage> apacks = annotatedModel.getPaEPackages();

		final EPackage[] epacks = new EPackage[apacks.size()];
		int cnt = 0;
		for (PAnnotatedEPackage apack : apacks) {
			epacks[cnt++] = apack.getAnnotatedEPackage();
		}

		log.debug("Registering epackages in model resolver, modelresolver instance is: " +
				EModelResolver.instance().getClass().getName());
		EModelResolver.instance().register(epacks);

		// if force fully classify typename then use the EModelResolver/ERuntime
		if (persistenceOptions.isAlsoMapAsClass()) {
			log.debug("Class names are to be fully classified, registering all the " + "epackages");
			// and now set the map as entity for each eclass
			for (PAnnotatedEPackage apack : annotatedModel.getPaEPackages()) {
				for (PAnnotatedEClass aclass : apack.getPaEClasses()) {
					aclass.setOnlyMapAsEntity(!EModelResolver.instance().hasImplementationClass(
						aclass.getAnnotatedEClass()));
				}
			}
		}

		annotatedModel.setInitialized(true);
		this.annotatedModel = annotatedModel;

		// initialize the strategies so they have the correct information
		// TODO this should be handled in aware like interfaces
		final EntityNameStrategy entityNameStrategy = extensionManager.getExtension(EntityNameStrategy.class);
		entityNameStrategy.setPaModel(annotatedModel); // is maybe already set?
		final SQLNameStrategy sqlNameStrategy = extensionManager.getExtension(SQLNameStrategy.class);
		sqlNameStrategy.setPersistenceOptions(po);

		setAnnotators();
		for (PAnnotatedEPackage pae : annotatedModel.getPaEPackages()) {
			processPackage(pae);
		}
	}

	/** Set the annotators */
	protected void setAnnotators() {
		eClassAnnotator = createAnnotator(EClassAnnotator.class);
		eDataTypeAnnotator = createAnnotator(EDataTypeAnnotator.class);
	}

	/** Creates an annotator and sets all kinds of default info */
	private <T extends AbstractAnnotator> T createAnnotator(Class<T> clz) {
		final T annotator = extensionManager.getExtension(clz);
		annotator.setAnnotatedModel(annotatedModel);
		annotator.setExtensionManager(extensionManager);
		annotator.setPersistenceOptions(persistenceOptions);
		annotator.setFactory(aFactory);
		annotator.initialize();
		return annotator;
	}

	/** Maps one epackage */
	protected void processPackage(PAnnotatedEPackage aPackage) {
		log.debug(">>>> Adding default annotations for EPackage " + aPackage.getAnnotatedElement().getName());

		log.debug("Processing EDataTypes");
		for (PAnnotatedEDataType annotatedEDataType : aPackage.getPaEDataTypes()) {
			eDataTypeAnnotator.annotate(annotatedEDataType);
		}

		log.debug("Processing EClasses");
		for (PAnnotatedEClass annotatedEClass : aPackage.getPaEClasses()) {
			eClassAnnotator.annotate(annotatedEClass);
		}
	}

	/**
	 * @param extensionManager
	 *            the extensionManager to set
	 */
	public void setExtensionManager(ExtensionManager extensionManager) {
		this.extensionManager = extensionManager;
	}
}