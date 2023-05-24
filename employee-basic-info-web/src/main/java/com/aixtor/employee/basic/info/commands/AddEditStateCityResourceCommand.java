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
import com.test.serviceBuilder.model.City;
import com.test.serviceBuilder.service.CityLocalService;

import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { 
		"javax.portlet.name="+EmployeePortletKeys.BRANCH_PORTLET,
		"mvc.command.name=/fetch/city", 
		}, 
service = MVCResourceCommand.class)
public class AddEditStateCityResourceCommand extends BaseMVCResourceCommand{

	private static Log log = LogFactoryUtil.getLog(AddEditStateCityResourceCommand.class.getName());
	@Reference
	CityLocalService cityLocalService;
	
	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {

		JSONObject obj = JSONFactoryUtil.createJSONObject();

		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		
	//Getting stateId from ajax which is in addBranch.jsp 
		long stateId=ParamUtil.getLong(resourceRequest, "stateId");
		log.info("AddEditStateCityResourceCommand >>> doServeResource >>> Inside doServeResource >>> stateId :::::"+stateId);
		
	//With the help of stateId we are fetching all the states attached with it
		List<City> allCitylist = cityLocalService.findBystateId(stateId);
		
		log.info("AddEditStateCityResourceCommand >>> doServeResource >>> Inside doServeResource >>> allCitylist :::::"+allCitylist);
		JSONObject jsonObject = null;
		
		for (City city : allCitylist) {
			jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put(ModuleConstants.CITY_NAME, city.getCityName());
			jsonObject.put(ModuleConstants.CITY_ID, city.getCityId());
			jsonArray.put(jsonObject);
		}
		
		PrintWriter writer = resourceResponse.getWriter();
		try {
			
	//Putting data in object form in JSONObject and Fetching in ajax in addBranch.jsp as a response
			obj.put(ModuleConstants.DATA, jsonArray);
			obj.put(ModuleConstants.STATUS, ModuleConstants.SUCCESS);
			log.info("AddEditStateCityResourceCommand >>> doServeResource >>> Inside doServeResource >>> writer :::::"+writer);
			log.info("AddEditStateCityResourceCommand >>> doServeResource >>> Inside doServeResource >>> jsonArray.toJSONString() :::::"+jsonArray.toJSONString());
		
		} catch (IOException e) {
			log.info("AddEditStateCityResourceCommand >>> doServeResource >>> Inside doServeResource ::::: error "+e);
			obj.put(ModuleConstants.STATUS, ModuleConstants.ERROR);
			obj.put(ModuleConstants.MESSAGE, "There was an error in ADDEditCity. Try again please!!!!!");
		} finally {
			log.info("AddEditStateCityResourceCommand >>> doServeResource >>> Inside doServeResource ::::: finally ");
			writer.write(obj.toString());
			writer.close();
		}
		
	}

}
