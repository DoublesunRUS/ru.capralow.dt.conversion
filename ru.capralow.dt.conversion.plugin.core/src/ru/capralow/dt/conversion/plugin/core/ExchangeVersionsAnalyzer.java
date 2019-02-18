package ru.capralow.dt.conversion.plugin.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IProject;
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
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
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
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

import ru.capralow.dt.conversion.plugin.core.ev.EvConfiguration;
import ru.capralow.dt.conversion.plugin.core.ev.EvConfigurationStatus;
import ru.capralow.dt.conversion.plugin.core.ev.EvExchangePair;
import ru.capralow.dt.conversion.plugin.core.ev.EvExchangePairStatus;
import ru.capralow.dt.conversion.plugin.core.ev.EvFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ev.ExchangeVersions;
import ru.capralow.dt.conversion.plugin.core.ev.impl.EvConfigurationImpl;
import ru.capralow.dt.conversion.plugin.core.ev.impl.EvExchangePairImpl;
import ru.capralow.dt.conversion.plugin.core.ev.impl.EvFormatVersionImpl;
import ru.capralow.dt.conversion.plugin.core.ev.impl.ExchangeVersionsImpl;

public class ExchangeVersionsAnalyzer {
	private static final String PLUGIN_ID = "ru.capralow.dt.conversion.plugin.ui"; //$NON-NLS-1$
	private ILog LOG = Platform.getLog(Platform.getBundle(PLUGIN_ID));

	private IV8ProjectManager projectManager;
	private IBmEmfIndexManager bmEmfIndexManager;
	private IModuleExtensionService moduleExtensionService;
	private DynamicFeatureAccessComputer DynamicFeatureAccessComputer;

	private ExchangeVersions exchangeVersions;

	public ExchangeVersions getExchangeVersions() {
		return exchangeVersions;
	}

