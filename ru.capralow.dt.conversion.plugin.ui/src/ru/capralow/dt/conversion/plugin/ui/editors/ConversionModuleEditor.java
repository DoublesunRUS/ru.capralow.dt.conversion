
package ru.capralow.dt.conversion.plugin.ui.editors;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.handly.buffer.BufferChange;
import org.eclipse.handly.snapshot.NonExpiringSnapshot;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.EmbeddedEditorBuffer;
import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.model.IModelEditingSupport;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.md.ui.editor.base.DtGranularEditor;
import com._1c.g5.v8.dt.md.ui.editor.base.DtGranularEditorPage;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com._1c.g5.v8.dt.ui.editor.input.IDtEditorInput;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.ConversionModuleReport;
import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.CmSpecialSubsystemType;
import ru.capralow.dt.conversion.plugin.core.cm.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmSubsystemImpl;
import ru.capralow.dt.conversion.plugin.core.fp.FormatPackage;

public class ConversionModuleEditor extends DtGranularEditorPage<CommonModule> {
	public static final java.lang.String PAGE_ID = "ru.capralow.dt.conversion.plugin.ui.editors.ConversionModuleEditor";

	private Boolean editable;

	@Inject
	private IV8ProjectManager projectManager;

	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	private ConversionModuleAnalyzer conversionModuleAnalyzer;
	private ConversionModule conversionModule;

	private TableViewer viewerSubsystems;
	private TableViewer viewerSendingDataRules, viewerSendingObjectRules;
	private TableViewer viewerReceivingDataRules, viewerReceivingObjectRules;
	private TableViewer viewerPredefineds;
	private TableViewer viewerAlgorithms;

	// private Button btnInformation;

	private MenuItem itemMenuSettings;
	private Menu menuMain;

	private CTabFolder tabFolder;

	@Inject
	public ConversionModuleEditor(String id, String title) {
		super(PAGE_ID, "Конвертация");
	}

	@Override
	protected void createPageControls(IManagedForm managedForm) {
		setActiveFeature(MdClassPackage.Literals.COMMON_MODULE__MODULE);

		IResourceServiceProvider provider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		IModelEditingSupport modelEditingSupport = provider.get(IModelEditingSupport.class);
		this.editable = modelEditingSupport.canEdit(getModel());

		IStructuredContentProvider viewerContentProvider = new ConversionModuleContentProvider();

		conversionModuleAnalyzer = new ConversionModuleAnalyzer(projectManager, bmEmfIndexManager);

		FormToolkit toolkit = managedForm.getToolkit();

		ScrolledForm form = managedForm.getForm();
		toolkit.decorateFormHeading(form.getForm());

		GridLayoutFactory.fillDefaults().applyTo(form);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(form);

		Composite container = form.getBody();
		toolkit.paintBordersFor(container);

		GridLayoutFactory.fillDefaults().applyTo(container);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(container);

		// Основная панель
		SashForm sashFormMain = new SashForm(container, SWT.HORIZONTAL);
		sashFormMain.setLayout(new GridLayout(2, false));
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(sashFormMain);

		// Левая панель
		Composite compositeLeft = new Composite(sashFormMain, SWT.NONE);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(compositeLeft);
		compositeLeft.setLayout(new GridLayout(1, false));

		// Левая панель: меню
		ToolBar toolBarMain = new ToolBar(compositeLeft, SWT.FLAT | SWT.RIGHT);
		ToolItem itemDropDown = new ToolItem(toolBarMain, SWT.DROP_DOWN);
		itemDropDown.setText("Меню");
		itemDropDown.setToolTipText("Показать меню");

		menuMain = new Menu(form.getShell(), SWT.POP_UP);

		itemMenuSettings = new MenuItem(menuMain, SWT.PUSH);
		itemMenuSettings.setText("Общие настройки...");

		itemDropDown.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Rectangle bounds = itemDropDown.getBounds();
				Point point = toolBarMain.toDisplay(bounds.x, bounds.y + bounds.height);
				menuMain.setLocation(point);
				menuMain.setVisible(true);
			}

