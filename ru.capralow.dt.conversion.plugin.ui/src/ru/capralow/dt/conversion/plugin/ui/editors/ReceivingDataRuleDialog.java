package ru.capralow.dt.conversion.plugin.ui.editors;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnLabelProvider;
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
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.validation.IResourceValidator;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.CustomEmbeddedEditor;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorModelAccess;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorResourceProvider;

import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant;

@SuppressWarnings("restriction")
public class ReceivingDataRuleDialog extends Dialog {

	private CmDataRule dataRule;
	private Text txtDataRuleName, txtObjectRuleName;
	private Text txtFormatObjectName;

	private CustomEmbeddedEditor editorOnProcessing;
	private CustomEmbeddedEditorModelAccess modelAccessOnProcessing;

	private String algorithmsText;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ReceivingDataRuleDialog(Shell parentShell, CmDataRule dataRule) {
		super(parentShell);
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.PRIMARY_MODAL);

		this.dataRule = dataRule;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		GridLayoutFactory.fillDefaults().applyTo(container);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(container);

		CTabFolder tabFolder = new CTabFolder(container, SWT.BORDER | SWT.FLAT);
		GridLayoutFactory.fillDefaults().applyTo(tabFolder);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(tabFolder);

		tabFolder.setSelectionBackground(
				Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		CTabItem tabItem1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem1.setText("Основные сведения");

		Composite tabComposite1 = new Composite(tabFolder, SWT.NONE);
		tabComposite1.setLayout(new GridLayout(3, false));

		// 1.1
		Label lblRuleName = new Label(tabComposite1, SWT.NONE);
		lblRuleName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRuleName.setText("Идентификатор правила");

		// 1.2
		txtDataRuleName = new Text(tabComposite1, SWT.BORDER);
		txtDataRuleName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtDataRuleName.setText("<Идентификатор правила>");

		// 1.3
		Button btnDisable = new Button(tabComposite1, SWT.CHECK);
		btnDisable.setText("Отключить");

		// 2.1
		Label lblSelectionVariant = new Label(tabComposite1, SWT.NONE);
		lblSelectionVariant.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSelectionVariant.setText("Способ выборки");

		// 2.2
		ToolBar toolBarSelectionVariant = new ToolBar(tabComposite1, SWT.FLAT);

		ToolItem tltmSelectionVariant1 = new ToolItem(toolBarSelectionVariant, SWT.CHECK);
		tltmSelectionVariant1.setText(CmSelectionVariant.STANDART.getLiteral());

		new ToolItem(toolBarSelectionVariant, SWT.SEPARATOR);

		ToolItem tltmSelectionVariant2 = new ToolItem(toolBarSelectionVariant, SWT.CHECK);
		tltmSelectionVariant2.setText(CmSelectionVariant.CUSTOM.getLiteral());

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
		Label lblObjectRulesSize = new Label(tabComposite1, SWT.NONE);
		lblObjectRulesSize.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblObjectRulesSize.setText("Количество правил конвертации");

		// 4.2
		ToolBar toolBarObjectRulesSize = new ToolBar(tabComposite1, SWT.FLAT);

		ToolItem tltmObjectRulesSize1 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmObjectRulesSize1.setText("Несколько");

		new ToolItem(toolBarObjectRulesSize, SWT.SEPARATOR);

		ToolItem tltmObjectRulesSize2 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmObjectRulesSize2.setText("Одно");

		// 4.3
		new Label(tabComposite1, SWT.NONE);

		// 5.1
		Label lblObjectRuleName = new Label(tabComposite1, SWT.NONE);
		lblObjectRuleName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblObjectRuleName.setText("Правило конвертации объекта");

		// 5.2
		txtObjectRuleName = new Text(tabComposite1, SWT.BORDER);
		txtObjectRuleName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtObjectRuleName.setText("<Правило конвертации объекта>");

		// 5.3
		new Label(tabComposite1, SWT.NONE);

		// 6.1-3
		Composite compositeTable = new Composite(tabComposite1, SWT.NONE);
		TableColumnLayout tcl = new TableColumnLayout();
		compositeTable.setLayout(tcl);
		compositeTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 3, 1));

		TableViewer viewer = new TableViewer(compositeTable, SWT.FULL_SELECTION | SWT.BORDER);

		Table table = viewer.getTable();

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableViewerColumn tblclmnColumn1 = new TableViewerColumn(viewer, SWT.NONE);
		tcl.setColumnData(tblclmnColumn1.getColumn(), new ColumnWeightData(1, 150, true));
		tblclmnColumn1.getColumn().setText("Правило конвертации объекта");
		tblclmnColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmObjectRule) element).getName();
			}
		});

		viewer.setContentProvider(new IStructuredContentProvider() {
			@SuppressWarnings("unchecked")
			@Override
			public Object[] getElements(Object inputElement) {
				EList<CmObjectRule> objectRules = (EList<CmObjectRule>) inputElement;

				Object[] viewerContent = new Object[objectRules.size()];

				int i = 0;
				Iterator<CmObjectRule> itr = objectRules.iterator();
				while (itr.hasNext()) {
					viewerContent[i] = itr.next();
					i++;
				}

				return viewerContent;
			}

		});

		tabItem1.setControl(tabComposite1);

		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		CustomEmbeddedEditorResourceProvider resourceProvider = (CustomEmbeddedEditorResourceProvider) resourceServiceProvider
				.get(IEditedResourceProvider.class);
		resourceProvider.setPlatformUri((URI) dataRule.getConversionModule().getModuleURI());

		IResourceValidator resourceValidator = resourceServiceProvider.get(ConversionResourceValidator.class);

		EmbeddedEditorFactory embeddedEditorFactory = resourceServiceProvider.get(EmbeddedEditorFactory.class);

		CTabItem tabItem2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem2.setText("При обработке");

		Composite compositeOnProcessingEditor = new Composite(tabFolder, SWT.BORDER);
		compositeOnProcessingEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeOnProcessingEditor);

		tabItem2.setControl(compositeOnProcessingEditor);

		Text txtOnProcessing = new Text(compositeOnProcessingEditor, SWT.BORDER | SWT.READ_ONLY);
		txtOnProcessing.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtOnProcessing.setText("<Описание процедуры>");

		editorOnProcessing = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator)
				.withParent(compositeOnProcessingEditor);

		editorOnProcessing.getViewer().getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Заполнение диалога

		txtDataRuleName.setText(dataRule.getName());

		CmSelectionVariant selectionVariant = dataRule.getSelectionVariant();
		tltmSelectionVariant1.setSelection(selectionVariant == CmSelectionVariant.STANDART);
		tltmSelectionVariant2.setSelection(selectionVariant == CmSelectionVariant.CUSTOM);

		txtFormatObjectName.setText(dataRule.getFormatObjectName());

		EList<CmObjectRule> objectRules = dataRule.getObjectRules();

		tltmObjectRulesSize1.setSelection(objectRules.size() > 1);
		tltmObjectRulesSize2.setSelection(objectRules.size() < 2);

		lblObjectRuleName.setVisible(objectRules.size() < 2);
		txtObjectRuleName.setVisible(objectRules.size() < 2);
		table.setVisible(objectRules.size() > 1);

		txtObjectRuleName.setText(objectRules.get(0).getName());
		viewer.setInput(objectRules);

		algorithmsText = dataRule.getConversionModule().getAllAlgorithmsText("");

		txtOnProcessing.setText(dataRule.getOnProcessingEventPrefix());
		getModelAccessOnProcessing().updateEditablePart(dataRule.getOnProcessingEventText());
		getModelAccessOnProcessing().updateModel(dataRule.getOnProcessingEventPrefix(), dataRule.getOnProcessingEvent(),
				dataRule.getOnProcessingEventSuffix() + System.lineSeparator() + algorithmsText);

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

	private synchronized CustomEmbeddedEditorModelAccess getModelAccessOnProcessing() {
		if (modelAccessOnProcessing == null) {
			modelAccessOnProcessing = (CustomEmbeddedEditorModelAccess) editorOnProcessing.createPartialEditor("", "",
					"", true);
		}
		return modelAccessOnProcessing;
	}

	@Override
	protected void okPressed() {
		dataRule.setOnProcessingEvent(getModelAccessOnProcessing().getEditablePart());

		super.okPressed();
	}

}
