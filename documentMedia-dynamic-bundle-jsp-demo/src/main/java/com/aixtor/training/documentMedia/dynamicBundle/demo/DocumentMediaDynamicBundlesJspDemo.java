package com.aixtor.training.documentMedia.dynamicBundle.demo;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author AadarshGupta
 */
@Component(
		immediate = true,
		service = DynamicInclude.class
	)
public class DocumentMediaDynamicBundlesJspDemo implements DynamicInclude {

	private static Log log=LogFactoryUtil.getLog(DocumentMediaDynamicBundlesJspDemo.class.getName());
	@Override
	public void include(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String key)
			throws IOException {
		log.info(">>> inside include method :::::");
		PrintWriter printWriter = httpServletResponse.getWriter();

	    printWriter.println(
	    "<h2>Added by Document and Media Dynamic Include!</h2><br />");
	    log.info(">>> include method ended :::::");
		
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
		log.info(">>> inside register method :::::");
		//For Document and media page
		dynamicIncludeRegistry.register("com.liferay.document.library.web#/document_library/view.jsp#pre");
		log.info(">>> register method ended :::::");
	}

}