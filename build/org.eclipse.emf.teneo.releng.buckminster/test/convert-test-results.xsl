<?xml version="1.0" encoding="UTF-8" ?>
<!-- 
Copyright (c) 2010 Martin Taal (Doorn, The Netherlands) and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
   Martin Taal - changes for Teneo
-->

<!--
Converts the output from the Buckminster junit test launch to a xml format readable by junitreport and hudson.

See here:
http://old.nabble.com/schema-for-junit-xml-output-td22193385.html
-->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
<xsl:param name="timeStamp"/>
<xsl:param name="testName"/>
<xsl:param name="testPackage"/>

<xsl:template match="/">
<xsl:apply-templates/>
</xsl:template>

<xsl:template match="testsuites">
	<testsuite errors="{@errors}" failures="{@failures}" hostname="build" id="0" name="{$testName}" package="{$testPackage}" tests="{@tests}" time="100" timestamp="{$timeStamp}">
	<properties/>
	<xsl:for-each select="testsuite//testcase">
		<testcase classname="{../@name}" name="{@name}" time="{@time}">
			<xsl:copy-of select="*" />
		</testcase>
	</xsl:for-each> 
		<system-out/>
		<system-err/>
	</testsuite>
</xsl:template>
</xsl:stylesheet>