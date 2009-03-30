/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
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
 * $Id: Document.java,v 1.8 2009/03/30 06:40:59 mtaal Exp $
 */

package org.eclipse.emf.teneo.simpledom;

/**
 * This simple class is part of the replacement of dom4j.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */

public class Document {

	/** The doctype */
	private String docType = "";

	/** Root element */
	private Element root = null;

	/** Set the docType */
	public void setDocType(String docType) {
		this.docType = docType;
	}

	/** Set the root */
	public Element setRoot(Element root) {
		this.root = root;
		return root;
	}

	/** Return the root */
	public Element getRoot() {
		return root;
	}

	/** Emit ourselve as a XML string */
	public String emitXML() {
		final StringBuffer result = new StringBuffer(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		if (docType.length() > 0) {
			result.append(docType + "\n");
		}
		// removed the following line because then comparison between different
		// versions
		// of hbm files is easier.
		// result.append("<!--\tGenerated by Teneo on " + new Date() + " -->");
		result.append(root.emitXML());
		return result.toString();
	}
}