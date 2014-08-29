package fr.obeo.dsl.sprototyper.initializer.actions;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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

import fr.obeo.dsl.sPrototyper.SPrototyper;
import fr.obeo.dsl.sprototyper.initializer.core.Initializer;

public class InitializerAction implements IObjectActionDelegate {

	private Shell shell;
	
	private EditingDomain editingDomain;
	
	private SPrototyper sPrototyper;
	
	/**
	 * Constructor for Action1.
	 */
	public InitializerAction() {
		editingDomain = new AdapterFactoryEditingDomain(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) , new BasicCommandStack());
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
				new Initializer(editingDomain, sPrototyper).run();
				MessageDialog.openInformation(
						shell,
						"SPrototyper Transformer",
						"Done.");
			} catch (IOException e) {
				MessageDialog.openError(
						shell,
						"SPrototyper Transformer",
						"Error:\n" + e.toString());
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
			Resource resource = editingDomain.getResourceSet().getResource(uri, true);
			if (resource.getContents() != null && !resource.getContents().isEmpty()) {
				if (resource.getContents().get(0) instanceof SPrototyper) {
					sPrototyper = (SPrototyper) resource.getContents().get(0);
				}
			}
		}
	}
	
}
