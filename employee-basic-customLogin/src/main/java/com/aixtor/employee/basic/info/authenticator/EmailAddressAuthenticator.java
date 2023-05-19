package com.aixtor.employee.basic.info.authenticator;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.auth.Authenticator;
import com.liferay.portal.kernel.service.UserLocalService;
import java.util.Map;
import com.training.aixtor.api.EmailAddressValidator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(
	    immediate = true, 
	    property = {"key=auth.pipeline.pre"},
	    service = Authenticator.class
	)
public class EmailAddressAuthenticator implements Authenticator{

	 private static final Log log = LogFactoryUtil.getLog(EmailAddressAuthenticator.class.getName());
	
	@Reference
    private volatile UserLocalService userLocalService;
    
    @Reference(
        policy = ReferencePolicy.DYNAMIC,
        cardinality = ReferenceCardinality.OPTIONAL
    )
    private volatile EmailAddressValidator emailValidator;
    
	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {
		// TODO Auto-generated method stub
		return validateDomain(emailAddress);
	}

	@Override
	public int authenticateByScreenName(long companyId, String screenName, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {
		// TODO Auto-generated method stub
		String emailAddress=userLocalService.fetchUserByScreenName(companyId, screenName).getEmailAddress();
		return validateDomain(emailAddress);
	}

	@Override
	public int authenticateByUserId(long companyId, long userId, String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap) throws AuthException {
		// TODO Auto-generated method stub
		String emailAddress=userLocalService.fetchUserById(userId).getEmailAddress();
		return validateDomain(emailAddress);
	}
	
	private int validateDomain(String emailAddress) throws AuthException {
        
        if (emailValidator == null) {
            
            String msg = "Email address validator is unavailable, cannot authenticate user";			
            log.error(msg);
            
            throw new AuthException(msg);
        }
        
        if (emailValidator.isValidEmailAddress(emailAddress)) {		
            return Authenticator.SUCCESS;
        }
        return Authenticator.FAILURE;
    }

}
