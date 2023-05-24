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

package com.test.serviceBuilder.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.test.serviceBuilder.model.Branch;
import com.test.serviceBuilder.service.BranchService;
import com.test.serviceBuilder.service.BranchServiceUtil;
import com.test.serviceBuilder.service.persistence.BranchPersistence;
import com.test.serviceBuilder.service.persistence.CityPersistence;
import com.test.serviceBuilder.service.persistence.DepartmentPersistence;
import com.test.serviceBuilder.service.persistence.DesignationPersistence;
import com.test.serviceBuilder.service.persistence.EmployeeFinder;
import com.test.serviceBuilder.service.persistence.EmployeePersistence;
import com.test.serviceBuilder.service.persistence.SpringMvcPersistence;
import com.test.serviceBuilder.service.persistence.StatePersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the branch remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.test.serviceBuilder.service.impl.BranchServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.test.serviceBuilder.service.impl.BranchServiceImpl
 * @generated
 */
public abstract class BranchServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, BranchService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>BranchService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>BranchServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			BranchService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		branchService = (BranchService)aopProxy;

		_setServiceUtilService(branchService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return BranchService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Branch.class;
	}

	protected String getModelClassName() {
		return Branch.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = branchPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(BranchService branchService) {
		try {
			Field field = BranchServiceUtil.class.getDeclaredField("_service");

			field.setAccessible(true);

			field.set(null, branchService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected com.test.serviceBuilder.service.BranchLocalService
		branchLocalService;

	protected BranchService branchService;

	@Reference
	protected BranchPersistence branchPersistence;

	@Reference
	protected CityPersistence cityPersistence;

	@Reference
	protected DepartmentPersistence departmentPersistence;

	@Reference
	protected DesignationPersistence designationPersistence;

	@Reference
	protected EmployeePersistence employeePersistence;

	@Reference
	protected EmployeeFinder employeeFinder;

	@Reference
	protected SpringMvcPersistence springMvcPersistence;

	@Reference
	protected StatePersistence statePersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryService
		assetEntryService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagService assetTagService;

	private static final Log _log = LogFactoryUtil.getLog(
		BranchServiceBaseImpl.class);

}