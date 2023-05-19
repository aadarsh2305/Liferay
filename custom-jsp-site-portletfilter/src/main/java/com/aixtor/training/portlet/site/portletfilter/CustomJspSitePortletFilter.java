package com.aixtor.training.portlet.site.portletfilter;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;
import javax.portlet.filter.RenderResponseWrapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author AadarshGupta
 */
@Component(
		immediate = true,
		property = {
				"javax.portlet.name=com_liferay_site_admin_web_portlet_SiteAdminPortlet"
		},
		service = PortletFilter.class
	)
public class CustomJspSitePortletFilter implements RenderFilter  {

	@Override
	public void init(FilterConfig filterConfig) throws PortletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(RenderRequest request, RenderResponse response, FilterChain chain)
			throws IOException, PortletException {
		RenderResponseWrapper renderResponseWrapper = new BufferedRenderResponseWrapper(response);

		chain.doFilter(request, renderResponseWrapper);

		String text = renderResponseWrapper.toString();
		
		if (text != null) {
			String interestingText = "<input  class=\"field form-control\"";

			int index = text.lastIndexOf(interestingText);

			if (index >= 0) {
				String newText1 = text.substring(0, index);
				String newText2 = "\n<p>Added by Blogs Render Filter!</p>\n";
				String newText3 = text.substring(index);
				
				String newText = newText1 + newText2 + newText3;
				
				response.getWriter().write(newText);
			}
		}
		
	}

	// TODO enter required service methods

}