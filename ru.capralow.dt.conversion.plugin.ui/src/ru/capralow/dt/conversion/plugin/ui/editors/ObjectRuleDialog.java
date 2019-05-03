package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.validation.IResourceValidator;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.CustomEmbeddedEditor;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorModelAccess;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorResourceProvider;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomModelAccessAwareEmbeddedEditorBuilder;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;

@SuppressWarnings("restriction")
public class ObjectRuleDialog extends Dialog implements IAdaptable {
	private static final String EDITOR_ID = "ru.capralow.dt.conversion.plugin.ui.editors.ConversionModuleEditor.id"; //$NON-NLS-1$

	private CmObjectRule objectRule;
	private ConversionModule conversionModule;
	private URI moduleURI;

	private CTabFolder tabFolder;

	private CTabItem tabItemOnSendingEditor;
	private CTabItem tabItemBeforeReceivingEditor;
	private CTabItem tabItemOnReceivingEditor;
	private CTabItem tabItemAfterReceivingEditor;

	private CustomEmbeddedEditor editorOnSending;
	private CustomEmbeddedEditor editorBeforeReceiving;
	private CustomEmbeddedEditor editorOnReceiving;
	private CustomEmbeddedEditor editorAfterReceiving;

	private CustomEmbeddedEditorModelAccess modelAccessOnSending;
	private CustomEmbeddedEditorModelAccess modelAccessBeforeReceiving;
	private CustomEmbeddedEditorModelAccess modelAccessOnReceiving;
	private CustomEmbeddedEditorModelAccess modelAccessAfterReceiving;

	private Boolean editable;

	/**
	 * Create the dialog.
	 *
	 * @param parentShell
	 */
	public ObjectRuleDialog(Shell parentShell, CmObjectRule objectRule, ConversionModule conversionModule,
			URI moduleURI, Boolean editable) {
		super(parentShell);
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.PRIMARY_MODAL);

		this.objectRule = objectRule;
		this.conversionModule = conversionModule;
		this.moduleURI = moduleURI;

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
			CTabItem currentTabItem = tabFolder.getSelection();
			if (currentTabItem == null)
				return null;

			if (currentTabItem.equals(tabItemOnSendingEditor))
				return (T) editorOnSending;

			else if (currentTabItem.equals(tabItemBeforeReceivingEditor))
				return (T) editorBeforeReceiving;

			else if (currentTabItem.equals(tabItemOnReceivingEditor))
				return (T) editorOnReceiving;

			else if (currentTabItem.equals(tabItemAfterReceivingEditor))
				return (T) editorAfterReceiving;

			return null;
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
		final String EMPTY_METHOD_NAME = "<Имя и параметры процедуры>";

		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		CustomEmbeddedEditorResourceProvider resourceProvider = (CustomEmbeddedEditorResourceProvider) resourceServiceProvider
				.get(IEditedResourceProvider.class);
		resourceProvider.setPlatformUri(moduleURI);

		IResourceValidator resourceValidator = resourceServiceProvider.get(ConversionResourceValidator.class);
		EmbeddedEditorFactory embeddedEditorFactory = resourceServiceProvider.get(EmbeddedEditorFactory.class);

		IStructuredContentProvider viewerContentProvider = new ConversionModuleContentProvider();

		Composite container = (Composite) super.createDialogArea(parent);

		GridLayoutFactory.fillDefaults().applyTo(container);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(container);

		tabFolder = new CTabFolder(container, SWT.BORDER | SWT.FLAT);
		GridLayoutFactory.fillDefaults().applyTo(tabFolder);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(tabFolder);

