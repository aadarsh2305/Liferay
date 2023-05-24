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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.test.serviceBuilder.exception.NoSuchSpringMvcException;
import com.test.serviceBuilder.model.SpringMvc;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the spring mvc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpringMvcUtil
 * @generated
 */
@ProviderType
public interface SpringMvcPersistence extends BasePersistence<SpringMvc> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SpringMvcUtil} to access the spring mvc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the spring mvcs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching spring mvcs
	 */
	public java.util.List<SpringMvc> findByUuid(String uuid);

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
	public java.util.List<SpringMvc> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<SpringMvc> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

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
	public java.util.List<SpringMvc> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public SpringMvc findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
				orderByComparator)
		throws NoSuchSpringMvcException;

	/**
	 * Returns the first spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public SpringMvc fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

	/**
	 * Returns the last spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public SpringMvc findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
				orderByComparator)
		throws NoSuchSpringMvcException;

	/**
	 * Returns the last spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public SpringMvc fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

	/**
	 * Returns the spring mvcs before and after the current spring mvc in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current spring mvc
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next spring mvc
	 * @throws NoSuchSpringMvcException if a spring mvc with the primary key could not be found
	 */
	public SpringMvc[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
				orderByComparator)
		throws NoSuchSpringMvcException;

	/**
	 * Removes all the spring mvcs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of spring mvcs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching spring mvcs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the spring mvc where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSpringMvcException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public SpringMvc findByUUID_G(String uuid, long groupId)
		throws NoSuchSpringMvcException;

	/**
	 * Returns the spring mvc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public SpringMvc fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the spring mvc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public SpringMvc fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the spring mvc where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the spring mvc that was removed
	 */
	public SpringMvc removeByUUID_G(String uuid, long groupId)
		throws NoSuchSpringMvcException;

	/**
	 * Returns the number of spring mvcs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching spring mvcs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the spring mvcs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching spring mvcs
	 */
	public java.util.List<SpringMvc> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<SpringMvc> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<SpringMvc> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

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
	public java.util.List<SpringMvc> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first spring mvc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public SpringMvc findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
				orderByComparator)
		throws NoSuchSpringMvcException;

	/**
	 * Returns the first spring mvc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public SpringMvc fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

	/**
	 * Returns the last spring mvc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public SpringMvc findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
				orderByComparator)
		throws NoSuchSpringMvcException;

	/**
	 * Returns the last spring mvc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public SpringMvc fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

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
	public SpringMvc[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
				orderByComparator)
		throws NoSuchSpringMvcException;

	/**
	 * Removes all the spring mvcs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of spring mvcs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching spring mvcs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the spring mvcs where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching spring mvcs
	 */
	public java.util.List<SpringMvc> findByid(long id);

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
	public java.util.List<SpringMvc> findByid(long id, int start, int end);

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
	public java.util.List<SpringMvc> findByid(
		long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

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
	public java.util.List<SpringMvc> findByid(
		long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first spring mvc in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public SpringMvc findByid_First(
			long id,
			com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
				orderByComparator)
		throws NoSuchSpringMvcException;

	/**
	 * Returns the first spring mvc in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public SpringMvc fetchByid_First(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

	/**
	 * Returns the last spring mvc in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc
	 * @throws NoSuchSpringMvcException if a matching spring mvc could not be found
	 */
	public SpringMvc findByid_Last(
			long id,
			com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
				orderByComparator)
		throws NoSuchSpringMvcException;

	/**
	 * Returns the last spring mvc in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spring mvc, or <code>null</code> if a matching spring mvc could not be found
	 */
	public SpringMvc fetchByid_Last(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

	/**
	 * Removes all the spring mvcs where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	public void removeByid(long id);

	/**
	 * Returns the number of spring mvcs where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching spring mvcs
	 */
	public int countByid(long id);

	/**
	 * Caches the spring mvc in the entity cache if it is enabled.
	 *
	 * @param springMvc the spring mvc
	 */
	public void cacheResult(SpringMvc springMvc);

	/**
	 * Caches the spring mvcs in the entity cache if it is enabled.
	 *
	 * @param springMvcs the spring mvcs
	 */
	public void cacheResult(java.util.List<SpringMvc> springMvcs);

	/**
	 * Creates a new spring mvc with the primary key. Does not add the spring mvc to the database.
	 *
	 * @param id the primary key for the new spring mvc
	 * @return the new spring mvc
	 */
	public SpringMvc create(long id);

	/**
	 * Removes the spring mvc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the spring mvc
	 * @return the spring mvc that was removed
	 * @throws NoSuchSpringMvcException if a spring mvc with the primary key could not be found
	 */
	public SpringMvc remove(long id) throws NoSuchSpringMvcException;

	public SpringMvc updateImpl(SpringMvc springMvc);

	/**
	 * Returns the spring mvc with the primary key or throws a <code>NoSuchSpringMvcException</code> if it could not be found.
	 *
	 * @param id the primary key of the spring mvc
	 * @return the spring mvc
	 * @throws NoSuchSpringMvcException if a spring mvc with the primary key could not be found
	 */
	public SpringMvc findByPrimaryKey(long id) throws NoSuchSpringMvcException;

	/**
	 * Returns the spring mvc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the spring mvc
	 * @return the spring mvc, or <code>null</code> if a spring mvc with the primary key could not be found
	 */
	public SpringMvc fetchByPrimaryKey(long id);

	/**
	 * Returns all the spring mvcs.
	 *
	 * @return the spring mvcs
	 */
	public java.util.List<SpringMvc> findAll();

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
	public java.util.List<SpringMvc> findAll(int start, int end);

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
	public java.util.List<SpringMvc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator);

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
	public java.util.List<SpringMvc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpringMvc>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the spring mvcs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of spring mvcs.
	 *
	 * @return the number of spring mvcs
	 */
	public int countAll();

}