package ru.capralow.dt.conversion.plugin.ui.views;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.xtext.resource.IResourceServiceProvider;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.lifecycle.ProjectContext;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.lifecycle.IServiceContextLifecycleListener;
import com._1c.g5.v8.dt.lifecycle.IServicesOrchestrator;
import com._1c.g5.v8.dt.lifecycle.ServiceState;
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

	private IServicesOrchestrator servicesOrchestrator;
	
	private IServiceContextLifecycleListener projectContextListener;
	
	@Override
	public void init(IViewSite site) throws PartInitException {
		setSite(site);

		this.conversionPanelAnalyzer = new ConversionPanelAnalyzer(projectManager, bmEmfIndexManager);

		IResourceServiceProvider provider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));
		this.servicesOrchestrator = provider.get(IServicesOrchestrator.class);

		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		for (int i = 0; i < projects.length; i++) {
			IProject project = projects[i];

			// проверяем инициализирован ли контекст
			if (servicesOrchestrator.getContextState(new ProjectContext(project)) != ServiceState.STARTED) {
			
				// если нет - ждем, пока UI инициализировать не нужно.
				// или опционально - инициализироватьк какой-то заглушкой, типа "загрузка
				// содержания..."
				servicesOrchestrator.addListener(this.projectContextListener = (context, state) -> {
					if (context instanceof ProjectContext && ((ProjectContext) context).getProject().equals(project)
							&& state == ServiceState.STARTED) {
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								conversionPanelAnalyzer.Analyze(project);
								treeViewer.setInput(conversionPanelAnalyzer.getConversionPanel());
								treeViewer.expandAll();
								treeViewer.refresh();
							}
						});

					}
					// где-то нужно не забыть удалить этот listener в зависимости от жизненного
					// цикла вашего класса
				});
			} else {
				// если инициализирован - сразу инициализируем UI
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						conversionPanelAnalyzer.Analyze(project);
						treeViewer.setInput(conversionPanelAnalyzer.getConversionPanel());
						treeViewer.expandAll();
						treeViewer.refresh();
					}
				});
			}
		}

	}

	@Override
	public void dispose() {
		servicesOrchestrator.removeListener(projectContextListener);
		
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
