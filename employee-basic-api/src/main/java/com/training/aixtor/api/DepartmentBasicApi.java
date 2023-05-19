package com.training.aixtor.api;

import com.liferay.portal.kernel.exception.PortalException;

import javax.portlet.ActionRequest;

public interface DepartmentBasicApi {

	public void deleteDepartment(ActionRequest actionRequest) throws PortalException;
	
	public void addEditSetDepartmentData(long departmentId, String departmentName, String departmentHead)
			throws PortalException;
}
