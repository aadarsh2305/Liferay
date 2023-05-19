package com.aixtor.training.test.servicewrapper;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupLocalServiceWrapper;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author AadarshGupta
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class BasicServiceWrapper extends GroupLocalServiceWrapper {

	private static Log log = LogFactoryUtil.getLog(BasicServiceWrapper.class.getName());
	
	public BasicServiceWrapper() {
		super(null);
	}
	
	@Override
	public Group addGroup(long userId, long parentGroupId, String className, long classPK, long liveGroupId,
			Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership,
			int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active,
			ServiceContext serviceContext) throws PortalException {
		log.info(">>> Adding a new Site");
		return super.addGroup(userId, parentGroupId, className, classPK, liveGroupId, nameMap, descriptionMap, type,
				manualMembership, membershipRestriction, friendlyURL, site, inheritContent, active, serviceContext);
	}
	
	@Override
		public Group deleteGroup(long groupId) throws PortalException {
			log.info(">>> Deleting a site");
			return super.deleteGroup(groupId);
		}

}