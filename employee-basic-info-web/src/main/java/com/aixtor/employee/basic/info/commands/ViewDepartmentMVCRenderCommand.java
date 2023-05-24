package com.aixtor.employee.basic.info.commands;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ModuleConstants;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.test.serviceBuilder.model.Department;
import com.test.serviceBuilder.service.DepartmentLocalService;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true,
property = {
		"javax.portlet.name="+EmployeePortletKeys.DEPARTMENT_PORTLET,
		"mvc.command.name=/", 
		}, 
service = MVCRenderCommand.class)
public class ViewDepartmentMVCRenderCommand implements MVCRenderCommand{

	private static final Log log =LogFactoryUtil.getLog(ViewDepartmentMVCRenderCommand.class.getName());
	@Reference
	DepartmentLocalService departmentLocalService;

	@Reference
	CounterLocalService counterLocalService;
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		//QueryUtil.ALL_POS used for all list
		List<Department> departmentList = departmentLocalService.getDepartments(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		renderRequest.setAttribute("departmentList", departmentList);
		
		String action = ParamUtil.getString(renderRequest, ModuleConstants.ACTION);
		log.info(" render >>> action :::::"+action);
		
		long departmentId = ParamUtil.getLong(renderRequest, ModuleConstants.ID);
		log.info(" render >>> departmentId :::::"+departmentId);
		
		boolean isUpdate = Boolean.FALSE;
		if (Validator.isNotNull(action)) {
			if ("edit".equalsIgnoreCase(action) && departmentId > 0) {
				try {
					log.info(" render >>> underb IF >>>:::::");
					Department selectedDepartment = departmentLocalService.getDepartment(departmentId);
					log.info(" render >>> underb IF >>> selectedDepartment :::::"+selectedDepartment);
					renderRequest.setAttribute("selectedDepartment", selectedDepartment);
					isUpdate = Boolean.TRUE;
				} catch (PortalException e) {
					e.printStackTrace();
				}
			} 
			renderRequest.setAttribute("isUpdate", isUpdate);
			return "/addDepartment.jsp";
		}
		else {
			return "/viewDepartment.jsp";
		}	

	}

}
