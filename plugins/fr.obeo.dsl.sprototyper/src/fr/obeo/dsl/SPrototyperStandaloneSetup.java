
package fr.obeo.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SPrototyperStandaloneSetup extends SPrototyperStandaloneSetupGenerated{

	public static void doSetup() {
		new SPrototyperStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

