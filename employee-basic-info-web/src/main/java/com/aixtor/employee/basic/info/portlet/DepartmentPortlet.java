package com.aixtor.employee.basic.info.portlet;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ModuleConstants;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.test.serviceBuilder.service.DepartmentLocalService;
import com.training.aixtor.api.DepartmentBasicApi;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
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
		"javax.portlet.display-name=DepartmentImpl", 
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/viewDepartment.jsp",
		"javax.portlet.name="+EmployeePortletKeys.DEPARTMENT_PORTLET ,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
		}, 
service = Portlet.class)
public class DepartmentPortlet extends MVCPortlet{

	@Reference
	CounterLocalService counterLocalService;

	@Reference
	DepartmentLocalService departmentLocalService;
	
	@Reference
	DepartmentBasicApi departmentBasicApi;

	private static final Log log = LogFactoryUtil.getLog(DepartmentPortlet.class.getName());
	
	/**
	 * 
	 * @param actionRequest
	 * @param acResponse
	 * @throws PortalException
	 */
	@ProcessAction(name = "deleteDepartment")
	public void deleteDepartment(ActionRequest actionRequest, ActionResponse acResponse) throws PortalException {
		log.info("deleteDepartment executed :::::");
		// This deleteid is coming from viewDepartment.jsp from delete's name parameter
		departmentBasicApi.deleteDepartment(actionRequest);
		SessionMessages.add(actionRequest, ModuleConstants.SUCCESS);}


	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		super.render(renderRequest, renderResponse);
	}
}
