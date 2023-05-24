package com.aixtor.employee.basic.info.portlet;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ModuleConstants;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Country;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.CountryService;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.test.serviceBuilder.service.BranchLocalService;
import com.test.serviceBuilder.service.CityLocalService;
import com.test.serviceBuilder.service.StateLocalService;

import java.io.IOException;
import java.util.List;

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
 * @author Aadarsh Gupta
 */

@Component(immediate = true, property = {		
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", 
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=BranchImpl", 
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/viewBranch.jsp", 
		"javax.portlet.name="+ EmployeePortletKeys.BRANCH_PORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
		
}, service = Portlet.class)
public class BranchPortlet extends MVCPortlet {

	@Reference
	private CounterLocalService counterLocalService;

	@Reference
	private BranchLocalService branchLocalService;
	
	@Reference
	private CountryService countryService;
	
	@Reference
	private StateLocalService stateLocalService;
	
	@Reference
	private CityLocalService cityLocalService;

	private static Log log = LogFactoryUtil.getLog(BranchPortlet.class.getName());

	
	/**
	 * @author AadarshGupta
	 * @param actionResponse
	 * @throws PortalException
	 */
	@ProcessAction(name = "deleteBranch")
	public void deleteBranch(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {

	// This deleteid is coming from viewBranch.jsp from delete's name parameter
		long branchId = ParamUtil.getLong(actionRequest, ModuleConstants.DELETE_ID);
		branchLocalService.deleteBranch(branchId);
		SessionMessages.add(actionRequest, ModuleConstants.SUCCESS);
	}
	

	/**
	 * @author AadarshGupta
	 * @throws IOException, PortletException 
	 */
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
//	    Listing all the previous list of branch
//		List<Branch> branchList = branchLocalService.getBranches(-1, -1);
		log.info("BranchPortlet >>>Inside render method >>>");
//	    Setting the attribute to viewBranch.jsp
//		renderRequest.setAttribute("branchList", branchList);
		
	//For display the content  here we are displaying the country
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		List<Country> listCountries=countryService.getCompanyCountries(themeDisplay.getCompanyId());

	//For setting country attribute in addBranch.jsp and rendering country names in dropdown
    	renderRequest.setAttribute("listCountries", listCountries);
		
		super.render(renderRequest, renderResponse);
	}
}
