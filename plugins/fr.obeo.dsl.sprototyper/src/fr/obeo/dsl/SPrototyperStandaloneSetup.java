
package fr.obeo.dsl;

/**
 * without equinox extension registry
 */
public class SPrototyperStandaloneSetup extends SPrototyperStandaloneSetupGenerated{

	public static void doSetup() {
		new SPrototyperStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

