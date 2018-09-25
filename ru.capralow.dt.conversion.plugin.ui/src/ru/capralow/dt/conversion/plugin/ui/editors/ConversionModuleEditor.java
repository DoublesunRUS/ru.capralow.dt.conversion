
package ru.capralow.dt.conversion.plugin.ui.editors;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.md.ui.editor.base.DtGranularEditorPage;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModuleAnalyzer;

public class ConversionModuleEditor extends DtGranularEditorPage<CommonModule> {
	public static final java.lang.String PAGE_ID = "ru.capralow.dt.conversion.plugin.ui.editors.ConversionModuleEditor";

	@Inject
	private IV8ProjectManager projectManager;

	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	private ConversionModuleAnalyzer conversionModuleAnalyzer;
	private ConversionModule conversionModule;

	private TableViewer viewerSendingDataRules, viewerAlgorithms;

	private Button btnInformation;

	private ToolItem tltmStoreVersion1, tltmStoreVersion2;

	@Inject
	public ConversionModuleEditor(String id, String title) {
		super(PAGE_ID, "Конвертация");

		conversionModuleAnalyzer = new ConversionModuleAnalyzer(projectManager, bmEmfIndexManager);
	}

	@Override
	protected void createPageControls(IManagedForm managedForm) {
		setActiveFeature(MdClassPackage.Literals.COMMON_MODULE__MODULE);

		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();

		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);

