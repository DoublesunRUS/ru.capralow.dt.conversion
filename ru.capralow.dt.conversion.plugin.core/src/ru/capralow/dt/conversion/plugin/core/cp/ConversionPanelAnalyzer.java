package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
import com._1c.g5.v8.dt.bsl.model.Pragma;
import com._1c.g5.v8.dt.bsl.model.SimpleStatement;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.bsl.model.StaticFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.StringLiteral;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IExtensionProject;
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

	IV8ProjectManager projectManager;
	IModelObjectAdopter modelObjectAdopter;
	IBmEmfIndexManager bmEmfIndexManager;
	IModuleExtensionService moduleExtensionService;

	public ConversionPanelAnalyzer(IV8ProjectManager projectManager, IModelObjectAdopter modelObjectAdopter,
			IBmEmfIndexManager bmEmfIndexManager, IModuleExtensionService moduleExtensionService) {

		this.projectManager = projectManager;
		this.modelObjectAdopter = modelObjectAdopter;
		this.bmEmfIndexManager = bmEmfIndexManager;
		this.moduleExtensionService = moduleExtensionService;
	}

	public ConversionPanelImpl Analyze() {

		Collection<IConfigurationProject> prConfigurations = projectManager.getProjects(IConfigurationProject.class);

		ConversionPanelImpl conversionPanel = new ConversionPanelImpl();
		Collection<cpConfiguration> cpConfigurations = conversionPanel.getConfigurations();

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

			Subsystem mdSubsystem = getSubsystem(project,
					QualifiedName.create("Subsystem", "СтандартныеПодсистемы", "Subsystem", "ОбменДанными"));
			if (mdSubsystem == null) {
				cpConfiguration.setStatus(WorkspaceStatus.NO_SUBSYSTEM);
				continue;
			}

			CommonModule mdModule = getCommonModule(project,
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

			Map<String, Module> availableFormatVersions = getAvailableFormatVersions(project, mdModule, mdMethod);
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

				Module formatModule = availableFormatVersions.get(version);

				if (projectManager.getProject(formatModule) instanceof IExtensionProject) {
					IExtensionProject formatProject = (IExtensionProject) projectManager.getProject(formatModule);

					cpFormatVersion.setConfigurationName(formatProject.getConfiguration().getName());
				}
				cpFormatVersion.setVersion(version);
				cpFormatVersion.setModule(formatModule);

				cpAvailableFormatVersions.add(cpFormatVersion);
			}

			cpConfiguration.setStatus(WorkspaceStatus.READY);
		}

		return conversionPanel;

	}

	protected Subsystem getSubsystem(IProject project, QualifiedName subsystemName) {
		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);

		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider
				.getEObjectIndexByType(MdClassPackage.Literals.SUBSYSTEM, subsystemName, true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext()) {
			return (Subsystem) objectItr.next().getEObjectOrProxy();
		}

		return null;
	}

	protected CommonModule getCommonModule(IProject project, QualifiedName moduleName) {
		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);

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

	protected Map<String, Module> getAvailableFormatVersions(IProject mainProject, CommonModule mdModule,
			Method mdMethod) {

		Map<String, Module> formatVersions = parseMethod(mainProject, mdModule.getModule(), mdMethod);

		return formatVersions;
	}

	protected Map<String, Module> parseMethod(IProject mainProject, Module mdModule, Method mdMethod) {

		Map<String, Module> formatVersions = new HashMap<String, Module>();

		Map<String, Module> beforeFormatVersions = new HashMap<String, Module>();
		Map<String, Module> insteadFormatVersions = getFormatVersions(mainProject, mdMethod);
		Map<String, Module> afterFormatVersions = new HashMap<String, Module>();

		Collection<Module> extensionModules = moduleExtensionService.getExtensionModules(mdModule);
		Iterator<Module> itr = extensionModules.iterator();
		while (itr.hasNext()) {
			Module mdExtensionModule = itr.next();

			IExtensionProject extensionProject = (IExtensionProject) projectManager.getProject(mdExtensionModule);
			
			if (!extensionProject.getParentProject().equals(projectManager.getProject(mdModule).getProject())) {
				continue;
			}
			
			Map<Pragma, Method> extensionMethods = moduleExtensionService.getExtensionMethods(mdExtensionModule,
					mdMethod.getName());

			Iterator<Entry<Pragma, Method>> itrExtensions = extensionMethods.entrySet().iterator();
			while (itrExtensions.hasNext()) {
				Entry<Pragma, Method> extendedMethod = itrExtensions.next();

				Map<String, Module> extensionFormatVersions = parseMethod(mainProject, mdExtensionModule,
						extendedMethod.getValue());

				if (extendedMethod.getKey().getSymbol().equalsIgnoreCase("До")) {
					beforeFormatVersions.putAll(extensionFormatVersions);
				} else if (extendedMethod.getKey().getSymbol().equalsIgnoreCase("Вместо")) {
					insteadFormatVersions.clear();
					insteadFormatVersions.putAll(extensionFormatVersions);
				} else if (extendedMethod.getKey().getSymbol().equalsIgnoreCase("После")) {
					afterFormatVersions.putAll(extensionFormatVersions);
				}

			}

		}

		formatVersions.putAll(beforeFormatVersions);
		formatVersions.putAll(insteadFormatVersions);
		formatVersions.putAll(afterFormatVersions);

		return formatVersions;

	}

	protected Map<String, Module> getFormatVersions(IProject mainProject, Method mdMethod) {

		if (mdMethod.getFormalParams().size() == 0) {
			throw new RuntimeException("Список параметров у метода пустой: " + mdMethod.getName());
		}

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

			if (source.getName().equalsIgnoreCase(variableName)) {
				if (methodAccess.getName().equalsIgnoreCase("Вставить")) {
					EList<Expression> params = expression.getParams();
					String versionNumber = ((StringLiteral) params.get(0)).getLines().get(0);
					versionNumber = versionNumber.substring(1, versionNumber.length() - 1);
					String moduleName = ((StaticFeatureAccess) params.get(1)).getName();

					QualifiedName qnModuleName = QualifiedName.create("CommonModule", moduleName);

					CommonModule mdFormatModule = getCommonModule(projectManager.getProject(mdMethod).getProject(),
							qnModuleName);
					if (mdFormatModule == null) {
						mdFormatModule = getCommonModule(mainProject, qnModuleName);
					}

					formatVersions.put(versionNumber, mdFormatModule.getModule());
				}
			} else {
				QualifiedName qnModuleName = QualifiedName.create("CommonModule", source.getName());

				IProject extensionProject = projectManager.getProject(mdMethod).getProject();

				Method mdSubMethod = null;

				// Ищем модуль и метод в текущем расширении
				CommonModule mdSubModule = getCommonModule(extensionProject, qnModuleName);
				if (mdSubModule != null) {
					mdSubMethod = getMethod(mdSubModule.getModule(), methodAccess.getName());
				}
				// Если не нашли модуль или метод, поищем в основной конфигурации
				if (mdSubMethod == null) {
					mdSubModule = getCommonModule(mainProject, qnModuleName);
					if (mdSubModule == null) {
						throw new RuntimeException(
								"Не удалось найти общий модуль: " + mainProject.getName() + "." + source.getName());
					}
					mdSubMethod = getMethod(mdSubModule.getModule(), methodAccess.getName());
					if (mdSubMethod == null) {
						throw new RuntimeException("Не удалось найти метод общего модуля: " + mainProject.getName()
								+ "." + source.getName() + "." + methodAccess.getName());
					}
				}

				Map<String, Module> moduleFormatVersions = parseMethod(mainProject, mdSubModule.getModule(),
						mdSubMethod);

				formatVersions.putAll(moduleFormatVersions);

			}

		}

		return formatVersions;
	}

}
