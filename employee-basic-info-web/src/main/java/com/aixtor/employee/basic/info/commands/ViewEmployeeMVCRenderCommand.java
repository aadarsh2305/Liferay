package com.aixtor.employee.basic.info.commands;

import com.aixtor.employee.basic.info.bean.EmployeeBean;
import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ModuleConstants;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.test.serviceBuilder.model.Branch;
import com.test.serviceBuilder.model.Department;
import com.test.serviceBuilder.model.Designation;
import com.test.serviceBuilder.model.Employee;
import com.test.serviceBuilder.service.BranchLocalService;
import com.test.serviceBuilder.service.DepartmentLocalService;
import com.test.serviceBuilder.service.DesignationLocalService;
import com.test.serviceBuilder.service.EmployeeLocalService;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true, 
		property = { 
			"javax.portlet.name="+EmployeePortletKeys.EMPLOYEE_PORTLET,
			"mvc.command.name=/", 
		}, 
service = MVCRenderCommand.class)
public class ViewEmployeeMVCRenderCommand implements MVCRenderCommand {

	private static final Log log = LogFactoryUtil.getLog(ViewEmployeeMVCRenderCommand.class.getName());
	@Reference
	private EmployeeLocalService employeeLocalService;

	@Reference
	private CounterLocalService counterLocalService;

	@Reference
	DepartmentLocalService departmentLocalService;

	@Reference
	DesignationLocalService designationLocalService;

	@Reference
	BranchLocalService branchLocalService;

	long employeeId;

	@SuppressWarnings("unchecked")
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		log.info("ViewEmployeeMVCRenderCommand >>>render");
		List<Designation> designationList = designationLocalService.getDesignations(QueryUtil.ALL_POS,
				QueryUtil.ALL_POS);
		List<Department> departmentList = departmentLocalService.getDepartments(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		List<Branch> branchList = branchLocalService.getBranches(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		List<Employee> employeeList;

		String customSql = (String) renderRequest.getAttribute(ModuleConstants.CUSTOM_SQL);

		if (Validator.isNotNull(customSql)) {
			employeeList = (List<Employee>) renderRequest.getAttribute(ModuleConstants.EMPLOYEE_LIST);

			log.info("EmployeePortlet >>> render >>> customSQL worked" + employeeList);
		} else {
			employeeList = employeeLocalService.getEmployees(-1, -1);
			log.info("EmployeePortlet >>> render >>> Default worked ");
		}

		renderRequest.setAttribute("employeeList", employeeList);
		renderRequest.setAttribute("designationList", designationList);
		renderRequest.setAttribute("departmentList", departmentList);
		renderRequest.setAttribute("branchList", branchList);

		/*
		 * List<Employee> employeeList =
		 * employeeLocalService.getEmployees(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		 * renderRequest.setAttribute("employeeList", employeeList);
		 */

		String action = ParamUtil.getString(renderRequest, ModuleConstants.ACTION);

		employeeId = ParamUtil.getLong(renderRequest, ModuleConstants.EMPLOYEE_ID);
		log.info("render >>> employeeId :::::" + employeeId);

		boolean isUpdate = Boolean.FALSE;
		if (Validator.isNotNull(action)) {
			if ("edit".equalsIgnoreCase(action) && employeeId > 0) {
				try {
					Employee selectedEmployee = employeeLocalService.getEmployee(employeeId);
					renderRequest.setAttribute("selectedEmployee", selectedEmployee);
					isUpdate = Boolean.TRUE;
				} catch (PortalException e) {
					e.printStackTrace();
				}

			}
			renderRequest.setAttribute("isUpdate", isUpdate);
			return "/addEmployee.jsp";
		} else {
			return "/viewEmployee.jsp";
		}

		// log.info("EmployeePortlet >>> searchCustomQuery >>> Search List :: " +
		// employeeNameBeanList);
	}

	
	  public void m1() { List<Object[]> beanNameList = employeeLocalService.getEmployeeBeanNameById(employeeId);
	  ArrayList<EmployeeBean> employeeNameBeanList = new ArrayList<EmployeeBean>();
	  log.info("beanNameList ::::: " +beanNameList); 
	  EmployeeBean employeeBean = new EmployeeBean();
	  
	  for (Object[] employees : beanNameList) { 
		  long id = GetterUtil.getLong(employees[0]); 
		  String name = GetterUtil.getString(employees[1]); 
		  long mobile_number = GetterUtil.getLong(employees[2]); 
		  String email =  GetterUtil.getString(employees[3]); 
		  String departmentName = GetterUtil.getString(employees[4]); 
		  String designationName = GetterUtil.getString(employees[5]); 
		  String branchName = GetterUtil.getString(employees[6]); 
		  employeeBean.setId(id);
		  employeeBean.setName(name); 
		  employeeBean.setMobileNumber(mobile_number);
		  employeeBean.setEmail(email); 
		  employeeBean.setDepartment(departmentName);
		  employeeBean.setDesigntion(designationName);
		  employeeBean.setBranch(branchName); 
		  log.info("employees :::::"+ employees); 
		  
	  }
	}
}
