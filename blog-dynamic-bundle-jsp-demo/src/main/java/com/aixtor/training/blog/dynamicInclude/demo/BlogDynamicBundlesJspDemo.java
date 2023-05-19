package com.aixtor.training.blog.dynamicInclude.demo;

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
		property = { 
				"service.ranking:Integer=1000" 
		}, 
	service = DynamicInclude.class
)
public class BlogDynamicBundlesJspDemo implements DynamicInclude {
	private static final Log log = LogFactoryUtil.getLog(BlogDynamicBundlesJspDemo.class);

	@Override
	public void include(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String key)
			throws IOException {

		log.info("=====Modifying the JSP using Dynamic Include======");
		PrintWriter printWriter = httpServletResponse.getWriter();

		printWriter.println("<h2>Blogs Dynamic Include!</h2>");
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
		log.info(" >>> Inside Register method");
		dynamicIncludeRegistry.register("com.liferay.blogs.web#/blogs/view_entry.jsp#pre");
		log.info(" >>> Register method ended");
	}
}