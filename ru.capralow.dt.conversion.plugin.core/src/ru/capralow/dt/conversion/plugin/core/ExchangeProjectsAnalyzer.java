package ru.capralow.dt.conversion.plugin.core;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.lib.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.bsl.common.IModuleExtensionService;
import com._1c.g5.v8.dt.bsl.model.BslContextDefMethod;
import com._1c.g5.v8.dt.bsl.model.Conditional;
import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.EmptyStatement;
import com._1c.g5.v8.dt.bsl.model.Expression;
import com._1c.g5.v8.dt.bsl.model.FeatureAccess;
import com._1c.g5.v8.dt.bsl.model.FeatureEntry;
import com._1c.g5.v8.dt.bsl.model.FormalParam;
import com._1c.g5.v8.dt.bsl.model.IfStatement;
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
import com._1c.g5.v8.dt.core.platform.IV8Project;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.mcore.Environmental;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects;
import ru.capralow.dt.conversion.plugin.core.ep.model.epFactory;

public class ExchangeProjectsAnalyzer {
	private static class ProjectFormatVersions {
		private static Boolean parseSubsystemExistsStatement(IfStatement ifStatement,
				IBmEmfIndexProvider bmEmfIndexProvider) {
			Boolean trueStatement = true;

			Conditional ifPart = ifStatement.getIfPart();
			Invocation predicate = (Invocation) ifPart.getPredicate();

			FeatureAccess methodAccess = predicate.getMethodAccess();
			DynamicFeatureAccess dynamicMethodAccess = (DynamicFeatureAccess) methodAccess;

			if (dynamicMethodAccess.getName().equals("ПодсистемаСуществует")) {
				StringLiteral subsystemLiteral = (StringLiteral) predicate.getParams().get(0);

				StringBuilder subsystemName = new StringBuilder();
				subsystemName.append("Подсистема");

				for (String stringPart : subsystemLiteral.getLines().get(0).replace("\"", "").split("[.]"))
					subsystemName.append(".").append(stringPart);

				Subsystem subsystem = (Subsystem) ConversionUtils.getConfigurationObject(subsystemName.toString(),
						bmEmfIndexProvider);

				trueStatement = subsystem != null;
			}

			return trueStatement;
		}

		private ExchangeProject exchangeProject;
		private IProject mainProject;
		private IV8ProjectManager projectManager;

		private IBmEmfIndexManager bmEmfIndexManager;

		public ProjectFormatVersions(ExchangeProject exchangeProject, IProject mainProject,
				IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {
			this.exchangeProject = exchangeProject;
			this.mainProject = mainProject;
			this.projectManager = projectManager;
			this.bmEmfIndexManager = bmEmfIndexManager;
		}

		private Map<String, CommonModule> getModuleFormatVersions(CommonModule mdCommonModule, Method mdMethod) {
			if (mdMethod.getFormalParams().isEmpty())
				throw new NullPointerException("Список параметров у метода пустой: " + mdMethod.getName());

			IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);

			FormalParam mdParam = mdMethod.getFormalParams().get(0);
			String variableName = mdParam.getName();

			Map<String, CommonModule> formatVersions = new HashMap<>();

			Map<String, String> modulesAliases = new HashMap<>();

			for (Statement statement : mdMethod.getStatements()) {
				if (statement instanceof IfStatement) {
					IfStatement ifStatement = (IfStatement) statement;

					Boolean trueStatement = parseSubsystemExistsStatement(ifStatement, bmEmfIndexProvider);

					if (!trueStatement)
						continue;

					Conditional ifPart = ifStatement.getIfPart();
					for (Statement ifPartStatement : ifPart.getStatements()) {
						parseModuleStatement(formatVersions, ifPartStatement, variableName, modulesAliases,
								mdCommonModule, mdMethod);

					}

				} else {
					parseModuleStatement(formatVersions, statement, variableName, modulesAliases, mdCommonModule,
							mdMethod);

				}

			}

			return formatVersions;
		}

		private Map<String, CommonModule> getProjectFormatVersions(CommonModule mdMainModule, Method mdMainMethod) {

			return parseMethod(mdMainModule, mdMainMethod);
		}

