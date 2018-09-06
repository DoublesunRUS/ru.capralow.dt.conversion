
package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.validation.IResourceValidator;

import com._1c.g5.ides.ui.texteditor.xtext.embedded.CustomEmbeddedEditor;
import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorModelAccess;
import com._1c.g5.v8.dt.lcore.ui.editor.embedded.CustomEmbeddedEditorResourceProvider;
import com._1c.g5.v8.dt.md.ui.editor.base.DtGranularEditorPage;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.SendingRulesContentProvider;
import ru.capralow.dt.conversion.plugin.core.cm.SendingRulesLabelProvider;

public class ConversionModuleEditor extends DtGranularEditorPage<CommonModule> {
	public static final java.lang.String PAGE_ID = "ru.capralow.dt.conversion.plugin.ui.editors.ConversionModuleEditor";

	@Inject
	private IV8ProjectManager projectManager;

	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	private ConversionModuleAnalyzer conversionModuleAnalyzer;

//	private Text textBeforeConvertationEvent;
	private Text textBeforeFillingEvent;
	private Text textAfterConvertationEvent;
	private TreeViewer treeViewerSendingEvents;
	private TreeViewer treeViewerReceivingEvents;
	private TreeViewer treeViewerPredefined;
	private TreeViewer treeViewerAlgorithms;

	private CustomEmbeddedEditor innerEditor;
	private CustomEmbeddedEditorModelAccess modelAccess;

	@Inject
	public ConversionModuleEditor(String id, String title) {
		super(PAGE_ID, "Конвертация");

		conversionModuleAnalyzer = new ConversionModuleAnalyzer(projectManager, bmEmfIndexManager);
	}

	@Override
	protected void createPageControls(IManagedForm managedForm) {
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
		tabFolder.setBorderVisible(true);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		toolkit.adapt(tabFolder);
		toolkit.paintBordersFor(tabFolder);

		tabFolder.setSelectionBackground(
				Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

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
		treeViewerSendingEvents.setContentProvider(new SendingRulesContentProvider());
		treeViewerSendingEvents.setLabelProvider(new SendingRulesLabelProvider());

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
		treeViewerReceivingEvents.setContentProvider(new SendingRulesContentProvider());
		treeViewerReceivingEvents.setLabelProvider(new SendingRulesLabelProvider());

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
		treeViewerPredefined.setContentProvider(new SendingRulesContentProvider());
		treeViewerPredefined.setLabelProvider(new SendingRulesLabelProvider());

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
		treeViewerAlgorithms.setContentProvider(new SendingRulesContentProvider());
		treeViewerAlgorithms.setLabelProvider(new SendingRulesLabelProvider());

		tabItem.setControl(tree4);

		// Перед конвертацией
		tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("Перед конвертацией");

		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		CustomEmbeddedEditorResourceProvider resourceProvider = (CustomEmbeddedEditorResourceProvider) resourceServiceProvider
				.get(IEditedResourceProvider.class);
		resourceProvider.setPlatformUri(EcoreUtil.getURI(getModel().getModule()));

		IResourceValidator resourceValidator = resourceServiceProvider.get(IResourceValidator.class);

		EmbeddedEditorFactory embeddedEditorFactory = resourceServiceProvider.get(EmbeddedEditorFactory.class);

		Composite editorComposite = new Composite(tabFolder, SWT.BORDER);
		editorComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayoutFactory.fillDefaults().applyTo(editorComposite);

		innerEditor = (CustomEmbeddedEditor) embeddedEditorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withResourceValidator(resourceValidator).withParent(editorComposite);

		innerEditor.getViewer().getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		tabItem.setControl(editorComposite);

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

		conversionModuleAnalyzer.analyze(getModel());
		ConversionModule conversionModule = conversionModuleAnalyzer.getConversionModule();

		String beforeConvertationEvent = conversionModule.getBeforeConvertationEvent();
		getModelAccess().updateEditablePart(beforeConvertationEvent != null ? beforeConvertationEvent : "");

		treeViewerSendingEvents.setInput(conversionModule);
		treeViewerSendingEvents.expandAll();

		hookListeners();
	}

	@Override
	public void activate() {
		super.activate();

//		textBeforeConvertationEvent.setText(conversionModule.getBeforeConvertationEvent());

//		String beforeFillingEvent = conversionModule.getBeforeFillingEvent();
//		textBeforeFillingEvent.setText(beforeFillingEvent != null ? beforeFillingEvent : "");
//
//		String afterConvertationEvent = conversionModule.getAfterConvertationEvent();
//		textAfterConvertationEvent.setText(afterConvertationEvent != null ? afterConvertationEvent : "");
	}

	private void hookListeners() {
		treeViewerSendingEvents.addDoubleClickListener((new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();

				if (selection.isEmpty()) {
					return;
				}

				Object element = ((IStructuredSelection) selection).getFirstElement();

				if (element instanceof CmSendingRule) {
					CmSendingRule sendingRule = ((CmSendingRule) element);

					SendingRuleDialog sendingRuleDialog = new SendingRuleDialog(
							event.getViewer().getControl().getShell());
					sendingRuleDialog.open();
				}

			}
		}));
	}

	private synchronized CustomEmbeddedEditorModelAccess getModelAccess() {
		if (modelAccess == null) {
			modelAccess = (CustomEmbeddedEditorModelAccess) innerEditor.createPartialEditor("", "", "", true);
		}
		return modelAccess;
	}

}