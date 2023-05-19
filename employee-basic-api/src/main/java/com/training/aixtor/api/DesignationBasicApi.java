package com.training.aixtor.api;

import com.liferay.portal.kernel.exception.PortalException;

import javax.portlet.ActionRequest;

public interface DesignationBasicApi {

	public void deleteDesignation(ActionRequest actionRequest) throws PortalException;
	
	public void addEditSetDesignationData(long designationId, String designationName) throws PortalException;
}
