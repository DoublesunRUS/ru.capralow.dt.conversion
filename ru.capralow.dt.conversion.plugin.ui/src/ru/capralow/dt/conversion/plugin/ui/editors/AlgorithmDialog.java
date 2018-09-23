package ru.capralow.dt.conversion.plugin.ui.editors;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.validation.IResourceValidator;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.CustomEmbeddedEditor;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorModelAccess;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorResourceProvider;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;

@SuppressWarnings("restriction")
public class AlgorithmDialog extends Dialog {
	private CmAlgorithm algorithm;

	private CustomEmbeddedEditor editor;
	private CustomEmbeddedEditorModelAccess modelAccess;

	private String algorithmsText;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public AlgorithmDialog(Shell parentShell, CmAlgorithm algorithm) {
		super(parentShell);
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.PRIMARY_MODAL);

		this.algorithm = algorithm;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(new GridLayout(1, false));

		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		CustomEmbeddedEditorResourceProvider resourceProvider = (CustomEmbeddedEditorResourceProvider) resourceServiceProvider
				.get(IEditedResourceProvider.class);
		resourceProvider.setPlatformUri((URI) algorithm.getConversionModule().getModuleURI());

		IResourceValidator resourceValidator = resourceServiceProvider.get(IResourceValidator.class);

		EmbeddedEditorFactory embeddedEditorFactory = resourceServiceProvider.get(EmbeddedEditorFactory.class);

		Composite composite = new Composite(container, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(composite);

		Text txtAlgorithm = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		txtAlgorithm.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtAlgorithm.setText("<Описание процедуры>");

		editor = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator).withParent(composite);

		editor.getViewer().getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Заполнение данными

		algorithmsText = algorithm.getConversionModule().getAlgorithmsText(algorithm.getName());

		String[] algorithmText = parseMethod(algorithm.getText());
		txtAlgorithm.setText(algorithmText[0]);
		getModelAccess().updateEditablePart(algorithm.getText());
		getModelAccess().updateModel(algorithmText[0], algorithmText[1],
				algorithmText[2] + System.lineSeparator() + algorithmsText);

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(1280, 668);
	}

	private synchronized CustomEmbeddedEditorModelAccess getModelAccess() {
		if (modelAccess == null) {
			modelAccess = (CustomEmbeddedEditorModelAccess) editor.createPartialEditor("", "", "", true);
		}
		return modelAccess;
	}

	private String[] parseMethod(String method) {
		String[] result = new String[3];

		result[0] = "";
		result[1] = "";
		result[2] = "";

		String[] methodArray = method.split(System.lineSeparator());

		if (methodArray.length < 3)
			return result;

		result[0] = methodArray[0];
		result[2] = methodArray[methodArray.length - 1];
		result[1] = method.substring(result[0].length() + System.lineSeparator().length(),
				method.length() - result[2].length() - System.lineSeparator().length());

		return result;

	}

	public Map<Object, String> getUpdatedMethods() {
		Map<Object, String> result = new HashMap<Object, String>();

		result.put(algorithm.getMethod(),
				editor.getDocument().get().substring(0, editor.getDocument().get().indexOf(algorithmsText)));

		return result;
	}

}