	public ExchangeVersionsAnalyzer(IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {

		IResourceServiceProvider provider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		this.projectManager = projectManager;
		this.bmEmfIndexManager = bmEmfIndexManager;
		this.moduleExtensionService = com._1c.g5.v8.dt.bsl.common.IModuleExtensionServiceProvider.INSTANCE
				.getModuleExtensionService();
		this.DynamicFeatureAccessComputer = provider.get(DynamicFeatureAccessComputer.class);

		this.exchangeVersions = new ExchangeVersionsImpl();
	}

	public void analyze(IProject updatedProject) {

		if (updatedProject == null) {
			Collection<IConfigurationProject> prConfigurations = projectManager
					.getProjects(IConfigurationProject.class);

			for (IConfigurationProject prConfiguration : prConfigurations) {
				IProject project = prConfiguration.getProject();

				updateConfiguration(project);
			}

		} else {
			if (!(projectManager.getProject(updatedProject) instanceof IConfigurationProject))
				return;

			updateConfiguration(updatedProject);

		}

		ArrayList<String> configurationsList = new ArrayList<String>();

		EList<EvConfiguration> EvConfigurations = exchangeVersions.getConfigurations();
		for (EvConfiguration EvConfiguration : exchangeVersions.getConfigurations()) {
			configurationsList.add(EvConfiguration.getConfigurationName());
		}

		List<Pair<String, String>> configurationPairs = getPairs(configurationsList);

		ECollections.sort(EvConfigurations, new Comparator<EvConfiguration>() {
			@Override
			public int compare(EvConfiguration arg1, EvConfiguration arg2) {
				String algorithm1 = arg1.getConfigurationName().replaceAll("_", "");
				String algorithm2 = arg2.getConfigurationName().replaceAll("_", "");

				if (algorithm1.equalsIgnoreCase(algorithm2))
					return 0;

				return algorithm1.compareToIgnoreCase(algorithm2);
			}

		});

		if (configurationPairs.size() != 0) {
			EList<EvExchangePair> exchangePairs = exchangeVersions.getExchangePairs();
			exchangePairs.clear();

			for (Pair<String, String> configurationPair : configurationPairs) {
				EvExchangePair EvExchangePair = new EvExchangePairImpl();

				EvExchangePair.setConfigurationName1(configurationPair.getKey());
				EvExchangePair.setConfigurationName2(configurationPair.getValue());

				EvConfiguration configuration1 = exchangeVersions.getConfiguration(configurationPair.getKey());
				EvConfiguration configuration2 = exchangeVersions.getConfiguration(configurationPair.getValue());

				EList<String> exchangePairVersions = EvExchangePair.getVersions();

				Set<String> commonVersions = findCommons(configuration1.getVersions(), configuration2.getVersions());

				exchangePairVersions.addAll(commonVersions);

				if (exchangePairVersions.size() == 0) {
					EvExchangePair.setStatus(EvExchangePairStatus.NO_SHARED_FORMAT_VERSIONS);
				} else {

					EvExchangePair.setStatus(EvExchangePairStatus.READY);
				}
				exchangePairs.add(EvExchangePair);
			}

			ECollections.sort(exchangePairs, new Comparator<EvExchangePair>() {
				@Override
				public int compare(EvExchangePair arg1, EvExchangePair arg2) {
					String algorithm1 = arg1.getConfigurationName1().replaceAll("_", "");
					String algorithm2 = arg2.getConfigurationName1().replaceAll("_", "");

					if (algorithm1.equalsIgnoreCase(algorithm2))
						return 0;

					return algorithm1.compareToIgnoreCase(algorithm2);
				}

			});
		}
	}

	private void updateConfiguration(IProject mainProject) {

		EvConfiguration evConfiguration = exchangeVersions.getConfiguration(mainProject.getName());

		if (evConfiguration == null) {
			Collection<EvConfiguration> EvConfigurations = exchangeVersions.getConfigurations();

			evConfiguration = new EvConfigurationImpl();
			EvConfigurations.add(evConfiguration);

			evConfiguration.setConfigurationObject(mainProject);
			evConfiguration.setConfigurationName(mainProject.getName());
		}

		Configuration mdConfiguration = ((IConfigurationProject) projectManager.getProject(mainProject))
				.getConfiguration();
		if (mdConfiguration == null) {
			evConfiguration.setStatus(EvConfigurationStatus.NO_CONFIGURATION);
			return;
		}

		Subsystem mdSubsystem = getSubsystem(mainProject,
				QualifiedName.create("Subsystem", "СтандартныеПодсистемы", "Subsystem", "ОбменДанными"));
		if (mdSubsystem == null) {
			evConfiguration.setStatus(EvConfigurationStatus.NO_SUBSYSTEM);
			return;
		}

		String sslVersion = getSSLVersion(mainProject);
		if (sslVersion.isEmpty()) {
			evConfiguration.setStatus(EvConfigurationStatus.NO_SSL_VERSION);
			return;
		}

		if (compareversions(sslVersion, "2.4.1") == -1) {
			evConfiguration.setStoreVersion("1");
		} else {
			evConfiguration.setStoreVersion("2");
		}

		CommonModule mdModule = getCommonModule(mainProject,
				QualifiedName.create("CommonModule", "ОбменДаннымиПереопределяемый"));
		if (mdModule == null) {
			evConfiguration.setStatus(EvConfigurationStatus.NO_COMMON_MODULE);
			return;
		}

		EList<Object> mainModules = evConfiguration.getMainModules();
		mainModules.clear();

		Method mdMethod = getMethod(mdModule.getModule(), "ПриПолученииДоступныхВерсийФормата");
		if (mdMethod == null) {
			evConfiguration.setStatus(EvConfigurationStatus.NO_METHOD);
			return;
		}

		Map<String, CommonModule> availableFormatVersions = getAvailableFormatVersions(mainProject, mdModule, mdMethod,
				mainModules);
		if (availableFormatVersions.size() == 0) {
			evConfiguration.setStatus(EvConfigurationStatus.EMPTY_METHOD);
			return;
		}

		EList<EvFormatVersion> evAvailableFormatVersions = evConfiguration.getAvailableFormatVersions();
		evAvailableFormatVersions.clear();

		List<String> sortedVersions = new ArrayList<String>(availableFormatVersions.keySet());
		Collections.sort(sortedVersions);
		for (String version : sortedVersions) {
			String namespace = "http://v8.1c.ru/edi/edi_stnd/EnterpriseData/" + version;

			XDTOPackage xdtoPackage = getXDTOPackage(mainProject, namespace);
			if (xdtoPackage == null) {
				for (IExtensionProject extensionProject : projectManager.getProjects(IExtensionProject.class)) {
					if (!(extensionProject.getParentProject().equals(mainProject)))
						continue;

					xdtoPackage = getXDTOPackage(extensionProject.getProject(), namespace);
					if (xdtoPackage != null)
						break;
				}
			}

			if (xdtoPackage == null) {
				LOG.log(new Status(IStatus.WARNING, PLUGIN_ID, "Не найден Пакет XDTO: " + namespace));

				continue;
			}

			EvFormatVersion evFormatVersion = new EvFormatVersionImpl();

			CommonModule formatModule = availableFormatVersions.get(version);

			if (projectManager.getProject(formatModule) instanceof IExtensionProject) {
				IExtensionProject formatProject = (IExtensionProject) projectManager.getProject(formatModule);

				evFormatVersion.setConfigurationName(formatProject.getConfiguration().getName());
			}
			evFormatVersion.setVersion(version);
			evFormatVersion.setModule(formatModule);

			evFormatVersion.setXdtoPackage(xdtoPackage);

			evAvailableFormatVersions.add(evFormatVersion);
		}

		evConfiguration.setStatus(EvConfigurationStatus.READY);
	}

	private Subsystem getSubsystem(IProject project, QualifiedName subsystemName) {
		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);

		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider
				.getEObjectIndexByType(MdClassPackage.Literals.SUBSYSTEM, subsystemName, true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext())
			return (Subsystem) objectItr.next().getEObjectOrProxy();

		return null;
	}

	private CommonModule getCommonModule(IProject project, QualifiedName moduleName) {
		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);

		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider
				.getEObjectIndexByType(MdClassPackage.Literals.COMMON_MODULE, moduleName, true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext())
			return (CommonModule) objectItr.next().getEObjectOrProxy();