		tabFolder.setSelectionBackground(
				Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		// Основные сведения
		CTabItem tabItemMain = new CTabItem(tabFolder, SWT.NONE);
		tabItemMain.setText("Основные сведения");

		Composite compositeMain = new Composite(tabFolder, 0);
		compositeMain.setLayout(new GridLayout(3, false));

		// 1.1
		Label lblRuleName = new Label(compositeMain, SWT.NONE);
		lblRuleName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRuleName.setText("Идентификатор правила");

		// 1.2
		Text txtObjectRuleName = new Text(compositeMain, SWT.BORDER);
		txtObjectRuleName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtObjectRuleName.setText("<Идентификатор правила>");
		txtObjectRuleName.setEditable(editable);

		// 1.3
		Button btnDisable = new Button(compositeMain, SWT.CHECK);
		btnDisable.setText("Отключить");
		btnDisable.setEnabled(editable);

		// 2.1
		Label lblConfigurationObjectName = new Label(compositeMain, SWT.NONE);
		lblConfigurationObjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblConfigurationObjectName.setText("Объект конфигурации");

		// 2.2
		Text txtConfigurationObjectName = new Text(compositeMain, SWT.BORDER);
		txtConfigurationObjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtConfigurationObjectName.setText("<Объект конфигурации>");
		txtConfigurationObjectName.setEditable(editable);

		// 2.3
		new Label(compositeMain, SWT.NONE);

		// 3.1
		Label lblFormatObjectName = new Label(compositeMain, SWT.NONE);
		lblFormatObjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFormatObjectName.setText("Объект формата");

		// 3.2
		Text txtFormatObjectName = new Text(compositeMain, SWT.BORDER);
		txtFormatObjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtFormatObjectName.setText("<Объект формата>");
		txtFormatObjectName.setEditable(editable);

		// 3.3
		new Label(compositeMain, SWT.NONE);

		// 4.1
		Label lblSendingReceiving = new Label(compositeMain, SWT.NONE);
		lblSendingReceiving.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSendingReceiving.setText("Область применения");

		// 4.2
		ToolBar toolBarObjectRulesSize = new ToolBar(compositeMain, SWT.FLAT);

		ToolItem tltmObjectRulesSize1 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmObjectRulesSize1.setText("Для отправки");
		tltmObjectRulesSize1.setEnabled(editable);

		new ToolItem(toolBarObjectRulesSize, SWT.SEPARATOR);

		ToolItem tltmObjectRulesSize2 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmObjectRulesSize2.setText("Для получения");
		tltmObjectRulesSize2.setEnabled(editable);

		new ToolItem(toolBarObjectRulesSize, SWT.SEPARATOR);

		ToolItem tltmObjectRulesSize3 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmObjectRulesSize3.setText("Для отправки и получения");
		tltmObjectRulesSize3.setEnabled(editable);

		// 4.3
		Button btnForGroup = new Button(compositeMain, SWT.CHECK);
		btnForGroup.setText("Правило для группы справочника");
		btnForGroup.setEnabled(editable);

		tabItemMain.setControl(compositeMain);

		// Правила конвертации свойств
		CTabItem tabItemAttributeRules = new CTabItem(tabFolder, SWT.NONE);
		tabItemAttributeRules.setText("Правила конвертации свойств");

		Composite compositeAttributeRules = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclAttributeRules = new TableColumnLayout();
		compositeAttributeRules.setLayout(tclAttributeRules);

		TableViewer viewerAttributeRules = new TableViewer(compositeAttributeRules,
				SWT.FULL_SELECTION | SWT.BORDER | SWT.V_SCROLL);

		Table tableAttributeRules = viewerAttributeRules.getTable();

		tableAttributeRules.setHeaderVisible(true);
		tableAttributeRules.setLinesVisible(true);

		TableViewerColumn tblclmnAttributeRulesColumn1 = new TableViewerColumn(viewerAttributeRules, SWT.NONE);
		tclAttributeRules.setColumnData(tblclmnAttributeRulesColumn1.getColumn(), new ColumnWeightData(2, 100, true));
		tblclmnAttributeRulesColumn1.getColumn().setText("Свойство конфигурации");
		tblclmnAttributeRulesColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAttributeRule) element).getConfigurationAttributeFullName();
			}
		});
		TableViewerColumn tblclmnAttributeRulesColumn2 = new TableViewerColumn(viewerAttributeRules, SWT.NONE);
		tclAttributeRules.setColumnData(tblclmnAttributeRulesColumn2.getColumn(), new ColumnWeightData(2, 100, true));
		tblclmnAttributeRulesColumn2.getColumn().setText("Свойство формата");
		tblclmnAttributeRulesColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAttributeRule) element).getFormatAttributeFullName();
			}
		});
		TableViewerColumn tblclmnAttributeRulesColumn3 = new TableViewerColumn(viewerAttributeRules, SWT.NONE);
		tclAttributeRules.setColumnData(tblclmnAttributeRulesColumn3.getColumn(), new ColumnWeightData(1, 100, true));
		tblclmnAttributeRulesColumn3.getColumn().setText("Правило конвертации свойства");
		tblclmnAttributeRulesColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmAttributeRule) element).getObjectRule() == null)
					return "";
				return ((CmAttributeRule) element).getObjectRule().getName();
			}
		});
		TableViewerColumn tblclmnAttributeRulesColumn4 = new TableViewerColumn(viewerAttributeRules, SWT.NONE);
		tclAttributeRules.setColumnData(tblclmnAttributeRulesColumn4.getColumn(), new ColumnPixelData(100));
		tblclmnAttributeRulesColumn4.getColumn().setText("Алгоритм");
		tblclmnAttributeRulesColumn4.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAttributeRule) element).getIsCustomRule() ? "Да" : "Нет";
			}
		});

		viewerAttributeRules.setContentProvider(viewerContentProvider);

		tabItemAttributeRules.setControl(compositeAttributeRules);

		// При отправке данных
		tabItemOnSendingEditor = new CTabItem(tabFolder, SWT.NONE);
		tabItemOnSendingEditor.setText("При отправке данных");

		Composite compositeOnSendingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeOnSendingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeOnSendingEditor);

		Text txtOnSendingDeclaration = new Text(compositeOnSendingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtOnSendingDeclaration.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtOnSendingDeclaration.setText(EMPTY_METHOD_NAME);

		CustomModelAccessAwareEmbeddedEditorBuilder customModelAccessAwareEmbeddedEditorBuilder = (CustomModelAccessAwareEmbeddedEditorBuilder) embeddedEditorFactory
				.newEditor(resourceProvider).showErrorAndWarningAnnotations().withResourceValidator(resourceValidator);
		customModelAccessAwareEmbeddedEditorBuilder.setEditorId(EDITOR_ID);
		editorOnSending = (CustomEmbeddedEditor) customModelAccessAwareEmbeddedEditorBuilder
				.withResourceValidator(resourceValidator).withParent(compositeOnSendingEditor);

		XtextSourceViewer viewerOnSending = editorOnSending.getViewer();
		viewerOnSending.setEditable(editable);
		viewerOnSending.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		tabItemOnSendingEditor.setControl(compositeOnSendingEditor);

		// При конвертации данных XDTO
		tabItemBeforeReceivingEditor = new CTabItem(tabFolder, SWT.NONE);
		tabItemBeforeReceivingEditor.setText("При конвертации данных XDTO");

		Composite compositeBeforeReceivingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeBeforeReceivingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeBeforeReceivingEditor);

		Text txtBeforeReceivingDeclaration = new Text(compositeBeforeReceivingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtBeforeReceivingDeclaration.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtBeforeReceivingDeclaration.setText(EMPTY_METHOD_NAME);

		customModelAccessAwareEmbeddedEditorBuilder = (CustomModelAccessAwareEmbeddedEditorBuilder) embeddedEditorFactory
				.newEditor(resourceProvider).showErrorAndWarningAnnotations().withResourceValidator(resourceValidator);
		customModelAccessAwareEmbeddedEditorBuilder.setEditorId(EDITOR_ID);
		editorBeforeReceiving = (CustomEmbeddedEditor) customModelAccessAwareEmbeddedEditorBuilder
				.withParent(compositeBeforeReceivingEditor);

		XtextSourceViewer viewerBeforeReceiving = editorBeforeReceiving.getViewer();
		viewerBeforeReceiving.setEditable(editable);
		viewerBeforeReceiving.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		tabItemBeforeReceivingEditor.setControl(compositeBeforeReceivingEditor);

		// Перед записью полученных данных
		tabItemOnReceivingEditor = new CTabItem(tabFolder, SWT.NONE);
		tabItemOnReceivingEditor.setText("Перед записью полученных данных");

		Composite compositeOnReceivingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeOnReceivingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeOnReceivingEditor);

		Text txtOnReceivingDeclaration = new Text(compositeOnReceivingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtOnReceivingDeclaration.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtOnReceivingDeclaration.setText(EMPTY_METHOD_NAME);

		customModelAccessAwareEmbeddedEditorBuilder = (CustomModelAccessAwareEmbeddedEditorBuilder) embeddedEditorFactory
				.newEditor(resourceProvider).showErrorAndWarningAnnotations().withResourceValidator(resourceValidator);
		customModelAccessAwareEmbeddedEditorBuilder.setEditorId(EDITOR_ID);
		editorOnReceiving = (CustomEmbeddedEditor) customModelAccessAwareEmbeddedEditorBuilder
				.withParent(compositeOnReceivingEditor);

		XtextSourceViewer viewerOnReceiving = editorOnReceiving.getViewer();
		viewerOnReceiving.setEditable(editable);
		viewerOnReceiving.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		tabItemOnReceivingEditor.setControl(compositeOnReceivingEditor);

		// После загрузки всех данных
		tabItemAfterReceivingEditor = new CTabItem(tabFolder, SWT.NONE);
		tabItemAfterReceivingEditor.setText("После загрузки всех данных");

		Composite compositeAfterReceivingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeAfterReceivingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeAfterReceivingEditor);

		Text txtAfterReceivingDeclaration = new Text(compositeAfterReceivingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtAfterReceivingDeclaration.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtAfterReceivingDeclaration.setText(EMPTY_METHOD_NAME);

		customModelAccessAwareEmbeddedEditorBuilder = (CustomModelAccessAwareEmbeddedEditorBuilder) embeddedEditorFactory
				.newEditor(resourceProvider).showErrorAndWarningAnnotations().withResourceValidator(resourceValidator);
		customModelAccessAwareEmbeddedEditorBuilder.setEditorId(EDITOR_ID);
		editorAfterReceiving = (CustomEmbeddedEditor) customModelAccessAwareEmbeddedEditorBuilder
				.withParent(compositeAfterReceivingEditor);

		XtextSourceViewer viewerAfterReceiving = editorAfterReceiving.getViewer();
		viewerAfterReceiving.setEditable(false); // Редактируется в алгоритмах
		viewerAfterReceiving.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		tabItemAfterReceivingEditor.setControl(compositeAfterReceivingEditor);

		// Идентификация
		CTabItem tabItemIdentification = new CTabItem(tabFolder, SWT.NONE);
		tabItemIdentification.setText("Идентификация");

		Composite compositeIdentification = new Composite(tabFolder, SWT.BORDER);
		compositeIdentification.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		compositeIdentification.setLayout(new GridLayout(2, false));

		// 1.1
		Label lblIdentificationVariant = new Label(compositeIdentification, SWT.NONE);
		lblIdentificationVariant.setText("Вариант Идентификации:");

		// 1.2
		ToolBar toolBarIdentificationVariant = new ToolBar(compositeIdentification, SWT.FLAT);

		ToolItem tltmIdentificationVariant1 = new ToolItem(toolBarIdentificationVariant, SWT.CHECK);
		tltmIdentificationVariant1.setText(CmIdentificationVariant.UUID.getLiteral());
		tltmIdentificationVariant1.setEnabled(editable);

		new ToolItem(toolBarIdentificationVariant, SWT.SEPARATOR);

		ToolItem tltmIdentificationVariant2 = new ToolItem(toolBarIdentificationVariant, SWT.CHECK);
		tltmIdentificationVariant2.setText(CmIdentificationVariant.SEARCH_FIELDS.getLiteral());
		tltmIdentificationVariant2.setEnabled(editable);

		new ToolItem(toolBarIdentificationVariant, SWT.SEPARATOR);

		ToolItem tltmIdentificationVariant3 = new ToolItem(toolBarIdentificationVariant, SWT.CHECK);
		tltmIdentificationVariant3.setText(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS.getLiteral());
		tltmIdentificationVariant3.setEnabled(editable);

		// 2.1
		new Label(compositeIdentification, SWT.NONE).setText("Идентификация по полям поиска");

		// 2.2
		new Label(compositeMain, SWT.NONE);
		new Label(compositeIdentification, SWT.NONE);

		// 3.1-2
		Composite compositeIdentificationFields = new Composite(compositeIdentification, SWT.BORDER);
		TableColumnLayout tclIdentificationFields = new TableColumnLayout();
		compositeIdentificationFields.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		compositeIdentificationFields.setLayout(tclIdentificationFields);

		TableViewer viewerIdentificationFields = new TableViewer(compositeIdentificationFields,
				SWT.FULL_SELECTION | SWT.BORDER | SWT.V_SCROLL);

		TableViewerColumn tblclmnIdentificationFieldsColumn1 = new TableViewerColumn(viewerIdentificationFields,
				SWT.NONE);
		tclIdentificationFields.setColumnData(tblclmnIdentificationFieldsColumn1.getColumn(),
				new ColumnWeightData(2, 100, true));
		tblclmnIdentificationFieldsColumn1.getColumn().setText("Поля поиска");
		tblclmnIdentificationFieldsColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((String) element);
			}
		});

		viewerIdentificationFields.setContentProvider(viewerContentProvider);

		tabItemIdentification.setControl(compositeIdentification);

		// Заполнение диалога

		txtObjectRuleName.setText(objectRule.getName());

		txtConfigurationObjectName.setText(objectRule.getConfigurationObjectName());

		txtFormatObjectName.setText(objectRule.getFormatObject());

		tltmObjectRulesSize1.setSelection(objectRule.getForSending() && !objectRule.getForReceiving());
		tltmObjectRulesSize2.setSelection(!objectRule.getForSending() && objectRule.getForReceiving());
		tltmObjectRulesSize3.setSelection(objectRule.getForSending() && objectRule.getForReceiving());

		if (!objectRule.getForSending())
			tabItemOnSendingEditor.dispose();

		if (!objectRule.getForReceiving()) {
			tabItemBeforeReceivingEditor.dispose();
			tabItemOnReceivingEditor.dispose();
			tabItemAfterReceivingEditor.dispose();
			tabItemIdentification.dispose();
		}

		btnForGroup.setSelection(objectRule.getForGroup());
		new Label(compositeMain, SWT.NONE);
		new Label(compositeMain, SWT.NONE);

		viewerAttributeRules.setInput(objectRule.getAttributeRules());

		String algorithmsText = "";
		if (objectRule.getAfterReceivingAlgorithm() != null)
			algorithmsText = conversionModule.getAllAlgorithmsText(objectRule.getAfterReceivingAlgorithm().getName());
		else
			algorithmsText = conversionModule.getAllAlgorithmsText("");

		txtOnSendingDeclaration.setText(objectRule.getOnSendingEventPrefix());
		getModelAccessOnSending().updateEditablePart(objectRule.getOnSendingEventText());
		getModelAccessOnSending().updateModel(objectRule.getOnSendingEventPrefix(), objectRule.getOnSendingEvent(),
				objectRule.getOnSendingEventSuffix() + System.lineSeparator() + algorithmsText);

		txtBeforeReceivingDeclaration.setText(objectRule.getBeforeReceivingEventPrefix());
		getModelAccessBeforeReceiving().updateEditablePart(objectRule.getBeforeReceivingEventText());
		getModelAccessBeforeReceiving().updateModel(objectRule.getBeforeReceivingEventPrefix(),
				objectRule.getBeforeReceivingEvent(),
				objectRule.getBeforeReceivingEventSuffix() + System.lineSeparator() + algorithmsText);

		txtOnReceivingDeclaration.setText(objectRule.getOnReceivingEventPrefix());
		getModelAccessOnReceiving().updateEditablePart(objectRule.getOnReceivingEventText());
		getModelAccessOnReceiving().updateModel(objectRule.getOnReceivingEventPrefix(),
				objectRule.getOnReceivingEvent(),
				objectRule.getOnReceivingEventSuffix() + System.lineSeparator() + algorithmsText);

		txtAfterReceivingDeclaration.setText("");
		if (objectRule.getAfterReceivingAlgorithm() != null) {
			txtAfterReceivingDeclaration.setText(objectRule.getAfterReceivingAlgorithm().getPrefix());
			getModelAccessAfterReceiving()
					.updateEditablePart(objectRule.getAfterReceivingAlgorithm().getAlgorithmText());
			getModelAccessAfterReceiving().updateModel(objectRule.getAfterReceivingAlgorithm().getPrefix(),
					objectRule.getAfterReceivingAlgorithm().getBody(),
					objectRule.getAfterReceivingAlgorithm().getSuffix() + System.lineSeparator() + algorithmsText);
		}

		tltmIdentificationVariant1.setSelection(objectRule.getIdentificationVariant() == CmIdentificationVariant.UUID);
		tltmIdentificationVariant2
				.setSelection(objectRule.getIdentificationVariant() == CmIdentificationVariant.SEARCH_FIELDS);
		tltmIdentificationVariant3
				.setSelection(objectRule.getIdentificationVariant() == CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);
		viewerIdentificationFields.setInput(objectRule.getIdentificationFields());

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

	private synchronized CustomEmbeddedEditorModelAccess getModelAccessOnSending() {
		if (modelAccessOnSending == null) {
			modelAccessOnSending = (CustomEmbeddedEditorModelAccess) editorOnSending.createPartialEditor("", "", "",
					true);
		}
		return modelAccessOnSending;
	}

	private synchronized CustomEmbeddedEditorModelAccess getModelAccessBeforeReceiving() {
		if (modelAccessBeforeReceiving == null) {
			modelAccessBeforeReceiving = (CustomEmbeddedEditorModelAccess) editorBeforeReceiving.createPartialEditor("",
					"", "", true);
		}
		return modelAccessBeforeReceiving;
	}

	private synchronized CustomEmbeddedEditorModelAccess getModelAccessOnReceiving() {
		if (modelAccessOnReceiving == null) {
			modelAccessOnReceiving = (CustomEmbeddedEditorModelAccess) editorOnReceiving.createPartialEditor("", "", "",
					true);
		}
		return modelAccessOnReceiving;
	}

	private synchronized CustomEmbeddedEditorModelAccess getModelAccessAfterReceiving() {
		if (modelAccessAfterReceiving == null) {
			modelAccessAfterReceiving = (CustomEmbeddedEditorModelAccess) editorAfterReceiving.createPartialEditor("",
					"", "", true);
		}
		return modelAccessAfterReceiving;
	}

	@Override
	protected void okPressed() {
		objectRule.setOnSendingEvent(getModelAccessOnSending().getEditablePart());
		objectRule.setBeforeReceivingEvent(getModelAccessBeforeReceiving().getEditablePart());

		super.okPressed();
	}

}
