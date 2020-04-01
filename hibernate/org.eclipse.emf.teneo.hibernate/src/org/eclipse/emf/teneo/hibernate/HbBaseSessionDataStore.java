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
 *   Martin Taal
 * </copyright>
 *
 * $Id: HbBaseSessionDataStore.java,v 1.11 2010/11/11 10:28:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.CustomEntityDirtinessStrategy;
import org.hibernate.HibernateException;
import org.hibernate.Interceptor;
import org.hibernate.MappingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.StatelessSession;
import org.hibernate.StatelessSessionBuilder;
import org.hibernate.TypeHelper;
import org.hibernate.boot.spi.SessionFactoryOptions;
import org.hibernate.cfg.Settings;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.hibernate.dialect.function.SQLFunctionRegistry;
import org.hibernate.engine.jdbc.spi.JdbcServices;
import org.hibernate.engine.profile.FetchProfile;
import org.hibernate.engine.query.spi.QueryPlanCache;
import org.hibernate.engine.spi.CacheImplementor;
import org.hibernate.engine.spi.FilterDefinition;
import org.hibernate.engine.spi.SessionBuilderImplementor;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.factory.IdentifierGeneratorFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.metadata.CollectionMetadata;
import org.hibernate.metamodel.spi.MetamodelImplementor;
import org.hibernate.proxy.EntityNotFoundDelegate;
import org.hibernate.query.spi.NamedQueryRepository;
import org.hibernate.service.spi.ServiceRegistryImplementor;
import org.hibernate.stat.spi.StatisticsImplementor;
import org.hibernate.type.Type;
import org.hibernate.type.TypeResolver;

/**
 * Holds the sessionfactory related methods, makes the HbSessionDataStore better readable.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.11 $
 */