		return null;
	}

	private XDTOPackage getXDTOPackage(IProject project, String namespace) {
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

	private Map<String, CommonModule> getAvailableFormatVersions(IProject mainProject, CommonModule commonModule,
			Method method, EList<Object> mainModules) {

		Map<String, CommonModule> formatVersions = parseMethod(mainProject, commonModule, method, mainModules);

		return formatVersions;
	}

	private Map<String, CommonModule> parseMethod(IProject mainProject, CommonModule commonModule, Method method,
			EList<Object> mainModules) {

		mainModules.add(commonModule);

		Map<String, CommonModule> formatVersions = new HashMap<String, CommonModule>();

		Map<String, CommonModule> beforeFormatVersions = new HashMap<String, CommonModule>();
		Map<String, CommonModule> insteadFormatVersions = getFormatVersions(mainProject, commonModule, method,
				mainModules);
		Map<String, CommonModule> afterFormatVersions = new HashMap<String, CommonModule>();

		if (projectManager.getProject(commonModule) instanceof IConfigurationProject) {
			Collection<Module> extensionModules = moduleExtensionService.getExtensionModules(commonModule.getModule());
			for (Module extensionModule : extensionModules) {
				IExtensionProject extensionProject = (IExtensionProject) projectManager.getProject(extensionModule);

				if (!extensionProject.getParentProject().equals(projectManager.getProject(commonModule).getProject())) {
					continue;
				}

				Map<Pragma, Method> extensionMethods = moduleExtensionService.getExtensionMethods(extensionModule,
						method.getName());

				for (Entry<Pragma, Method> extendedMethod : extensionMethods.entrySet()) {
					Map<String, CommonModule> extensionFormatVersions = parseMethod(mainProject,
							(CommonModule) extensionModule.getOwner(), extendedMethod.getValue(), mainModules);

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

	private Map<String, CommonModule> getFormatVersions(IProject mainProject, CommonModule mdModule, Method mdMethod,
			EList<Object> mainModules) {

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
					StringLiteral subsystemName = (StringLiteral) predicate.getParams().get(0);

					QualifiedName qnSubsystemName = QualifiedName.create();

					for (String stringPart : subsystemName.getLines().get(0).replace("\"", "").split("[.]")) {
						qnSubsystemName = qnSubsystemName.append("Subsystem").append(stringPart);
					}

					Object subsystem = getSubsystem(mainProject, qnSubsystemName);

					trueStatement = subsystem != null;
				}

				if (!trueStatement)
					continue;

				for (Statement ifPartStatement : ifPart.getStatements()) {
					parseModuleStatement(formatVersions, ifPartStatement, variableName, modulesAliases, mainProject,
							mdModule, mdMethod, mainModules);

				}

			} else {
				parseModuleStatement(formatVersions, statement, variableName, modulesAliases, mainProject, mdModule,
						mdMethod, mainModules);

			}

		}

		return formatVersions;
	}

	private void parseModuleStatement(Map<String, CommonModule> formatVersions, Statement statement,
			String variableName, Map<String, String> modulesAliases, IProject mainProject, CommonModule commonModule,
			Method method, EList<Object> mainModules) {

		if (statement instanceof EmptyStatement)
			return;

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

						QualifiedName qnModuleName = QualifiedName.create("CommonModule", moduleName);

						CommonModule mdFormatModule = getCommonModule(mainProject, qnModuleName);
						if (mdFormatModule == null) {
							mdFormatModule = getCommonModule(projectManager.getProject(method).getProject(),
									qnModuleName);
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

					CommonModule subCommonModule = getCommonModule(mainProject,
							QualifiedName.create("CommonModule", source.getName()));
					if (subCommonModule == null) {
						subCommonModule = getCommonModule(projectManager.getProject(mdSubMethod).getProject(),
								QualifiedName.create("CommonModule", source.getName()));
					}
					mainModules.add(subCommonModule);

					Map<String, CommonModule> moduleFormatVersions = parseMethod(mainProject, subCommonModule,
							mdSubMethod, mainModules);

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

				mainModules.add(commonModule);

				Map<String, CommonModule> moduleFormatVersions = parseMethod(mainProject, commonModule, mdSubMethod,
						mainModules);

				formatVersions.putAll(moduleFormatVersions);

			}
		}
	}

	private String getSSLVersion(IProject project) {
		String version = "";

		CommonModule mdCommonModule = getCommonModule(project,
				QualifiedName.create("CommonModule", "ОбновлениеИнформационнойБазыБСП"));
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

	private static <T> List<Pair<T, T>> getPairs(List<T> list) {
		List<Pair<T, T>> pairs = new LinkedList<>();

		for (int i = 0; i < list.size() - 1; i++)
			for (int j = i + 1; j < list.size(); j++)
				pairs.add(new Pair<>(list.get(i), list.get(j)));

		return pairs;
	}

	private static Set<String> findCommons(EList<String> a, EList<String> b) {
		Set<String> set = new LinkedHashSet<String>(a);
		set.retainAll(b);

		return set;
	}

	public static int compareversions(String version1, String version2) {

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