		private Map<String, CommonModule> parseMethod(CommonModule mdCommonModule, Method mdMethod) {

			EList<CommonModule> settingsModules = exchangeProject.getSettingsModules();

			settingsModules.add(mdCommonModule);

			Map<String, CommonModule> formatVersions = new HashMap<>();

			Map<String, CommonModule> beforeFormatVersions = new HashMap<>();
			Map<String, CommonModule> insteadFormatVersions = getModuleFormatVersions(mdCommonModule, mdMethod);
			Map<String, CommonModule> afterFormatVersions = new HashMap<>();

			if (projectManager.getProject(mdCommonModule) instanceof IConfigurationProject) {
				Collection<Module> extensionModules = moduleExtensionService
						.getExtensionModules(mdCommonModule.getModule());
				for (Module extensionModule : extensionModules) {
					IExtensionProject extensionProject = (IExtensionProject) projectManager.getProject(extensionModule);

					if (!extensionProject.getParentProject()
							.equals(projectManager.getProject(mdCommonModule).getProject())) {
						continue;
					}

					Map<Pragma, Method> extensionMethods = moduleExtensionService.getExtensionMethods(extensionModule,
							mdMethod.getName());

					for (Entry<Pragma, Method> extendedMethod : extensionMethods.entrySet()) {
						Map<String, CommonModule> extensionFormatVersions = parseMethod(
								(CommonModule) extensionModule.getOwner(), extendedMethod.getValue());

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
			}

			formatVersions.putAll(beforeFormatVersions);
			formatVersions.putAll(insteadFormatVersions);
			formatVersions.putAll(afterFormatVersions);

			return formatVersions;

		}

		private void parseModuleStatement(Map<String, CommonModule> formatVersions, Statement statement,
				String variableName, Map<String, String> modulesAliases, CommonModule commonModule, Method method) {
			if (statement instanceof EmptyStatement)
				return;

			EList<CommonModule> settingsModules = exchangeProject.getSettingsModules();

			SimpleStatement simpleStatement = (SimpleStatement) statement;
			Expression leftStatement = simpleStatement.getLeft();

			if (leftStatement instanceof StaticFeatureAccess) {
				String moduleAlias = ((StaticFeatureAccess) leftStatement).getName();

				String moduleName = ((StringLiteral) ((Invocation) simpleStatement.getRight()).getParams().get(0))
						.getLines().get(0).replace("\"", "");

				modulesAliases.put(moduleAlias, moduleName);

			} else {
				Invocation leftInvocation = (Invocation) leftStatement;

				FeatureAccess methodAccess = leftInvocation.getMethodAccess();

				if (methodAccess instanceof DynamicFeatureAccess) {
					DynamicFeatureAccess dynamicMethodAccess = (DynamicFeatureAccess) methodAccess;
					StaticFeatureAccess source = (StaticFeatureAccess) dynamicMethodAccess.getSource();

					if (source.getName().equalsIgnoreCase(variableName))
						parseStatementWithFormatString(formatVersions, leftInvocation, dynamicMethodAccess, method,
								modulesAliases);

					else
						parseStatementMethodInAnotherModule(formatVersions, settingsModules, dynamicMethodAccess,
								source);

				} else {
					StaticFeatureAccess staticMethodAccess = (StaticFeatureAccess) methodAccess;

					parseStatementMethodInSameModule(formatVersions, settingsModules, staticMethodAccess, commonModule);

				}
			}
		}

		private void parseStatementMethodInAnotherModule(Map<String, CommonModule> formatVersions,
				EList<CommonModule> settingsModules, DynamicFeatureAccess dynamicMethodAccess,
				StaticFeatureAccess source) {
			List<FeatureEntry> featureEntries = dynamicFeatureAccessComputer.resolveObject(dynamicMethodAccess,
					EcoreUtil2.getContainerOfType(dynamicMethodAccess, Environmental.class).environments());
			if (featureEntries.isEmpty())
				return;

			FeatureEntry featureEntry = featureEntries.get(0);
			EObject feature = featureEntry.getFeature();

			BslContextDefMethod bslMethod = (BslContextDefMethod) feature;
			EObject newObject = EcoreFactory.eINSTANCE.createEObject();
			((InternalEObject) newObject).eSetProxyURI((bslMethod).getSourceUri());
			Method mdSubMethod = (Method) EcoreUtil.resolve(newObject, dynamicMethodAccess);

			IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);
			CommonModule subCommonModule = (CommonModule) ConversionUtils
					.getConfigurationObject(MD_COMMONMODULE.concat(".").concat(source.getName()), bmEmfIndexProvider);
			if (subCommonModule == null) {
				bmEmfIndexProvider = bmEmfIndexManager
						.getEmfIndexProvider(projectManager.getProject(mdSubMethod).getProject());
				subCommonModule = (CommonModule) ConversionUtils.getConfigurationObject(
						MD_COMMONMODULE.concat(".").concat(source.getName()), bmEmfIndexProvider);
			}
			settingsModules.add(subCommonModule);

			Map<String, CommonModule> moduleFormatVersions = parseMethod(subCommonModule, mdSubMethod);

			formatVersions.putAll(moduleFormatVersions);
		}

		private void parseStatementMethodInSameModule(Map<String, CommonModule> formatVersions,
				EList<CommonModule> settingsModules, StaticFeatureAccess staticMethodAccess,
				CommonModule commonModule) {
			List<FeatureEntry> featureEntries = dynamicFeatureAccessComputer.resolveObject(staticMethodAccess,
					EcoreUtil2.getContainerOfType(staticMethodAccess, Environmental.class).environments());
			if (featureEntries.isEmpty())
				return;

			FeatureEntry featureEntry = featureEntries.get(0);
			EObject feature = featureEntry.getFeature();

			Method mdSubMethod = (Method) feature;

			Map<String, CommonModule> moduleFormatVersions = parseMethod(commonModule, mdSubMethod);

			settingsModules.add(commonModule);
			formatVersions.putAll(moduleFormatVersions);
		}

		private void parseStatementWithFormatString(Map<String, CommonModule> formatVersions, Invocation leftInvocation,
				DynamicFeatureAccess dynamicMethodAccess, Method method, Map<String, String> modulesAliases) {
			if (!dynamicMethodAccess.getName().equalsIgnoreCase("Вставить"))
				throw new NullPointerException(
						"В процедуре ПриПолученииДоступныхВерсийФормата ожидалось выражение ВерсииФормата.Вставить, но что-то пошло не так.");

			EList<Expression> params = leftInvocation.getParams();
			String versionNumber = ((StringLiteral) params.get(0)).getLines().get(0);
			versionNumber = versionNumber.substring(1, versionNumber.length() - 1);
			String moduleAlias = ((StaticFeatureAccess) params.get(1)).getName();

			String moduleName = modulesAliases.get(moduleAlias);
			if (moduleName == null)
				moduleName = moduleAlias;

			IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);
			CommonModule mdFormatModule = (CommonModule) ConversionUtils
					.getConfigurationObject(MD_COMMONMODULE.concat(".").concat(moduleName), bmEmfIndexProvider);
			if (mdFormatModule == null) {
				bmEmfIndexProvider = bmEmfIndexManager
						.getEmfIndexProvider(projectManager.getProject(method).getProject());
				mdFormatModule = (CommonModule) ConversionUtils
						.getConfigurationObject(MD_COMMONMODULE.concat(".").concat(moduleName), bmEmfIndexProvider);
			}

			formatVersions.put(versionNumber, mdFormatModule);

		}
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(ExchangeProjectsAnalyzer.class);

