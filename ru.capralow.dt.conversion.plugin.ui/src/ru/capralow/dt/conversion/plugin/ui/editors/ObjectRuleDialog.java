package ru.capralow.dt.conversion.plugin.ui.editors;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ColumnLabelProvider;
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
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.validation.IResourceValidator;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.CustomEmbeddedEditor;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorModelAccess;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorResourceProvider;

import ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;

@SuppressWarnings("restriction")
public class ObjectRuleDialog extends Dialog {

	private CmObjectRule objectRule;
	private Text txtObjectRuleName;
	private Text txtConfigurationObjectName, txtFormatObjectName;

	private TableViewer viewerAttributeRules;

	private CustomEmbeddedEditor editorOnSending, editorBeforeReceiving, editorOnReceiving, editorAfterReceiving;
	private CustomEmbeddedEditorModelAccess modelAccessOnSending, modelAccessBeforeReceiving, modelAccessOnReceiving,
			modelAccessAfterReceiving;

	private String algorithmsText;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ObjectRuleDialog(Shell parentShell, CmObjectRule objectRule) {
		super(parentShell);
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.PRIMARY_MODAL);

		this.objectRule = objectRule;
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

		// Основные сведения
		CTabItem tabItem1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem1.setText("Основные сведения");

		Composite tabComposite1 = new Composite(tabFolder, 0);
		tabItem1.setControl(tabComposite1);
		tabComposite1.setLayout(new GridLayout(3, false));

		// 1.1
		Label lblRuleName = new Label(tabComposite1, SWT.NONE);
		lblRuleName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRuleName.setText("Идентификатор правила");

		// 1.2
		txtObjectRuleName = new Text(tabComposite1, SWT.BORDER);
		txtObjectRuleName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtObjectRuleName.setText("<Идентификатор правила>");

		// 1.3
		Button btnDisable = new Button(tabComposite1, SWT.CHECK);
		btnDisable.setText("Отключить");

		// 2.1
		Label lblConfigurationObjectName = new Label(tabComposite1, SWT.NONE);
		lblConfigurationObjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblConfigurationObjectName.setText("Объект конфигурации");

		// 2.2
		txtConfigurationObjectName = new Text(tabComposite1, SWT.BORDER);
		txtConfigurationObjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtConfigurationObjectName.setText("<Объект конфигурации>");

		// 2.3
		new Label(tabComposite1, SWT.NONE);

		// 3.1
		Label lblFormatObjectName = new Label(tabComposite1, SWT.NONE);
		lblFormatObjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFormatObjectName.setText("Объект формата");

		// 3.2
		txtFormatObjectName = new Text(tabComposite1, SWT.BORDER);
		txtFormatObjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtFormatObjectName.setText("<Объект формата>");

		// 3.3
		new Label(tabComposite1, SWT.NONE);

		// 4.1
		Label lblSendingReceiving = new Label(tabComposite1, SWT.NONE);
		lblSendingReceiving.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSendingReceiving.setText("Область применения");

		// 4.2
		ToolBar toolBarObjectRulesSize = new ToolBar(tabComposite1, SWT.FLAT);

		ToolItem tltmObjectRulesSize1 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmObjectRulesSize1.setText("Для отправки");

		new ToolItem(toolBarObjectRulesSize, SWT.SEPARATOR);

		ToolItem tltmObjectRulesSize2 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmObjectRulesSize2.setText("Для получения");

		new ToolItem(toolBarObjectRulesSize, SWT.SEPARATOR);

		ToolItem tltmObjectRulesSize3 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmObjectRulesSize3.setText("Для отправки и получения");

		// 4.3
		Button btnForGroup = new Button(tabComposite1, SWT.CHECK);
		btnForGroup.setText("Правило для группы справочника");

		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		CustomEmbeddedEditorResourceProvider resourceProvider = (CustomEmbeddedEditorResourceProvider) resourceServiceProvider
				.get(IEditedResourceProvider.class);
		resourceProvider.setPlatformUri((URI) objectRule.getConversionModule().getModuleURI());

		IResourceValidator resourceValidator = resourceServiceProvider.get(IResourceValidator.class);

		EmbeddedEditorFactory embeddedEditorFactory = resourceServiceProvider.get(EmbeddedEditorFactory.class);

