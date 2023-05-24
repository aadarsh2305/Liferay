/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.serviceBuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SpringMvcLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SpringMvcLocalService
 * @generated
 */
public class SpringMvcLocalServiceWrapper
	implements ServiceWrapper<SpringMvcLocalService>, SpringMvcLocalService {

	public SpringMvcLocalServiceWrapper() {
		this(null);
	}

	public SpringMvcLocalServiceWrapper(
		SpringMvcLocalService springMvcLocalService) {

		_springMvcLocalService = springMvcLocalService;
	}

	/**
	 * Adds the spring mvc to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpringMvcLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param springMvc the spring mvc
	 * @return the spring mvc that was added
	 */
	@Override
	public com.test.serviceBuilder.model.SpringMvc addSpringMvc(
		com.test.serviceBuilder.model.SpringMvc springMvc) {

		return _springMvcLocalService.addSpringMvc(springMvc);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _springMvcLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new spring mvc with the primary key. Does not add the spring mvc to the database.
	 *
	 * @param id the primary key for the new spring mvc
	 * @return the new spring mvc
	 */
	@Override
	public com.test.serviceBuilder.model.SpringMvc createSpringMvc(long id) {
		return _springMvcLocalService.createSpringMvc(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _springMvcLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the spring mvc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpringMvcLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the spring mvc
	 * @return the spring mvc that was removed
	 * @throws PortalException if a spring mvc with the primary key could not be found
	 */
	@Override
	public com.test.serviceBuilder.model.SpringMvc deleteSpringMvc(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _springMvcLocalService.deleteSpringMvc(id);
	}

	/**
	 * Deletes the spring mvc from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpringMvcLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param springMvc the spring mvc
	 * @return the spring mvc that was removed
	 */
	@Override
	public com.test.serviceBuilder.model.SpringMvc deleteSpringMvc(
		com.test.serviceBuilder.model.SpringMvc springMvc) {

		return _springMvcLocalService.deleteSpringMvc(springMvc);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _springMvcLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _springMvcLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _springMvcLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _springMvcLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.test.serviceBuilder.model.impl.SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _springMvcLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.test.serviceBuilder.model.impl.SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _springMvcLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _springMvcLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _springMvcLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.test.serviceBuilder.model.SpringMvc fetchSpringMvc(long id) {
		return _springMvcLocalService.fetchSpringMvc(id);
	}

	/**
	 * Returns the spring mvc matching the UUID and group.
	 *
	 * @param uuid the spring mvc's UUID
	 * @param groupId the primary key of the group
	 * @return the matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	@Override
	public com.test.serviceBuilder.model.SpringMvc
		fetchSpringMvcByUuidAndGroupId(String uuid, long groupId) {

		return _springMvcLocalService.fetchSpringMvcByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _springMvcLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _springMvcLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _springMvcLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _springMvcLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _springMvcLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the spring mvc with the primary key.
	 *
	 * @param id the primary key of the spring mvc
	 * @return the spring mvc
	 * @throws PortalException if a spring mvc with the primary key could not be found
	 */
	@Override
	public com.test.serviceBuilder.model.SpringMvc getSpringMvc(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _springMvcLocalService.getSpringMvc(id);
	}

	/**
	 * Returns the spring mvc matching the UUID and group.
	 *
	 * @param uuid the spring mvc's UUID
	 * @param groupId the primary key of the group
	 * @return the matching spring mvc
	 * @throws PortalException if a matching spring mvc could not be found
	 */
	@Override
	public com.test.serviceBuilder.model.SpringMvc getSpringMvcByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _springMvcLocalService.getSpringMvcByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the spring mvcs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.test.serviceBuilder.model.impl.SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @return the range of spring mvcs
	 */
	@Override
	public java.util.List<com.test.serviceBuilder.model.SpringMvc>
		getSpringMvcs(int start, int end) {

		return _springMvcLocalService.getSpringMvcs(start, end);
	}

	/**
	 * Returns all the spring mvcs matching the UUID and company.
	 *
	 * @param uuid the UUID of the spring mvcs
	 * @param companyId the primary key of the company
	 * @return the matching spring mvcs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.test.serviceBuilder.model.SpringMvc>
		getSpringMvcsByUuidAndCompanyId(String uuid, long companyId) {

		return _springMvcLocalService.getSpringMvcsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of spring mvcs matching the UUID and company.
	 *
	 * @param uuid the UUID of the spring mvcs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching spring mvcs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.test.serviceBuilder.model.SpringMvc>
		getSpringMvcsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.test.serviceBuilder.model.SpringMvc> orderByComparator) {

		return _springMvcLocalService.getSpringMvcsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of spring mvcs.
	 *
	 * @return the number of spring mvcs
	 */
	@Override
	public int getSpringMvcsCount() {
		return _springMvcLocalService.getSpringMvcsCount();
	}

	/**
	 * Updates the spring mvc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpringMvcLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param springMvc the spring mvc
	 * @return the spring mvc that was updated
	 */
	@Override
	public com.test.serviceBuilder.model.SpringMvc updateSpringMvc(
		com.test.serviceBuilder.model.SpringMvc springMvc) {

		return _springMvcLocalService.updateSpringMvc(springMvc);
	}

	@Override
	public SpringMvcLocalService getWrappedService() {
		return _springMvcLocalService;
	}

	@Override
	public void setWrappedService(SpringMvcLocalService springMvcLocalService) {
		_springMvcLocalService = springMvcLocalService;
	}

	private SpringMvcLocalService _springMvcLocalService;

}