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

package com.test.serviceBuilder.service.impl;

import com.liferay.portal.aop.AopService;
import com.test.serviceBuilder.model.Branch;
import com.test.serviceBuilder.model.Employee;
import com.test.serviceBuilder.service.base.EmployeeLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.test.serviceBuilder.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	
	public List<Object[]> getEmployeesByName(String Name){
		return employeeFinder.getEmployeesByName(Name);
	}
	
	public List<Object[]> getEmployeeBeanNameById(long id){
		return employeeFinder.getEmployeeBeanNameById(id);
	}
	
	public List<Employee> findByBranchId(long branchId) {
		return employeePersistence.findBybranchId(branchId);
	}
	
	public List<Employee> findByDepartmentId(long departmentId) {
		return employeePersistence.findBydepartmentId(departmentId);
	}
}