		GridLayoutFactory.fillDefaults().applyTo(body);
		GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).grab(true, true).applyTo(body);

		CTabItem tabItem;

		// Страницы
		CTabFolder tabFolder = new CTabFolder(body, SWT.FLAT);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tabFolder.setBorderVisible(true);

		toolkit.adapt(tabFolder);
		toolkit.paintBordersFor(tabFolder);

		tabFolder.setSelectionBackground(
				Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		// Информация
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Информация");

		Composite compositeInformation = new Composite(tabFolder, SWT.BORDER);
		compositeInformation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeInformation);
		compositeInformation.setLayout(new GridLayout(2, false));

		// 1.1
		Label lblStoreVersion = new Label(compositeInformation, SWT.NONE);
		lblStoreVersion.setText("Версия формата менеджера обмена");

		// 1.2
		ToolBar toolBarObjectRulesSize = new ToolBar(compositeInformation, SWT.FLAT);

		tltmStoreVersion1 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmStoreVersion1.setText("1");

		new ToolItem(toolBarObjectRulesSize, SWT.SEPARATOR);

		tltmStoreVersion2 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		tltmStoreVersion2.setText("2");

		// 2.1
		new Label(compositeInformation, SWT.NONE).setText("Доступные версии формата:");

		// 2.2
		new Label(compositeInformation, SWT.NONE);

		// 3.1-2
		TableViewer viewerInformation = new TableViewer(compositeInformation,
				SWT.FULL_SELECTION | SWT.BORDER | SWT.V_SCROLL);

		TableViewerColumn tblclmnINformationColumn1 = new TableViewerColumn(viewerInformation, SWT.NONE);
		tblclmnINformationColumn1.getColumn().setWidth(150);
		tblclmnINformationColumn1.getColumn().setText("Версия формата");

		Table tableInformation = viewerInformation.getTable();
		tableInformation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

		tableInformation.setHeaderVisible(true);
		tableInformation.setLinesVisible(true);

		// 4.1
		btnInformation = new Button(compositeInformation, SWT.PUSH);
		btnInformation.setText("Общие события конвертации");

		// 4.2
		new Label(compositeInformation, SWT.NONE);

		tabItem.setControl(compositeInformation);

		// ПОД: Отправка
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("ПОД: Отправка");

		Composite compositeSendingDataRules = new Composite(tabFolder, SWT.BORDER);
		compositeSendingDataRules.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeSendingDataRules);
		compositeSendingDataRules.setLayout(new GridLayout(1, false));

		viewerSendingDataRules = new TableViewer(compositeSendingDataRules,
				SWT.FULL_SELECTION | SWT.BORDER | SWT.V_SCROLL);

		TableViewerColumn tblclmnSendingDataRulesColumn1 = new TableViewerColumn(viewerSendingDataRules, SWT.NONE);
		tblclmnSendingDataRulesColumn1.getColumn().setWidth(300);
		tblclmnSendingDataRulesColumn1.getColumn().setText("Наименование");
		tblclmnSendingDataRulesColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmDataRule) element).getName();
			}
		});
		TableViewerColumn tblclmnSendingDataRulesColumn2 = new TableViewerColumn(viewerSendingDataRules, SWT.NONE);
		tblclmnSendingDataRulesColumn2.getColumn().setWidth(300);
		tblclmnSendingDataRulesColumn2.getColumn().setText("Объект конфигурации");
		tblclmnSendingDataRulesColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmDataRule) element).getConfigurationObject() == null)
					return "";
				return ((CmDataRule) element).getConfigurationObject().toString();
			}
		});
		TableViewerColumn tblclmnSendingDataRulesColumn3 = new TableViewerColumn(viewerSendingDataRules, SWT.NONE);
		tblclmnSendingDataRulesColumn3.getColumn().setWidth(100);
		tblclmnSendingDataRulesColumn3.getColumn().setText("При обработке");
		tblclmnSendingDataRulesColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmDataRule) element).getOnProcessingEvent().length() != 0 ? "Да" : "Нет";
			}
		});
		TableViewerColumn tblclmnSendingDataRulesColumn4 = new TableViewerColumn(viewerSendingDataRules, SWT.NONE);
		tblclmnSendingDataRulesColumn4.getColumn().setWidth(105);
		tblclmnSendingDataRulesColumn4.getColumn().setText("Выборка данных");
		tblclmnSendingDataRulesColumn4.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmDataRule) element).getDataSelectionEvent().length() != 0 ? "Да" : "Нет";
			}
		});

		viewerSendingDataRules.setContentProvider(new IStructuredContentProvider() {
			@SuppressWarnings("unchecked")
			@Override
			public Object[] getElements(Object inputElement) {
				EList<Object> dataRules = (EList<Object>) inputElement;

				Object[] viewerContent = new Object[dataRules.size()];

				int i = 0;
				Iterator<Object> itr = dataRules.iterator();
				while (itr.hasNext()) {
					viewerContent[i] = itr.next();
					i++;
				}

				return viewerContent;
			}

		});

		Table tableSendingDataRules = viewerSendingDataRules.getTable();
		tableSendingDataRules.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		tableSendingDataRules.setHeaderVisible(true);
		tableSendingDataRules.setLinesVisible(true);

		tabItem.setControl(compositeSendingDataRules);

		// // Получение
		// tabItem = new CTabItem(tabFolder, SWT.NONE);
		// tabItem.setText("Получение");
		//
		// Tree tree2 = new Tree(tabFolder, SWT.NONE);
		// tree2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		// tree2.setHeaderVisible(true);
		// TreeColumn column21 = new TreeColumn(tree2, SWT.LEFT);
		// column21.setText("Column 1");
		// column21.setWidth(200);
		// TreeColumn column22 = new TreeColumn(tree2, SWT.CENTER);
		// column22.setText("Column 2");
		// column22.setWidth(200);
		// TreeColumn column23 = new TreeColumn(tree2, SWT.RIGHT);
		// column23.setText("Column 3");
		// column23.setWidth(200);
		//
		// treeViewerReceivingEvents = new TreeViewer(tree);
		// treeViewerReceivingEvents.setContentProvider(new
		// SendingDataRulesContentProvider());
		// treeViewerReceivingEvents.setLabelProvider(new
		// SendingDataRulesLabelProvider());
		//
		// tabItem.setControl(tree2);
		//
		// // Предопределенные
		// tabItem = new CTabItem(tabFolder, SWT.NONE);
		// tabItem.setText("Предопределенные");
		//
		// Tree tree3 = new Tree(tabFolder, SWT.NONE);
		// tree3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		// tree3.setHeaderVisible(true);
		// TreeColumn column31 = new TreeColumn(tree3, SWT.LEFT);
		// column31.setText("Column 1");
		// column31.setWidth(200);
		// TreeColumn column32 = new TreeColumn(tree3, SWT.CENTER);
		// column32.setText("Column 2");
		// column32.setWidth(200);
		// TreeColumn column33 = new TreeColumn(tree3, SWT.RIGHT);
		// column33.setText("Column 3");
		// column33.setWidth(200);
		//
		// treeViewerPredefined = new TreeViewer(tree3);
		// treeViewerPredefined.setContentProvider(new
		// SendingDataRulesContentProvider());
		// treeViewerPredefined.setLabelProvider(new SendingDataRulesLabelProvider());
		//
		// tabItem.setControl(tree3);

		// Алгоритмы
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Алгоритмы");

		Composite compositeAlgorithms = new Composite(tabFolder, SWT.BORDER);
		compositeAlgorithms.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(compositeAlgorithms);
		compositeAlgorithms.setLayout(new GridLayout(1, false));

		viewerAlgorithms = new TableViewer(compositeAlgorithms, SWT.FULL_SELECTION | SWT.BORDER | SWT.V_SCROLL);

		TableViewerColumn tblclmnAlgorithmsColumn1 = new TableViewerColumn(viewerAlgorithms, SWT.NONE);
		tblclmnAlgorithmsColumn1.getColumn().setWidth(80);
		tblclmnAlgorithmsColumn1.getColumn().setText("Тип");
		tblclmnAlgorithmsColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAlgorithm) element).getMethodType().getLiteral();
			}
		});
		TableViewerColumn tblclmnAlgorithmsColumn2 = new TableViewerColumn(viewerAlgorithms, SWT.NONE);
		tblclmnAlgorithmsColumn2.getColumn().setWidth(300);
		tblclmnAlgorithmsColumn2.getColumn().setText("Имя");
		tblclmnAlgorithmsColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAlgorithm) element).getName();
			}
		});
		TableViewerColumn tblclmnAlgorithmsColumn3 = new TableViewerColumn(viewerAlgorithms, SWT.NONE);
		tblclmnAlgorithmsColumn3.getColumn().setWidth(300);
		tblclmnAlgorithmsColumn3.getColumn().setText("Параметры");
		tblclmnAlgorithmsColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAlgorithm) element).getParams();
			}
		});
		TableViewerColumn tblclmnAlgorithmsColumn4 = new TableViewerColumn(viewerAlgorithms, SWT.NONE);
		tblclmnAlgorithmsColumn4.getColumn().setWidth(60);
		tblclmnAlgorithmsColumn4.getColumn().setText("Экспорт");
		tblclmnAlgorithmsColumn4.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAlgorithm) element).getIsExport() ? "Да" : "Нет";
			}
		});

		viewerAlgorithms.setContentProvider(new IStructuredContentProvider() {
			@SuppressWarnings("unchecked")
			@Override
			public Object[] getElements(Object inputElement) {
				EList<Object> dataRules = (EList<Object>) inputElement;

				Object[] viewerContent = new Object[dataRules.size()];

				int i = 0;
				Iterator<Object> itr = dataRules.iterator();
				while (itr.hasNext()) {
					viewerContent[i] = itr.next();
					i++;
				}

				return viewerContent;
			}

		});

		Table tableAlgorithms = viewerAlgorithms.getTable();
		tableAlgorithms.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		tableAlgorithms.setHeaderVisible(true);
		tableAlgorithms.setLinesVisible(true);

		tabItem.setControl(compositeAlgorithms);

		tabFolder.setSelection(0);

		hookListeners();

	}

	@Override
	public void activate() {
		conversionModuleAnalyzer.analyze(getModel());
		conversionModule = conversionModuleAnalyzer.getConversionModule();

		tltmStoreVersion1.setSelection(conversionModule.getStoreVersion() == "1");
		tltmStoreVersion2.setSelection(conversionModule.getStoreVersion() == "2");

		viewerSendingDataRules.setInput(conversionModule.getSendingDataRules());

		viewerAlgorithms.setInput(conversionModule.getAlgorithms());

		super.activate();
	}

	private void hookListeners() {
		btnInformation.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				ConversionModuleDialog conversionModuleDialog = new ConversionModuleDialog(
						((Button) event.getSource()).getShell(), conversionModule);
				if (conversionModuleDialog.open() == Window.OK) {
					updateModule();
				}
				;
			}

			public void widgetDefaultSelected(SelectionEvent event) {
			}
		});

		viewerSendingDataRules.addDoubleClickListener((new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();

				if (selection.isEmpty()) {
					return;
				}

				Object element = ((IStructuredSelection) selection).getFirstElement();

				if (element instanceof CmDataRule) {
					CmDataRule dataRule = ((CmDataRule) element);

					DataRuleDialog dataRuleDialog = new DataRuleDialog(event.getViewer().getControl().getShell(),
							dataRule);
					if (dataRuleDialog.open() == Window.OK) {
						updateModule();
					}
					;
				}

			}
		}));

		viewerAlgorithms.addDoubleClickListener((new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();

				if (selection.isEmpty()) {
					return;
				}

				Object element = ((IStructuredSelection) selection).getFirstElement();

				if (element instanceof CmAlgorithm) {
					CmAlgorithm algorithm = ((CmAlgorithm) element);

					AlgorithmDialog algorithmDialog = new AlgorithmDialog(event.getViewer().getControl().getShell(),
							algorithm);
					if (algorithmDialog.open() == Window.OK) {
						updateModule();
					}
					;
				}

			}
		}));
	}

	private void updateModule() {
		String newModule = conversionModule.getModuleText();
		
		System.out.print(newModule);
		
		XtextEditor embeddedEditor = null;
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		for (IEditorReference editorReference : page.getEditorReferences()) {
			final IEditorPart[] editor = new IEditorPart[1];
			editor[0] = editorReference.getEditor(false);
			if (editor != null) {
				if (editor[0] instanceof XtextEditor) {
					embeddedEditor = (XtextEditor) editor[0];
					break;
				} else {
					if (editor[0] != null) {
						embeddedEditor = editor[0].getAdapter(XtextEditor.class);
					}
					if (embeddedEditor instanceof XtextEditor) {
						break;
					}
				}
			}
		}

		if (embeddedEditor == null)
			return;
		
	}

}