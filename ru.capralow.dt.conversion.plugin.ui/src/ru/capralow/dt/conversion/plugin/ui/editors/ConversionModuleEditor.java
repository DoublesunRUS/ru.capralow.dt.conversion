package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.forms.IManagedForm;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.md.ui.editor.base.DtGranularEditorPage;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModuleContentProvider;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModuleLabelProvider;

public class ConversionModuleEditor extends DtGranularEditorPage<CommonModule> {
	public static final java.lang.String PAGE_ID = "ru.capralow.dt.conversion.plugin.ui.editors.ConversionModuleEditor";

	@Inject
	private IV8ProjectManager projectManager;

	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	private ConversionModuleAnalyzer conversionModuleAnalyzer;

	private Text textBeforeConvertationEvent;
	private Text textBeforeFillingEvent;
	private Text textAfterConvertationEvent;
	private TreeViewer treeViewerSendingEvents;
	private TreeViewer treeViewerReceivingEvents;
	private TreeViewer treeViewerPredefined;
	private TreeViewer treeViewerAlgorithms;

	@Inject
	public ConversionModuleEditor(String id, String title) {
		super(PAGE_ID, "Конвертация");

		conversionModuleAnalyzer = new ConversionModuleAnalyzer(projectManager, bmEmfIndexManager);
	}

	@Override
	protected void createPageControls(IManagedForm managedForm) {
		Composite parent = managedForm.getForm().getBody();

		GridLayoutFactory.fillDefaults().applyTo(parent);
		GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).grab(true, true).applyTo(parent);

		CTabItem tabItem;

		// Страницы
		CTabFolder tabFolder = new CTabFolder(parent, SWT.FLAT);
		tabFolder.setBorderVisible(true);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// Информация
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Информация");

		// Отправка
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Отправка");

		Tree tree = new Tree(tabFolder, SWT.NONE);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tree.setHeaderVisible(true);
		TreeColumn column1 = new TreeColumn(tree, SWT.LEFT);
		column1.setText("Объект конфигурации");
		column1.setWidth(200);
		TreeColumn column2 = new TreeColumn(tree, SWT.CENTER);
		column2.setText("Объект формата");
		column2.setWidth(200);
		TreeColumn column3 = new TreeColumn(tree, SWT.RIGHT);
		column3.setText("Есть правило обработки данных");
		column3.setWidth(200);

		treeViewerSendingEvents = new TreeViewer(tree);
		treeViewerSendingEvents.setContentProvider(new ConversionModuleContentProvider());
		treeViewerSendingEvents.setLabelProvider(new ConversionModuleLabelProvider());

		tabItem.setControl(tree);

		// Получение
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Получение");

		Tree tree2 = new Tree(tabFolder, SWT.NONE);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tree.setHeaderVisible(true);
		TreeColumn column21 = new TreeColumn(tree2, SWT.LEFT);
		column21.setText("Column 1");
		column21.setWidth(200);
		TreeColumn column22 = new TreeColumn(tree2, SWT.CENTER);
		column22.setText("Column 2");
		column22.setWidth(200);
		TreeColumn column23 = new TreeColumn(tree2, SWT.RIGHT);
		column23.setText("Column 3");
		column23.setWidth(200);

		treeViewerReceivingEvents = new TreeViewer(tree);
		treeViewerReceivingEvents.setContentProvider(new ConversionModuleContentProvider());
		treeViewerReceivingEvents.setLabelProvider(new ConversionModuleLabelProvider());

		tabItem.setControl(tree2);

		// Предопределенные
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Предопределенные");

		Tree tree3 = new Tree(tabFolder, SWT.NONE);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tree.setHeaderVisible(true);
		TreeColumn column31 = new TreeColumn(tree3, SWT.LEFT);
		column31.setText("Column 1");
		column31.setWidth(200);
		TreeColumn column32 = new TreeColumn(tree3, SWT.CENTER);
		column32.setText("Column 2");
		column32.setWidth(200);
		TreeColumn column33 = new TreeColumn(tree3, SWT.RIGHT);
		column33.setText("Column 3");
		column33.setWidth(200);

		treeViewerPredefined = new TreeViewer(tree3);
		treeViewerPredefined.setContentProvider(new ConversionModuleContentProvider());
		treeViewerPredefined.setLabelProvider(new ConversionModuleLabelProvider());

		tabItem.setControl(tree3);

		// Алгоритмы
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Алгоритмы");

		Tree tree4 = new Tree(tabFolder, SWT.NONE);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tree.setHeaderVisible(true);
		TreeColumn column41 = new TreeColumn(tree4, SWT.LEFT);
		column41.setText("Column 1");
		column41.setWidth(200);
		TreeColumn column42 = new TreeColumn(tree4, SWT.CENTER);
		column42.setText("Column 2");
		column42.setWidth(200);
		TreeColumn column43 = new TreeColumn(tree4, SWT.RIGHT);
		column43.setText("Column 3");
		column43.setWidth(200);

		treeViewerAlgorithms = new TreeViewer(tree4);
		treeViewerAlgorithms.setContentProvider(new ConversionModuleContentProvider());
		treeViewerAlgorithms.setLabelProvider(new ConversionModuleLabelProvider());

		tabItem.setControl(tree4);

		// Перед конвертацией
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Перед конвертацией");

		textBeforeConvertationEvent = new Text(tabFolder, SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL | SWT.MULTI);
		textBeforeConvertationEvent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		tabItem.setControl(textBeforeConvertationEvent);

		// Перед отложенным заполнением
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Перед отложенным заполнением");

		textBeforeFillingEvent = new Text(tabFolder, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		textBeforeFillingEvent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		tabItem.setControl(textBeforeFillingEvent);

		// После конвертации
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("После конвертации");

		textAfterConvertationEvent = new Text(tabFolder, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		textAfterConvertationEvent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		tabItem.setControl(textAfterConvertationEvent);

		tabFolder.setSelection(0);
	}

	@Override
	public void activate() {
		super.activate();

		conversionModuleAnalyzer.analyze(getModel());
		ConversionModule conversionModule = conversionModuleAnalyzer.getConversionModule();

		textBeforeConvertationEvent.setText(conversionModule.getBeforeConvertationEvent());

		textBeforeFillingEvent.setText(conversionModule.getBeforeFillingEvent());

		textAfterConvertationEvent.setText(conversionModule.getAfterConvertationEvent());

		treeViewerSendingEvents.setInput(conversionModule.getPODs());
		treeViewerSendingEvents.expandAll();
	}

}
