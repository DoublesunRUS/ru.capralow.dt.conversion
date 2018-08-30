package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
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

import ru.capralow.dt.conversion.plugin.core.cm.ConversionModuleAnalyzer;

public class ConversionModuleEditor extends DtGranularEditorPage<CommonModule> {
	public static final java.lang.String PAGE_ID = "ru.capralow.dt.conversion.plugin.ui.editors.ConversionModuleEditor";

	@Inject
	private IV8ProjectManager projectManager;

	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	private ConversionModuleAnalyzer conversionModuleAnalyzer;

	private CTabFolder tabFolder;
	private Text text;

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

		FormToolkit toolkit = managedForm.getToolkit();
//		Composite parent = managedForm.getForm().getBody();

		// put a managed form on the composite
		ScrolledForm form = managedForm.getForm();

		// give it a title banner
		form.setText("Form in a view... with subpages");

		// and a layout
		GridLayout layout = new GridLayout();
		layout.marginWidth = 10;
		form.getBody().setLayout(layout);

		// add the tabFolder
		tabFolder = new CTabFolder(form.getBody(), SWT.FLAT | SWT.TOP);
		toolkit.adapt(tabFolder, true, true);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = 0;
		tabFolder.setLayoutData(gd);

		//
		Color selectedColor = toolkit.getColors().getColor(IFormColors.SEPARATOR);
		tabFolder.setSelectionBackground(new Color[] { selectedColor, toolkit.getColors().getBackground() },
				new int[] { 50 });
		// tabFolder.setCursor(FormsResources.getHandCursor());

		toolkit.paintBordersFor(tabFolder);
		createTabs(toolkit);
		createText(toolkit, form.getBody());
		tabFolder.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateSelection();
			}
		});
		tabFolder.setSelection(0);
		updateSelection();

	}

	private void createTabs(FormToolkit toolkit) {
		createTab(toolkit, "Copyright", "Copyright 2004 IBM and others.");
		createTab(toolkit, "License Agreement", "LICENSE AGREEMENT\n\nUse this feature any way you want.");
		createTab(toolkit, "Description", "A simple description of the feature");
	}

	private void createText(FormToolkit toolkit, Composite parent) {
		Composite tabContent = toolkit.createComposite(parent);
		tabContent.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		tabContent.setLayout(layout);
		layout.numColumns = 2;
		layout.marginWidth = 0;
		GridData gd;
		text = toolkit.createText(tabContent, "", SWT.MULTI | SWT.WRAP);
		gd = new GridData(GridData.FILL_BOTH);
		gd.verticalSpan = 2;
		text.setLayoutData(gd);
		Button apply = toolkit.createButton(tabContent, "Apply", SWT.PUSH);
		apply.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_BEGINNING));
		Button reset = toolkit.createButton(tabContent, "Reset", SWT.PUSH);
		reset.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_BEGINNING));
	}

	private void updateSelection() {
		CTabItem item = tabFolder.getSelection();
		TextSection section = (TextSection) item.getData();
		text.setText(section.text);
	}

	private void createTab(FormToolkit toolkit, String title, String content) {
		CTabItem item = new CTabItem(tabFolder, SWT.NULL);
		TextSection section = new TextSection(content);
		item.setText(title);
		item.setData(section);

//		ScrolledForm form = toolkit.createScrolledForm(parent);
//		form.setText("Eclipse Forms API Example");
//
//		// Lets make a layout for the first section of the screen
//		GridLayout layout = new GridLayout();
//		layout.numColumns = 1;
//		layout.marginWidth = 2;
//		layout.marginHeight = 2;
//		// Creating the Screen
//		Section section = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
//		section.setText("Section 1 for demonstration"); //$NON-NLS-1$
//		section.setDescription("This demonstrates the usage of section");
//		// Composite for storing the data
//		Composite client = toolkit.createComposite(section, SWT.WRAP);
//		layout = new GridLayout();
//		layout.numColumns = 2;
//		layout.marginWidth = 2;
//		layout.marginHeight = 2;
//		client.setLayout(layout);
//		Table t = toolkit.createTable(client, SWT.NONE);
//		GridData gd = new GridData(GridData.FILL_BOTH);
//		gd.heightHint = 20;
//		gd.widthHint = 100;
//		t.setLayoutData(gd);
//		toolkit.paintBordersFor(client);
//		Button b = toolkit.createButton(client, "Do something", SWT.PUSH); //$NON-NLS-1$
//		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
//		b.setLayoutData(gd);
//		section.setClient(client);
//		TableViewer viewer = new TableViewer(t);
//
//		viewer.setContentProvider(new ArrayContentProvider());
//
//		TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
//		viewerColumn.getColumn().setWidth(100);
//		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
//			@Override
//			public String getText(Object element) {
//				return element.toString();
//			};
//
//			public Image getImage(Object element) {
//				return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
//			};
//		}
//
//		);
//		viewer.setInput(getEditorSite());
	}

}
