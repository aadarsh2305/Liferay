package com.training.aixtor.service;
import com.training.aixtor.api.EmailAddressValidator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		service = EmailAddressValidator.class
	)
public class EmailAddressValidatorImpl implements EmailAddressValidator{

	private Set<String> validEmailDomains = 
	        new HashSet<String>(Arrays.asList(new String[] {"@liferay.com"}));
	
	@Override
	public boolean isValidEmailAddress(String emailAddress) {
		if (validEmailDomains.contains(
	            emailAddress.substring(emailAddress.indexOf('@')))) {

	            return true;
	        }
	        return false;
	}

}
