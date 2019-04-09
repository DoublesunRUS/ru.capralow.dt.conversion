package ru.capralow.dt.conversion.plugin.ui.views;

import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.lifecycle.ProjectContext;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.lifecycle.IServiceContextLifecycleListener;
import com._1c.g5.v8.dt.lifecycle.IServicesOrchestrator;
import com._1c.g5.v8.dt.lifecycle.ServiceState;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.ui.util.OpenHelper;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.ExchangeProjectsAnalyzer;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects;
import ru.capralow.dt.conversion.plugin.ui.Activator;

public class ConversionPanelView extends ViewPart {
	@Inject
	private IV8ProjectManager projectManager;
	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	private TreeViewer treeViewer;

	private IServicesOrchestrator servicesOrchestrator;

	private IServiceContextLifecycleListener projectContextListener;

	private IResourceChangeListener objectsListener;

	private IProject[] projects;
	private HashMap<IProject, Boolean> readyProjects;

	public ConversionPanelView() {
		// Нечего делать
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		setSite(site);

		IResourceServiceProvider provider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));
		servicesOrchestrator = provider.get(IServicesOrchestrator.class);

		projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		readyProjects = new HashMap<>();
		for (IProject project : projects)
			readyProjects.put(project, false);

		for (Integer i = 0; i < projects.length; i++) {
			IProject project = projects[i];

			// проверяем инициализирован ли контекст
			if (servicesOrchestrator.getContextState(new ProjectContext(project)) != ServiceState.STARTED) {

				// если нет - ждем, пока UI инициализировать не нужно.
				// или опционально - инициализироватьк какой-то заглушкой, типа "загрузка
				// содержания..."
				projectContextListener = (context, state) -> {
					if (context instanceof ProjectContext && ((ProjectContext) context).getProject().equals(project)
							&& state == ServiceState.STARTED) {
						Display.getDefault().asyncExec(() -> updateTreeViewer(project));

					}
					// где-то нужно не забыть удалить этот listener в зависимости от жизненного
					// цикла вашего класса
				};
				servicesOrchestrator.addListener(projectContextListener);
			} else {
				// если инициализирован - сразу инициализируем UI
				Display.getDefault().asyncExec(() -> updateTreeViewer(project));
			}
		}

		objectsListener = event -> {
			IResourceDelta eventDelta = event.getDelta();

			for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
				if (!(projectManager.getProject(project) instanceof IConfigurationProject))
					continue;

				IPath path = project.getFullPath();

				IResourceDelta delta = eventDelta.findMember(path);

				if (delta != null)
					Display.getDefault().asyncExec(() -> updateTreeViewer(project));

			}
		};

		ResourcesPlugin.getWorkspace().addResourceChangeListener(objectsListener, IResourceChangeEvent.POST_CHANGE);

	}

	private void updateTreeViewer(IProject updatedProject) {
		readyProjects.put(updatedProject, true);

		for (IProject project : projects) {
			Boolean isReady = readyProjects.get(project);
			if (!isReady)
				return;
		}

		ExchangeProjects exchangeProjects = ExchangeProjectsAnalyzer
				.loadPluginResources(projectManager, bmEmfIndexManager, Activator.getDefault());
		ExchangeData exchangeData = ExchangeProjectsAnalyzer.analyzePairs(exchangeProjects);
		treeViewer.setInput(exchangeData);
		treeViewer.expandAll();
		treeViewer.refresh();

	}

	@Override
	public void dispose() {
		servicesOrchestrator.removeListener(projectContextListener);

		ResourcesPlugin.getWorkspace().removeResourceChangeListener(objectsListener);

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
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		treeViewer.setContentProvider(new ConversionPanelContentProvider());
		treeViewer.setLabelProvider(new ConversionPanelLabelProvider());

		treeViewer.setUseHashlookup(true);

		GridData layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.grabExcessVerticalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.verticalAlignment = GridData.FILL;
		treeViewer.getControl().setLayoutData(layoutData);

		treeViewer.expandAll();

		hookListeners();
	}

	@Override
	public void setFocus() {
		// Нечего делать
	}

	private void hookListeners() {
		treeViewer.addDoubleClickListener(event -> {
			ISelection selection = event.getSelection();

			if (selection.isEmpty())
				return;

			Object element = ((IStructuredSelection) selection).getFirstElement();

			if (element instanceof EpFormatVersion) {
				CommonModule commonModule = ((EpFormatVersion) element).getModule();

				URI uri = EcoreUtil.getURI(commonModule);

				OpenHelper openHelper = new OpenHelper();
				openHelper.openEditor(uri, null);
			}
		});
	}

}
