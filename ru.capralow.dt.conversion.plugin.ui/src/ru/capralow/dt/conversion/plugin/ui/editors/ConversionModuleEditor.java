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

	private Text text1;
	private Text text2;
	private Text text3;
	private TreeViewer viewer;

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

		
		// Страницы
		CTabFolder tabFolder = new CTabFolder(parent, SWT.FLAT);
		tabFolder.setBorderVisible(true);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		
		// Перед конвертацией
		CTabItem item1 = new CTabItem(tabFolder, SWT.NONE);
		item1.setText("Перед конвертацией");

		text1 = new Text(tabFolder, SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL | SWT.MULTI);
		text1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		item1.setControl(text1);

		// Перед отложенным заполнением
		CTabItem item2 = new CTabItem(tabFolder, SWT.NONE);
		item2.setText("Перед отложенным заполнением");

		text2 = new Text(tabFolder, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		text2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		item2.setControl(text2);

		// После конвертации
		CTabItem item3 = new CTabItem(tabFolder, SWT.NONE);
		item3.setText("После конвертации");

		text3 = new Text(tabFolder, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		text3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		item3.setControl(text3);

		// Отправка
		CTabItem item4 = new CTabItem(tabFolder, SWT.NONE);
		item4.setText("Отправка");

		Tree table = new Tree(tabFolder, SWT.NONE);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		viewer = new TreeViewer(table);
		viewer.setContentProvider(new ConversionModuleContentProvider());
		viewer.setLabelProvider(new ConversionModuleLabelProvider());

		item4.setControl(table);

		tabFolder.setSelection(0);
	}

	@Override
	public void activate() {
		super.activate();

		conversionModuleAnalyzer.analyze(getModel());
		ConversionModule conversionModule = conversionModuleAnalyzer.getConversionModule();

		text1.setText(conversionModule.getBeforeConvertationEvent());

		text2.setText(conversionModule.getBeforeFillingEvent());

		text3.setText(conversionModule.getAfterConvertationEvent());

		viewer.setInput(conversionModule.getPODs());
		viewer.expandAll();
	}

}
