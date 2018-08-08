package ru.capralow.dt.conversion.plugin.ui.views;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.Invocation;
import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.Expression;
import com._1c.g5.v8.dt.bsl.model.FeatureAccess;
import com._1c.g5.v8.dt.bsl.model.SimpleStatement;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.core.platform.IConfigurationProvider;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IExtensionProject;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanelContentProvider;
import ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration;
import ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl;
import com.google.inject.Inject;

public class ConversionPanelView extends ViewPart {
	@Inject
	private IConfigurationProvider configurationProvider;
	@Inject
	private IV8ProjectManager projectManager;

	protected TreeViewer treeViewer;

	protected ConversionPanel conversionPanel;

	@Override
	public void init(IViewSite site) throws PartInitException {
		setSite(site);
		
		Collection<IConfigurationProject> configurations = projectManager.getProjects(IConfigurationProject.class);
		Collection<IExtensionProject> projects = projectManager.getProjects(IExtensionProject.class);
		
		conversionPanel = new ConversionPanelImpl();
		Collection<cpConfiguration> cpConfigurations = conversionPanel.getConfigurations();
		
		Collection<Configuration> mdConfigurations = configurationProvider.getConfigurations();
		
		Iterator<Configuration> itr = mdConfigurations.iterator();
		while (itr.hasNext()) {
			Configuration mdConfiguration = (Configuration) itr.next();
			
			if (mdConfiguration.getExtension() == null) {
				cpConfigurationImpl cpConfiguration = new cpConfigurationImpl();
				
				cpConfiguration.setConfigurationObject(mdConfiguration);
				cpConfiguration.setConfigurationName(mdConfiguration.getName());
				
				CommonModule mdModule = getCommonModule(mdConfiguration, "ќбменƒаннымиѕереопредел€емый");
				Method method = getCommonMethod(mdModule.getModule(), "ѕриѕолученииƒоступных¬ерсий‘ормата");
				
				EList<Statement> statements = method.getStatements();
				
				SimpleStatement statement = (SimpleStatement) statements.get(0);
				
				Invocation expression = (Invocation) statement.getLeft();
				
				DynamicFeatureAccess methodAccess = (DynamicFeatureAccess) expression.getMethodAccess();
				
				Expression source = methodAccess.getSource();
				
				cpConfigurations.add(cpConfiguration);
				
			} else {
//				cpConfiguration = cpConfigurations.getConfiguration();
//				EList<cpConfiguration> extensions = cpConfiguration.getExtensions();
//				
//				cpConfigurationImpl cpExtension = new cpConfigurationImpl();
//				
//				cpExtension.setConfigurationObject(mdConfiguration);
//				cpExtension.setConfigurationName(mdConfiguration.getName());
//				
//				extensions.add(cpExtension);
				
			}
		}
		
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
		// TODO јвтоматически созданна€ заглушка метода

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
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					
					
//					IDE.openEditor(page, ((Configuration) element));
				}
				
			}
		}));
	}
	
	protected CommonModule getCommonModule(Configuration mdConfiguration, String moduleName) {
		Iterator<CommonModule> itr = mdConfiguration.getCommonModules().iterator();
		while (itr.hasNext()) {
			CommonModule mdModule = (CommonModule) itr.next();
			
			if (mdModule.getName().equals(moduleName)) {
				return mdModule;
			}
		}
		
		return null;
	}
	
	protected Method getCommonMethod(Module mdModule, String methodName) {
		Iterator<Method> itr = mdModule.allMethods().iterator();
		while (itr.hasNext()) {
			Method mdMethod = (Method) itr.next();
			
			if (mdMethod.getName().equals(methodName)) {
				return mdMethod;
			}
		}
		
		return null;
	}
	
}
