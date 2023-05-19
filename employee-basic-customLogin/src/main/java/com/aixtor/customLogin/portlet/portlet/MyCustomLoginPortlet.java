package com.aixtor.customLogin.portlet.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.auth.session.AuthenticatedSessionManagerUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { 
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", 
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MyCustomLogin", 
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/customLoginForm.jsp",
		"javax.portlet.name=com_aixtor_customLogin_portlet_MyCustomLoginPortlet",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
		}, 
service = Portlet.class)

public class MyCustomLoginPortlet extends MVCPortlet{
	
	private static Log logger = LogFactoryUtil.getLog(MyCustomLoginPortlet.class.getName());
	@ProcessAction(name="customLoginAction")
	public void customLoginAction(ActionRequest actionRequest,
            ActionResponse actionResponse) throws IOException, PortletException {

		
		logger.info("-----------Inside loginUrl action method----------");
		
		logger.info("Inside custom login action method");
        ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
            WebKeys.THEME_DISPLAY);
        
        HttpServletRequest request = PortalUtil.getOriginalServletRequest(
            PortalUtil.getHttpServletRequest(actionRequest));
        
        HttpServletResponse response = PortalUtil.getHttpServletResponse(
            actionResponse);

        String login = ParamUtil.getString(actionRequest, "login");
        String password = ParamUtil.getString(actionRequest,"password");
        boolean rememberMe = ParamUtil.getBoolean(actionRequest, "rememberMe");
        String authType = CompanyConstants.AUTH_TYPE_EA;
        //authentication is by email address EA(Email address)
        //there are different auth types like by userId , screeName etc
        
        try {
			AuthenticatedSessionManagerUtil.login(
			    request, response, login, password, rememberMe, authType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        actionResponse.sendRedirect(themeDisplay.getPathMain());
    }

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		logger.info(">>> render :::::");
		super.render(renderRequest, renderResponse);
	}
}
