package com.aixtor.employee.basic.info.servletfilter;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    property = {
	        "servlet-context-name=",
	        "servlet-filter-name=Servlet Filter Example",
	        "url-pattern=/ahmedabad/*",
	    },
	    service = Filter.class
	)
public class ServletFilterExample implements Filter{

	private static final Log log=LogFactoryUtil.getLog(ServletFilterExample.class);
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info(" >>> Init Initiated :::::");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info(" >>> Inside doFilter :::::");
		HttpServletRequest _request = (HttpServletRequest) request;
        HttpServletResponse _response = (HttpServletResponse) response;
        String path = _request.getPathInfo();
        log.info(" doFilter >>> Request path: " + path);
        if(path.endsWith("designation")) {
        	_response.sendRedirect("https://www.youtube.com/?gl=IN");
        }
        chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		log.info(" >>> Destroy Initiated :::::");
		
	}

}
