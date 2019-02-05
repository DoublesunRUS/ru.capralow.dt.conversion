package ru.capralow.dt.conversion.plugin.ui;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

public class DataFormatToEMFGeneratorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		TreeSelection treeSelection = (TreeSelection) HandlerUtil.getCurrentSelection(event);

		Object firstSelection = treeSelection.getFirstElement();
		if (!(firstSelection instanceof XDTOPackage))
			return null;

		try {
			Resource ecoreResource = new DataFormatToEMFGenerator().generate((XDTOPackage) firstSelection);

			URIEditorInput editorInput = new URIEditorInput(ecoreResource.getURI());

			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(editorInput,
					"org.eclipse.emf.ecore.presentation.ReflectiveEditorID");

		} catch (IOException | PartInitException e) {
			e.printStackTrace();
		}

		return null;
	}

}
