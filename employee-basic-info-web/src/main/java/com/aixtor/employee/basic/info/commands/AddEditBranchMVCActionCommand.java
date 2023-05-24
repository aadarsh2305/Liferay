package com.aixtor.employee.basic.info.commands;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ModuleConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.test.serviceBuilder.service.BranchLocalService;
import com.training.aixtor.api.BranchBasicApi;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true, 
		property = { 
			"javax.portlet.name="+ EmployeePortletKeys.BRANCH_PORTLET,
			"mvc.command.name=/add-edit/branch",
		}, 
		service = MVCActionCommand.class
)
public class AddEditBranchMVCActionCommand extends BaseMVCActionCommand{

	private static final Log log = LogFactoryUtil.getLog(AddEditBranchMVCActionCommand.class);

	@Reference(unbind = "-")
	private BranchBasicApi branchBasicApi;
	
	@Reference
	BranchLocalService branchLocalService;

	/**
	 * @author AadarshGupta
	 * @throws PortalException
	 */
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException{

		log.info("AddEditBranchMVCActionCommand >>>> Add/Edit Branch Action Invoked....");
		  //Adding a new Branch 
		long branchId = ParamUtil.getLong(actionRequest, ModuleConstants.ID, GetterUtil.DEFAULT_LONG);
		  String name = ParamUtil.getString(actionRequest, ModuleConstants.FIRST_Name);
		  long city = ParamUtil.getLong(actionRequest, ModuleConstants.CITY_NAME);
		  String home_address = ParamUtil.getString(actionRequest, ModuleConstants.ADDRESS_1);
		  String work_address =ParamUtil.getString(actionRequest, ModuleConstants.ADDRESS_2); 
		  long country= ParamUtil.getLong(actionRequest, ModuleConstants.COUNTRY); 
		  long state = ParamUtil.getLong(actionRequest, ModuleConstants.STATE); 
		  int pincode = ParamUtil.getInteger(actionRequest, ModuleConstants.PINCODE); 
		  log.info(name +
		  "" + city + "" + home_address + "" + work_address + "" + country + "" + state
		  + "" + pincode);
		  
		
		branchBasicApi.addEditSetBranchData(branchId, name, city, home_address, work_address, country, state, pincode);
	}
		
}