	private static IModuleExtensionService moduleExtensionService = com._1c.g5.v8.dt.bsl.common.IModuleExtensionServiceProvider.INSTANCE
			.getModuleExtensionService();

	private static DynamicFeatureAccessComputer dynamicFeatureAccessComputer = IResourceServiceProvider.Registry.INSTANCE
			.getResourceServiceProvider(URI.createURI("foo.bsl")).get(DynamicFeatureAccessComputer.class);

	private static final String MD_COMMONMODULE = "ОбщийМодуль";

	public static ExchangeData analyzePairs(ExchangeProjects exchangeProjects) {
		ArrayList<String> listProjects = new ArrayList<>();

		EList<ExchangeProject> epProjects = exchangeProjects.getProjects();
		for (ExchangeProject exchangeProject : epProjects) {
			listProjects.add(exchangeProject.getName());
		}

		List<Pair<String, String>> configurationPairs = getPairs(listProjects);

		ECollections.sort(epProjects, (ExchangeProject arg1, ExchangeProject arg2) -> {

			String algorithm1 = arg1.getName().replaceAll("_", "");
			String algorithm2 = arg2.getName().replaceAll("_", "");

			if (algorithm1.equalsIgnoreCase(algorithm2))
				return 0;

			return algorithm1.compareToIgnoreCase(algorithm2);
		});

		ExchangeData exchangeData = epFactory.eINSTANCE.createExchangeData();
		exchangeData.getProjects().addAll(epProjects);

		if (configurationPairs.isEmpty())
			return exchangeData;

		EList<EpExchangePair> epPairs = exchangeData.getPairs();
		epPairs.clear();

		for (Pair<String, String> configurationPair : configurationPairs) {
			EpExchangePair epExchangePair = epFactory.eINSTANCE.createEpExchangePair();

			epExchangePair.setConfigurationName1(configurationPair.getKey());
			epExchangePair.setConfigurationName2(configurationPair.getValue());

			ExchangeProject project1 = exchangeProjects.getProject(configurationPair.getKey());
			ExchangeProject project2 = exchangeProjects.getProject(configurationPair.getValue());

			EList<String> exchangePairVersions = epExchangePair.getVersions();

			Set<String> commonVersions = findCommons(project1.getVersions(), project2.getVersions());

			exchangePairVersions.addAll(commonVersions);

			if (exchangePairVersions.isEmpty())
				epExchangePair.setStatus(EpExchangePairStatus.NO_SHARED_FORMAT_VERSIONS);
			else
				epExchangePair.setStatus(EpExchangePairStatus.READY);

			epPairs.add(epExchangePair);
		}

		ECollections.sort(epPairs, (EpExchangePair arg1, EpExchangePair arg2) -> {
			String algorithm1 = arg1.getConfigurationName1().replaceAll("_", "");
			String algorithm2 = arg2.getConfigurationName1().replaceAll("_", "");

			if (algorithm1.equalsIgnoreCase(algorithm2))
				return 0;

			return algorithm1.compareToIgnoreCase(algorithm2);
		});

		return exchangeData;
	}

