package training.second.project.portlet;

import training.second.project.Employee.Employee;
import training.second.project.constants.TrainingSecondProjectPortletKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
 
import java.io.IOException;
import java.util.ArrayList;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author AadarshGupta
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=TrainingSecondProject",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TrainingSecondProjectPortletKeys.TRAININGSECONDPROJECT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TrainingSecondProjectPortlet extends MVCPortlet {
	private static final Log log=LogFactoryUtil.getLog(TrainingSecondProjectPortlet.class.getName());
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		log.info("Portlet 2");
		super.doView(renderRequest, renderResponse);
	}
	
	@Override
	public void init() throws PortletException {
	log.info("++++++++++++++Init() method called+++++++++++++++");
	super.init();

	} 
	
	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		log.info("++++++++++++++++++Render is called++++++++++++++");
		ArrayList<Employee> emp =new ArrayList<Employee>();
		emp.add(new Employee(1,"Aadarsh",101,"Java"));
		emp.add(new Employee(2,"Sachin",102,"Python"));
		request.setAttribute("list", emp);
		super.render(request, response);
	}
	
	@Override
	public void destroy() {
		log.info("++++++++++++++++++Destroyed+++++++++++++++++++++");
		super.destroy();
	}
} 