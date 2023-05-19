package com.training.aixtor.service;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.test.serviceBuilder.model.Department;
import com.test.serviceBuilder.service.DepartmentLocalService;
import com.training.aixtor.api.DepartmentBasicApi;
import com.training.aixtor.constants.ModuleConstants;

import javax.portlet.ActionRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		service = DepartmentBasicApi.class
	)
public class DepartmentBasicService implements DepartmentBasicApi{

	private static final Log log = LogFactoryUtil.getLog(DepartmentBasicService.class.getName());
	@Reference
	private DepartmentLocalService departmentLocalService;
	
	@Reference
	private CounterLocalService counterLocalService;
	
	/**
	 * @author AadarshGupta
	 * description : Deleting the department as per the given Id
	 */
	@Override
	public void deleteDepartment(ActionRequest actionRequest) throws PortalException {
		long departmentId = ParamUtil.getLong(actionRequest, ModuleConstants.DELETE_ID);
		log.info("DepartmentBasicService >>> departmentId :::::"+departmentId);
		departmentLocalService.deleteDepartment(departmentId);
		
	}

	
	/**
	 * @author AadarshGupta
	 * description : Adding and Updating Department
	 */
	@Override
	public void addEditSetDepartmentData(long departmentId, String departmentName, String departmentHead)
			throws PortalException {
		Department department;
		// If greater then 0 so it will show for update particular designation as per the given designationId
		if (departmentId > 0) {
			log.info("doProcessAction >>> If >>> departmentId ::: " + departmentId);
			department = departmentLocalService.getDepartment(departmentId);
			department.setName(departmentName);
			department.setHead(departmentHead);
		} 
		
		//If there is no existing id so it will create a fresh new add designation page 
		else {
			department = departmentLocalService.createDepartment(counterLocalService.increment());
			department.setName(departmentName);
			department.setHead(departmentHead);
			log.info(" doProcessAction >>> else ");
		}
		departmentLocalService.updateDepartment(department);
		
	}

	
		


}
