package com.aixtor.training.documentmedia.servicewrapper;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceWrapper;
import com.liferay.dynamic.data.mapping.kernel.DDMFormValues;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author AadarshGupta
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class CustomDocumentMediaWrapper extends DLFileEntryLocalServiceWrapper {

	private static Log log=LogFactoryUtil.getLog(CustomDocumentMediaWrapper.class.getName());
	public CustomDocumentMediaWrapper() {
		super(null);
	}
	@Override
	public DLFileEntry addFileEntry(String externalReferenceCode, long userId, long groupId, long repositoryId,
			long folderId, String sourceFileName, String mimeType, String title, String urlTitle, String description,
			String changeLog, long fileEntryTypeId, Map<String, DDMFormValues> ddmFormValuesMap, File file,
			InputStream inputStream, long size, Date expirationDate, Date reviewDate, ServiceContext serviceContext)
			throws PortalException {
		log.info(">>> Added Media Success");
		return super.addFileEntry(externalReferenceCode, userId, groupId, repositoryId, folderId, sourceFileName, mimeType,
				title, urlTitle, description, changeLog, fileEntryTypeId, ddmFormValuesMap, file, inputStream, size,
				expirationDate, reviewDate, serviceContext);
	}
	
	@Reference(unbind = "-")
	private void serviceSetter(DLFileEntryLocalService DLFileEntryLocalService) {
	    setWrappedService(DLFileEntryLocalService);
	}

}