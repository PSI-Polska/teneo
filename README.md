Eclipse Teneo
=============

This fork contains the 2.1.0 version of Teneo. For more information visit the Teneo wiki: http://wiki.eclipse.org/Teneo

Changes
------
* Migration to Hibernate 5.2.1.Final
* Metadata management moved to HbEntityDataStore + some fixes required for extending the model
* Destroying service registry on close - for preventing connection leaks
* Memory leaks eliminated when EObjects are keys of maps in the IdentifierCacheHandler

Licensing
------
Each module contains separate license files (as in source repository).