public abstract class HbBaseSessionDataStore extends HbDataStore implements SessionFactory,
		SessionFactoryImplementor {

	private static final long serialVersionUID = 1L;

	/** The persistency manager factory */
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbDataStore#close()
	 */
	@Override
	public void close() {
		if (isInitialized()) {
			closeSessionFactory();
			// this will call the close method again but because the
			// datastore
			// is not initialized anymore it won't get here
			HbHelper.INSTANCE.deRegisterDataStore(this);
		}
	}

	/**
	 * @return the sessionFactory
	 */
	@Override
	public SessionFactoryImplementor getSessionFactory() {
		if (!isInitialized()) {
			initialize();
		}
		return (SessionFactoryImplementor) sessionFactory;
	}

	// close session factory if set
	protected void closeSessionFactory() {
		if (sessionFactory != null && !sessionFactory.isClosed()) {
			sessionFactory.close();
			sessionFactory = null;
		}
		// do set initialized false after closing it
		setInitialized(false);
	}

	/**
	 * @param sessionFactory
	 *          the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() throws HibernateException {
		return getSessionFactory().getCurrentSession();
	}

	@SuppressWarnings("rawtypes")
	public Set getDefinedFilterNames() {
		return getSessionFactory().getDefinedFilterNames();
	}

	public FilterDefinition getFilterDefinition(String filterName) throws HibernateException {
		return getSessionFactory().getFilterDefinition(filterName);
	}

	public Reference getReference() throws NamingException {
		return getSessionFactory().getReference();
	}

	public boolean isClosed() {
		return getSessionFactory().isClosed();
	}

	public Session openSession() throws HibernateException {
		return getSessionFactory().openSession();
	}

	public Session openSession(Connection connection, Interceptor interceptor) {
		return ((SessionFactoryImpl) getSessionFactory()).withOptions().interceptor(interceptor)
				.connection(connection).openSession();
	}

	public Session openSession(Connection connection) {
		return ((SessionFactoryImpl) getSessionFactory()).withOptions().connection(connection)
				.openSession();
	}

	public Session openSession(Interceptor interceptor) throws HibernateException {
		return ((SessionFactoryImpl) getSessionFactory()).withOptions().interceptor(interceptor)
				.openSession();
	}

	public StatelessSession openStatelessSession() {
		return getSessionFactory().openStatelessSession();
	}

	public StatelessSession openStatelessSession(Connection connection) {
		return getSessionFactory().openStatelessSession(connection);
	}

	public void addObserver(SessionFactoryObserver arg0) {
		getSessionFactory().addObserver(arg0);
	}

	public boolean containsFetchProfileDefinition(String arg0) {
		return getSessionFactory().containsFetchProfileDefinition(arg0);
	}

	public CurrentTenantIdentifierResolver getCurrentTenantIdentifierResolver() {
		return getSessionFactory().getCurrentTenantIdentifierResolver();
	}

	public CustomEntityDirtinessStrategy getCustomEntityDirtinessStrategy() {
		return getSessionFactory().getCustomEntityDirtinessStrategy();
	}

	public EntityNotFoundDelegate getEntityNotFoundDelegate() {
		return getSessionFactory().getEntityNotFoundDelegate();
	}

	public FetchProfile getFetchProfile(String arg0) {
		return getSessionFactory().getFetchProfile(arg0);
	}

	public IdentifierGenerator getIdentifierGenerator(String arg0) {
		return getSessionFactory().getIdentifierGenerator(arg0);
	}

	@Deprecated
	public IdentifierGeneratorFactory getIdentifierGeneratorFactory() {
		return getSessionFactory().getIdentifierGeneratorFactory();
	}

	public String getIdentifierPropertyName(String arg0) throws MappingException {
		return getSessionFactory().getIdentifierPropertyName(arg0);
	}

	public Type getIdentifierType(String arg0) throws MappingException {
		return getSessionFactory().getIdentifierType(arg0);
	}

	public JdbcServices getJdbcServices() {
		return getSessionFactory().getJdbcServices();
	}

	public Type getReferencedPropertyType(String arg0, String arg1) throws MappingException {
		return getSessionFactory().getReferencedPropertyType(arg0, arg1);
	}

	public ServiceRegistryImplementor getServiceRegistry() {
		return getSessionFactory().getServiceRegistry();
	}

	public SessionFactoryOptions getSessionFactoryOptions() {
		return getSessionFactory().getSessionFactoryOptions();
	}

	public SQLFunctionRegistry getSqlFunctionRegistry() {
		return getSessionFactory().getSqlFunctionRegistry();
	}

	public TypeHelper getTypeHelper() {
		return getSessionFactory().getTypeHelper();
	}

	public Session openTemporarySession() throws HibernateException {
		return getSessionFactory().openTemporarySession();
	}

	@SuppressWarnings("rawtypes")
	public SessionBuilderImplementor withOptions() {
		return getSessionFactory().withOptions();
	}

	@SuppressWarnings("rawtypes")
	public StatelessSessionBuilder withStatelessOptions() {
		return getSessionFactory().withStatelessOptions();
	}

	public <T> void addNamedEntityGraph(String arg0, EntityGraph<T> arg1) {
		getSessionFactory().addNamedEntityGraph(arg0, arg1);
	}

	public void addNamedQuery(String arg0, Query arg1) {
		getSessionFactory().addNamedQuery(arg0, arg1);
	}

	public EntityManager createEntityManager() {
		return getSessionFactory().createEntityManager();
	}

	public EntityManager createEntityManager(Map arg0) {
		return getSessionFactory().createEntityManager(arg0);
	}

	public EntityManager createEntityManager(SynchronizationType arg0) {
		return getSessionFactory().createEntityManager(arg0);
	}

	public EntityManager createEntityManager(SynchronizationType arg0,
			@SuppressWarnings("rawtypes") Map arg1) {
		return getSessionFactory().createEntityManager(arg0, arg1);
	}

	public CriteriaBuilder getCriteriaBuilder() {
		return getSessionFactory().getCriteriaBuilder();
	}

	public PersistenceUnitUtil getPersistenceUnitUtil() {
		return getSessionFactory().getPersistenceUnitUtil();
	}

	public Map<String, Object> getProperties() {
		return getSessionFactory().getProperties();
	}

	public boolean isOpen() {
		return getSessionFactory().isOpen();
	}

	public <T> T unwrap(Class<T> arg0) {
		return getSessionFactory().unwrap(arg0);
	}

	public <T> List<EntityGraph<? super T>> findEntityGraphsByType(Class<T> arg0) {
		return getSessionFactory().findEntityGraphsByType(arg0);
	}

	@SuppressWarnings("rawtypes")
	public EntityGraph findEntityGraphByName(String arg0) {
		return getSessionFactory().findEntityGraphByName(arg0);
	}

	public CacheImplementor getCache() {
		return getSessionFactory().getCache();
	}

	@SuppressWarnings("rawtypes")
	public DeserializationResolver getDeserializationResolver() {
		return getSessionFactory().getDeserializationResolver();
	}

	public MetamodelImplementor getMetamodel() {
		return getSessionFactory().getMetamodel();
	}

	public StatisticsImplementor getStatistics() {
		return getSessionFactory().getStatistics();
	}

	public String getUuid() {
		return getSessionFactory().getUuid();
	}

	public Type resolveParameterBindType(Object arg0) {
		return getSessionFactory().resolveParameterBindType(arg0);
	}

	public Type resolveParameterBindType(@SuppressWarnings("rawtypes") Class arg0) {
		return getSessionFactory().resolveParameterBindType(arg0);
	}

	public Map<String, ClassMetadata> getAllClassMetadata() {
		return getSessionFactory().getAllClassMetadata();
	}

	public Map getAllCollectionMetadata() {
		return getSessionFactory().getAllCollectionMetadata();
	}

	public ClassMetadata getClassMetadata(Class arg0) {
		return getSessionFactory().getClassMetadata(arg0);
	}

	public ClassMetadata getClassMetadata(String arg0) {
		return getSessionFactory().getClassMetadata(arg0);
	}

	public CollectionMetadata getCollectionMetadata(String arg0) {
		return getSessionFactory().getCollectionMetadata(arg0);
	}

	public Map getAllSecondLevelCacheRegions() {
		return getSessionFactory().getAllSecondLevelCacheRegions();
	}

	public NamedQueryRepository getNamedQueryRepository() {
		return getSessionFactory().getNamedQueryRepository();
	}

	public QueryPlanCache getQueryPlanCache() {
		return getSessionFactory().getQueryPlanCache();
	}

	public Settings getSettings() {
		return getSessionFactory().getSettings();
	}

	public TypeResolver getTypeResolver() {
		return getSessionFactory().getTypeResolver();
	}
}