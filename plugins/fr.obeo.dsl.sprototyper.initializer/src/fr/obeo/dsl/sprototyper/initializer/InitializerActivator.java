/**
 * 
 */
package fr.obeo.dsl.sprototyper.initializer;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author glefur
 *
 */
public class InitializerActivator implements BundleActivator {

	private static Bundle bundle;

	public static Bundle getBundle() {
		return bundle;
	}

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		bundle = context.getBundle();
	}

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
