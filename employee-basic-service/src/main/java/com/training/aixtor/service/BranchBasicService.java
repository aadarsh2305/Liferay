package com.training.aixtor.service;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.test.serviceBuilder.model.Branch;
import com.test.serviceBuilder.service.BranchLocalService;
import com.training.aixtor.api.BranchBasicApi;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author AadarshGupta
 */
@Component(
	immediate = true,
	service = BranchBasicApi.class
)
public class BranchBasicService implements BranchBasicApi{

	private static final Log log = LogFactoryUtil.getLog(BranchBasicService.class.getName());
	
	@Reference
	private BranchLocalService branchLocalService;

	
	@Reference
	private CounterLocalService counterLocalService;


	/**
	 * @author AadarshGupta
	 * description : Updating and Adding Branch Form using Same Method
	 */
	@Override
	public void addEditSetBranchData(long branchId, String name, long city, String home_address, String work_address,
			long country, long state, int pincode) throws PortalException {
		Branch branch = null;
		// If greater then 0 so it will show for update particular designation as per the given designationId
			if (branchId > 0) {
				log.info("doProcessAction >>> If >>> branchId ::: " + branchId);
				  branch = branchLocalService.getBranch(branchId);		

				  branch.setName(name); 
				  branch.setCity(city);
				  branch.setAddress1(home_address);
				  branch.setAddress2(work_address);
				  branch.setCountry(country);
				  branch.setState(state);
				  branch.setPincode(pincode);	
			} 
		//If there is no existing id so it will create a fresh new add designation page 
			else {
				  branch.setName(name); 
				  branch.setCity(city);
				  branch.setAddress1(home_address);
				  branch.setAddress2(work_address);
				  branch.setCountry(country);
				  branch.setState(state);
				  branch.setPincode(pincode);
				log.info(" doProcessAction >>> else ");
			}
		branchLocalService.updateBranch(branch);
	}
		
	}


	
	
	

	

	

