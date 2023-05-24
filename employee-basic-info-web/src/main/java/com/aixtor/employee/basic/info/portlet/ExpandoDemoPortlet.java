package com.aixtor.employee.basic.info.portlet;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.liferay.expando.kernel.model.ExpandoTable;
import com.liferay.expando.kernel.model.ExpandoValue;
import com.liferay.expando.kernel.service.ExpandoTableLocalService;
import com.liferay.expando.kernel.service.ExpandoValueLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ClassNameLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { 
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", 
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ExpandoImpl", 
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/viewExpando.jsp",
		"javax.portlet.name="+EmployeePortletKeys.EXPANDO_DEMO_PORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
		}, 
	service = Portlet.class
)

public class ExpandoDemoPortlet extends MVCPortlet{

	private static final Log log=LogFactoryUtil.getLog(ExpandoDemoPortlet.class);
	
	@Reference
	ExpandoValueLocalService expandoValueLocalService;
	
	@Reference
	ClassNameLocalService classNameLocalService;
	
	@Reference
	UserLocalService userLocalService;
	
	@Reference
	ExpandoTableLocalService expandoTableLocalService;
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		ThemeDisplay themeDisplay  =(ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);	
		try {
			long classNameId = classNameLocalService.getClassNameId(User.class.getName());
			log.info("Field classNameId==>"+classNameId);
			
			long companyId=themeDisplay.getCompanyId();
			log.info("Field companyId==>"+companyId);
			
			ExpandoTable expandoTable=expandoTableLocalService.getDefaultTable(companyId, classNameId);

			String columnName = "Hobbies";// key
			log.info("Field columnName==>"+columnName);
			
//			long tableId=expandoTable.getTableId();
//			log.info("Field tableId==>"+tableId);
			
			String tableName = expandoTable.getName();  //"CUSTOM_FIELDS";
			log.info("Field tableName==>"+tableName);
			
			long userId = themeDisplay.getUserId();// userId=classPK
			log.info("Field userId==>"+userId);
			
			ExpandoValue expandoObject=expandoValueLocalService.getValue(companyId, classNameId, tableName, columnName, userId);

			String value=expandoObject.getData();
			log.info("Field value==>"+value);
			
			renderRequest.setAttribute("userId", userId);
			renderRequest.setAttribute("data", value);
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		super.render(renderRequest, renderResponse);
	}
}
