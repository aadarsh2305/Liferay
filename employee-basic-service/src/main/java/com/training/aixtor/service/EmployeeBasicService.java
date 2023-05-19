package com.training.aixtor.service;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.test.serviceBuilder.model.Employee;
import com.test.serviceBuilder.service.EmployeeLocalService;
import com.test.serviceBuilder.service.EmployeeLocalServiceUtil;
import com.training.aixtor.api.EmployeeBasicApi;
import com.training.aixtor.constants.ModuleConstants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		service = EmployeeBasicApi.class
	)
public class EmployeeBasicService implements EmployeeBasicApi{

	private static final Log log = LogFactoryUtil.getLog(EmployeeBasicService.class.getName());
	
	@Reference
	private EmployeeLocalService employeeLocalService;
	
	@Reference
	private CounterLocalService counterLocalService;
	/**
	 * @author AadarshGupta
	 * description : Filtering employee With help of Date
	 */
	@Override
	public List<Employee> dynamicQueryEmployee(String fromDateStr, String toDateStr) {
		
		Date fromDate = null, toDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(ModuleConstants.DATE_TYPE);
		try {
			fromDate = sdf.parse(fromDateStr);
			toDate = sdf.parse(toDateStr);
		} catch (ParseException e) {
			System.out.println(e);
		}

		log.info(">>> render >>> Under If condition fromDate  ::::: " + fromDate
				+ " todate ::::: " + toDate);
		log.info(">>> render >>> Inside search employee");

		DynamicQuery dynamicQueryForDateFilter = EmployeeLocalServiceUtil.dynamicQuery();
		dynamicQueryForDateFilter.add(PropertyFactoryUtil.forName(ModuleConstants.CREATE_DATE).between(fromDate, toDate));

		List<Employee> userList = EmployeeLocalServiceUtil.dynamicQuery(dynamicQueryForDateFilter);
		// log.info("EmployeePortlet >>> render >>> dynamicQuery worked >>> userList
		// fetched ::: " + userList);
		for (Employee employee : userList) {
			log.info(">>> render >>> employeeName ::: " + employee.getName());
		}
		return userList;
	
	}


	/**
	 * @author AadarshGupta
	 * description : Filtering employee with the help of CustomSqlQuery
	 */
	@Override
	public ArrayList<Employee> customSqlEmployee(ActionRequest actionRequest) throws PortalException {
		
		log.info("Inside customSqlEmployee ");
		String employeeName = ParamUtil.getString(actionRequest, ModuleConstants.CUSTOM_SQL_NAME);

		List<Object[]> employeelist = employeeLocalService.getEmployeesByName(employeeName);

		log.info("EmployeePortlet >>> searchCustomQuery >>> employeelist Object :::::" + employeelist);
		ArrayList<Employee> searchEmployeeList = new ArrayList<Employee>();
		for (Object[] employees : employeelist) {
			long employeeId = GetterUtil.getLong(employees[0]);
			Employee employee = employeeLocalService.getEmployee(employeeId);
			
			searchEmployeeList.add(employee);

			log.info("EmployeePortlet >>> searchCustomQuery >>> Search List :: " + searchEmployeeList);

		}
		return searchEmployeeList;
	}

	/**
	 * @author AadarshGupta
	 * description : deleting Employee with the help of particular Id
	 */
	@Override
	public void deleteEmployee(ActionRequest actionRequest) throws PortalException {

		long employeeid = ParamUtil.getLong(actionRequest, ModuleConstants.ID);
		log.info("empid==" + employeeid);
		employeeLocalService.deleteEmployee(employeeid);
	
		
	}


	/**
	 * @author AadarshGupta
	 * description : Adding and Updating Employee 
	 */
	
	@Override
	public void addEditSetEmployeeData(long employeeId, String employeeName, long mobileNumber, String email,
			long departmentId, long designationId, long branchId) throws PortalException {
		Employee employee = null;
		// If greater then 0 so it will show for update particular employee as per the given employeeId
		if (employeeId > 0) {
			log.info("AddEditDesignationMVCActionCommand >>> doProcessAction >>> designationId ::: " + employeeId);
			employee = employeeLocalService.getEmployee(employeeId);
			employee.setName(employeeName);
			employee.setMobileNo(mobileNumber);
			employee.setEmail(email);
			employee.setDepartmentId(departmentId);
			employee.setDesignationId(designationId);
			employee.setBranchId(branchId);
		} 
		
		//If there is no existing id so it will create a fresh new add designation page
		else {
			employee = employeeLocalService.createEmployee(counterLocalService.increment(Employee.class.getName()));
			employee.setName(employeeName);
			employee.setMobileNo(mobileNumber);
			employee.setEmail(email);
			employee.setDepartmentId(departmentId);
			employee.setDesignationId(designationId);
			employee.setBranchId(branchId);
		}
		employeeLocalService.updateEmployee(employee);
		
	}
	
}
