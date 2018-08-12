package ru.capralow.dt.conversion.plugin.ui.views;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bsl.common.IModuleExtensionService;
import com._1c.g5.v8.dt.bsl.resource.DynamicFeatureAccessComputer;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.md.extension.adopt.IModelObjectAdopter;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelContentProvider;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelLabelProvider;

public class ConversionPanelView extends ViewPart {
	@Inject
	private IV8ProjectManager projectManager;

	@Inject
	private IModelObjectAdopter modelObjectAdopter;

	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	protected TreeViewer treeViewer;

	protected ConversionPanel conversionPanel;

	@Override
	public void init(IViewSite site) throws PartInitException {
		setSite(site);

		IModuleExtensionService moduleExtensionService = com._1c.g5.v8.dt.bsl.common.IModuleExtensionServiceProvider.INSTANCE
				.getModuleExtensionService();

		DynamicFeatureAccessComputer dynamicFeatureAccessComputer = new com._1c.g5.v8.dt.bsl.resource.DynamicFeatureAccessComputer();
		
		ConversionPanelAnalyzer conversionPanelAnalyzer = new ConversionPanelAnalyzer(projectManager,
				modelObjectAdopter, bmEmfIndexManager, moduleExtensionService, dynamicFeatureAccessComputer);

		conversionPanel = conversionPanelAnalyzer.Analyze();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 2;
		layout.marginWidth = 0;
		layout.marginHeight = 2;
		parent.setLayout(layout);

		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new ConversionPanelContentProvider());
		ConversionPanelLabelProvider labelProvider = new ConversionPanelLabelProvider();
		treeViewer.setLabelProvider(labelProvider);

		treeViewer.setUseHashlookup(true);

		GridData layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.grabExcessVerticalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.verticalAlignment = GridData.FILL;
		treeViewer.getControl().setLayoutData(layoutData);

		treeViewer.setInput(conversionPanel);
		treeViewer.expandAll();

		hookListeners();
	}

	@Override
	public void setFocus() {
		// TODO Автоматически созданная заглушка метода

	}

	protected void hookListeners() {
		treeViewer.addDoubleClickListener((new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();

				if (selection.isEmpty()) {
					return;
				}

				Object element = ((IStructuredSelection) selection).getFirstElement();

				if (element instanceof Configuration) {
//					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

//					IDE.openEditor(page, ((Configuration) element));
				}

			}
		}));
	}

}
