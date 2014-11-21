package fr.obeo.dsl.sprototyper.initializer.actions;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;

import fr.obeo.dsl.sPrototyper.SPrototyper;
import fr.obeo.dsl.sprototyper.initializer.core.Initializer;
import fr.obeo.dsl.sprototyper.initializer.core.services.NamingService;
import fr.obeo.dsl.sprototyper.initializer.core.services.ToolsService;
import fr.obeo.dsl.sprototyper.initializer.core.services.VSMService;

public class InitializerAction implements IObjectActionDelegate {

	private Shell shell;
	private EditingDomain editingDomain;

	@Inject
	private IResourceSetProvider resourceSetProvider;

	private SPrototyper sPrototyper;

	/**
	 * Constructor for Action1.
	 */
	public InitializerAction() {
		editingDomain = getEditingDomain();
	}

	private EditingDomain getEditingDomain() {
		if (editingDomain == null) {
			editingDomain = new AdapterFactoryEditingDomain(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) , new BasicCommandStack());
		}
		return editingDomain;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (sPrototyper != null) {
			try {
				NamingService namingService = new NamingService(sPrototyper);
				VSMService vsmService = new VSMService(getEditingDomain());
				ToolsService toolsService = new ToolsService(namingService, vsmService, getEditingDomain());
				new Initializer(namingService, toolsService, vsmService, getEditingDomain(), sPrototyper).run();
				MessageDialog.openInformation(
						shell,
						"SPrototyper Transformer",
						"Done.");
			} catch (IOException e) {
				MessageDialog.openError(
						shell,
						"SPrototyper Transformer",
						"Error:\n" + e.toString());
			} finally {
				editingDomain = null;
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IFile selectedFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
			URI uri = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);
			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri(selectedFile.getWorkspace().getRoot().getLocation().toOSString());
			IProject project = selectedFile.getProject();
			XtextResourceSet resourceSet = (XtextResourceSet) resourceSetProvider.get(project);
			Resource resource = resourceSet.getResource(uri, true);
			if (resource.getContents() != null && !resource.getContents().isEmpty()) {
				if (resource.getContents().get(0) instanceof SPrototyper) {
					sPrototyper = (SPrototyper) resource.getContents().get(0);
				}
			}
		}
	}

}
