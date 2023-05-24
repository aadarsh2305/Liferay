package com.aixtor.employee.basic.info.commands;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ModuleConstants;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.test.serviceBuilder.service.EmployeeLocalService;
import com.training.aixtor.api.EmployeeBasicApi;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name="+ EmployeePortletKeys.EMPLOYEE_PORTLET,
		"mvc.command.name=addEditEmployee",
		}, 
service = MVCActionCommand.class)
public class AddEditEmployeeMVCActionCommand extends BaseMVCActionCommand{

	private static final Log log =LogFactoryUtil.getLog(AddEditEmployeeMVCActionCommand.class.getName());
	@Reference
	EmployeeLocalService employeeLocalService;
	@Reference
	CounterLocalService counterLocalService;
	@Reference
	EmployeeBasicApi employeeBasicApi;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		log.info("Inside doProcessAction >>>");
		long employeeId = ParamUtil.getLong(actionRequest, ModuleConstants.ID, GetterUtil.DEFAULT_LONG);
		
		String employeeName = ParamUtil.getString(actionRequest, ModuleConstants.FIRST_Name);
		long mobileNumber = ParamUtil.getLong(actionRequest, ModuleConstants.MOBILE_NUMBER);
		String email=ParamUtil.getString(actionRequest, ModuleConstants.EMAIL);
		long departmentId=ParamUtil.getLong(actionRequest, ModuleConstants.DEPARTMENT);
		long designationId =ParamUtil.getLong(actionRequest, ModuleConstants.DESIGNATION);
		long branchId=ParamUtil.getLong(actionRequest, ModuleConstants.BRANCH);

		employeeBasicApi.addEditSetEmployeeData(employeeId, employeeName, mobileNumber, email, departmentId, designationId, branchId);
		}

	}
