package com.aixtor.employee.basic.info.portlet;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ModuleConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.test.serviceBuilder.model.Employee;
import com.training.aixtor.api.EmployeeBasicApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * 
 * @author AadarshGupta
 *
 */

@Component(immediate = true, property = { 
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", 
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=EmployeeImpl", 
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/viewEmployee.jsp",
		"javax.portlet.name="+EmployeePortletKeys.EMPLOYEE_PORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
		}, 
service = Portlet.class)

public class EmployeePortlet extends MVCPortlet {

	private static final Log log = LogFactoryUtil.getLog(EmployeePortlet.class.getName());

	@Reference
	EmployeeBasicApi employeeBasicApi;

	/**
	 * @author AadarshGupta
	 */
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		super.render(renderRequest, renderResponse);
	}

	/**
	 * @author AadarshGupta
	 * @param actionRequest
	 * @param actionResponse
	 * @throws PortalException
	 */
	public void deleteEmployee(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		log.info("am inside of the delete method");
		// Deleting the Employee
		employeeBasicApi.deleteEmployee(actionRequest);
		SessionMessages.add(actionRequest, ModuleConstants.SUCCESS);
	}

	/**
	 * @author AadarshGupta
	 * @param actionRequest
	 * @param actionResponse
	 * @throws PortalException
	 */
	public void searchCustomQuery(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {

		log.info("EmployeePortlet >>> searchCustomQuery >>>");
		String fromDateStr = ParamUtil.getString(actionRequest, ModuleConstants.FROM_DATE);
		String toDateStr = ParamUtil.getString(actionRequest, ModuleConstants.TO_DATE);

		log.info("EmployeePortlet >>> searchEmployee >>> fromDate ::::::::::" + fromDateStr + "toDate ::::::::::"
				+ toDateStr);

		if (Validator.isNotNull(fromDateStr) && Validator.isNotNull(toDateStr)) {
			// Dynamic query to be executed
			// Getting Filtered by Date List of Employee with the help of dynamicQuery
			List<Employee> userList = employeeBasicApi.dynamicQueryEmployee(fromDateStr, toDateStr);
			log.info("searchCustomQuery >>> userList :::::" + userList);

			actionRequest.setAttribute("employeeList", userList);
		} else {
			// Custom sql to be executed
			// Getting Filtered List of Employee according to name with the help of
			// customSql
			ArrayList<Employee> searchEmployeeList = employeeBasicApi.customSqlEmployee(actionRequest);

			actionRequest.setAttribute("employeeList", searchEmployeeList);
		}
		actionRequest.setAttribute("customSql", "true");
		PortalUtil.copyRequestParameters(actionRequest, actionResponse);
	}

}
