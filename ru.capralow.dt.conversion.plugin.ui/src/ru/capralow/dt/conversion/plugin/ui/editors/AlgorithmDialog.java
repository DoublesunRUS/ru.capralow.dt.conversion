package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.core.runtime.IAdaptable;
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
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.validation.IResourceValidator;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.CustomEmbeddedEditor;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorModelAccess;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorResourceProvider;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomModelAccessAwareEmbeddedEditorBuilder;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;

@SuppressWarnings("restriction")
public class AlgorithmDialog extends Dialog implements IAdaptable {
	private static final String EDITOR_ID = "ru.capralow.dt.conversion.plugin.ui.editors.ConversionModuleEditor.id"; //$NON-NLS-1$

	private CmAlgorithm algorithm;
	private ConversionModule conversionModule;

	private CustomEmbeddedEditor editorAlgorithm;
	private CustomEmbeddedEditorModelAccess modelAccessAlgorithm;

	private String algorithmsText;

	private Boolean editable;

	/**
	 * Create the dialog.
	 *
	 * @param parentShell
	 */
	public AlgorithmDialog(Shell parentShell, CmAlgorithm algorithm, ConversionModule conversionModule,
			Boolean editable) {
		super(parentShell);
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.PRIMARY_MODAL);

		this.algorithm = algorithm;
		this.conversionModule = conversionModule;

		this.editable = editable;
	}

	/*
	 * Каждый диалог, который имеет встроенные редакторы модуля, нужно расширить при
	 * помощи "org.eclipse.core.runtime.IAdaptable" и реализовать данный метод,
	 * который бы возвращал правильный актуальный EmbeddedEditor, иначе конструктор
	 * запросов открываться не будет.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		if (org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor.class == adapter) {
			return (T) editorAlgorithm;
		}
		return null;
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

		Composite composite = new Composite(container, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(composite);

		Text txtAlgorithm = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		txtAlgorithm.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtAlgorithm.setText("<Описание процедуры>");

		CustomModelAccessAwareEmbeddedEditorBuilder customModelAccessAwareEmbeddedEditorBuilder = (CustomModelAccessAwareEmbeddedEditorBuilder) embeddedEditorFactory
				.newEditor(resourceProvider).showErrorAndWarningAnnotations().withResourceValidator(resourceValidator);
		customModelAccessAwareEmbeddedEditorBuilder.setEditorId(EDITOR_ID);
		editorAlgorithm = (CustomEmbeddedEditor) customModelAccessAwareEmbeddedEditorBuilder.withParent(composite);

		XtextSourceViewer viewer = editorAlgorithm.getViewer();
		viewer.setEditable(editable);
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Заполнение данными

		algorithmsText = conversionModule.getAllAlgorithmsText(algorithm.getName());

		txtAlgorithm.setText(algorithm.getPrefix());
		getModelAccess().updateEditablePart(algorithm.getAlgorithmText());
		getModelAccess().updateModel(algorithm.getPrefix(), algorithm.getBody(),
				algorithm.getSuffix() + System.lineSeparator() + algorithmsText);

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

	private synchronized CustomEmbeddedEditorModelAccess getModelAccess() {
		if (modelAccessAlgorithm == null) {
			modelAccessAlgorithm = (CustomEmbeddedEditorModelAccess) editorAlgorithm.createPartialEditor("", "", "",
					true);
		}
		return modelAccessAlgorithm;
	}

	@Override
	protected void okPressed() {
		algorithm.setBody(getModelAccess().getEditablePart());

		super.okPressed();
	}

}
