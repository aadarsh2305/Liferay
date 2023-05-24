package com.aixtor.employee.basic.info.commands;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ModuleConstants;
import com.liferay.adaptive.media.exception.AMRuntimeException.IOException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.test.serviceBuilder.model.State;
import com.test.serviceBuilder.service.StateLocalService;

import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { 
		"javax.portlet.name="+EmployeePortletKeys.BRANCH_PORTLET,
		"mvc.command.name=/fetch/state", 
		}, 
service = MVCResourceCommand.class)
public class AddEditStateCountryResourceCommand extends BaseMVCResourceCommand {

	private static Log log = LogFactoryUtil.getLog(AddEditStateCountryResourceCommand.class.getName());
	@Reference
	StateLocalService stateLocalService;

	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {

		log.info("AddEditStateCountryResourceCommand >>> doServeResource >>> Inside doServeResource :::::");

		JSONObject obj = JSONFactoryUtil.createJSONObject();

		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

	//Getting countryId from ajax which is in addBranch.jsp 
		long countryId = ParamUtil.getLong(resourceRequest, "countryId");
		log.info("countryId :::::"+countryId);
		
	//With the help of countryId we are fetching all the states attached with it
		List<State> allStatelist = stateLocalService.findByCountryId(countryId);

		JSONObject jsonObject = null;

		for (State state : allStatelist) {
			jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put(ModuleConstants.STATE_NAME, state.getStateName());
			jsonObject.put(ModuleConstants.STATE_ID, state.getStateId());
			jsonArray.put(jsonObject);
		}
		log.info("AddEditStateCountryResourceCommand >>> doServeResource >>> Inside doServeResource ::::: JsonArray "+jsonArray);
		log.info("AddEditStateCountryResourceCommand >>> doServeResource >>> Inside doServeResource ::::: JsonObject "+jsonObject);
		
		PrintWriter writer = resourceResponse.getWriter();
		try {
			
		//Putting data in object form in JSONObject and Fetching in ajax in addBranch.jsp as a response
			obj.put(ModuleConstants.DATA, jsonArray);
			obj.put(ModuleConstants.STATUS, ModuleConstants.SUCCESS);
			log.info("AddEditStateCountryResourceCommand >>> doServeResource >>> Inside doServeResource >>> writer :::::"+writer);
			log.info("AddEditStateCountryResourceCommand >>> doServeResource >>> Inside doServeResource >>> jsonArray.toJSONString() :::::"+jsonArray.toJSONString());
		
		} catch (IOException e) {
			log.info("AddEditStateCountryResourceCommand >>> doServeResource >>> Inside doServeResource ::::: error "+e);
			obj.put(ModuleConstants.STATUS, ModuleConstants.ERROR);
			obj.put(ModuleConstants.MESSAGE, "There was an error in ADDEditState. Try again please!!!!!");
		} finally {
			log.info("AddEditStateCountryResourceCommand >>> doServeResource >>> Inside doServeResource ::::: finally ");
			writer.write(obj.toString());
			writer.close();
		}
	}

}