			public void widgetDefaultSelected(SelectionEvent event) {
			}
		});

		// Левая панель: Подсистемы
		Composite compositeTableSubsystems = new Composite(compositeLeft, SWT.NONE);
		TableColumnLayout tclSubsystems = new TableColumnLayout();
		compositeTableSubsystems.setLayout(tclSubsystems);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(compositeTableSubsystems);

		viewerSubsystems = new TableViewer(compositeTableSubsystems, SWT.BORDER | SWT.V_SCROLL);

		Table tableSubsystems = viewerSubsystems.getTable();

		tableSubsystems.setLinesVisible(true);

		TableViewerColumn tblclmnSubsystemsColumn1 = new TableViewerColumn(viewerSubsystems, SWT.NONE);
		tclSubsystems.setColumnData(tblclmnSubsystemsColumn1.getColumn(), new ColumnWeightData(1, 150, true));
		tblclmnSubsystemsColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmSubsystem) element).getName();
			}
		});
		viewerSubsystems.setContentProvider(new IStructuredContentProvider() {
			@Override
			public Object[] getElements(Object inputElement) {
				@SuppressWarnings("unchecked")
				EList<Object> listObjects = (EList<Object>) inputElement;

				Object[] viewerContent = new Object[listObjects.size() + 1];

				CmSubsystemImpl subsystem = new CmSubsystemImpl();
				subsystem.setSpecialSubsystemType(CmSpecialSubsystemType.ALL);
				viewerContent[0] = subsystem;

				int i = 1;
				for (Object object : listObjects) {
					viewerContent[i] = object;
					i++;
				}

				return viewerContent;
			}
		});

		// Правая панель: Страницы
		tabFolder = new CTabFolder(sashFormMain, SWT.FLAT);
		GridLayoutFactory.fillDefaults().applyTo(tabFolder);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(tabFolder);

		tabFolder.setBorderVisible(true);

		toolkit.adapt(tabFolder);
		toolkit.paintBordersFor(tabFolder);

		tabFolder.setSelectionBackground(
				Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		// Информация
		// CTabItem tabItem1 = new CTabItem(tabFolder, SWT.NONE);
		// tabItem1.setText("Информация");
		//
		// Composite compositeInformation = new Composite(tabFolder, SWT.BORDER);
		// compositeInformation.setLayout(new GridLayout(2, false));
		//
		// // 1.1
		// Label lblStoreVersion = new Label(compositeInformation, SWT.NONE);
		// lblStoreVersion.setText("Версия формата менеджера обмена");
		//
		// // 1.2
		// ToolBar toolBarObjectRulesSize = new ToolBar(compositeInformation, SWT.FLAT);
		//
		// tltmStoreVersion1 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		// tltmStoreVersion1.setText("1");
		//
		// new ToolItem(toolBarObjectRulesSize, SWT.SEPARATOR);
		//
		// tltmStoreVersion2 = new ToolItem(toolBarObjectRulesSize, SWT.CHECK);
		// tltmStoreVersion2.setText("2");
		//
		// // 2.1
		// btnInformation = new Button(compositeInformation, SWT.PUSH);
		// btnInformation.setText("Общие события конвертации");
		//
		// // 2.2
		// new Label(compositeInformation, SWT.NONE);
		//
		// // 3.1
		// new Label(compositeInformation, SWT.NONE).setText("Доступные версии
		// формата:");
		//
		// // 3.2
		// new Label(compositeInformation, SWT.NONE);
		//
		// // 4.1-2
		// Composite compositeTableInformation = new Composite(compositeInformation,
		// SWT.NONE);
		// TableColumnLayout tclInformation = new TableColumnLayout();
		// compositeTableInformation.setLayout(tclInformation);
		// compositeTableInformation.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
		// false, false, 2, 1));
		//
		// TableViewer viewerInformation = new TableViewer(compositeTableInformation,
		// SWT.BORDER | SWT.V_SCROLL);
		//
		// Table tableInformation = viewerInformation.getTable();
		//
		// tableInformation.setHeaderVisible(true);
		// tableInformation.setLinesVisible(true);
		//
		// TableViewerColumn tblclmnInformationColumn1 = new
		// TableViewerColumn(viewerInformation, SWT.NONE);
		// tclInformation.setColumnData(tblclmnInformationColumn1.getColumn(), new
		// ColumnWeightData(1, 150, true));
		// tblclmnInformationColumn1.getColumn().setText("Версия формата");
		//
		// tabItem1.setControl(compositeInformation);

		// ПОД: Отправка
		CTabItem tabItem2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem2.setText("ПОД: Отправка");

		Composite compositeSendingDataRules = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclSendingDataRules = new TableColumnLayout();
		compositeSendingDataRules.setLayout(tclSendingDataRules);

		viewerSendingDataRules = new TableViewer(compositeSendingDataRules,
				SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL);

		Table tableSendingDataRules = viewerSendingDataRules.getTable();

		tableSendingDataRules.setHeaderVisible(true);
		tableSendingDataRules.setLinesVisible(true);

		TableViewerColumn tblclmnSendingDataRulesColumn2 = new TableViewerColumn(viewerSendingDataRules, SWT.NONE);
		tclSendingDataRules.setColumnData(tblclmnSendingDataRulesColumn2.getColumn(),
				new ColumnWeightData(1, 100, true));
		tblclmnSendingDataRulesColumn2.getColumn().setText("Объект конфигурации");
		tblclmnSendingDataRulesColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmDataRule) element).getConfigurationObject() == null)
					return "";
				return ((CmDataRule) element).getConfigurationObjectName();
			}
		});
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

		viewerSendingDataRules.setContentProvider(viewerContentProvider);

		tabItem2.setControl(compositeSendingDataRules);

		// ПКО: Отправка
		CTabItem tabItem3 = new CTabItem(tabFolder, SWT.NONE);
		tabItem3.setText("ПКО: Отправка");

		Composite compositeSendingObjectRules = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclSendingObjectRules = new TableColumnLayout();
		compositeSendingObjectRules.setLayout(tclSendingObjectRules);

		viewerSendingObjectRules = new TableViewer(compositeSendingObjectRules,
				SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL);

		Table tableSendingObjectRules = viewerSendingObjectRules.getTable();

		tableSendingObjectRules.setHeaderVisible(true);
		tableSendingObjectRules.setLinesVisible(true);

		TableViewerColumn tblclmnSendingObjectRulesColumn2 = new TableViewerColumn(viewerSendingObjectRules, SWT.NONE);
		tclSendingObjectRules.setColumnData(tblclmnSendingObjectRulesColumn2.getColumn(),
				new ColumnWeightData(1, 100, true));
		tblclmnSendingObjectRulesColumn2.getColumn().setText("Объект конфигурации");
		tblclmnSendingObjectRulesColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmObjectRule) element).getConfigurationObject() == null)
					return "";
				return ((CmObjectRule) element).getConfigurationObjectName();
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
				return ((CmObjectRule) element).getFormatObject();
			}
		});
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
		TableViewerColumn tblclmnSendingObjectRulesColumn4 = new TableViewerColumn(viewerSendingObjectRules, SWT.NONE);
		tclSendingObjectRules.setColumnData(tblclmnSendingObjectRulesColumn4.getColumn(), new ColumnPixelData(100));
		tblclmnSendingObjectRulesColumn4.getColumn().setText("При отправке данных");
		tblclmnSendingObjectRulesColumn4.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmObjectRule) element).getOnSendingEvent().length() != 0 ? "Да" : "Нет";
			}
		});

		viewerSendingObjectRules.setContentProvider(viewerContentProvider);

		tabItem3.setControl(compositeSendingObjectRules);

		// ПОД: Получение
		CTabItem tabItem4 = new CTabItem(tabFolder, SWT.NONE);
		tabItem4.setText("ПОД: Получение");

		Composite compositeReceivingDataRules = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclReceivingDataRules = new TableColumnLayout();
		compositeReceivingDataRules.setLayout(tclReceivingDataRules);

		viewerReceivingDataRules = new TableViewer(compositeReceivingDataRules,
				SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL);

		Table tableReceivingDataRules = viewerReceivingDataRules.getTable();

		tableReceivingDataRules.setHeaderVisible(true);
		tableReceivingDataRules.setLinesVisible(true);

		TableViewerColumn tblclmnReceivingDataRulesColumn2 = new TableViewerColumn(viewerReceivingDataRules, SWT.NONE);
		tclReceivingDataRules.setColumnData(tblclmnReceivingDataRulesColumn2.getColumn(),
				new ColumnWeightData(1, 100, true));
		tblclmnReceivingDataRulesColumn2.getColumn().setText("Объект формата");
		tblclmnReceivingDataRulesColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmDataRule) element).getFormatObject() == null)
					return "";
				return ((CmDataRule) element).getFormatObject();
			}
		});
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
		TableViewerColumn tblclmnReceivingDataRulesColumn3 = new TableViewerColumn(viewerReceivingDataRules, SWT.NONE);
		tclReceivingDataRules.setColumnData(tblclmnReceivingDataRulesColumn3.getColumn(), new ColumnPixelData(100));
		tblclmnReceivingDataRulesColumn3.getColumn().setText("При обработке");
		tblclmnReceivingDataRulesColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmDataRule) element).getOnProcessingEvent().length() != 0 ? "Да" : "Нет";
			}
		});

		viewerReceivingDataRules.setContentProvider(viewerContentProvider);

		tabItem4.setControl(compositeReceivingDataRules);

		// ПКО: Получение
		CTabItem tabItem5 = new CTabItem(tabFolder, SWT.NONE);
		tabItem5.setText("ПКО: Получение");

		Composite compositeReceivingObjectRules = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclReceivingObjectRules = new TableColumnLayout();
		compositeReceivingObjectRules.setLayout(tclReceivingObjectRules);

		viewerReceivingObjectRules = new TableViewer(compositeReceivingObjectRules,
				SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL);

		Table tableReceivingObjectRules = viewerReceivingObjectRules.getTable();

		tableReceivingObjectRules.setHeaderVisible(true);
		tableReceivingObjectRules.setLinesVisible(true);

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
				return ((CmObjectRule) element).getFormatObject();
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
				return ((CmObjectRule) element).getConfigurationObjectName();
			}
		});
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

		viewerReceivingObjectRules.setContentProvider(viewerContentProvider);

		tabItem5.setControl(compositeReceivingObjectRules);

		// ПКПД
		CTabItem tabItem7 = new CTabItem(tabFolder, SWT.NONE);
		tabItem7.setText("ПКПД");

		Composite compositePredefineds = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclPredefineds = new TableColumnLayout();
		compositePredefineds.setLayout(tclPredefineds);

		viewerPredefineds = new TableViewer(compositePredefineds, SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL);

		Table tablePredefineds = viewerPredefineds.getTable();

		tablePredefineds.setHeaderVisible(true);
		tablePredefineds.setLinesVisible(true);

		TableViewerColumn tblclmnPredefinedsColumn2 = new TableViewerColumn(viewerPredefineds, SWT.NONE);
		tclPredefineds.setColumnData(tblclmnPredefinedsColumn2.getColumn(), new ColumnWeightData(1, 100, true));
		tblclmnPredefinedsColumn2.getColumn().setText("Объект конфигурации");
		tblclmnPredefinedsColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmPredefined) element).getConfigurationObject() == null)
					return "";
				return ((CmPredefined) element).getConfigurationObjectName();
			}
		});
		TableViewerColumn tblclmnPredefinedsColumn3 = new TableViewerColumn(viewerPredefineds, SWT.NONE);
		tclPredefineds.setColumnData(tblclmnPredefinedsColumn3.getColumn(), new ColumnWeightData(1, 100, true));
		tblclmnPredefinedsColumn3.getColumn().setText("Объект формата");
		tblclmnPredefinedsColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (((CmPredefined) element).getFormatObject() == null)
					return "";
				return ((CmPredefined) element).getFormatObject();
			}
		});
		TableViewerColumn tblclmnPredefinedsColumn1 = new TableViewerColumn(viewerPredefineds, SWT.NONE);
		tclPredefineds.setColumnData(tblclmnPredefinedsColumn1.getColumn(), new ColumnWeightData(2, 100, true));
		tblclmnPredefinedsColumn1.getColumn().setText("Наименование");
		tblclmnPredefinedsColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmPredefined) element).getName();
			}
		});
		TableViewerColumn tblclmnPredefinedsColumn4 = new TableViewerColumn(viewerPredefineds, SWT.NONE);
		tclPredefineds.setColumnData(tblclmnPredefinedsColumn4.getColumn(), new ColumnPixelData(100));
		tblclmnPredefinedsColumn4.getColumn().setText("Для отправки");
		tblclmnPredefinedsColumn4.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmPredefined) element).getForSending() ? "Да" : "Нет";
			}
		});
		TableViewerColumn tblclmnPredefinedsColumn5 = new TableViewerColumn(viewerPredefineds, SWT.NONE);
		tclPredefineds.setColumnData(tblclmnPredefinedsColumn5.getColumn(), new ColumnPixelData(100));
		tblclmnPredefinedsColumn5.getColumn().setText("Для получения");
		tblclmnPredefinedsColumn5.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmPredefined) element).getForReceiving() ? "Да" : "Нет";
			}
		});

		viewerPredefineds.setContentProvider(viewerContentProvider);

		tabItem7.setControl(compositePredefineds);

		// Алгоритмы
		CTabItem tabItem6 = new CTabItem(tabFolder, SWT.NONE);
		tabItem6.setText("Алгоритмы");

		Composite compositeAlgorithms = new Composite(tabFolder, SWT.BORDER);
		TableColumnLayout tclAlgorithms = new TableColumnLayout();
		compositeAlgorithms.setLayout(tclAlgorithms);

		viewerAlgorithms = new TableViewer(compositeAlgorithms, SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL);

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

		viewerAlgorithms.setContentProvider(viewerContentProvider);

		tabItem6.setControl(compositeAlgorithms);

		sashFormMain.setWeights(new int[] { 20, 80 });

		hookListeners();
	}

	@Override
	public void setActive(boolean active) {
		super.setActive(active);

		if (active)
			updatePage();
	}

	private void hookListeners() {
		itemMenuSettings.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				ConversionModuleDialog conversionModuleDialog = new ConversionModuleDialog(
						((MenuItem) event.getSource()).getParent().getShell(), conversionModule, editable);
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

		viewerSubsystems.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				CmSubsystem cmSubsystem = (CmSubsystem) ((StructuredSelection) ((TableViewer) event.getSource())
						.getSelection()).getFirstElement();

				viewerSendingDataRules.setInput(conversionModule.getSendingDataRules(cmSubsystem));
				viewerSendingObjectRules.setInput(conversionModule.getSendingObjectRules(cmSubsystem));

				viewerReceivingDataRules.setInput(conversionModule.getReceivingDataRules(cmSubsystem));
				viewerReceivingObjectRules.setInput(conversionModule.getReceivingObjectRules(cmSubsystem));
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
							event.getViewer().getControl().getShell(), dataRule, editable);
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
							objectRule, editable);
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
							event.getViewer().getControl().getShell(), dataRule, editable);
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
							objectRule, editable);
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

		viewerPredefineds.addDoubleClickListener((new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();

				if (selection.isEmpty()) {
					return;
				}

				Object element = ((IStructuredSelection) selection).getFirstElement();

				if (element instanceof CmPredefined) {
					CmPredefined predefined = ((CmPredefined) element);

					PredefinedDialog predefinedDialog = new PredefinedDialog(event.getViewer().getControl().getShell(),
							predefined, editable);
					if (predefinedDialog.open() == Window.OK) {
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
							algorithm, editable);
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

	private void updatePage() {
		conversionModuleAnalyzer.analyze(getModel());
		conversionModule = conversionModuleAnalyzer.getConversionModule();

		while (menuMain.getItemCount() > 1)
			menuMain.getItem(1).dispose();
		for (Entry<String, FormatPackage> formatPackage : conversionModuleAnalyzer.getFormatPackages().entrySet()) {
			MenuItem itemMenu = new MenuItem(menuMain, SWT.PUSH);
			itemMenu.setText("Описание формата " + formatPackage.getKey());
			itemMenu.addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent event) {

					class StringStorage implements IStorage {
						private String string;

						StringStorage(String input) {
							this.string = input;
						}

						@Override
						public InputStream getContents() throws CoreException {
							return new ByteArrayInputStream(string.getBytes());
						}

						@Override
						public String getName() {
							int len = string.indexOf("\r\n");
							return string.substring(0, len).replace(".", "_").concat(".md"); // $NON-NLS-1$
						}

						@Override
						public boolean isReadOnly() {
							return true;
						}

						@Override
						public <T> T getAdapter(Class<T> adapter) {
							return null;
						}

						@Override
						public IPath getFullPath() {
							return null;
						}
					}

					class StringInput implements IStorageEditorInput {
						private IStorage storage;

						StringInput(IStorage storage) {
							this.storage = storage;
						}

						@Override
						public boolean exists() {
							return true;
						}

						@Override
						public String getName() {
							return storage.getName();
						}

						@Override
						public IStorage getStorage() {
							return storage;
						}

						@Override
						public String getToolTipText() {
							return "String-based file: " + storage.getName();
						}

						@Override
						public <T> T getAdapter(Class<T> adapter) {
							return null;
						}

						@Override
						public ImageDescriptor getImageDescriptor() {
							return null;
						}

						@Override
						public IPersistableElement getPersistable() {
							return null;
						}

					}

					ConversionModuleReport cmReport = new ConversionModuleReport(conversionModule,
							formatPackage.getValue());

					try {
						String stringReport = cmReport.createReport();

						IStorage storage = new StringStorage(stringReport);
						IStorageEditorInput input = new StringInput(storage);

						IWorkbench workbench = PlatformUI.getWorkbench();

						IEditorDescriptor defaultEditor = workbench.getEditorRegistry().getDefaultEditor("foo.md");
						if (defaultEditor == null)
							defaultEditor = workbench.getEditorRegistry().getDefaultEditor("foo.txt");

						String editorID = defaultEditor.getId();

						IDE.openEditor(workbench.getActiveWorkbenchWindow().getActivePage(), input, editorID);

					} catch (IOException | PartInitException e) {
						e.printStackTrace();

					}
				}

				public void widgetDefaultSelected(SelectionEvent event) {
				}
			});

		}

		// String storeVersion = conversionModule.getStoreVersion();
		// tltmStoreVersion1.setSelection(storeVersion.equals("1"));
		// tltmStoreVersion2.setSelection(storeVersion.equals("2"));

		viewerSubsystems.setInput(conversionModule.getSubsystems());

		viewerSendingDataRules.setInput(conversionModule.getSendingDataRules());
		viewerSendingObjectRules.setInput(conversionModule.getSendingObjectRules());

		viewerReceivingDataRules.setInput(conversionModule.getReceivingDataRules());
		viewerReceivingObjectRules.setInput(conversionModule.getReceivingObjectRules());

		viewerPredefineds.setInput(conversionModule.getPredefineds());
		viewerAlgorithms.setInput(conversionModule.getAlgorithms());

		tabFolder.setSelection(0);

	}

	private void updateModule() throws CoreException {
		String newModule = conversionModuleAnalyzer.getModuleText();

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

				@SuppressWarnings("unchecked")
				IDtEditorInput<CommonModule> editorInput = ((DtGranularEditor<CommonModule>) formEditor)
						.getEditorInput();
				if (!editorInput.getModel().getUuid().equals(getModel().getUuid()))
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