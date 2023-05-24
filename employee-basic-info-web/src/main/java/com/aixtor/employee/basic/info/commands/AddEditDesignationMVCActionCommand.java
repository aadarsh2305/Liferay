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
import com.test.serviceBuilder.service.DesignationLocalService;
import com.training.aixtor.api.DesignationBasicApi;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name="+EmployeePortletKeys.DESIGNATION_PORTLET,
		"mvc.command.name=addEditDesignation",
		}, 
service = MVCActionCommand.class)
public class AddEditDesignationMVCActionCommand extends BaseMVCActionCommand{

	private static final Log log = LogFactoryUtil.getLog(AddEditDesignationMVCActionCommand.class);

	@Reference
	private DesignationLocalService designationLocalService;

	@Reference
	private CounterLocalService counterLocalService;

	@Reference
	private DesignationBasicApi designationBasicApi;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		log.info("Inside AddEditDesignationMVCActionCommand >>> doProcessAction");
		long designationId = ParamUtil.getLong(actionRequest, ModuleConstants.ID, GetterUtil.DEFAULT_LONG);
		log.info("AddEditDesignationMVCActionCommand >>> doProcessAction >>> designationId :::::" + designationId);
		String designationName = ParamUtil.getString(actionRequest, ModuleConstants.FIRST_Name);
		log.info("Designation Name ::"+designationName);
		
		designationBasicApi.addEditSetDesignationData(designationId, designationName);
//		designationLocalService.updateDesignation(designation);
	}

}
