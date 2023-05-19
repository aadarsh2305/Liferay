package com.aixtor.training.custompassword;

import com.liferay.portal.deploy.hot.CustomJspBag;
import com.liferay.portal.kernel.url.URLContainer;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    property = {
	    	"context.id=customLoginPasswordJSPBag",
	        "context.name=Test Custom JSP Bag",
	    	"service.ranking:Integer=1000"
	    }
	)
public class CustomLoginPasswordJSPBag implements CustomJspBag {
	
	private Bundle bundle;
	private List<String> customJsps;

	@Override
	public String getCustomJspDir() {
		System.out.println("DemoCustomJspBag >>> getCustomJspDir() >>> Inside");
		return "META-INF/jsps/";
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		bundle = bundleContext.getBundle();

		customJsps = new ArrayList<>();

		Enumeration<URL> entries = bundle.findEntries(
			getCustomJspDir(), "*.jsp", true);

		while (entries.hasMoreElements()) {
			URL url = entries.nextElement();
			customJsps.add(url.getPath());
		}
	}
	
	@Override
	public List<String> getCustomJsps() {
		System.out.println("DemoCustomJspBag >>> getCustomJsps() >>> Inside");
	    return customJsps;
	}

	@Override
	public URLContainer getURLContainer() {
		System.out.println("DemoCustomJspBag >>> getURLContainer() >>> Inside");
		return urlContainer;
	}

	@Override
	public boolean isCustomJspGlobal() {
		System.out.println("DemoCustomJspBag >>> isCustomJspGlobal() >>> Inside");
		return true;
	}
	
	private final URLContainer urlContainer = new URLContainer() {

	    @Override
	    public URL getResource(String name) {
	        return bundle.getEntry(name);
	    }

	    @Override
	    public Set<String> getResources(String path) {
	        Set<String> paths = new HashSet<>();

	        for (String entry : customJsps) {
	            if (entry.startsWith(path)) {
	               paths.add(entry);
	            }
	        }

	        return paths;
	    }

	};

}