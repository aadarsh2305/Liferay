package com.training.aixtor.api;

import com.liferay.portal.kernel.exception.PortalException;
import com.test.serviceBuilder.model.Employee;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;

public interface EmployeeBasicApi {

	/**
	 * @param fromDateStr
	 * @param toDateStr
	 * @return
	 */
	public List<Employee> dynamicQueryEmployee(String fromDateStr, String toDateStr);
	
	/**
	 * @param actionRequest
	 * @return
	 * @throws PortalException
	 */
	public ArrayList<Employee> customSqlEmployee(ActionRequest actionRequest) throws PortalException;
	
	/**
	 * @param actionRequest
	 * @throws PortalException
	 */
	public void deleteEmployee(ActionRequest actionRequest) throws PortalException;
	
	/**
	 * @param employeeName
	 * @param mobileNumber
	 * @param email
	 * @param departmentId
	 * @param designationId
	 * @param branchId
	 * @param employee
	 */
	public void addEditSetEmployeeData(long employeeId, String employeeName, long mobileNumber, String email,
			long departmentId, long designationId, long branchId) throws PortalException;

}
