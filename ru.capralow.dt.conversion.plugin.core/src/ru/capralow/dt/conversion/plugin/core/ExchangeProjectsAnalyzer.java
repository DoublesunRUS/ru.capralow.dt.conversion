package ru.capralow.dt.conversion.plugin.core;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
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
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

import ru.capralow.dt.conversion.plugin.core.ep.EpExchangePair;
import ru.capralow.dt.conversion.plugin.core.ep.EpExchangePairStatus;
import ru.capralow.dt.conversion.plugin.core.ep.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.EpProjectStatus;
import ru.capralow.dt.conversion.plugin.core.ep.ExchangeData;
import ru.capralow.dt.conversion.plugin.core.ep.ExchangeProject;
import ru.capralow.dt.conversion.plugin.core.ep.ExchangeProjects;
import ru.capralow.dt.conversion.plugin.core.ep.impl.EpExchangePairImpl;
import ru.capralow.dt.conversion.plugin.core.ep.impl.EpFormatVersionImpl;
import ru.capralow.dt.conversion.plugin.core.ep.impl.ExchangeDataImpl;
import ru.capralow.dt.conversion.plugin.core.ep.impl.ExchangeProjectImpl;
import ru.capralow.dt.conversion.plugin.core.ep.impl.ExchangeProjectsImpl;

public class ExchangeProjectsAnalyzer {
	private static final String PLUGIN_ID = "ru.capralow.dt.conversion.plugin.ui";
	private static ILog LOG = Platform.getLog(Platform.getBundle(PLUGIN_ID));

	private IV8ProjectManager projectManager;
	private IBmEmfIndexManager bmEmfIndexManager;
	private AbstractUIPlugin plugin;

	private IModuleExtensionService moduleExtensionService;
	private DynamicFeatureAccessComputer DynamicFeatureAccessComputer;

	private ExchangeProjects exchangeProjects;

	public ExchangeProjectsAnalyzer(IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager,
			AbstractUIPlugin plugin) {

		IResourceServiceProvider provider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		this.projectManager = projectManager;
		this.bmEmfIndexManager = bmEmfIndexManager;
		this.plugin = plugin;

		this.moduleExtensionService = com._1c.g5.v8.dt.bsl.common.IModuleExtensionServiceProvider.INSTANCE
				.getModuleExtensionService();
		this.DynamicFeatureAccessComputer = provider.get(DynamicFeatureAccessComputer.class);

		this.exchangeProjects = new ExchangeProjectsImpl();
	}

	public ExchangeProject getExchangeProject(IProject project) {
		return exchangeProjects.getProject(project.getName());
	}

	public ExchangeProjects getExchangeProjects() {
		return exchangeProjects;
	}

	public ExchangeProject loadResource(IProject project) {
		URI uri = URI.createPlatformResourceURI(project.getName() + File.separator + "exchangeProject.xmi", false);

		try {
			File file = ConversionUtils.getResourceFile(uri, plugin);

			XMIResource xmiResource = new XMIResourceImpl(URI.createFileURI(file.getPath()));

			if (!file.exists())
				return null;

			// FIXME: Сделать чтобы ресолвились ссылки
			final Map<Object, Object> loadOptions = xmiResource.getDefaultLoadOptions();
			xmiResource.load(loadOptions);
			EcoreUtil.resolveAll(xmiResource);
			ExchangeProject exchangeProject = (ExchangeProject) xmiResource.getContents().get(0);

			ExchangeProject oldProject = exchangeProjects.getProject(project.getName());
			if (oldProject != null)
				exchangeProjects.getProjects().remove(oldProject);
			exchangeProjects.getProjects().add(exchangeProject);

			return exchangeProject;

		} catch (IOException e) {
			e.printStackTrace();

		}

		return null;
	}