		// Правила конвертации свойств
		CTabItem tabItem2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem2.setText("Правила конвертации свойств");

		Composite compositeAttributeRules = new Composite(tabFolder, SWT.BORDER);
		compositeAttributeRules.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeAttributeRules);
		compositeAttributeRules.setLayout(new GridLayout(1, false));

		viewerAttributeRules = new TableViewer(compositeAttributeRules, SWT.FULL_SELECTION | SWT.BORDER | SWT.V_SCROLL);

		TableViewerColumn tblclmnAttributeRulesColumn1 = new TableViewerColumn(viewerAttributeRules, SWT.NONE);
		tblclmnAttributeRulesColumn1.getColumn().setWidth(300);
		tblclmnAttributeRulesColumn1.getColumn().setText("Свойство конфигурации");
		tblclmnAttributeRulesColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAttributeRule) element).getConfigurationAttributeFullName();
			}
		});
		TableViewerColumn tblclmnAttributeRulesColumn2 = new TableViewerColumn(viewerAttributeRules, SWT.NONE);
		tblclmnAttributeRulesColumn2.getColumn().setWidth(300);
		tblclmnAttributeRulesColumn2.getColumn().setText("Свойство формата");
		tblclmnAttributeRulesColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAttributeRule) element).getFormatAttributeFullName();
			}
		});
		TableViewerColumn tblclmnAttributeRulesColumn3 = new TableViewerColumn(viewerAttributeRules, SWT.NONE);
		tblclmnAttributeRulesColumn3.getColumn().setWidth(300);
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
		tblclmnAttributeRulesColumn4.getColumn().setWidth(100);
		tblclmnAttributeRulesColumn4.getColumn().setText("Алгоритм");
		tblclmnAttributeRulesColumn4.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAttributeRule) element).getIsCustomRule() ? "Да" : "Нет";
			}
		});

		viewerAttributeRules.setContentProvider(new IStructuredContentProvider() {
			@SuppressWarnings("unchecked")
			@Override
			public Object[] getElements(Object inputElement) {
				EList<CmAttributeRule> attributeRules = (EList<CmAttributeRule>) inputElement;

				CmAttributeRule[] viewerContent = new CmAttributeRule[attributeRules.size()];

				int i = 0;
				Iterator<CmAttributeRule> itr = attributeRules.iterator();
				while (itr.hasNext()) {
					viewerContent[i] = itr.next();
					i++;
				}

				return viewerContent;
			}

		});

		Table tableAttributeRules = viewerAttributeRules.getTable();
		tableAttributeRules.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		tableAttributeRules.setHeaderVisible(true);
		tableAttributeRules.setLinesVisible(true);

		tabItem2.setControl(compositeAttributeRules);

		// При отправке данных
		CTabItem tabItem3 = new CTabItem(tabFolder, SWT.NONE);
		tabItem3.setText("При отправке данных");

		Composite compositeOnSendingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeOnSendingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeOnSendingEditor);

		tabItem3.setControl(compositeOnSendingEditor);

		Text txtOnSending = new Text(compositeOnSendingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtOnSending.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtOnSending.setText("<Описание процедуры>");

		editorOnSending = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator)
				.withParent(compositeOnSendingEditor);

		editorOnSending.getViewer().getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// При конвертации данных XDTO
		CTabItem tabItem4 = new CTabItem(tabFolder, SWT.NONE);
		tabItem4.setText("При конвертации данных XDTO");

		Composite compositeBeforeReceivingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeBeforeReceivingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeBeforeReceivingEditor);

		tabItem4.setControl(compositeBeforeReceivingEditor);

		Text txtBeforeReceiving = new Text(compositeBeforeReceivingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtBeforeReceiving.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtBeforeReceiving.setText("<Описание процедуры>");

		editorBeforeReceiving = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator)
				.withParent(compositeBeforeReceivingEditor);

		editorBeforeReceiving.getViewer().getControl()
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Перед записью полученных данных
		CTabItem tabItem5 = new CTabItem(tabFolder, SWT.NONE);
		tabItem5.setText("Перед записью полученных данных");

		Composite compositeOnReceivingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeOnReceivingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeOnReceivingEditor);

		tabItem5.setControl(compositeOnReceivingEditor);

		Text txtOnReceiving = new Text(compositeOnReceivingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtOnReceiving.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtOnReceiving.setText("<Описание процедуры>");

		editorOnReceiving = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator)
				.withParent(compositeOnReceivingEditor);

		editorOnReceiving.getViewer().getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Перед записью полученных данных
		CTabItem tabItem6 = new CTabItem(tabFolder, SWT.NONE);
		tabItem6.setText("Перед записью полученных данных");

		Composite compositeAfterReceivingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeAfterReceivingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeAfterReceivingEditor);

		tabItem6.setControl(compositeAfterReceivingEditor);

		Text txtAfterReceiving = new Text(compositeAfterReceivingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtAfterReceiving.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtAfterReceiving.setText("<Описание процедуры>");

		editorAfterReceiving = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator)
				.withParent(compositeAfterReceivingEditor);

		editorAfterReceiving.getViewer().getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		editorAfterReceiving.getViewer().setEditable(false);

		// Заполнение диалога

		txtObjectRuleName.setText(objectRule.getName());

		txtConfigurationObjectName.setText("");
		if (objectRule.getConfigurationObject() != null)
			txtConfigurationObjectName.setText(objectRule.getConfigurationObject().toString());

		txtFormatObjectName.setText("");
		if (objectRule.getFormatObject() != null)
			txtFormatObjectName.setText(objectRule.getFormatObject().toString());

		tltmObjectRulesSize1.setSelection(objectRule.getForSending() && !objectRule.getForReceiving());
		tltmObjectRulesSize2.setSelection(!objectRule.getForSending() && objectRule.getForReceiving());
		tltmObjectRulesSize3.setSelection(objectRule.getForSending() && objectRule.getForReceiving());

		if (!objectRule.getForSending())
			tabItem3.dispose();

		if (!objectRule.getForReceiving()) {
			tabItem4.dispose();
			tabItem5.dispose();
			tabItem6.dispose();
		}

		btnForGroup.setSelection(objectRule.getForGroup());

		viewerAttributeRules.setInput(objectRule.getAttributeRules());

		if (objectRule.getAfterReceivingAlgorithm() != null)
			algorithmsText = objectRule.getConversionModule()
					.getAllAlgorithmsText(objectRule.getAfterReceivingAlgorithm().getName());
		else
			algorithmsText = objectRule.getConversionModule().getAllAlgorithmsText("");

		txtOnSending.setText(objectRule.getOnSendingEventPrefix());
		getModelAccessOnSending().updateEditablePart(objectRule.getOnSendingEventText());
		getModelAccessOnSending().updateModel(objectRule.getOnSendingEventPrefix(), objectRule.getOnSendingEvent(),
				objectRule.getOnSendingEventSuffix() + System.lineSeparator() + algorithmsText);

		txtBeforeReceiving.setText(objectRule.getBeforeReceivingEventPrefix());
		getModelAccessBeforeReceiving().updateEditablePart(objectRule.getBeforeReceivingEventText());
		getModelAccessBeforeReceiving().updateModel(objectRule.getBeforeReceivingEventPrefix(),
				objectRule.getBeforeReceivingEvent(),
				objectRule.getBeforeReceivingEventSuffix() + System.lineSeparator() + algorithmsText);

		txtOnReceiving.setText(objectRule.getOnReceivingEventPrefix());
		getModelAccessOnReceiving().updateEditablePart(objectRule.getOnReceivingEventText());
		getModelAccessOnReceiving().updateModel(objectRule.getOnReceivingEventPrefix(),
				objectRule.getOnReceivingEvent(),
				objectRule.getOnReceivingEventSuffix() + System.lineSeparator() + algorithmsText);

		txtAfterReceiving.setText("");
		if (objectRule.getAfterReceivingAlgorithm() != null) {
			txtAfterReceiving.setText(objectRule.getAfterReceivingAlgorithm().getPrefix());
			getModelAccessAfterReceiving().updateEditablePart(objectRule.getAfterReceivingAlgorithm().getAlgorithmText());
			getModelAccessAfterReceiving().updateModel(objectRule.getAfterReceivingAlgorithm().getPrefix(),
					objectRule.getAfterReceivingAlgorithm().getBody(),
					objectRule.getAfterReceivingAlgorithm().getSuffix() + System.lineSeparator() + algorithmsText);
		}

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
