package ru.capralow.dt.conversion.plugin.core.cp;

import java.lang.annotation.Inherited;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.util.Pair;

import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.Expression;
import com._1c.g5.v8.dt.bsl.model.FormalParam;
import com._1c.g5.v8.dt.bsl.model.Invocation;
import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.Pragma;
import com._1c.g5.v8.dt.bsl.model.SimpleStatement;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.bsl.resource.BslEventsService;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IExtensionProject;
import com._1c.g5.v8.dt.core.platform.IV8Project;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.lcore.util.CaseInsensitiveString;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;
import com._1c.g5.v8.dt.md.extension.adopt.IModelObjectAdopter;
import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.bsl.common.IModuleExtensionService;

import ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl;

public class ConversionPanelAnalyzer {

	public static ConversionPanelImpl Analyze(IV8ProjectManager projectManager, IModelObjectAdopter modelObjectAdopter,
			IBmEmfIndexManager bmEmfIndexManager, IModuleExtensionService moduleExtensionService) {

		Collection<IConfigurationProject> prConfigurations = projectManager.getProjects(IConfigurationProject.class);
		Collection<IExtensionProject> prExtensions = projectManager.getProjects(IExtensionProject.class);

		ConversionPanelImpl conversionPanel = new ConversionPanelImpl();
		Collection<cpConfiguration> cpConfigurations = conversionPanel.getConfigurations();

		Iterator<IConfigurationProject> itr = prConfigurations.iterator();
		while (itr.hasNext()) {
			IConfigurationProject prConfiguration = itr.next();
			IProject project = prConfiguration.getProject();
			IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);

			cpConfigurationImpl cpConfiguration = new cpConfigurationImpl();
			cpConfigurations.add(cpConfiguration);

			cpConfiguration.setConfigurationObject(project);
			cpConfiguration.setConfigurationName(project.getName());

			Configuration mdConfiguration = prConfiguration.getConfiguration();
			if (mdConfiguration == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_CONFIGURATION);
				continue;
			}

			Subsystem mdSubsystem = getSubsystem(bmEmfIndexProvider,
					QualifiedName.create("Subsystem", "СтандартныеПодсистемы", "Subsystem", "ОбменДанными"));
			if (mdSubsystem == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_SUBSYSTEM);
				continue;
			}

			CommonModule mdModule = getCommonModule(bmEmfIndexProvider,
					QualifiedName.create("CommonModule", "ОбменДаннымиПереопределяемый"));
			if (mdModule == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_COMMON_MODULE);
				continue;
			}

			Method mdMethod = getMethod(mdModule.getModule(), "ПриПолученииДоступныхВерсийФормата");
			if (mdMethod == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_METHOD);
				continue;
			}

			EList<Statement> statements = mdMethod.getStatements();
			if (statements.size() == 0) {
				cpConfiguration.setStatus(WorkspaceStatus.EMPTY_METHOD);
				continue;
			}

			getUsedFormatVersions(mdModule, mdMethod, prExtensions, projectManager, modelObjectAdopter,
					moduleExtensionService);

			cpConfiguration.setStatus(WorkspaceStatus.READY);
		}

		return conversionPanel;

	}

	protected static Subsystem getSubsystem(IBmEmfIndexProvider bmEmfIndexProvider, QualifiedName subsystemName) {
		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider
				.getEObjectIndexByType(MdClassPackage.Literals.SUBSYSTEM, subsystemName, true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext()) {
			return (Subsystem) objectItr.next().getEObjectOrProxy();
		}

		return null;
	}

	protected static CommonModule getCommonModule(IBmEmfIndexProvider bmEmfIndexProvider, QualifiedName moduleName) {
		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider
				.getEObjectIndexByType(MdClassPackage.Literals.COMMON_MODULE, moduleName, true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext()) {
			return (CommonModule) objectItr.next().getEObjectOrProxy();
		}

		return null;
	}

	protected static Method getMethod(Module mdModule, String methodName) {
		Iterator<Method> itr = mdModule.allMethods().iterator();
		while (itr.hasNext()) {
			Method mdMethod = (Method) itr.next();

			if (mdMethod.getName().equals(methodName)) {
				return mdMethod;
			}
		}

		return null;
	}

	protected static EList<?> getUsedFormatVersions(CommonModule mdModule, Method mdMethod,
			Collection<IExtensionProject> prExtensions, IV8ProjectManager projectManager,
			IModelObjectAdopter modelObjectAdopter, IModuleExtensionService moduleExtensionService) {
		FormalParam mdParam = mdMethod.getFormalParams().get(0);
		String variableName = mdParam.getName();

		parseMethod(mdModule.getModule(), mdMethod, moduleExtensionService);

//		Iterator<IExtensionProject> itr = prExtensions.iterator();
//		while (itr.hasNext()) {
//			IExtensionProject prExtension = itr.next();

//			CommonModule extendedModule = getCommonModule(prExtension.getConfiguration(), "ОбменДаннымиПереопределяемый");

//			Module adopter = modelObjectAdopter.getAdopted(mdModule.getModule(), prExtension);

//			Map<Pragma, Method> methods = moduleExtensionService.getExtensionMethods(mdModule.getModule(), "ПриПолученииДоступныхВерсийФормата");
//			Collection<Module> methods = moduleExtensionService.getExtensionModules(mdModule.getModule());
//		}

//		Iterator<Statement> itr = mdStatements.iterator();
//		while (itr.hasNext()) {
//			Statement mdStatement = itr.next();
//
//			Invocation expression = (Invocation) ((SimpleStatement) mdStatement).getLeft();
//
//			DynamicFeatureAccess methodAccess = (DynamicFeatureAccess) expression.getMethodAccess();
//
//			Expression source = methodAccess.getSource();
//
//		}

		return null;
	}

	protected static void parseMethod(Module mdModule, Method mdMethod,
			IModuleExtensionService moduleExtensionService) {
		Collection<Module> extensionModules = moduleExtensionService.getExtensionModules(mdModule);
		Iterator<Module> itr = extensionModules.iterator();
		while (itr.hasNext()) {
			Module mdExtensionModule = itr.next();

			Map<Pragma, Method> extensionMethods = moduleExtensionService.getExtensionMethods(mdExtensionModule,
					mdMethod.getName());

		}

	}

}
