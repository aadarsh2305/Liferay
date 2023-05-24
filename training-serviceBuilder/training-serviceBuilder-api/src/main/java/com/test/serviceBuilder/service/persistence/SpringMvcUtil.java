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

package com.test.serviceBuilder.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.test.serviceBuilder.model.SpringMvc;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the spring mvc service. This utility wraps <code>com.test.serviceBuilder.service.persistence.impl.SpringMvcPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpringMvcPersistence
 * @generated
 */
public class SpringMvcUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(SpringMvc springMvc) {
		getPersistence().clearCache(springMvc);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, SpringMvc> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SpringMvc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SpringMvc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SpringMvc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SpringMvc update(SpringMvc springMvc) {
		return getPersistence().update(springMvc);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SpringMvc update(
		SpringMvc springMvc, ServiceContext serviceContext) {

		return getPersistence().update(springMvc, serviceContext);
	}

	/**
	 * Returns all the spring mvcs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching spring mvcs
	 */
	public static List<SpringMvc> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the spring mvcs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @return the range of matching spring mvcs
	 */
	public static List<SpringMvc> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the spring mvcs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching spring mvcs
	 */
	public static List<SpringMvc> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the spring mvcs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching spring mvcs
	 */
	public static List<SpringMvc> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SpringMvc> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public static SpringMvc findByUuid_First(
			String uuid, OrderByComparator<SpringMvc> orderByComparator)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public static SpringMvc fetchByUuid_First(
		String uuid, OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public static SpringMvc findByUuid_Last(
			String uuid, OrderByComparator<SpringMvc> orderByComparator)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public static SpringMvc fetchByUuid_Last(
		String uuid, OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the spring mvcs before and after the current spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current spring mvc
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next spring mvc
	 * @throws NoSuchSpringMvcException if a spring mvc with the primary key could not be found
	 */
	public static SpringMvc[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<SpringMvc> orderByComparator)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the spring mvcs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of spring mvcs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching spring mvcs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the spring mvc where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSpringMvcException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public static SpringMvc findByUUID_G(String uuid, long groupId)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the spring mvc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public static SpringMvc fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the spring mvc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public static SpringMvc fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the spring mvc where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the spring mvc that was removed
	 */
	public static SpringMvc removeByUUID_G(String uuid, long groupId)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of spring mvcs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching spring mvcs
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the spring mvcs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching spring mvcs
	 */
	public static List<SpringMvc> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the spring mvcs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @return the range of matching spring mvcs
	 */
	public static List<SpringMvc> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the spring mvcs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching spring mvcs
	 */
	public static List<SpringMvc> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the spring mvcs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching spring mvcs
	 */
	public static List<SpringMvc> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SpringMvc> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first spring mvc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public static SpringMvc findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SpringMvc> orderByComparator)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first spring mvc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public static SpringMvc fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last spring mvc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public static SpringMvc findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SpringMvc> orderByComparator)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last spring mvc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public static SpringMvc fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the spring mvcs before and after the current spring mvc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current spring mvc
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next spring mvc
	 * @throws NoSuchSpringMvcException if a spring mvc with the primary key could not be found
	 */
	public static SpringMvc[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<SpringMvc> orderByComparator)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the spring mvcs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of spring mvcs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching spring mvcs
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the spring mvcs where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching spring mvcs
	 */
	public static List<SpringMvc> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	 * Returns a range of all the spring mvcs where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @return the range of matching spring mvcs
	 */
	public static List<SpringMvc> findByid(long id, int start, int end) {
		return getPersistence().findByid(id, start, end);
	}

	/**
	 * Returns an ordered range of all the spring mvcs where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching spring mvcs
	 */
	public static List<SpringMvc> findByid(
		long id, int start, int end,
		OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the spring mvcs where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching spring mvcs
	 */
	public static List<SpringMvc> findByid(
		long id, int start, int end,
		OrderByComparator<SpringMvc> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByid(
			id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first spring mvc in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public static SpringMvc findByid_First(
			long id, OrderByComparator<SpringMvc> orderByComparator)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	 * Returns the first spring mvc in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public static SpringMvc fetchByid_First(
		long id, OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	 * Returns the last spring mvc in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public static SpringMvc findByid_Last(
			long id, OrderByComparator<SpringMvc> orderByComparator)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	 * Returns the last spring mvc in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public static SpringMvc fetchByid_Last(
		long id, OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	 * Removes all the spring mvcs where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	 * Returns the number of spring mvcs where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching spring mvcs
	 */
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	 * Caches the spring mvc in the entity cache if it is enabled.
	 *
	 * @param springMvc the spring mvc
	 */
	public static void cacheResult(SpringMvc springMvc) {
		getPersistence().cacheResult(springMvc);
	}

	/**
	 * Caches the spring mvcs in the entity cache if it is enabled.
	 *
	 * @param springMvcs the spring mvcs
	 */
	public static void cacheResult(List<SpringMvc> springMvcs) {
		getPersistence().cacheResult(springMvcs);
	}

	/**
	 * Creates a new spring mvc with the primary key. Does not add the spring mvc to the database.
	 *
	 * @param id the primary key for the new spring mvc
	 * @return the new spring mvc
	 */
	public static SpringMvc create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the spring mvc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the spring mvc
	 * @return the spring mvc that was removed
	 * @throws NoSuchSpringMvcException if a spring mvc with the primary key could not be found
	 */
	public static SpringMvc remove(long id)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().remove(id);
	}

	public static SpringMvc updateImpl(SpringMvc springMvc) {
		return getPersistence().updateImpl(springMvc);
	}

	/**
	 * Returns the spring mvc with the primary key or throws a <code>NoSuchSpringMvcException</code> if it could not be found.
	 *
	 * @param id the primary key of the spring mvc
	 * @return the spring mvc
	 * @throws NoSuchSpringMvcException if a spring mvc with the primary key could not be found
	 */
	public static SpringMvc findByPrimaryKey(long id)
		throws com.test.serviceBuilder.exception.NoSuchSpringMvcException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the spring mvc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the spring mvc
	 * @return the spring mvc, or <code>null</code> if a spring mvc with the primary key could not be found
	 */
	public static SpringMvc fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the spring mvcs.
	 *
	 * @return the spring mvcs
	 */
	public static List<SpringMvc> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the spring mvcs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @return the range of spring mvcs
	 */
	public static List<SpringMvc> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the spring mvcs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of spring mvcs
	 */
	public static List<SpringMvc> findAll(
		int start, int end, OrderByComparator<SpringMvc> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the spring mvcs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpringMvcModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of spring mvcs
	 * @param end the upper bound of the range of spring mvcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of spring mvcs
	 */
	public static List<SpringMvc> findAll(
		int start, int end, OrderByComparator<SpringMvc> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the spring mvcs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of spring mvcs.
	 *
	 * @return the number of spring mvcs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SpringMvcPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SpringMvcPersistence _persistence;

}