	public void saveResource(ExchangeProject exchangeProject, IProject project) {
		URI uri = URI.createPlatformResourceURI(project.getName() + File.separator + "exchangeProject.xmi", false);

		File file;
		try {
			file = ConversionUtils.getResourceFile(uri, plugin);

			XMIResource xmiResource = new XMIResourceImpl(URI.createFileURI(file.getPath()));

			xmiResource.getContents().add(exchangeProject);
			final Map<Object, Object> saveOptions = xmiResource.getDefaultSaveOptions();
			saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
			xmiResource.save(saveOptions);

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public ExchangeProjects loadResources() {
		exchangeProjects.getProjects().clear();

		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (!(projectManager.getProject(project) instanceof IConfigurationProject))
				continue;

			loadResource(project);
		}

		return exchangeProjects;
	}

	public ExchangeData analyzePairs() {
		ArrayList<String> listProjects = new ArrayList<String>();

		EList<ExchangeProject> epProjects = exchangeProjects.getProjects();
		for (ExchangeProject exchangeProject : epProjects) {
			listProjects.add(exchangeProject.getName());
		}

		List<Pair<String, String>> configurationPairs = getPairs(listProjects);

		ECollections.sort(epProjects, new Comparator<ExchangeProject>() {
			@Override
			public int compare(ExchangeProject arg1, ExchangeProject arg2) {
				String algorithm1 = arg1.getName().replaceAll("_", "");
				String algorithm2 = arg2.getName().replaceAll("_", "");

				if (algorithm1.equalsIgnoreCase(algorithm2))
					return 0;

				return algorithm1.compareToIgnoreCase(algorithm2);
			}

		});

		ExchangeData exchangeData = new ExchangeDataImpl();
		exchangeData.getProjects().addAll(epProjects);

		if (configurationPairs.size() != 0) {
			EList<EpExchangePair> epPairs = exchangeData.getPairs();
			epPairs.clear();

			for (Pair<String, String> configurationPair : configurationPairs) {
				EpExchangePair epExchangePair = new EpExchangePairImpl();

				epExchangePair.setConfigurationName1(configurationPair.getKey());
				epExchangePair.setConfigurationName2(configurationPair.getValue());

				ExchangeProject project1 = exchangeProjects.getProject(configurationPair.getKey());
				ExchangeProject project2 = exchangeProjects.getProject(configurationPair.getValue());

				EList<String> exchangePairVersions = epExchangePair.getVersions();

				Set<String> commonVersions = findCommons(project1.getVersions(), project2.getVersions());

				exchangePairVersions.addAll(commonVersions);

				if (exchangePairVersions.size() == 0) {
					epExchangePair.setStatus(EpExchangePairStatus.NO_SHARED_FORMAT_VERSIONS);
				} else {

					epExchangePair.setStatus(EpExchangePairStatus.READY);
				}
				epPairs.add(epExchangePair);
			}

			ECollections.sort(epPairs, new Comparator<EpExchangePair>() {
				@Override
				public int compare(EpExchangePair arg1, EpExchangePair arg2) {
					String algorithm1 = arg1.getConfigurationName1().replaceAll("_", "");
					String algorithm2 = arg2.getConfigurationName1().replaceAll("_", "");

					if (algorithm1.equalsIgnoreCase(algorithm2))
						return 0;

					return algorithm1.compareToIgnoreCase(algorithm2);
				}

			});
		}

		return exchangeData;
	}

	public ExchangeProject analyzeProject(IProject project) {
		if (!(projectManager.getProject(project) instanceof IConfigurationProject))
			return null;

		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);

		ExchangeProject exchangeProject = exchangeProjects.getProject(project.getName());

		if (exchangeProject == null) {
			EList<ExchangeProject> ExchangeProjects = exchangeProjects.getProjects();

			exchangeProject = new ExchangeProjectImpl();
			ExchangeProjects.add(exchangeProject);

			exchangeProject.setName(project.getName());
		}

		EList<MdObject> settingsModules = exchangeProject.getSettingsModules();
		settingsModules.clear();
		EList<EpFormatVersion> epFormatVersions = exchangeProject.getFormatVersions();
		epFormatVersions.clear();

		Configuration mdConfiguration = ((IConfigurationProject) projectManager.getProject(project)).getConfiguration();
		if (mdConfiguration == null) {
			exchangeProject.setStatus(EpProjectStatus.NO_CONFIGURATION);
			return exchangeProject;
		}

		Subsystem mdSubsystem = (Subsystem) ConversionUtils
				.getConfigurationObject("Подсистема.СтандартныеПодсистемы.ОбменДанными", bmEmfIndexProvider);
		if (mdSubsystem == null) {
			exchangeProject.setStatus(EpProjectStatus.NO_SUBSYSTEM);
			return exchangeProject;
		}

		String sslVersion = getSSLVersion(project);
		if (sslVersion.isEmpty()) {
			exchangeProject.setStatus(EpProjectStatus.NO_SSL_VERSION);
			return exchangeProject;
		}

		if (compareVersions(sslVersion, "2.4.1") == -1)
			exchangeProject.setStoreVersion("1");
		else
			exchangeProject.setStoreVersion("2");

		CommonModule mdModule = (CommonModule) ConversionUtils
				.getConfigurationObject("ОбщийМодуль.ОбменДаннымиПереопределяемый", bmEmfIndexProvider);
		if (mdModule == null) {
			exchangeProject.setStatus(EpProjectStatus.NO_COMMON_MODULE);
			return exchangeProject;
		}

		Method mdMethod = getMethod(mdModule.getModule(), "ПриПолученииДоступныхВерсийФормата");
		if (mdMethod == null) {
			exchangeProject.setStatus(EpProjectStatus.NO_METHOD);
			return exchangeProject;
		}

		Map<String, CommonModule> formatVersions = getProjectFormatVersions(exchangeProject, project, mdModule,
				mdMethod);
		if (formatVersions.size() == 0) {
			exchangeProject.setStatus(EpProjectStatus.EMPTY_METHOD);
			return exchangeProject;
		}

		List<String> sortedVersions = new ArrayList<String>(formatVersions.keySet());
		Collections.sort(sortedVersions);
		for (String version : sortedVersions) {
			String namespace = "http://v8.1c.ru/edi/edi_stnd/EnterpriseData/" + version;

			XDTOPackage xdtoPackage = getXDTOPackageByNamespace(project, namespace);
			if (xdtoPackage == null) {
				for (IExtensionProject extensionProject : projectManager.getProjects(IExtensionProject.class)) {
					if (!(extensionProject.getParentProject().equals(project)))
						continue;

					xdtoPackage = getXDTOPackageByNamespace(extensionProject.getProject(), namespace);
					if (xdtoPackage != null)
						break;
				}
			}

			if (xdtoPackage == null) {
				LOG.log(new Status(IStatus.WARNING, PLUGIN_ID, "Не найден Пакет XDTO: " + namespace));

				continue;
			}

			EpFormatVersion epFormatVersion = new EpFormatVersionImpl();

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

		exchangeProject.setStatus(EpProjectStatus.READY);

		return exchangeProject;
	}

	private XDTOPackage getXDTOPackageByNamespace(IProject project, String namespace) {
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

	private static Method getMethod(Module mdModule, String methodName) {
		for (Method mdMethod : mdModule.allMethods()) {
			if (mdMethod.getName().equals(methodName))
				return mdMethod;
		}

		return null;
	}

	private Map<String, CommonModule> getProjectFormatVersions(ExchangeProject exchangeProject, IProject mainProject,
			CommonModule mdMainModule, Method mdMainMethod) {

		Map<String, CommonModule> formatVersions = parseMethod(exchangeProject, mainProject, mdMainModule,
				mdMainMethod);

		return formatVersions;
	}

	private Map<String, CommonModule> parseMethod(ExchangeProject exchangeProject, IProject mainProject,
			CommonModule mdCommonModule, Method mdMethod) {

		EList<MdObject> settingsModules = exchangeProject.getSettingsModules();

		settingsModules.add(mdCommonModule);

		Map<String, CommonModule> formatVersions = new HashMap<String, CommonModule>();

		Map<String, CommonModule> beforeFormatVersions = new HashMap<String, CommonModule>();
		Map<String, CommonModule> insteadFormatVersions = getModuleFormatVersions(exchangeProject, mainProject,
				mdCommonModule, mdMethod);
		Map<String, CommonModule> afterFormatVersions = new HashMap<String, CommonModule>();

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
					Map<String, CommonModule> extensionFormatVersions = parseMethod(exchangeProject, mainProject,
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

	private Map<String, CommonModule> getModuleFormatVersions(ExchangeProject exchangeProject, IProject mainProject,
			CommonModule mdCommonModule, Method mdMethod) {

		if (mdMethod.getFormalParams().size() == 0) {
			throw new RuntimeException("Список параметров у метода пустой: " + mdMethod.getName());
		}

		FormalParam mdParam = mdMethod.getFormalParams().get(0);
		String variableName = mdParam.getName();

		Map<String, CommonModule> formatVersions = new HashMap<String, CommonModule>();

		Map<String, String> modulesAliases = new HashMap<String, String>();

		for (Statement statement : mdMethod.getStatements()) {
			if (statement instanceof IfStatement) {
				IfStatement ifStatement = (IfStatement) statement;

				boolean trueStatement = true;

				Conditional ifPart = ifStatement.getIfPart();
				Invocation predicate = (Invocation) ifPart.getPredicate();

				FeatureAccess methodAccess = predicate.getMethodAccess();
				DynamicFeatureAccess dynamicMethodAccess = (DynamicFeatureAccess) methodAccess;

				if (dynamicMethodAccess.getName().equals("ПодсистемаСуществует")) {
					StringLiteral subsystemLiteral = (StringLiteral) predicate.getParams().get(0);

					String subsystemName = "Подсистема";

					for (String stringPart : subsystemLiteral.getLines().get(0).replace("\"", "").split("[.]")) {
						subsystemName += "." + stringPart;
					}

					IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);
					Subsystem subsystem = (Subsystem) ConversionUtils.getConfigurationObject(subsystemName,
							bmEmfIndexProvider);

					trueStatement = subsystem != null;
				}

				if (!trueStatement)
					continue;

				for (Statement ifPartStatement : ifPart.getStatements()) {
					parseModuleStatement(formatVersions, ifPartStatement, variableName, modulesAliases, exchangeProject,
							mainProject, mdCommonModule, mdMethod);

				}

			} else {
				parseModuleStatement(formatVersions, statement, variableName, modulesAliases, exchangeProject,
						mainProject, mdCommonModule, mdMethod);

			}

		}

		return formatVersions;
	}

	private void parseModuleStatement(Map<String, CommonModule> formatVersions, Statement statement,
			String variableName, Map<String, String> modulesAliases, ExchangeProject exchangeProject,
			IProject mainProject, CommonModule commonModule, Method method) {
		if (statement instanceof EmptyStatement)
			return;

		EList<MdObject> settingsModules = exchangeProject.getSettingsModules();

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

				if (source.getName().equalsIgnoreCase(variableName)) {
					if (dynamicMethodAccess.getName().equalsIgnoreCase("Вставить")) {
						EList<Expression> params = leftInvocation.getParams();
						String versionNumber = ((StringLiteral) params.get(0)).getLines().get(0);
						versionNumber = versionNumber.substring(1, versionNumber.length() - 1);
						String moduleAlias = ((StaticFeatureAccess) params.get(1)).getName();

						String moduleName = modulesAliases.get(moduleAlias);
						if (moduleName == null)
							moduleName = moduleAlias;

						IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);
						CommonModule mdFormatModule = (CommonModule) ConversionUtils
								.getConfigurationObject("ОбщийМодуль." + moduleName, bmEmfIndexProvider);
						if (mdFormatModule == null) {
							bmEmfIndexProvider = bmEmfIndexManager
									.getEmfIndexProvider(projectManager.getProject(method).getProject());
							mdFormatModule = (CommonModule) ConversionUtils
									.getConfigurationObject("ОбщийМодуль." + moduleName, bmEmfIndexProvider);
						}

						formatVersions.put(versionNumber, mdFormatModule);
					}
				} else {
					List<FeatureEntry> featureEntries = DynamicFeatureAccessComputer.resolveObject(dynamicMethodAccess,
							EcoreUtil2.getContainerOfType(dynamicMethodAccess, Environmental.class).environments());
					if (featureEntries.size() == 0) {
						return;
					}
					FeatureEntry featureEntry = featureEntries.get(0);
					EObject feature = featureEntry.getFeature();

					BslContextDefMethod bslMethod = (BslContextDefMethod) feature;
					EObject newObject = EcoreFactory.eINSTANCE.createEObject();
					((InternalEObject) newObject).eSetProxyURI((bslMethod).getSourceUri());
					Method mdSubMethod = (Method) EcoreUtil.resolve(newObject, methodAccess);

					IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);
					CommonModule subCommonModule = (CommonModule) ConversionUtils
							.getConfigurationObject("ОбщийМодуль." + source.getName(), bmEmfIndexProvider);
					if (subCommonModule == null) {
						bmEmfIndexProvider = bmEmfIndexManager
								.getEmfIndexProvider(projectManager.getProject(mdSubMethod).getProject());
						subCommonModule = (CommonModule) ConversionUtils
								.getConfigurationObject("ОбщийМодуль." + source.getName(), bmEmfIndexProvider);
					}
					settingsModules.add(subCommonModule);

					Map<String, CommonModule> moduleFormatVersions = parseMethod(exchangeProject, mainProject,
							subCommonModule, mdSubMethod);

					formatVersions.putAll(moduleFormatVersions);
				}
			} else {
				StaticFeatureAccess staticMethodAccess = (StaticFeatureAccess) methodAccess;

				List<FeatureEntry> featureEntries = DynamicFeatureAccessComputer.resolveObject(staticMethodAccess,
						EcoreUtil2.getContainerOfType(staticMethodAccess, Environmental.class).environments());
				if (featureEntries.size() == 0) {
					return;
				}
				FeatureEntry featureEntry = featureEntries.get(0);
				EObject feature = featureEntry.getFeature();

				Method mdSubMethod = (Method) feature;

				settingsModules.add(commonModule);

				Map<String, CommonModule> moduleFormatVersions = parseMethod(exchangeProject, mainProject, commonModule,
						mdSubMethod);

				formatVersions.putAll(moduleFormatVersions);

			}
		}
	}

	private String getSSLVersion(IProject project) {
		String version = "";

		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);
		CommonModule mdCommonModule = (CommonModule) ConversionUtils
				.getConfigurationObject("ОбщийМодуль.ОбновлениеИнформационнойБазыБСП", bmEmfIndexProvider);
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

	private <T> List<Pair<T, T>> getPairs(List<T> list) {
		List<Pair<T, T>> pairs = new LinkedList<>();

		for (int i = 0; i < list.size() - 1; i++)
			for (int j = i + 1; j < list.size(); j++)
				pairs.add(new Pair<>(list.get(i), list.get(j)));

		return pairs;
	}

	private Set<String> findCommons(EList<String> a, EList<String> b) {
		Set<String> set = new LinkedHashSet<String>(a);
		set.retainAll(b);

		return set;
	}

	private int compareVersions(String version1, String version2) {

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
