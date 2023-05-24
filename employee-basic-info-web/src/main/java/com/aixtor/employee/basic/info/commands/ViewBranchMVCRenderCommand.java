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
import com.test.serviceBuilder.model.Branch;
import com.test.serviceBuilder.service.BranchLocalService;
import com.training.aixtor.api.BranchBasicApi;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true,
property = {
		"javax.portlet.name="+ EmployeePortletKeys.BRANCH_PORTLET,
		"mvc.command.name=/", 
		}, 
service = MVCRenderCommand.class)
public class ViewBranchMVCRenderCommand implements MVCRenderCommand{


	private static final Log log =LogFactoryUtil.getLog(ViewBranchMVCRenderCommand.class.getName());
	
	@Reference
	private BranchLocalService branchLocalService;

	@Reference
	private CounterLocalService counterLocalService;
	
	@Reference
	private BranchBasicApi branchBasicApi;
	
	/**
	 * @author AadarshGupta
	 * @return "/addBranch.jsp" or "/viewBranch.jsp"
	 * @throws PortletException
	 */
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		//QueryUtil.ALL_POS used for all list
		List<Branch> branchList = branchLocalService.getBranches(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		renderRequest.setAttribute("branchList", branchList);
		
		String action = ParamUtil.getString(renderRequest, ModuleConstants.ACTION);
		log.info(" render >>> action :::::"+action);
		
		long branchId = ParamUtil.getLong(renderRequest, ModuleConstants.ID);
		log.info(" render >>> designationId :::::"+branchId);
		
		boolean isUpdate = Boolean.FALSE;
		if (Validator.isNotNull(action)) {
			if ("edit".equalsIgnoreCase(action) && branchId > 0) {
				try {
					Branch selectedBranch = branchLocalService.getBranch(branchId);
					renderRequest.setAttribute("selectedBranch", selectedBranch);
					isUpdate = Boolean.TRUE;
				} catch (PortalException e) {
					e.printStackTrace();
				}
				
			}
			renderRequest.setAttribute("isUpdate", isUpdate);
			return "/addBranch.jsp";
		}
		else {
			return "/viewBranch.jsp";
		}
	}

}
