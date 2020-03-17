package osgi.mtit.auth;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class AuthActivator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Authentication server is started");
		AdminAuthorization adminAuthorization = new AdminAuthorization();
		serviceRegistration = context.registerService(AdminAuthorization.class.getName(), 
				adminAuthorization, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Authentication server stopped!");
		serviceRegistration.unregister();
	}

}
