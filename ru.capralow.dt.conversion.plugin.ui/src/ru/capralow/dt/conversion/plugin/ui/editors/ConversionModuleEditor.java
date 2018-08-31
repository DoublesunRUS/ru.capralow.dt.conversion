package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

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

	private TreeViewer viewer;
	
	class TextSection {
		String text;

		public TextSection(String text) {
			this.text = text;
		}
	}

	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	@Inject
	public ConversionModuleEditor(String id, String title) {
		super(PAGE_ID, "Конвертация");

		conversionModuleAnalyzer = new ConversionModuleAnalyzer(projectManager, bmEmfIndexManager);
	}

	@Override
	protected void createPageControls(IManagedForm managedForm) {
		conversionModuleAnalyzer.analyze(getModel());
		ConversionModule conversionModule = conversionModuleAnalyzer.getConversionModule();

		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		Composite parent = form.getBody();

		GridLayout layout;
		GridData gd;
		
		// Заголовок
		form.setText("Form in a view... with subpages");

		// Дизайн
		layout = new GridLayout();
		layout.marginWidth = 10;
		parent.setLayout(layout);

		// Страницы
		CTabFolder tabFolder = new CTabFolder(parent, SWT.FLAT | SWT.TOP);
		toolkit.adapt(tabFolder, true, true);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// Градиент
		Color selectedColor = toolkit.getColors().getColor(IFormColors.SEPARATOR);
		tabFolder.setSelectionBackground(new Color[] { selectedColor, toolkit.getColors().getBackground() },
				new int[] { 50 });

		toolkit.paintBordersFor(tabFolder);

		// Перед конвертацией
		CTabItem item1 = new CTabItem(tabFolder, SWT.NONE);
		item1.setText("Перед конвертацией");

		Composite tabContent1 = toolkit.createComposite(tabFolder);
		tabContent1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		layout = new GridLayout();
		tabContent1.setLayout(layout);
		layout.numColumns = 1;
		layout.marginWidth = 0;

		Text text1 = toolkit.createText(tabContent1, conversionModule.getBeforeConvertationEvent(), SWT.MULTI | SWT.WRAP);
		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.verticalSpan = 2;
		text1.setLayoutData(gd);

		item1.setControl(tabContent1);
		
		// Перед отложенным заполнением
		CTabItem item2 = new CTabItem(tabFolder, SWT.NONE);
		item2.setText("Перед отложенным заполнением");
		
		Composite tabContent2 = toolkit.createComposite(tabFolder);
		tabContent2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		layout = new GridLayout();
		tabContent2.setLayout(layout);
		layout.numColumns = 1;
		layout.marginWidth = 0;

		Text text2 = toolkit.createText(tabContent2, conversionModule.getBeforeFillingEvent(), SWT.MULTI | SWT.WRAP);
		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.verticalSpan = 2;
		text2.setLayoutData(gd);
	
		item2.setControl(tabContent2);

		// После конвертации
		CTabItem item3 = new CTabItem(tabFolder, SWT.NONE);
		item3.setText("После конвертации");

		Composite tabContent3 = toolkit.createComposite(tabFolder);
		tabContent3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		layout = new GridLayout();
		tabContent3.setLayout(layout);
		layout.numColumns = 1;
		layout.marginWidth = 0;

		Text text3 = toolkit.createText(tabContent3, "", SWT.MULTI | SWT.WRAP);
		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.verticalSpan = 2;
		text3.setLayoutData(gd);

		item3.setControl(tabContent3);

		// Отправка
		CTabItem item4 = new CTabItem(tabFolder, SWT.NONE);
		item4.setText("Отправка");
		
		Composite tabContent4 = toolkit.createComposite(tabFolder);
		tabContent4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		layout = new GridLayout();
		tabContent4.setLayout(layout);
		layout.numColumns = 1;
		layout.marginWidth = 0;

		Tree table = toolkit.createTree(tabContent4, SWT.NONE);
		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		table.setLayoutData(gd);

		viewer = new TreeViewer(table);
		gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		gd.verticalAlignment = GridData.FILL;
		viewer.getControl().setLayoutData(gd);
		viewer.setContentProvider(new ConversionModuleContentProvider());
		viewer.setLabelProvider(new ConversionModuleLabelProvider());

		viewer.setInput(conversionModule.getPODs());
		viewer.expandAll();

		item4.setControl(tabContent4);

		tabFolder.setSelection(0);
	}

}