	public static ExchangeProject analyzeProject(IConfigurationProject configurationProject,
			IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {
		ExchangeProject exchangeProject = epFactory.eINSTANCE.createExchangeProject();

		IProject mainProject = configurationProject.getProject();

		exchangeProject.setName(mainProject.getName());

		EList<CommonModule> settingsModules = exchangeProject.getSettingsModules();
		settingsModules.clear();
		EList<EpFormatVersion> epFormatVersions = exchangeProject.getFormatVersions();
		epFormatVersions.clear();

		Configuration mdConfiguration = configurationProject.getConfiguration();
		if (mdConfiguration == null) {
			exchangeProject.setStatus(EpProjectStatus.NO_CONFIGURATION);
			return exchangeProject;
		}

		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);
		Subsystem mdSubsystem = (Subsystem) ConversionUtils
				.getConfigurationObject("Подсистема.СтандартныеПодсистемы.ОбменДанными", bmEmfIndexProvider);
		if (mdSubsystem == null) {
			exchangeProject.setStatus(EpProjectStatus.NO_SUBSYSTEM);
			return exchangeProject;
		}

		String sslVersion = getSSLVersion(bmEmfIndexProvider);
		if (sslVersion.isEmpty()) {
			exchangeProject.setStatus(EpProjectStatus.NO_SSL_VERSION);
			return exchangeProject;
		}

		if (compareVersions(sslVersion, "2.4.1") == -1)
			exchangeProject.setStoreVersion("1");
		else
			exchangeProject.setStoreVersion("2");

		CommonModule mdModule = (CommonModule) ConversionUtils.getConfigurationObject(
				MD_COMMONMODULE.concat(".").concat("ОбменДаннымиПереопределяемый"), bmEmfIndexProvider);
		if (mdModule == null) {
			exchangeProject.setStatus(EpProjectStatus.NO_COMMON_MODULE);
			return exchangeProject;
		}

		Method mdMethod = getMethod(mdModule.getModule(), "ПриПолученииДоступныхВерсийФормата");
		if (mdMethod == null) {
			exchangeProject.setStatus(EpProjectStatus.NO_METHOD);
			return exchangeProject;
		}

		ProjectFormatVersions projectFormatVersions = new ProjectFormatVersions(exchangeProject, mainProject,
				projectManager, bmEmfIndexManager);

		Map<String, CommonModule> formatVersions = projectFormatVersions.getProjectFormatVersions(mdModule, mdMethod);
		if (formatVersions.size() == 0) {
			exchangeProject.setStatus(EpProjectStatus.EMPTY_METHOD);
			return exchangeProject;
		}

		addFormatVersion(formatVersions, exchangeProject, mainProject, projectManager);

		exchangeProject.setStatus(EpProjectStatus.READY);

		return exchangeProject;
	}

