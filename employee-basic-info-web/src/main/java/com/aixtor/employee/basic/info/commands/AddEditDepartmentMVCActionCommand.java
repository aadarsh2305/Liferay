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
import com.test.serviceBuilder.service.DepartmentLocalService;
import com.training.aixtor.api.DepartmentBasicApi;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(immediate = true, property = {
		"javax.portlet.name="+EmployeePortletKeys.DEPARTMENT_PORTLET,
		"mvc.command.name=addEditDepartment",
		}, 
service = MVCActionCommand.class)
public class AddEditDepartmentMVCActionCommand extends BaseMVCActionCommand{

	private static final Log log = LogFactoryUtil.getLog(AddEditDepartmentMVCActionCommand.class);

	@Reference
	DepartmentLocalService departmentLocalService;

	@Reference
	CounterLocalService counterLocalService;
	
	@Reference
	DepartmentBasicApi departmentBasicApi;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		log.info("Inside AddEditDepartmentMVCActionCommand >>> doProcessAction");
		long departmentId = ParamUtil.getLong(actionRequest, ModuleConstants.ID, GetterUtil.DEFAULT_LONG);
		log.info(" doProcessAction >>> designationId :::::" + departmentId);
		String departmentName = ParamUtil.getString(actionRequest, ModuleConstants.FIRST_Name);
		String departmentHead = ParamUtil.getString(actionRequest, ModuleConstants.HEAD_NAME);
		
		log.info("departmentName :::::"+departmentName +"departmentHead :::::"+departmentHead);
		
		departmentBasicApi.addEditSetDepartmentData(departmentId, departmentName, departmentHead);
	}
}
