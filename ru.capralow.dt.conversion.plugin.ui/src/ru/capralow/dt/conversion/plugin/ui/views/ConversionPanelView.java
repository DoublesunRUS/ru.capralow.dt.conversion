package ru.capralow.dt.conversion.plugin.ui.views;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.core.lifecycle.ProjectContext;
import com._1c.g5.v8.dt.core.platform.IResourceLookup;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.lifecycle.IServiceContextLifecycleListener;
import com._1c.g5.v8.dt.lifecycle.IServicesOrchestrator;
import com._1c.g5.v8.dt.lifecycle.ServiceState;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.ui.util.OpenHelper;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelContentProvider;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelLabelProvider;
import ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion;

public class ConversionPanelView extends ViewPart {
	@Inject
	private IV8ProjectManager projectManager;

	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	@Inject
	private IResourceLookup resourceLookup;

	private TreeViewer treeViewer;

	private ConversionPanelAnalyzer conversionPanelAnalyzer;

	private IServicesOrchestrator servicesOrchestrator;

	private IServiceContextLifecycleListener projectContextListener;

	private IResourceChangeListener objectsListener;

	@Override
	public void init(IViewSite site) throws PartInitException {
		setSite(site);

		this.conversionPanelAnalyzer = new ConversionPanelAnalyzer(projectManager, bmEmfIndexManager);

		IResourceServiceProvider provider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));
		this.servicesOrchestrator = provider.get(IServicesOrchestrator.class);

		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		objectsListener = new IResourceChangeListener() {

			@Override
			public void resourceChanged(IResourceChangeEvent event) {
				IResourceDelta eventDelta = event.getDelta();

				ConversionPanel conversionPanel = conversionPanelAnalyzer.getConversionPanel();

				EList<Object> objects = conversionPanel.getObjects();

				boolean refreshUI = false;
				IProject project = null;

				Iterator<Object> itr = objects.iterator();
				while (itr.hasNext()) {
					EObject object = (EObject) itr.next();

					IFile file = resourceLookup.getPlatformResource(object.eResource());

					IPath path = file.getFullPath();

					IResourceDelta delta = eventDelta.findMember(path);

					if (delta != null) {
						refreshUI = true;
						project = projectManager.getProject(object).getProject();
						break;
					}
				}

				if (refreshUI) {
					updateTreeViewer(project);
				}

			}

		};

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
								updateTreeViewer(project);
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
						updateTreeViewer(project);
					}
				});
			}
		}

		ResourcesPlugin.getWorkspace().addResourceChangeListener(objectsListener, IResourceChangeEvent.POST_CHANGE);

	}

	private void updateTreeViewer(IProject project) {
		conversionPanelAnalyzer.Analyze(project);
		treeViewer.setInput(conversionPanelAnalyzer.getConversionPanel());
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

		hookListeners();
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

				if (element instanceof cpFormatVersion) {
					Module module = ((cpFormatVersion) element).getModule();
					CommonModule commonModule = (CommonModule) module.getOwner();

					URI uri = resourceLookup.getPlatformResourceUri(commonModule);

					OpenHelper openHelper = new OpenHelper();
					openHelper.openEditor(uri, null);
				}

			}
		}));
	}

}
