package com.training.aixtor.api;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.Map;

/**
 * @author AadarshGupta
 *
 */
public interface BranchBasicApi {
	
	/**
	 * @param name
	 * @param city
	 * @param home_address
	 * @param work_address
	 * @param country
	 * @param state
	 * @param pincode
	 * @param branch
	 * @return
	 * @throws PortalException
	 */
	public void addEditSetBranchData(long branchId, String name, long city, String home_address, String work_address,
			long country, long state, int pincode) throws PortalException;
			
	//create a method which returns map 
	 
	
	
	
}

