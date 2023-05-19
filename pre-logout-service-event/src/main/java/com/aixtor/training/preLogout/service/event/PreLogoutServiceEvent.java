package com.aixtor.training.preLogout.service.event;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.PortalUtil;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author AadarshGupta
 */
@Component(
	immediate = true,
	property = {
			"key=logout.events.pre"
	},
	service = LifecycleAction.class
)
public class PreLogoutServiceEvent implements LifecycleAction {

	
	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		HttpServletRequest request=lifecycleEvent.getRequest();
		try {
			long userId = PortalUtil.getUser(request).getUserId();
			log.info(" >>> processLifecycleEvent >>> userId :::::"+userId);	
			User user=userLocalService.getUserById(userId);
			
//			Used for getting the output in a english and the xml will not get in output
			Locale locale = Locale.getDefault();
			List<Group> group = groupLocalService.getGroups(user.getGroupIds());
			for (Group tempGroup : group) { 
//				log.info(">>> processLifecycleEvent >>> group :::::"+tempGroup);
				String siteName=tempGroup.getName(locale);
				log.info(">>> processLifecycleEvent >>> group >>> siteName::::: "+siteName);
			}
		} catch (PortalException e) {
			e.printStackTrace();
		}
		
	}
	private static final Log log=LogFactoryUtil.getLog(PreLogoutServiceEvent.class);
	
	@Reference
	GroupLocalService groupLocalService;
	
	@Reference
	UserLocalService userLocalService;
}