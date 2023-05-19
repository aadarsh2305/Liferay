package com.aixtor.training.postLogout.service.event;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

/**
 * @author AadarshGupta
 */
@Component(
	immediate = true,
	property = {
			"key=logout.events.post"
	},
	service = LifecycleAction.class
)
public class PostLogoutServiceEvent implements LifecycleAction {

	private static Log log=LogFactoryUtil.getLog(PostLogoutServiceEvent.class.getName());
	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		HttpServletRequest request=lifecycleEvent.getRequest();
		try {
			long userId = PortalUtil.getUser(request).getUserId();
			log.info(" >>> processLifecycleEvent >>> userId :::::"+userId);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		
	}
}