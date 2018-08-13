package ru.capralow.dt.conversion.plugin.ui.views;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bsl.common.IModuleExtensionService;
import com._1c.g5.v8.dt.bsl.resource.DynamicFeatureAccessComputer;
import com._1c.g5.v8.dt.core.event.IEvent;
import com._1c.g5.v8.dt.core.event.IEventListener;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.core.platform.events.IV8ProjectEvent;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelContentProvider;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelLabelProvider;

public class ConversionPanelView extends ViewPart {
	@Inject
	private IV8ProjectManager projectManager;

	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	private TreeViewer treeViewer;

	private ConversionPanelAnalyzer conversionPanelAnalyzer;

	private IEventListener eventListener;

	@Override
	public void init(IViewSite site) throws PartInitException {
		setSite(site);

		IModuleExtensionService moduleExtensionService = com._1c.g5.v8.dt.bsl.common.IModuleExtensionServiceProvider.INSTANCE
				.getModuleExtensionService();

		DynamicFeatureAccessComputer dynamicFeatureAccessComputer = new com._1c.g5.v8.dt.bsl.resource.DynamicFeatureAccessComputer();

		this.conversionPanelAnalyzer = new ConversionPanelAnalyzer(projectManager, bmEmfIndexManager,
				moduleExtensionService, dynamicFeatureAccessComputer);

		this.eventListener = new IEventListener() {

			@Override
			public void handleEvent(IEvent arg0) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						conversionPanelAnalyzer.Analyze(arg0.getProject());
						treeViewer.setInput(conversionPanelAnalyzer.getConversionPanel());
						treeViewer.expandAll();
						treeViewer.refresh();
					}
				});
			}
		};

		conversionPanelAnalyzer.Analyze(null);

		projectManager.addProjectsListener(eventListener, IV8ProjectEvent.class);

	}

	@Override
	public void dispose() {
		projectManager.removeListener(eventListener);

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

		treeViewer.setInput(conversionPanelAnalyzer.getConversionPanel());
		treeViewer.expandAll();

//		hookListeners();
	}

	@Override
	public void setFocus() {
		// TODO Автоматически созданная заглушка метода

	}

	private void hookListeners() {
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
