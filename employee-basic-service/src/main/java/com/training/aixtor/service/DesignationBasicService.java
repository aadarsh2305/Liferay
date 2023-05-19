package com.training.aixtor.service;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.test.serviceBuilder.model.Designation;
import com.test.serviceBuilder.service.DesignationLocalService;
import com.training.aixtor.api.DesignationBasicApi;
import com.training.aixtor.constants.ModuleConstants;

import javax.portlet.ActionRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		service = DesignationBasicApi.class
	)
public class DesignationBasicService implements DesignationBasicApi{

	private static final Log log = LogFactoryUtil.getLog(DesignationBasicService.class.getName());

	@Reference
	DesignationLocalService designationLocalService;
	
	@Reference
	CounterLocalService counterLocalService;
	
	/**
	 * @author AadarshGupta
	 * description : Deleting the designation as per the passed id
	 */
	@Override
	public void deleteDesignation(ActionRequest actionRequest) throws PortalException {
		long designationId = ParamUtil.getLong(actionRequest, ModuleConstants.DELETE_ID);
		designationLocalService.deleteDesignation(designationId);	
	}

	/**
	 * @author AadarshGupta
	 * description : Adding and Updating Designation 
	 */
	@Override
	public void addEditSetDesignationData(long designationId, String designationName) throws PortalException {
		Designation designation;
		// If greater then 0 so it will show for update particular designation as per the given designationId
		if (designationId > 0) {
			log.info(" addEditSetDesignationData >>> If >>> designationId ::: " + designationId);
			designation = designationLocalService.getDesignation(designationId);
			log.info(" addEditSetDesignationData >>> If >>> designationId= ::: " + designationId);
			designation.setName(designationName);
		
		//If there is no existing id so it will create a fresh new add designation page 
		} else {
			designation = designationLocalService.createDesignation(counterLocalService.increment());
			designation.setName(designationName);
			log.info("addEditSetDesignationData >>> doProcessAction >>> else completed");
		}
		designationLocalService.updateDesignation(designation);
	}
}
