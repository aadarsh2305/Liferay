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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.test.serviceBuilder.model.SpringMvc;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SpringMvc. This utility wraps
 * <code>com.test.serviceBuilder.service.impl.SpringMvcLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SpringMvcLocalService
 * @generated
 */
public class SpringMvcLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.test.serviceBuilder.service.impl.SpringMvcLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static SpringMvc addSpringMvc(SpringMvc springMvc) {
		return getService().addSpringMvc(springMvc);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new spring mvc with the primary key. Does not add the spring mvc to the database.
	 *
	 * @param id the primary key for the new spring mvc
	 * @return the new spring mvc
	 */
	public static SpringMvc createSpringMvc(long id) {
		return getService().createSpringMvc(id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static SpringMvc deleteSpringMvc(long id) throws PortalException {
		return getService().deleteSpringMvc(id);
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
	public static SpringMvc deleteSpringMvc(SpringMvc springMvc) {
		return getService().deleteSpringMvc(springMvc);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static SpringMvc fetchSpringMvc(long id) {
		return getService().fetchSpringMvc(id);
	}

	/**
	 * Returns the spring mvc matching the UUID and group.
	 *
	 * @param uuid the spring mvc's UUID
	 * @param groupId the primary key of the group
	 * @return the matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public static SpringMvc fetchSpringMvcByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchSpringMvcByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the spring mvc with the primary key.
	 *
	 * @param id the primary key of the spring mvc
	 * @return the spring mvc
	 * @throws PortalException if a spring mvc with the primary key could not be found
	 */
	public static SpringMvc getSpringMvc(long id) throws PortalException {
		return getService().getSpringMvc(id);
	}

	/**
	 * Returns the spring mvc matching the UUID and group.
	 *
	 * @param uuid the spring mvc's UUID
	 * @param groupId the primary key of the group
	 * @return the matching spring mvc
	 * @throws PortalException if a matching spring mvc could not be found
	 */
	public static SpringMvc getSpringMvcByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getSpringMvcByUuidAndGroupId(uuid, groupId);
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
	public static List<SpringMvc> getSpringMvcs(int start, int end) {
		return getService().getSpringMvcs(start, end);
	}

	/**
	 * Returns all the spring mvcs matching the UUID and company.
	 *
	 * @param uuid the UUID of the spring mvcs
	 * @param companyId the primary key of the company
	 * @return the matching spring mvcs, or an empty list if no matches were found
	 */
	public static List<SpringMvc> getSpringMvcsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getSpringMvcsByUuidAndCompanyId(uuid, companyId);
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
	public static List<SpringMvc> getSpringMvcsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SpringMvc> orderByComparator) {

		return getService().getSpringMvcsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of spring mvcs.
	 *
	 * @return the number of spring mvcs
	 */
	public static int getSpringMvcsCount() {
		return getService().getSpringMvcsCount();
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
	public static SpringMvc updateSpringMvc(SpringMvc springMvc) {
		return getService().updateSpringMvc(springMvc);
	}

	public static SpringMvcLocalService getService() {
		return _service;
	}

	private static volatile SpringMvcLocalService _service;

}