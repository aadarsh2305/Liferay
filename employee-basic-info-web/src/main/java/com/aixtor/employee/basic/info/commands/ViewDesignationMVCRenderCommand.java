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
import com.test.serviceBuilder.model.Designation;
import com.test.serviceBuilder.service.DesignationLocalService;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true,
property = {
		"javax.portlet.name="+EmployeePortletKeys.DESIGNATION_PORTLET,
		"mvc.command.name=/", 
		}, 
service = MVCRenderCommand.class)
public class ViewDesignationMVCRenderCommand implements MVCRenderCommand {

	private static final Log log =LogFactoryUtil.getLog(ViewDesignationMVCRenderCommand.class.getName());
	@Reference
	DesignationLocalService designationLocalService;

	@Reference
	CounterLocalService counterLocalService;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
	//QueryUtil.ALL_POS used for all list
		List<Designation> designationList = designationLocalService.getDesignations(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		renderRequest.setAttribute("designationList", designationList);

		String action = ParamUtil.getString(renderRequest, ModuleConstants.ACTION);
		log.info("ViewDesignationMVCRenderCommand >>> render >>> action :::::"+action);
		
		long designationId = ParamUtil.getLong(renderRequest, ModuleConstants.ID);
		log.info("ViewDesignationMVCRenderCommand >>> render >>> designationId :::::"+designationId);
		
		boolean isUpdate = Boolean.FALSE;
		if (Validator.isNotNull(action)) {
			if ("edit".equalsIgnoreCase(action) && designationId > 0) {
				try {
					Designation selectedDesignation = designationLocalService.getDesignation(designationId);
					renderRequest.setAttribute("selectedDesignation", selectedDesignation);
					isUpdate = Boolean.TRUE;
				} catch (PortalException e) {
					e.printStackTrace();
				}
			} 
			renderRequest.setAttribute("isUpdate", isUpdate);
			return "/addDesignation.jsp";
		}else {
			return "/viewDesignation.jsp";
		}
	}

	
}
