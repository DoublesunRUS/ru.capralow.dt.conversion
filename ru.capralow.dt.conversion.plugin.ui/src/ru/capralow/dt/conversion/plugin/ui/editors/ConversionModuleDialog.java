package ru.capralow.dt.conversion.plugin.ui.editors;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.validation.IResourceValidator;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.CustomEmbeddedEditor;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorModelAccess;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorResourceProvider;

import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

public class ConversionModuleDialog extends Dialog {
	private ConversionModule conversionModule;

	private CustomEmbeddedEditor editorBeforeConvertation, editorBeforeFilling, editorAfterConvertation;
	private CustomEmbeddedEditorModelAccess modelAccessBeforeConvertation, modelAccessBeforeFilling,
			modelAccessAfterConvertation;

	private String algorithmsText;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ConversionModuleDialog(Shell parentShell, ConversionModule conversionModule) {
		super(parentShell);
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.PRIMARY_MODAL);

		this.conversionModule = conversionModule;
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

		CTabFolder tabFolder = new CTabFolder(container, SWT.BORDER | SWT.FLAT);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tabFolder.setSelectionBackground(
				Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		CustomEmbeddedEditorResourceProvider resourceProvider = (CustomEmbeddedEditorResourceProvider) resourceServiceProvider
				.get(IEditedResourceProvider.class);
		resourceProvider.setPlatformUri((URI) conversionModule.getModuleURI());

		IResourceValidator resourceValidator = resourceServiceProvider.get(IResourceValidator.class);

		EmbeddedEditorFactory embeddedEditorFactory = resourceServiceProvider.get(EmbeddedEditorFactory.class);

		CTabItem tabItem1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem1.setText("Перед конвертацией");

		Composite compositeBeforeConvertationEditor = new Composite(tabFolder, SWT.BORDER);
		compositeBeforeConvertationEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeBeforeConvertationEditor);

		tabItem1.setControl(compositeBeforeConvertationEditor);

		Text txtBeforeConvertation = new Text(compositeBeforeConvertationEditor, SWT.BORDER | SWT.READ_ONLY);
		txtBeforeConvertation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtBeforeConvertation.setText("<Описание процедуры>");

		editorBeforeConvertation = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator)
				.withParent(compositeBeforeConvertationEditor);

		editorBeforeConvertation.getViewer().getControl()
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		CTabItem tabItem2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem2.setText("Перед отложенным заполнением");

		Composite compositeBeforeFillingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeBeforeFillingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeBeforeFillingEditor);

		tabItem2.setControl(compositeBeforeFillingEditor);

		Text txtBeforeFilling = new Text(compositeBeforeFillingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtBeforeFilling.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtBeforeFilling.setText("<Описание процедуры>");

		editorBeforeFilling = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator)
				.withParent(compositeBeforeFillingEditor);

		editorBeforeFilling.getViewer().getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		CTabItem tabItem3 = new CTabItem(tabFolder, SWT.NONE);
		tabItem3.setText("Перед отложенным заполнением");

		Composite compositeAfterConvertationEditor = new Composite(tabFolder, SWT.BORDER);
		compositeAfterConvertationEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeAfterConvertationEditor);

		tabItem3.setControl(compositeAfterConvertationEditor);

		Text txtAfterConvertation = new Text(compositeAfterConvertationEditor, SWT.BORDER | SWT.READ_ONLY);
		txtAfterConvertation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtAfterConvertation.setText("<Описание процедуры>");

		editorAfterConvertation = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator)
				.withParent(compositeAfterConvertationEditor);

		editorAfterConvertation.getViewer().getControl()
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Заполнение данными

		algorithmsText = conversionModule.getAlgorithmsText("");

		String[] beforeConvertationEvent = parseMethod(conversionModule.getBeforeConvertationEvent());
		txtBeforeConvertation.setText(beforeConvertationEvent[0]);
		getModelAccessBeforeConvertation().updateEditablePart(conversionModule.getBeforeConvertationEvent());
		getModelAccessBeforeConvertation().updateModel(beforeConvertationEvent[0], beforeConvertationEvent[1],
				beforeConvertationEvent[2] + System.lineSeparator() + algorithmsText);

		String[] beforeFillingEvent = parseMethod(conversionModule.getBeforeFillingEvent());
		txtBeforeFilling.setText(beforeFillingEvent[0]);
		getModelAccessBeforeFilling().updateEditablePart(conversionModule.getBeforeFillingEvent());
		getModelAccessBeforeFilling().updateModel(beforeFillingEvent[0], beforeFillingEvent[1],
				beforeFillingEvent[2] + System.lineSeparator() + algorithmsText);

		String[] afterConvertationEvent = parseMethod(conversionModule.getAfterConvertationEvent());
		txtAfterConvertation.setText(afterConvertationEvent[0]);
		getModelAccessAfterConvertation().updateEditablePart(conversionModule.getAfterConvertationEvent());
		getModelAccessAfterConvertation().updateModel(afterConvertationEvent[0], afterConvertationEvent[1],
				afterConvertationEvent[2] + System.lineSeparator() + algorithmsText);

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

	private synchronized CustomEmbeddedEditorModelAccess getModelAccessBeforeConvertation() {
		if (modelAccessBeforeConvertation == null) {
			modelAccessBeforeConvertation = (CustomEmbeddedEditorModelAccess) editorBeforeConvertation
					.createPartialEditor("", "", "", true);
		}
		return modelAccessBeforeConvertation;
	}

	private synchronized CustomEmbeddedEditorModelAccess getModelAccessBeforeFilling() {
		if (modelAccessBeforeFilling == null) {
			modelAccessBeforeFilling = (CustomEmbeddedEditorModelAccess) editorBeforeFilling.createPartialEditor("", "",
					"", true);
		}
		return modelAccessBeforeFilling;
	}

	private synchronized CustomEmbeddedEditorModelAccess getModelAccessAfterConvertation() {
		if (modelAccessAfterConvertation == null) {
			modelAccessAfterConvertation = (CustomEmbeddedEditorModelAccess) editorAfterConvertation
					.createPartialEditor("", "", "", true);
		}
		return modelAccessAfterConvertation;
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

		result.put(conversionModule.getBeforeConvertationEventMethod(), editorBeforeConvertation.getDocument().get()
				.substring(0, editorBeforeConvertation.getDocument().get().indexOf(algorithmsText)));
		result.put(conversionModule.getBeforeFillingEventMethod(), editorBeforeFilling.getDocument().get().substring(0,
				editorBeforeFilling.getDocument().get().indexOf(algorithmsText)));
		result.put(conversionModule.getAfterConvertationEventMethod(), editorAfterConvertation.getDocument().get()
				.substring(0, editorAfterConvertation.getDocument().get().indexOf(algorithmsText)));

		return result;
	}

}
