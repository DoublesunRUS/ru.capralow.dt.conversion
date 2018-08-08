package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;

import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IExtensionProject;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;

import ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl;

public class ConversionPanelAnalyzer {

	public static ConversionPanelImpl Analyze(IV8ProjectManager projectManager) {
		Collection<IConfigurationProject> prConfigurations = projectManager.getProjects(IConfigurationProject.class);
		Collection<IExtensionProject> prExtensions = projectManager.getProjects(IExtensionProject.class);

		ConversionPanelImpl conversionPanel = new ConversionPanelImpl();
		Collection<cpConfiguration> cpConfigurations = conversionPanel.getConfigurations();

//		Collection<Configuration> mdConfigurations = configurationProvider.getConfigurations();

		Iterator<IConfigurationProject> itr = prConfigurations.iterator();
		while (itr.hasNext()) {
			IConfigurationProject prConfiguration = itr.next();
			IProject project = prConfiguration.getProject();

			cpConfigurationImpl cpConfiguration = new cpConfigurationImpl();
			cpConfigurations.add(cpConfiguration);

			cpConfiguration.setConfigurationObject(project);
			cpConfiguration.setConfigurationName(project.getName());

			Configuration mdConfiguration = prConfiguration.getConfiguration();
			if (mdConfiguration == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_CONFIGURATION);
				continue;
			}

			Subsystem mdSubsystem = getSubsystem(mdConfiguration, "СтандартныеПодсистемы");
			if (mdSubsystem == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_SUBSYSTEM);
				continue;
			}

			Subsystem mdChildSubsystem = getSubsystem(mdSubsystem, "ОбменДанными");
			if (mdChildSubsystem == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_SUBSYSTEM);
				continue;
			}

			CommonModule mdModule = getCommonModule(mdConfiguration, "ОбменДаннымиПереопределяемый");
			if (mdModule == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_COMMON_MODULE);
				continue;
			}

			Method mdMethod = getCommonMethod(mdModule.getModule(), "ПриПолученииДоступныхВерсийФормата");
			if (mdMethod == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_METHOD);
				continue;
			}

			EList<Statement> statements = mdMethod.getStatements();
			if (statements.size() == 0) {
				cpConfiguration.setStatus(WorkspaceStatus.EMPTY_METHOD);
				continue;
			}

			cpConfiguration.setStatus(WorkspaceStatus.READY);
//				
//				SimpleStatement statement = (SimpleStatement) statements.get(0);
//				
//				Invocation expression = (Invocation) statement.getLeft();
//				
//				DynamicFeatureAccess methodAccess = (DynamicFeatureAccess) expression.getMethodAccess();
//				
//				Expression source = methodAccess.getSource();
			
		}
		
		return conversionPanel;
		
	}

	protected static Subsystem getSubsystem(Configuration mdConfiguration, String subsystemName) {
		Iterator<Subsystem> itr = mdConfiguration.getSubsystems().iterator();
		while (itr.hasNext()) {
			Subsystem mdSubsystem = (Subsystem) itr.next();

			if (mdSubsystem.getName().equals(subsystemName)) {
				return mdSubsystem;
			}
		}

		return null;
	}

	protected static Subsystem getSubsystem(Subsystem mdSubsystem, String subsystemName) {
		Iterator<Subsystem> itr = mdSubsystem.getSubsystems().iterator();
		while (itr.hasNext()) {
			Subsystem mdChildSubsystem = (Subsystem) itr.next();

			if (mdChildSubsystem.getName().equals(subsystemName)) {
				return mdChildSubsystem;
			}
		}

		return null;
	}

	protected static CommonModule getCommonModule(Configuration mdConfiguration, String moduleName) {
		Iterator<CommonModule> itr = mdConfiguration.getCommonModules().iterator();
		while (itr.hasNext()) {
			CommonModule mdModule = (CommonModule) itr.next();

			if (mdModule.getName().equals(moduleName)) {
				return mdModule;
			}
		}

		return null;
	}

	protected static Method getCommonMethod(Module mdModule, String methodName) {
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