	public static URI getResourceURIforPlugin(IProject project, AbstractUIPlugin plugin) {
		return ConversionUtils.getResourceURIforPlugin(project.getName(), "exchangeProject", plugin);
	}

	public static ExchangeProjects loadPluginResources(IV8ProjectManager projectManager, AbstractUIPlugin plugin) {
		ExchangeProjects exchangeProjects = epFactory.eINSTANCE.createExchangeProjects();

		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			IV8Project configurationProject = projectManager.getProject(project);
			if (!(configurationProject instanceof IConfigurationProject))
				continue;

			URI xmiURI = getResourceURIforPlugin(project, plugin);

			ExchangeProject exchangeProject = loadResource(xmiURI,
					((IConfigurationProject) configurationProject).getConfiguration());
			exchangeProjects.getProjects().add(exchangeProject);
		}

		return exchangeProjects;
	}

	public static ExchangeProject loadResource(URI xmiUri, Configuration configuration) {
		File file = new File(xmiUri.toFileString());
		if (!file.exists())
			return null;

		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			// TODO: Сделать пересборку вторичных данных если файла нет
			final Map<Object, Object> loadOptions = xmiResource.getDefaultLoadOptions();
			xmiResource.load(loadOptions);
			ExchangeProject exchangeProject = (ExchangeProject) xmiResource.getContents().get(0);

			for (EpFormatVersion formatVersion : exchangeProject.getFormatVersions()) {
				formatVersion.setModule((CommonModule) EcoreUtil.resolve(formatVersion.getModule(), configuration));
				formatVersion
						.setXdtoPackage((XDTOPackage) EcoreUtil.resolve(formatVersion.getXdtoPackage(), configuration));
			}

			EList<CommonModule> oldList = exchangeProject.getSettingsModules();
			EList<CommonModule> newList = new BasicEList<>();
			for (CommonModule oldItem : oldList)
				newList.add((CommonModule) EcoreUtil.resolve(oldItem, configuration));
			oldList.clear();
			oldList.addAll(newList);

			return exchangeProject;

		} catch (IOException e) {
			String msg = "Не удалось загрузить вторичные данные для ExchangeProject. Перезапустите сборку проекта.";
			LOGGER.error(msg, e);

		}

