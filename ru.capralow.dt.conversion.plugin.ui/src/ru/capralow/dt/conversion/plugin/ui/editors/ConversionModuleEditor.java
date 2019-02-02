
package ru.capralow.dt.conversion.plugin.ui.editors;

import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.handly.buffer.BufferChange;
import org.eclipse.handly.snapshot.NonExpiringSnapshot;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
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
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.EmbeddedEditorBuffer;
import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.md.ui.editor.base.DtGranularEditor;
import com._1c.g5.v8.dt.md.ui.editor.base.DtGranularEditorPage;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com._1c.g5.v8.dt.ui.editor.input.IDtEditorInput;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
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

	private TableViewer viewerSendingDataRules, viewerSendingObjectRules;
	private TableViewer viewerReceivingDataRules, viewerReceivingObjectRules;
	private TableViewer viewerAlgorithms;

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

		// Страницы
		CTabFolder tabFolder = new CTabFolder(body, SWT.FLAT);
		GridLayoutFactory.fillDefaults().applyTo(tabFolder);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(tabFolder);

		tabFolder.setBorderVisible(true);

		toolkit.adapt(tabFolder);
		toolkit.paintBordersFor(tabFolder);

		tabFolder.setSelectionBackground(
				Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		// Информация
		CTabItem tabItem1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem1.setText("Информация");

		Composite compositeInformation = new Composite(tabFolder, SWT.BORDER);
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
		btnInformation = new Button(compositeInformation, SWT.PUSH);
		btnInformation.setText("Общие события конвертации");

		// 2.2
		new Label(compositeInformation, SWT.NONE);

		// 3.1
		new Label(compositeInformation, SWT.NONE).setText("Доступные версии формата:");

		// 3.2
		new Label(compositeInformation, SWT.NONE);

		// 4.1-2
		Composite compositeTableInformation = new Composite(compositeInformation, SWT.NONE);
		TableColumnLayout tclInformation = new TableColumnLayout();
		compositeTableInformation.setLayout(tclInformation);
		compositeTableInformation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));

		TableViewer viewerInformation = new TableViewer(compositeTableInformation, SWT.BORDER | SWT.V_SCROLL);

		Table tableInformation = viewerInformation.getTable();

		tableInformation.setHeaderVisible(true);
		tableInformation.setLinesVisible(true);

		TableViewerColumn tblclmnInformationColumn1 = new TableViewerColumn(viewerInformation, SWT.NONE);
		tclInformation.setColumnData(tblclmnInformationColumn1.getColumn(), new ColumnWeightData(1, 150, true));
		tblclmnInformationColumn1.getColumn().setText("Версия формата");

		tabItem1.setControl(compositeInformation);

		// ПОД: Отправка
		CTabItem tabItem2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem2.setText("ПОД: Отправка");

		Composite compositeSendingDataRules = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclSendingDataRules = new TableColumnLayout();
		compositeSendingDataRules.setLayout(tclSendingDataRules);

		viewerSendingDataRules = new TableViewer(compositeSendingDataRules, SWT.BORDER | SWT.V_SCROLL);

		Table tableSendingDataRules = viewerSendingDataRules.getTable();

		tableSendingDataRules.setHeaderVisible(true);
		tableSendingDataRules.setLinesVisible(true);

		TableViewerColumn tblclmnSendingDataRulesColumn1 = new TableViewerColumn(viewerSendingDataRules, SWT.NONE);
		tclSendingDataRules.setColumnData(tblclmnSendingDataRulesColumn1.getColumn(),
				new ColumnWeightData(2, 100, true));
		tblclmnSendingDataRulesColumn1.getColumn().setText("Наименование");
		tblclmnSendingDataRulesColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmDataRule) element).getName();
			}
		});
		TableViewerColumn tblclmnSendingDataRulesColumn2 = new TableViewerColumn(viewerSendingDataRules, SWT.NONE);
		tclSendingDataRules.setColumnData(tblclmnSendingDataRulesColumn2.getColumn(),
				new ColumnWeightData(1, 100, true));
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
		tclSendingDataRules.setColumnData(tblclmnSendingDataRulesColumn3.getColumn(), new ColumnPixelData(100));
		tblclmnSendingDataRulesColumn3.getColumn().setText("При обработке");
		tblclmnSendingDataRulesColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmDataRule) element).getOnProcessingEvent().length() != 0 ? "Да" : "Нет";
			}
		});
		TableViewerColumn tblclmnSendingDataRulesColumn4 = new TableViewerColumn(viewerSendingDataRules, SWT.NONE);
		tclSendingDataRules.setColumnData(tblclmnSendingDataRulesColumn4.getColumn(), new ColumnPixelData(105));
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

		tabItem2.setControl(compositeSendingDataRules);

		// ПКО: Отправка
		CTabItem tabItem3 = new CTabItem(tabFolder, SWT.NONE);
		tabItem3.setText("ПКО: Отправка");

		Composite compositeSendingObjectRules = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclSendingObjectRules = new TableColumnLayout();
		compositeSendingObjectRules.setLayout(tclSendingObjectRules);

		viewerSendingObjectRules = new TableViewer(compositeSendingObjectRules, SWT.BORDER | SWT.V_SCROLL);

		Table tableSendingObjectRules = viewerSendingObjectRules.getTable();

		tableSendingObjectRules.setHeaderVisible(true);
		tableSendingObjectRules.setLinesVisible(true);

		TableViewerColumn tblclmnSendingObjectRulesColumn1 = new TableViewerColumn(viewerSendingObjectRules, SWT.NONE);
		tclSendingObjectRules.setColumnData(tblclmnSendingObjectRulesColumn1.getColumn(),
				new ColumnWeightData(2, 100, true));
		tblclmnSendingObjectRulesColumn1.getColumn().setText("Наименование");
		tblclmnSendingObjectRulesColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmObjectRule) element).getName();
			}
		});
		TableViewerColumn tblclmnSendingObjectRulesColumn2 = new TableViewerColumn(viewerSendingObjectRules, SWT.NONE);
		tclSendingObjectRules.setColumnData(tblclmnSendingObjectRulesColumn2.getColumn(),
				new ColumnWeightData(1, 100, true));
		tblclmnSendingObjectRulesColumn2.getColumn().setText("Объект конфигурации");
		tblclmnSendingObjectRulesColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmObjectRule) element).getConfigurationObject() == null)
					return "";
				return ((CmObjectRule) element).getConfigurationObject().toString();
			}
		});
		TableViewerColumn tblclmnSendingObjectRulesColumn3 = new TableViewerColumn(viewerSendingObjectRules, SWT.NONE);
		tclSendingObjectRules.setColumnData(tblclmnSendingObjectRulesColumn3.getColumn(),
				new ColumnWeightData(1, 100, true));
		tblclmnSendingObjectRulesColumn3.getColumn().setText("Объект формата");
		tblclmnSendingObjectRulesColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmObjectRule) element).getFormatObject() == null)
					return "";
				return ((CmObjectRule) element).getFormatObject().toString();
			}
		});
		TableViewerColumn tblclmnSendingObjectRulesColumn4 = new TableViewerColumn(viewerSendingObjectRules, SWT.NONE);
		tclSendingObjectRules.setColumnData(tblclmnSendingObjectRulesColumn4.getColumn(), new ColumnPixelData(100));
		tblclmnSendingObjectRulesColumn4.getColumn().setText("При отправке данных");
		tblclmnSendingObjectRulesColumn4.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmObjectRule) element).getOnSendingEvent().length() != 0 ? "Да" : "Нет";
			}
		});

		viewerSendingObjectRules.setContentProvider(new IStructuredContentProvider() {
			@SuppressWarnings("unchecked")
			@Override
			public Object[] getElements(Object inputElement) {
				EList<Object> ObjectRules = (EList<Object>) inputElement;

				Object[] viewerContent = new Object[ObjectRules.size()];

				int i = 0;
				Iterator<Object> itr = ObjectRules.iterator();
				while (itr.hasNext()) {
					viewerContent[i] = itr.next();
					i++;
				}

				return viewerContent;
			}

		});

		tabItem3.setControl(compositeSendingObjectRules);

		// ПОД: Получение
		CTabItem tabItem4 = new CTabItem(tabFolder, SWT.NONE);
		tabItem4.setText("ПОД: Получение");

		Composite compositeReceivingDataRules = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclReceivingDataRules = new TableColumnLayout();
		compositeReceivingDataRules.setLayout(tclReceivingDataRules);

		viewerReceivingDataRules = new TableViewer(compositeReceivingDataRules, SWT.BORDER | SWT.V_SCROLL);

		Table tableReceivingDataRules = viewerReceivingDataRules.getTable();

		tableReceivingDataRules.setHeaderVisible(true);
		tableReceivingDataRules.setLinesVisible(true);

		TableViewerColumn tblclmnReceivingDataRulesColumn1 = new TableViewerColumn(viewerReceivingDataRules, SWT.NONE);
		tclReceivingDataRules.setColumnData(tblclmnReceivingDataRulesColumn1.getColumn(),
				new ColumnWeightData(2, 100, true));
		tblclmnReceivingDataRulesColumn1.getColumn().setText("Наименование");
		tblclmnReceivingDataRulesColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmDataRule) element).getName();
			}
		});
		TableViewerColumn tblclmnReceivingDataRulesColumn2 = new TableViewerColumn(viewerReceivingDataRules, SWT.NONE);
		tclReceivingDataRules.setColumnData(tblclmnReceivingDataRulesColumn2.getColumn(),
				new ColumnWeightData(1, 100, true));
		tblclmnReceivingDataRulesColumn2.getColumn().setText("Объект формата");
		tblclmnReceivingDataRulesColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmDataRule) element).getFormatObject() == null)
					return "";
				return ((CmDataRule) element).getFormatObject().toString();
			}
		});
		TableViewerColumn tblclmnReceivingDataRulesColumn3 = new TableViewerColumn(viewerReceivingDataRules, SWT.NONE);
		tclReceivingDataRules.setColumnData(tblclmnReceivingDataRulesColumn3.getColumn(), new ColumnPixelData(100));
		tblclmnReceivingDataRulesColumn3.getColumn().setText("При обработке");
		tblclmnReceivingDataRulesColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmDataRule) element).getOnProcessingEvent().length() != 0 ? "Да" : "Нет";
			}
		});

		viewerReceivingDataRules.setContentProvider(new IStructuredContentProvider() {
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

		tabItem4.setControl(compositeReceivingDataRules);

		// ПКО: Получение
		CTabItem tabItem5 = new CTabItem(tabFolder, SWT.NONE);
		tabItem5.setText("ПКО: Получение");

		Composite compositeReceivingObjectRules = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclReceivingObjectRules = new TableColumnLayout();
		compositeReceivingObjectRules.setLayout(tclReceivingObjectRules);

		viewerReceivingObjectRules = new TableViewer(compositeReceivingObjectRules, SWT.BORDER | SWT.V_SCROLL);

		Table tableReceivingObjectRules = viewerReceivingObjectRules.getTable();

		tableReceivingObjectRules.setHeaderVisible(true);
		tableReceivingObjectRules.setLinesVisible(true);

		TableViewerColumn tblclmnReceivingObjectRulesColumn1 = new TableViewerColumn(viewerReceivingObjectRules,
				SWT.NONE);
		tclReceivingObjectRules.setColumnData(tblclmnReceivingObjectRulesColumn1.getColumn(),
				new ColumnWeightData(2, 100, true));
		tblclmnReceivingObjectRulesColumn1.getColumn().setText("Наименование");
		tblclmnReceivingObjectRulesColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmObjectRule) element).getName();
			}
		});
		TableViewerColumn tblclmnReceivingObjectRulesColumn2 = new TableViewerColumn(viewerReceivingObjectRules,
				SWT.NONE);
		tclReceivingObjectRules.setColumnData(tblclmnReceivingObjectRulesColumn2.getColumn(),
				new ColumnWeightData(1, 100, true));
		tblclmnReceivingObjectRulesColumn2.getColumn().setText("Объект конфигурации");
		tblclmnReceivingObjectRulesColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmObjectRule) element).getConfigurationObject() == null)
					return "";
				return ((CmObjectRule) element).getConfigurationObject().toString();
			}
		});
		TableViewerColumn tblclmnReceivingObjectRulesColumn3 = new TableViewerColumn(viewerReceivingObjectRules,
				SWT.NONE);
		tclReceivingObjectRules.setColumnData(tblclmnReceivingObjectRulesColumn3.getColumn(),
				new ColumnWeightData(1, 100, true));
		tblclmnReceivingObjectRulesColumn3.getColumn().setText("Объект формата");
		tblclmnReceivingObjectRulesColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmObjectRule) element).getFormatObject() == null)
					return "";
				return ((CmObjectRule) element).getFormatObject().toString();
			}
		});
		TableViewerColumn tblclmnReceivingObjectRulesColumn4 = new TableViewerColumn(viewerReceivingObjectRules,
				SWT.NONE);
		tclReceivingObjectRules.setColumnData(tblclmnReceivingObjectRulesColumn4.getColumn(), new ColumnPixelData(100));
		tblclmnReceivingObjectRulesColumn4.getColumn().setText("При конвертации данных XDTO");
		tblclmnReceivingObjectRulesColumn4.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmObjectRule) element).getBeforeReceivingEvent().length() != 0 ? "Да" : "Нет";
			}
		});
		TableViewerColumn tblclmnReceivingObjectRulesColumn5 = new TableViewerColumn(viewerReceivingObjectRules,
				SWT.NONE);
		tclReceivingObjectRules.setColumnData(tblclmnReceivingObjectRulesColumn5.getColumn(), new ColumnPixelData(100));
		tblclmnReceivingObjectRulesColumn5.getColumn().setText("Перед записью полученных данных");
		tblclmnReceivingObjectRulesColumn5.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmObjectRule) element).getOnReceivingEvent().length() != 0 ? "Да" : "Нет";
			}
		});
		TableViewerColumn tblclmnReceivingObjectRulesColumn6 = new TableViewerColumn(viewerReceivingObjectRules,
				SWT.NONE);
		tclReceivingObjectRules.setColumnData(tblclmnReceivingObjectRulesColumn6.getColumn(), new ColumnPixelData(100));
		tblclmnReceivingObjectRulesColumn6.getColumn().setText("После загрузки всех данных");
		tblclmnReceivingObjectRulesColumn6.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmObjectRule) element).getAfterReceivingAlgorithm() != null ? "Да" : "Нет";
			}
		});

		viewerReceivingObjectRules.setContentProvider(new IStructuredContentProvider() {
			@SuppressWarnings("unchecked")
			@Override
			public Object[] getElements(Object inputElement) {
				EList<Object> ObjectRules = (EList<Object>) inputElement;

				Object[] viewerContent = new Object[ObjectRules.size()];

				int i = 0;
				Iterator<Object> itr = ObjectRules.iterator();
				while (itr.hasNext()) {
					viewerContent[i] = itr.next();
					i++;
				}

				return viewerContent;
			}

		});

		tabItem5.setControl(compositeReceivingObjectRules);

		// Алгоритмы
		CTabItem tabItem6 = new CTabItem(tabFolder, SWT.NONE);
		tabItem6.setText("Алгоритмы");

		Composite compositeAlgorithms = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclAlgorithms = new TableColumnLayout();
		compositeAlgorithms.setLayout(tclAlgorithms);

		viewerAlgorithms = new TableViewer(compositeAlgorithms, SWT.BORDER | SWT.V_SCROLL);

		Table tableAlgorithms = viewerAlgorithms.getTable();

		tableAlgorithms.setHeaderVisible(true);
		tableAlgorithms.setLinesVisible(true);

		TableViewerColumn tblclmnAlgorithmsColumn1 = new TableViewerColumn(viewerAlgorithms, SWT.NONE);
		tclAlgorithms.setColumnData(tblclmnAlgorithmsColumn1.getColumn(), new ColumnPixelData(80));
		tblclmnAlgorithmsColumn1.getColumn().setText("Тип");
		tblclmnAlgorithmsColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAlgorithm) element).getMethodType().getLiteral();
			}
		});
		TableViewerColumn tblclmnAlgorithmsColumn2 = new TableViewerColumn(viewerAlgorithms, SWT.NONE);
		tclAlgorithms.setColumnData(tblclmnAlgorithmsColumn2.getColumn(), new ColumnWeightData(2, 100, true));
		tblclmnAlgorithmsColumn2.getColumn().setText("Имя");
		tblclmnAlgorithmsColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAlgorithm) element).getName();
			}
		});
		TableViewerColumn tblclmnAlgorithmsColumn3 = new TableViewerColumn(viewerAlgorithms, SWT.NONE);
		tclAlgorithms.setColumnData(tblclmnAlgorithmsColumn3.getColumn(), new ColumnWeightData(1, 100, true));
		tblclmnAlgorithmsColumn3.getColumn().setText("Параметры");
		tblclmnAlgorithmsColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmAlgorithm) element).getParams();
			}
		});
		TableViewerColumn tblclmnAlgorithmsColumn4 = new TableViewerColumn(viewerAlgorithms, SWT.NONE);
		tclAlgorithms.setColumnData(tblclmnAlgorithmsColumn4.getColumn(), new ColumnPixelData(60));
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

		tabItem6.setControl(compositeAlgorithms);

		tabFolder.setSelection(0);

		hookListeners();
	}

	@Override
	public void activate() {
		super.activate();

		conversionModuleAnalyzer.analyze(getModel());
		conversionModule = conversionModuleAnalyzer.getConversionModule();

		String storeVersion = conversionModule.getStoreVersion();
		tltmStoreVersion1.setSelection(storeVersion.equals("1"));
		tltmStoreVersion2.setSelection(storeVersion.equals("2"));

		viewerSendingDataRules.setInput(conversionModule.getSendingDataRules());
		viewerSendingObjectRules.setInput(conversionModule.getSendingObjectRules());

		viewerReceivingDataRules.setInput(conversionModule.getReceivingDataRules());
		viewerReceivingObjectRules.setInput(conversionModule.getReceivingObjectRules());

		viewerAlgorithms.setInput(conversionModule.getAlgorithms());
	}

	private void hookListeners() {
		btnInformation.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				ConversionModuleDialog conversionModuleDialog = new ConversionModuleDialog(
						((Button) event.getSource()).getShell(), conversionModule);
				if (conversionModuleDialog.open() == Window.OK) {
					try {
						updateModule();
					} catch (CoreException e) {
						e.printStackTrace();
					}
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

					SendingDataRuleDialog dataRuleDialog = new SendingDataRuleDialog(
							event.getViewer().getControl().getShell(), dataRule);
					if (dataRuleDialog.open() == Window.OK) {
						try {
							updateModule();
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
					;
				}

			}
		}));

		viewerSendingObjectRules.addDoubleClickListener((new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();

				if (selection.isEmpty()) {
					return;
				}

				Object element = ((IStructuredSelection) selection).getFirstElement();

				if (element instanceof CmObjectRule) {
					CmObjectRule objectRule = ((CmObjectRule) element);

					ObjectRuleDialog objectRuleDialog = new ObjectRuleDialog(event.getViewer().getControl().getShell(),
							objectRule);
					if (objectRuleDialog.open() == Window.OK) {
						try {
							updateModule();
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
					;
				}

			}
		}));

		viewerReceivingDataRules.addDoubleClickListener((new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();

				if (selection.isEmpty()) {
					return;
				}

				Object element = ((IStructuredSelection) selection).getFirstElement();

				if (element instanceof CmDataRule) {
					CmDataRule dataRule = ((CmDataRule) element);

					ReceivingDataRuleDialog dataRuleDialog = new ReceivingDataRuleDialog(
							event.getViewer().getControl().getShell(), dataRule);
					if (dataRuleDialog.open() == Window.OK) {
						try {
							updateModule();
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
					;
				}

			}
		}));

		viewerReceivingObjectRules.addDoubleClickListener((new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();

				if (selection.isEmpty()) {
					return;
				}

				Object element = ((IStructuredSelection) selection).getFirstElement();

				if (element instanceof CmObjectRule) {
					CmObjectRule objectRule = ((CmObjectRule) element);

					ObjectRuleDialog objectRuleDialog = new ObjectRuleDialog(event.getViewer().getControl().getShell(),
							objectRule);
					if (objectRuleDialog.open() == Window.OK) {
						try {
							updateModule();
						} catch (CoreException e) {
							e.printStackTrace();
						}
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
						try {
							updateModule();
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
					;
				}

			}
		}));
	}

	private void updateModule() throws CoreException {
		String newModule = conversionModule.getModuleText();

		// System.out.print(newModule);

		XtextEditor embeddedEditor = null;
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		for (IEditorReference editorReference : page.getEditorReferences()) {
			final IEditorPart[] editor = new IEditorPart[1];
			editor[0] = editorReference.getEditor(false);
			if (editor[0] == null)
				continue;

			if (editor[0] instanceof XtextEditor) {
				// Если же мы идем по первой ветке, то есть у нас нет "formEditor", то берем
				// EditorInput, он должен быть файловым, и по файлу уже определяем, например,
				// при помощи сервиса
				// com._1c.g5.v8.dt.core.filesystem.IQualifiedNameFilePathConverter

				embeddedEditor = (XtextEditor) editor[0];
				break;

			} else if (editor[0] instanceof FormEditor) {
				FormEditor formEditor = (FormEditor) editor[0];
				if (!(formEditor instanceof DtGranularEditor))
					continue;

				IDtEditorInput<CommonModule> editorInput = ((DtGranularEditor<CommonModule>) formEditor)
						.getEditorInput();
				if (editorInput.getModel().getUuid() != getModel().getUuid())
					continue;

				embeddedEditor = formEditor.findPage("editors.pages.module").getAdapter(XtextEditor.class);

			} else if (editor[0] != null) {
				embeddedEditor = editor[0].getAdapter(XtextEditor.class);

			}

			if (embeddedEditor instanceof XtextEditor) {
				break;
			}

		}

		if (embeddedEditor == null) {
			throw new NullPointerException("Не удалось найти редактор для помещения изменений.");
		}

		EmbeddedEditorBuffer buffer = new EmbeddedEditorBuffer(embeddedEditor.getDocument());
		try {
			NonExpiringSnapshot snapshot = new NonExpiringSnapshot(buffer);
			TextEdit change = new ReplaceEdit(0, embeddedEditor.getDocument().getLength(), newModule);
			BufferChange bufferChange = new BufferChange(change);
			bufferChange.setBase(snapshot);
			try {
				buffer.applyChange(bufferChange, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}

		} finally {
			buffer.release();

		}
	}
}