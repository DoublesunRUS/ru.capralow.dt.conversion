package ru.capralow.dt.conversion.plugin.ui.editors;

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
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.validation.IResourceValidator;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.CustomEmbeddedEditor;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorModelAccess;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorResourceProvider;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomModelAccessAwareEmbeddedEditorBuilder;

import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

@SuppressWarnings("restriction")
public class ConversionModuleDialog extends Dialog {
	private static final String EDITOR_ID = "ru.capralow.dt.conversion.plugin.ui.editors.ConversionModuleEditor.id"; //$NON-NLS-1$

	private ConversionModule conversionModule;

	private CustomEmbeddedEditor editorBeforeConvertation, editorBeforeFilling, editorAfterConvertation;
	private CustomEmbeddedEditorModelAccess modelAccessBeforeConvertation, modelAccessBeforeFilling,
			modelAccessAfterConvertation;

	private String algorithmsText;

	private Boolean editable;

	/**
	 * Create the dialog.
	 *
	 * @param parentShell
	 */
	public ConversionModuleDialog(Shell parentShell, ConversionModule conversionModule, Boolean editable) {
		super(parentShell);
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.PRIMARY_MODAL);

		this.conversionModule = conversionModule;

		this.editable = editable;
	}

	/**
	 * Create contents of the dialog.
	 *
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		CustomEmbeddedEditorResourceProvider resourceProvider = (CustomEmbeddedEditorResourceProvider) resourceServiceProvider
				.get(IEditedResourceProvider.class);
		resourceProvider.setPlatformUri((URI) conversionModule.getModuleURI());

		IResourceValidator resourceValidator = resourceServiceProvider.get(ConversionResourceValidator.class);
		EmbeddedEditorFactory embeddedEditorFactory = resourceServiceProvider.get(EmbeddedEditorFactory.class);

		Composite container = (Composite) super.createDialogArea(parent);

		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(new GridLayout(1, false));

		CTabFolder tabFolder = new CTabFolder(container, SWT.BORDER | SWT.FLAT);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tabFolder.setSelectionBackground(
				Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		CTabItem tabItem1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem1.setText("Перед конвертацией");

		Composite compositeBeforeConvertationEditor = new Composite(tabFolder, SWT.BORDER);
		compositeBeforeConvertationEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeBeforeConvertationEditor);

		tabItem1.setControl(compositeBeforeConvertationEditor);

		Text txtBeforeConvertation = new Text(compositeBeforeConvertationEditor, SWT.BORDER);
		txtBeforeConvertation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtBeforeConvertation.setText("<Описание процедуры>");

		CustomModelAccessAwareEmbeddedEditorBuilder customModelAccessAwareEmbeddedEditorBuilder = (CustomModelAccessAwareEmbeddedEditorBuilder) embeddedEditorFactory
				.newEditor(resourceProvider).showErrorAndWarningAnnotations().withResourceValidator(resourceValidator);
		customModelAccessAwareEmbeddedEditorBuilder.setEditorId(EDITOR_ID);
		editorBeforeConvertation = (CustomEmbeddedEditor) customModelAccessAwareEmbeddedEditorBuilder
				.withParent(compositeBeforeConvertationEditor);

		XtextSourceViewer viewerBeforeConvertation = editorBeforeConvertation.getViewer();
		viewerBeforeConvertation.setEditable(editable);
		viewerBeforeConvertation.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		CTabItem tabItem2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem2.setText("Перед отложенным заполнением");

		Composite compositeBeforeFillingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeBeforeFillingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeBeforeFillingEditor);

		tabItem2.setControl(compositeBeforeFillingEditor);

		Text txtBeforeFilling = new Text(compositeBeforeFillingEditor, SWT.BORDER);
		txtBeforeFilling.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtBeforeFilling.setText("<Описание процедуры>");

		customModelAccessAwareEmbeddedEditorBuilder = (CustomModelAccessAwareEmbeddedEditorBuilder) embeddedEditorFactory
				.newEditor(resourceProvider).showErrorAndWarningAnnotations().withResourceValidator(resourceValidator);
		customModelAccessAwareEmbeddedEditorBuilder.setEditorId(EDITOR_ID);
		editorBeforeFilling = (CustomEmbeddedEditor) customModelAccessAwareEmbeddedEditorBuilder
				.withParent(compositeBeforeFillingEditor);

		XtextSourceViewer viewerBeforeFilling = editorBeforeFilling.getViewer();
		viewerBeforeFilling.setEditable(editable);
		viewerBeforeFilling.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		CTabItem tabItem3 = new CTabItem(tabFolder, SWT.NONE);
		tabItem3.setText("Перед отложенным заполнением");

		Composite compositeAfterConvertationEditor = new Composite(tabFolder, SWT.BORDER);
		compositeAfterConvertationEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeAfterConvertationEditor);

		tabItem3.setControl(compositeAfterConvertationEditor);

		Text txtAfterConvertation = new Text(compositeAfterConvertationEditor, SWT.BORDER);
		txtAfterConvertation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtAfterConvertation.setText("<Описание процедуры>");

		customModelAccessAwareEmbeddedEditorBuilder = (CustomModelAccessAwareEmbeddedEditorBuilder) embeddedEditorFactory
				.newEditor(resourceProvider).showErrorAndWarningAnnotations().withResourceValidator(resourceValidator);
		customModelAccessAwareEmbeddedEditorBuilder.setEditorId(EDITOR_ID);
		editorAfterConvertation = (CustomEmbeddedEditor) customModelAccessAwareEmbeddedEditorBuilder
				.withParent(compositeAfterConvertationEditor);

		XtextSourceViewer viewerAfterConvertation = editorAfterConvertation.getViewer();
		viewerAfterConvertation.setEditable(editable);
		viewerAfterConvertation.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Заполнение данными

		algorithmsText = conversionModule.getAllAlgorithmsText("");

		txtBeforeConvertation.setText(conversionModule.getBeforeConvertationEventPrefix());
		getModelAccessBeforeConvertation().updateEditablePart(conversionModule.getBeforeConvertationEventText());
		getModelAccessBeforeConvertation().updateModel(conversionModule.getBeforeConvertationEventPrefix(),
				conversionModule.getBeforeConvertationEvent(),
				conversionModule.getBeforeConvertationEventSuffix() + System.lineSeparator() + algorithmsText);

		txtBeforeFilling.setText(conversionModule.getBeforeFillingEventPrefix());
		getModelAccessBeforeFilling().updateEditablePart(conversionModule.getBeforeFillingEventText());
		getModelAccessBeforeFilling().updateModel(conversionModule.getBeforeFillingEventPrefix(),
				conversionModule.getBeforeFillingEvent(),
				conversionModule.getBeforeFillingEventSuffix() + System.lineSeparator() + algorithmsText);

		txtAfterConvertation.setText(conversionModule.getAfterConvertationEventPrefix());
		getModelAccessAfterConvertation().updateEditablePart(conversionModule.getAfterConvertationEventText());
		getModelAccessAfterConvertation().updateModel(conversionModule.getAfterConvertationEventPrefix(),
				conversionModule.getAfterConvertationEvent(),
				conversionModule.getAfterConvertationEventSuffix() + System.lineSeparator() + algorithmsText);

		return container;
	}

	/**
	 * Create contents of the button bar.
	 *
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		if (editable)
			createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, !editable);
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

	@Override
	protected void okPressed() {
		conversionModule.setBeforeConvertationEvent(getModelAccessBeforeConvertation().getEditablePart());
		conversionModule.setBeforeFillingEvent(getModelAccessBeforeFilling().getEditablePart());
		conversionModule.setAfterConvertationEvent(getModelAccessAfterConvertation().getEditablePart());

		super.okPressed();
	}

}
