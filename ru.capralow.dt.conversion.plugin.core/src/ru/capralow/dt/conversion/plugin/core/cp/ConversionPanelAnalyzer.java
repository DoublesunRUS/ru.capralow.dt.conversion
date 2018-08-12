package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
<<<<<<< HEAD
import java.util.Set;
=======
>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Pair;

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
import com._1c.g5.v8.dt.bsl.resource.DynamicFeatureAccessComputer;
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
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpExchangePairImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl;

public class ConversionPanelAnalyzer {

	IV8ProjectManager projectManager;
	IModelObjectAdopter modelObjectAdopter;
	IBmEmfIndexManager bmEmfIndexManager;
	IModuleExtensionService moduleExtensionService;
<<<<<<< HEAD
	DynamicFeatureAccessComputer dynamicFeatureAccessComputer;

	public ConversionPanelAnalyzer(IV8ProjectManager projectManager, IModelObjectAdopter modelObjectAdopter,
			IBmEmfIndexManager bmEmfIndexManager, IModuleExtensionService moduleExtensionService,
			DynamicFeatureAccessComputer dynamicFeatureAccessComputer) {

		this.projectManager = projectManager;
		this.modelObjectAdopter = modelObjectAdopter;
		this.bmEmfIndexManager = bmEmfIndexManager;
		this.moduleExtensionService = moduleExtensionService;
		this.dynamicFeatureAccessComputer = dynamicFeatureAccessComputer;
	}

