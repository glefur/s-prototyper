/**
 * 
 */
package fr.obeo.dsl.sprototyper.initializer.core.services;

import com.google.common.base.Strings;

import fr.obeo.dsl.sPrototyper.SPDiagram;
import fr.obeo.dsl.sPrototyper.SPTable;
import fr.obeo.dsl.sPrototyper.SPViewpoint;
import fr.obeo.dsl.sPrototyper.SPrototyper;

/**
 * @author glefur
 *
 */
public class NamingService {
	
	private SPrototyper sPrototyper;
	
	public NamingService(SPrototyper sPrototyper) {
		this.sPrototyper = sPrototyper;
	}

	public String computeViewpointShortcut(SPViewpoint spViewpoint) {
		String shortcut = spViewpoint.getShortcut();
		if (Strings.isNullOrEmpty(shortcut)) {
			shortcut = spViewpoint.getName().substring(0, 3).toLowerCase();
		}
		return shortcut;
	}

	public String computeDiagramQualifier(SPViewpoint spViewpoint, SPDiagram spDiagram) {
		return sPrototyper.getQualifier() + "." + computeViewpointShortcut(spViewpoint) + "." + spDiagram.getName().toLowerCase();
	}

	public String computeTableQualifier(SPViewpoint spViewpoint, SPTable spTable) {
		return sPrototyper.getQualifier() + "." + computeViewpointShortcut(spViewpoint) + "." + spTable.getName().toLowerCase();
	}


}
