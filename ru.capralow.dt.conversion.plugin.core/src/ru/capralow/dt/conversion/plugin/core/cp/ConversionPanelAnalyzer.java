package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.bsl.common.IModuleExtensionService;
import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.Expression;
import com._1c.g5.v8.dt.bsl.model.FormalParam;
import com._1c.g5.v8.dt.bsl.model.Invocation;
import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.SimpleStatement;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.bsl.model.StaticFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.StringLiteral;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.md.extension.adopt.IModelObjectAdopter;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;

import ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl;

public class ConversionPanelAnalyzer {

	public static ConversionPanelImpl Analyze(IV8ProjectManager projectManager, IModelObjectAdopter modelObjectAdopter,
			IBmEmfIndexManager bmEmfIndexManager, IModuleExtensionService moduleExtensionService) {

		Collection<IConfigurationProject> prConfigurations = projectManager.getProjects(IConfigurationProject.class);
//		Collection<IExtensionProject> prExtensions = projectManager.getProjects(IExtensionProject.class);

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

			Map<String, Module> availableFormatVersions = getAvailableFormatVersions(mdModule, mdMethod,
					bmEmfIndexProvider, moduleExtensionService);
			if (availableFormatVersions.size() == 0) {
				cpConfiguration.setStatus(WorkspaceStatus.EMPTY_METHOD);
				continue;
			}

			EList<cpFormatVersion> cpAvailableFormatVersions = cpConfiguration.getAvailableFormatVersions();
			List<String> sortedVersions = new ArrayList<String>(availableFormatVersions.keySet());
			Collections.sort(sortedVersions);
			Iterator<String> itrVersions = sortedVersions.iterator();
			while (itrVersions.hasNext()) {
				String version = itrVersions.next();

				cpFormatVersionImpl cpFormatVersion = new cpFormatVersionImpl();

				cpFormatVersion.setVersion(version);
				cpFormatVersion.setModule(availableFormatVersions.get(version));

				cpAvailableFormatVersions.add(cpFormatVersion);
			}

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

	protected static Map<String, Module> getAvailableFormatVersions(CommonModule mdModule, Method mdMethod,
			IBmEmfIndexProvider bmEmfIndexProvider, IModuleExtensionService moduleExtensionService) {

		Map<String, Module> formatVersions = new HashMap<String, Module>();

		parseMethod(formatVersions, mdModule.getModule(), mdMethod, bmEmfIndexProvider, moduleExtensionService);

		return formatVersions;
	}

	protected static void parseMethod(Map<String, Module> formatVersions, Module mdModule, Method mdMethod,
			IBmEmfIndexProvider bmEmfIndexProvider, IModuleExtensionService moduleExtensionService) {

		Map<String, Module> insteadFormatVersions = getFormatVersions(mdMethod, bmEmfIndexProvider);

		formatVersions.putAll(insteadFormatVersions);

//		Collection<Module> extensionModules = moduleExtensionService.getExtensionModules(mdModule);
//		Iterator<Module> itr = extensionModules.iterator();
//		while (itr.hasNext()) {
//			Module mdExtensionModule = itr.next();

//			Map<Pragma, Method> extensionMethods = moduleExtensionService.getExtensionMethods(mdExtensionModule,
//					mdMethod.getName());

//			Iterator itrKeys = sortedKeys.iterator();
//			while (itrKeys.hasNext()) {
//				String keyName = (String) itrKeys.next();
//				
//				formatVersions.
//				
//			}

//		}

//		List<String> sortedKeys = new ArrayList<String>(insteadFormatVersions.keySet());
//		Collections.sort(sortedKeys);
//
//		return sortedKeys;

	}

	protected static Map<String, Module> getFormatVersions(Method mdMethod, IBmEmfIndexProvider bmEmfIndexProvider) {

		FormalParam mdParam = mdMethod.getFormalParams().get(0);
		String variableName = mdParam.getName();

		Map<String, Module> formatVersions = new HashMap<String, Module>();

		EList<Statement> mdStatements = mdMethod.getStatements();
		Iterator<Statement> itr = mdStatements.iterator();
		while (itr.hasNext()) {
			Statement mdStatement = itr.next();

			Invocation expression = (Invocation) ((SimpleStatement) mdStatement).getLeft();

			DynamicFeatureAccess methodAccess = (DynamicFeatureAccess) expression.getMethodAccess();

			StaticFeatureAccess source = (StaticFeatureAccess) methodAccess.getSource();

			if (!source.getName().equalsIgnoreCase(variableName)) {
				continue;
			}

			if (methodAccess.getName().equalsIgnoreCase("Вставить")) {
				EList<Expression> params = expression.getParams();
				String versionNumber = ((StringLiteral) params.get(0)).getLines().get(0);
				versionNumber = versionNumber.substring(1, versionNumber.length() - 1);
				String moduleName = ((StaticFeatureAccess) params.get(1)).getName();

				CommonModule mdFormatModule = getCommonModule(bmEmfIndexProvider,
						QualifiedName.create("CommonModule", moduleName));

				formatVersions.put(versionNumber, mdFormatModule.getModule());
			}

		}

		return formatVersions;
	}

}
