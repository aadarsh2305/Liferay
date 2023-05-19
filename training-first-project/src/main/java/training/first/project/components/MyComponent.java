package training.first.project.components;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Component;

@Component
public class MyComponent implements BundleActivator{

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Started Shell");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopped Shell");
		
	}

}