	public ConversionPanel Analyze() {
=======

	public ConversionPanelAnalyzer(IV8ProjectManager projectManager, IModelObjectAdopter modelObjectAdopter,
			IBmEmfIndexManager bmEmfIndexManager, IModuleExtensionService moduleExtensionService) {
>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git

		this.projectManager = projectManager;
		this.modelObjectAdopter = modelObjectAdopter;
		this.bmEmfIndexManager = bmEmfIndexManager;
		this.moduleExtensionService = moduleExtensionService;
	}

	public ConversionPanelImpl Analyze() {

		Collection<IConfigurationProject> prConfigurations = projectManager.getProjects(IConfigurationProject.class);

		ConversionPanel conversionPanel = new ConversionPanelImpl();
		Collection<cpConfiguration> cpConfigurations = conversionPanel.getConfigurations();

		ArrayList<String> configurationsList = new ArrayList<String>();

		Iterator<IConfigurationProject> itr = prConfigurations.iterator();
		while (itr.hasNext()) {
			IConfigurationProject prConfiguration = itr.next();
			IProject project = prConfiguration.getProject();

			configurationsList.add(project.getName());

			cpConfiguration cpConfiguration = new cpConfigurationImpl();
			cpConfigurations.add(cpConfiguration);

			cpConfiguration.setConfigurationObject(project);
			cpConfiguration.setConfigurationName(project.getName());

			Configuration mdConfiguration = prConfiguration.getConfiguration();
			if (mdConfiguration == null) {
				cpConfiguration.setStatus(ConfigurationStatus.NO_CONFIGURATION);
				continue;
			}

			Subsystem mdSubsystem = getSubsystem(project,
					QualifiedName.create("Subsystem", "СтандартныеПодсистемы", "Subsystem", "ОбменДанными"));
			if (mdSubsystem == null) {
				cpConfiguration.setStatus(ConfigurationStatus.NO_SUBSYSTEM);
				continue;
			}

<<<<<<< HEAD
			String sslVersion = getSSLVersion(project);
			if (sslVersion.isEmpty()) {
				cpConfiguration.setStatus(ConfigurationStatus.NO_SSL_VERSION);
				continue;
			}

			if (compareVersions(sslVersion, "2.4.1") == -1) {
				cpConfiguration.setStoreVersion("1");
			} else {
				cpConfiguration.setStoreVersion("2");
			}

=======
>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git
			CommonModule mdModule = getCommonModule(project,
					QualifiedName.create("CommonModule", "ОбменДаннымиПереопределяемый"));
			if (mdModule == null) {
				cpConfiguration.setStatus(ConfigurationStatus.NO_COMMON_MODULE);
				continue;
			}

			Method mdMethod = getMethod(mdModule.getModule(), "ПриПолученииДоступныхВерсийФормата");
			if (mdMethod == null) {
				cpConfiguration.setStatus(ConfigurationStatus.NO_METHOD);
				continue;
			}

			Map<String, Module> availableFormatVersions = getAvailableFormatVersions(project, mdModule, mdMethod);
			if (availableFormatVersions.size() == 0) {
				cpConfiguration.setStatus(ConfigurationStatus.EMPTY_METHOD);
				continue;
			}

			EList<cpFormatVersion> cpAvailableFormatVersions = cpConfiguration.getAvailableFormatVersions();
			List<String> sortedVersions = new ArrayList<String>(availableFormatVersions.keySet());
			Collections.sort(sortedVersions);
			Iterator<String> itrVersions = sortedVersions.iterator();
			while (itrVersions.hasNext()) {
				String version = itrVersions.next();

				cpFormatVersion cpFormatVersion = new cpFormatVersionImpl();

				Module formatModule = availableFormatVersions.get(version);

				if (projectManager.getProject(formatModule) instanceof IExtensionProject) {
					IExtensionProject formatProject = (IExtensionProject) projectManager.getProject(formatModule);

					cpFormatVersion.setConfigurationName(formatProject.getConfiguration().getName());
				}
				cpFormatVersion.setVersion(version);
				cpFormatVersion.setModule(formatModule);

				cpAvailableFormatVersions.add(cpFormatVersion);
			}

			cpConfiguration.setStatus(ConfigurationStatus.READY);
		}

		Collections.sort(configurationsList);
		List<Pair<String, String>> configurationPairs = getPairs(configurationsList);

		if (configurationPairs.size() != 0) {
			EList<cpExchangePair> exchangePairs = conversionPanel.getExchangePairs();

			Iterator<Pair<String, String>> itrList = configurationPairs.iterator();
			while (itrList.hasNext()) {
				Pair<String, String> configurationPair = itrList.next();

				cpExchangePair cpExchangePair = new cpExchangePairImpl();

				cpExchangePair.setConfigurationName1(configurationPair.getKey());
				cpExchangePair.setConfigurationName2(configurationPair.getValue());

				cpConfiguration configuration1 = conversionPanel.getConfiguration(configurationPair.getKey());
				cpConfiguration configuration2 = conversionPanel.getConfiguration(configurationPair.getValue());

				EList<String> exchangePairVersions = cpExchangePair.getVersions();

				Set<String> commonVersions = findCommons(configuration1.getVersions(), configuration2.getVersions());

				exchangePairVersions.addAll(commonVersions);

				if (exchangePairVersions.size() == 0) {
					cpExchangePair.setStatus(ExchangePairStatus.NO_SHARED_FORMAT_VERSIONS);
				} else {

					cpExchangePair.setStatus(ExchangePairStatus.READY);
				}
				exchangePairs.add(cpExchangePair);
			}
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
<<<<<<< HEAD

			if (!extensionProject.getParentProject().equals(projectManager.getProject(mdModule).getProject())) {
				continue;
			}

=======
			
			if (!extensionProject.getParentProject().equals(projectManager.getProject(mdModule).getProject())) {
				continue;
			}
			
>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git
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
<<<<<<< HEAD
//				List<FeatureEntry> featureEntry = dynamicFeatureAccessComputer.getLastObject(methodAccess, source.getFeatureEntries().get(0).getEnvironments());

=======
>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git
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

	protected String getSSLVersion(IProject project) {
		String version = "";

		CommonModule mdCommonModule = getCommonModule(project,
				QualifiedName.create("CommonModule", "ОбновлениеИнформационнойБазыБСП"));
		if (mdCommonModule == null)
			return version;

		Method mdMethod = getMethod(mdCommonModule.getModule(), "ПриДобавленииПодсистемы");
		if (mdMethod == null)
			return version;
		EList<Statement> mdStatements = mdMethod.getStatements();
		Iterator<Statement> itr = mdStatements.iterator();
		while (itr.hasNext()) {
			Statement mdStatement = itr.next();

			DynamicFeatureAccess methodAccess = (DynamicFeatureAccess) ((SimpleStatement) mdStatement).getLeft();

			if (methodAccess.getName().equalsIgnoreCase("Версия")) {
				version = ((StringLiteral) ((SimpleStatement) mdStatement).getRight()).getLines().get(0);
				version = version.substring(1, version.length() - 1);
				break;
			}
		}

		return version;
	}

	protected static <T> List<Pair<T, T>> getPairs(List<T> list) {
		List<Pair<T, T>> pairs = new LinkedList<>();

		for (int i = 0; i < list.size() - 1; i++)
			for (int j = i + 1; j < list.size(); j++)
				pairs.add(new Pair<>(list.get(i), list.get(j)));

		return pairs;
	}

	protected static Set<String> findCommons(EList<String> a, EList<String> b) {
		Set<String> set = new LinkedHashSet<String>(a);
		set.retainAll(b);

		return set;
	}

	public static int compareVersions(String version1, String version2) {

		String[] levels1 = version1.split("\\.");
		String[] levels2 = version2.split("\\.");

		int length = Math.max(levels1.length, levels2.length);
		for (int i = 0; i < length; i++) {
			Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
			Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
			int compare = v1.compareTo(v2);
			if (compare != 0) {
				return compare;
			}
		}

		return 0;
	}
}