		return null;
	}

	public static void saveResource(ExchangeProject exchangeProject, URI xmiUri) {
		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			xmiResource.getContents().add(exchangeProject);
			final Map<Object, Object> saveOptions = xmiResource.getDefaultSaveOptions();
			saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
			xmiResource.save(saveOptions);

		} catch (IOException e) {
			String msg = "Не удалось сохранить вторичные данные для ExchangeProject. Перезапустите сборку проекта.";
			LOGGER.error(msg, e);

		}
	}

	private static void addFormatVersion(Map<String, CommonModule> formatVersions, ExchangeProject exchangeProject,
			IProject mainProject, IV8ProjectManager projectManager) {
		EList<EpFormatVersion> epFormatVersions = exchangeProject.getFormatVersions();

		List<String> sortedVersions = new ArrayList<>(formatVersions.keySet());
		Collections.sort(sortedVersions);
		for (String version : sortedVersions) {
			XDTOPackage xdtoPackage = findXdtoPackage(version, mainProject, projectManager);

			if (xdtoPackage == null)
				continue;

			EpFormatVersion epFormatVersion = epFactory.eINSTANCE.createEpFormatVersion();

			CommonModule formatModule = formatVersions.get(version);

			epFormatVersion.setVersion(version);
			if (projectManager.getProject(formatModule) instanceof IExtensionProject) {
				IExtensionProject formatProject = (IExtensionProject) projectManager.getProject(formatModule);

				epFormatVersion.setExtensionName(formatProject.getConfiguration().getName());
			}
			epFormatVersion.setModuleName(formatModule.getName());

			epFormatVersion.setModule(formatModule);
			epFormatVersion.setXdtoPackage(xdtoPackage);

			epFormatVersions.add(epFormatVersion);
		}

	}

	private static int compareVersions(String version1, String version2) {

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

	private static Set<String> findCommons(EList<String> a, EList<String> b) {
		Set<String> set = new LinkedHashSet<>(a);
		set.retainAll(b);

		return set;
	}

	private static XDTOPackage findXdtoPackage(String version, IProject mainProject, IV8ProjectManager projectManager) {
		String namespace = "http://v8.1c.ru/edi/edi_stnd/EnterpriseData/" + version;

		XDTOPackage xdtoPackage = getXDTOPackageByNamespace(mainProject, namespace, projectManager);
		if (xdtoPackage == null) {
			for (IExtensionProject extensionProject : projectManager.getProjects(IExtensionProject.class)) {
				if (!(extensionProject.getParentProject().equals(mainProject)))
					continue;

				xdtoPackage = getXDTOPackageByNamespace(extensionProject.getProject(), namespace, projectManager);
				if (xdtoPackage != null)
					return xdtoPackage;
			}
		}

		if (xdtoPackage == null) {
			String msg = String.format("Не найден Пакет XDTO: \"%1$s\"", namespace);
			LOGGER.warn(msg);

			return null;
		}

		return xdtoPackage;
	}

	private static Method getMethod(Module mdModule, String methodName) {
		for (Method mdMethod : mdModule.allMethods()) {
			if (mdMethod.getName().equals(methodName))
				return mdMethod;
		}

		return null;
	}

	private static <T> List<Pair<T, T>> getPairs(List<T> list) {
		List<Pair<T, T>> pairs = new LinkedList<>();

		for (int i = 0; i < list.size() - 1; i++)
			for (int j = i + 1; j < list.size(); j++)
				pairs.add(new Pair<>(list.get(i), list.get(j)));

		return pairs;
	}

	private static String getSSLVersion(IBmEmfIndexProvider bmEmfIndexProvider) {
		String version = "";

		CommonModule mdCommonModule = (CommonModule) ConversionUtils.getConfigurationObject(
				MD_COMMONMODULE.concat(".").concat("ОбновлениеИнформационнойБазыБСП"), bmEmfIndexProvider);
		if (mdCommonModule == null)
			return version;

		Method mdMethod = getMethod(mdCommonModule.getModule(), "ПриДобавленииПодсистемы");
		if (mdMethod == null)
			return version;

		for (Statement mdStatement : mdMethod.getStatements()) {
			DynamicFeatureAccess methodAccess = (DynamicFeatureAccess) ((SimpleStatement) mdStatement).getLeft();

			if (methodAccess.getName().equalsIgnoreCase("Версия")) {
				version = ((StringLiteral) ((SimpleStatement) mdStatement).getRight()).getLines().get(0);
				version = version.substring(1, version.length() - 1);
				break;
			}
		}

		return version;
	}

	private static XDTOPackage getXDTOPackageByNamespace(IProject project, String namespace,
			IV8ProjectManager projectManager) {
		IV8Project v8Project = projectManager.getProject(project);

		EList<XDTOPackage> xdtoPackages;
		if (v8Project instanceof IConfigurationProject)
			xdtoPackages = ((IConfigurationProject) v8Project).getConfiguration().getXDTOPackages();
		else
			xdtoPackages = ((IExtensionProject) v8Project).getConfiguration().getXDTOPackages();

		for (XDTOPackage xdtoPackage : xdtoPackages) {
			if (xdtoPackage.getNamespace().equals(namespace))
				return xdtoPackage;
		}

		return null;
	}

	private ExchangeProjectsAnalyzer() {
		throw new IllegalStateException("Вспомогательный класс");
	}

}
