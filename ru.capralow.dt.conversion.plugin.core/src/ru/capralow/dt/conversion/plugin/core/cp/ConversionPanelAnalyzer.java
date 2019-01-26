package ru.capralow.dt.conversion.plugin.core.cp;

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
import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
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
import com._1c.g5.v8.dt.core.platform.IExternalObjectProject;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.mcore.Environmental;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;

import ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.CpConfigurationImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.CpExchangePairImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.CpFormatVersionImpl;

public class ConversionPanelAnalyzer {

	private IV8ProjectManager projectManager;
	private IBmEmfIndexManager bmEmfIndexManager;
	private IModuleExtensionService moduleExtensionService;
	private DynamicFeatureAccessComputer dynamicFeatureAccessComputer;

	private ConversionPanel conversionPanel;

	public ConversionPanel getConversionPanel() {
		return conversionPanel;
	}

	public ConversionPanelAnalyzer(IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {

		IResourceServiceProvider provider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("foo.bsl"));

		this.projectManager = projectManager;
		this.bmEmfIndexManager = bmEmfIndexManager;
		this.moduleExtensionService = com._1c.g5.v8.dt.bsl.common.IModuleExtensionServiceProvider.INSTANCE
				.getModuleExtensionService();
		this.dynamicFeatureAccessComputer = provider.get(DynamicFeatureAccessComputer.class);

		this.conversionPanel = new ConversionPanelImpl();
	}

	public void analyze(IProject updatedProject) {

		if (updatedProject == null) {
			Collection<IConfigurationProject> prConfigurations = projectManager
					.getProjects(IConfigurationProject.class);

			Iterator<IConfigurationProject> itr = prConfigurations.iterator();
			while (itr.hasNext()) {
				IConfigurationProject prConfiguration = itr.next();
				IProject project = prConfiguration.getProject();

				updateConfiguration(project);

			}
		} else {
			updateConfiguration(updatedProject);

		}

		ArrayList<String> configurationsList = new ArrayList<String>();

		EList<CpConfiguration> cpConfigurations = conversionPanel.getConfigurations();
		Iterator<CpConfiguration> itr = cpConfigurations.iterator();
		while (itr.hasNext()) {
			CpConfiguration cpConfiguration = itr.next();

			configurationsList.add(cpConfiguration.getConfigurationName());
		}

		List<Pair<String, String>> configurationPairs = getPairs(configurationsList);

		ECollections.sort(cpConfigurations, new Comparator<CpConfiguration>() {
			@Override
			public int compare(CpConfiguration arg1, CpConfiguration arg2) {
				String algorithm1 = arg1.getConfigurationName().replaceAll("_", "");
				String algorithm2 = arg2.getConfigurationName().replaceAll("_", "");

				if (algorithm1.equalsIgnoreCase(algorithm2))
					return 0;

				return algorithm1.compareToIgnoreCase(algorithm2);
			}

		});

		if (configurationPairs.size() != 0) {
			EList<CpExchangePair> exchangePairs = conversionPanel.getExchangePairs();
			exchangePairs.clear();

			Iterator<Pair<String, String>> itrList = configurationPairs.iterator();
			while (itrList.hasNext()) {
				Pair<String, String> configurationPair = itrList.next();

				CpExchangePair CpExchangePair = new CpExchangePairImpl();

				CpExchangePair.setConfigurationName1(configurationPair.getKey());
				CpExchangePair.setConfigurationName2(configurationPair.getValue());

				CpConfiguration configuration1 = conversionPanel.getConfiguration(configurationPair.getKey());
				CpConfiguration configuration2 = conversionPanel.getConfiguration(configurationPair.getValue());

				EList<String> exchangePairVersions = CpExchangePair.getVersions();

				Set<String> commonVersions = findCommons(configuration1.getVersions(), configuration2.getVersions());

				exchangePairVersions.addAll(commonVersions);

				if (exchangePairVersions.size() == 0) {
					CpExchangePair.setStatus(CpExchangePairStatus.NO_SHARED_FORMAT_VERSIONS);
				} else {

					CpExchangePair.setStatus(CpExchangePairStatus.READY);
				}
				exchangePairs.add(CpExchangePair);
			}

			ECollections.sort(exchangePairs, new Comparator<CpExchangePair>() {
				@Override
				public int compare(CpExchangePair arg1, CpExchangePair arg2) {
					String algorithm1 = arg1.getConfigurationName1().replaceAll("_", "");
					String algorithm2 = arg2.getConfigurationName1().replaceAll("_", "");

					if (algorithm1.equalsIgnoreCase(algorithm2))
						return 0;

					return algorithm1.compareToIgnoreCase(algorithm2);
				}

			});
		}
	}

	private void updateConfiguration(IProject project) {

		if (projectManager.getProject(project) instanceof IExternalObjectProject)
			return;

		if (projectManager.getProject(project) instanceof IExtensionProject) {
			project = ((IExtensionProject) projectManager.getProject(project)).getParentProject();
		}

		CpConfiguration cpConfiguration = conversionPanel.getConfiguration(project.getName());

		if (cpConfiguration == null) {
			Collection<CpConfiguration> cpConfigurations = conversionPanel.getConfigurations();

			cpConfiguration = new CpConfigurationImpl();
			cpConfigurations.add(cpConfiguration);

			cpConfiguration.setConfigurationObject(project);
			cpConfiguration.setConfigurationName(project.getName());
		}

		Configuration mdConfiguration = ((IConfigurationProject) projectManager.getProject(project)).getConfiguration();
		if (mdConfiguration == null) {
			cpConfiguration.setStatus(CpConfigurationStatus.NO_CONFIGURATION);
			return;
		}

		Subsystem mdSubsystem = getSubsystem(project,
				QualifiedName.create("Subsystem", "СтандартныеПодсистемы", "Subsystem", "ОбменДанными"));
		if (mdSubsystem == null) {
			cpConfiguration.setStatus(CpConfigurationStatus.NO_SUBSYSTEM);
			return;
		}

		String sslVersion = getSSLVersion(project);
		if (sslVersion.isEmpty()) {
			cpConfiguration.setStatus(CpConfigurationStatus.NO_SSL_VERSION);
			return;
		}

		if (compareVersions(sslVersion, "2.4.1") == -1) {
			cpConfiguration.setStoreVersion("1");
		} else {
			cpConfiguration.setStoreVersion("2");
		}

		CommonModule mdModule = getCommonModule(project,
				QualifiedName.create("CommonModule", "ОбменДаннымиПереопределяемый"));
		if (mdModule == null) {
			cpConfiguration.setStatus(CpConfigurationStatus.NO_COMMON_MODULE);
			return;
		}

		EList<Object> coreObjects = cpConfiguration.getCoreObjects();
		coreObjects.clear();

		Method mdMethod = getMethod(mdModule.getModule(), "ПриПолученииДоступныхВерсийФормата");
		if (mdMethod == null) {
			cpConfiguration.setStatus(CpConfigurationStatus.NO_METHOD);
			return;
		}

		Map<String, Module> availableFormatVersions = getAvailableFormatVersions(project, mdModule, mdMethod,
				coreObjects);
		if (availableFormatVersions.size() == 0) {
			cpConfiguration.setStatus(CpConfigurationStatus.EMPTY_METHOD);
			return;
		}

		EList<CpFormatVersion> cpAvailableFormatVersions = cpConfiguration.getAvailableFormatVersions();
		cpAvailableFormatVersions.clear();

		List<String> sortedVersions = new ArrayList<String>(availableFormatVersions.keySet());
		Collections.sort(sortedVersions);
		Iterator<String> itrVersions = sortedVersions.iterator();
		while (itrVersions.hasNext()) {
			String version = itrVersions.next();

			CpFormatVersion CpFormatVersion = new CpFormatVersionImpl();

			Module formatModule = availableFormatVersions.get(version);

			if (projectManager.getProject(formatModule) instanceof IExtensionProject) {
				IExtensionProject formatProject = (IExtensionProject) projectManager.getProject(formatModule);

				CpFormatVersion.setConfigurationName(formatProject.getConfiguration().getName());
			}
			CpFormatVersion.setVersion(version);
			CpFormatVersion.setModule(formatModule);

			cpAvailableFormatVersions.add(CpFormatVersion);
		}

		cpConfiguration.setStatus(CpConfigurationStatus.READY);
	}

	private Subsystem getSubsystem(IProject project, QualifiedName subsystemName) {
		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);

		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider
				.getEObjectIndexByType(MdClassPackage.Literals.SUBSYSTEM, subsystemName, true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext()) {
			return (Subsystem) objectItr.next().getEObjectOrProxy();
		}

		return null;
	}

	private CommonModule getCommonModule(IProject project, QualifiedName moduleName) {
		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);

		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider
				.getEObjectIndexByType(MdClassPackage.Literals.COMMON_MODULE, moduleName, true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext()) {
			return (CommonModule) objectItr.next().getEObjectOrProxy();
		}

		return null;
	}

	private static Method getMethod(Module mdModule, String methodName) {
		Iterator<Method> itr = mdModule.allMethods().iterator();
		while (itr.hasNext()) {
			Method mdMethod = (Method) itr.next();

			if (mdMethod.getName().equals(methodName)) {
				return mdMethod;
			}
		}

		return null;
	}

	private Map<String, Module> getAvailableFormatVersions(IProject mainProject, CommonModule mdModule, Method mdMethod,
			EList<Object> coreObjects) {

		Map<String, Module> formatVersions = parseMethod(mainProject, mdModule.getModule(), mdMethod, coreObjects);

		return formatVersions;
	}

	private Map<String, Module> parseMethod(IProject mainProject, Module mdModule, Method mdMethod,
			EList<Object> coreObjects) {

		coreObjects.add(mdModule);

		Map<String, Module> formatVersions = new HashMap<String, Module>();

		Map<String, Module> beforeFormatVersions = new HashMap<String, Module>();
		Map<String, Module> insteadFormatVersions = getFormatVersions(mainProject, mdModule, mdMethod, coreObjects);
		Map<String, Module> afterFormatVersions = new HashMap<String, Module>();

		if (projectManager.getProject(mdModule) instanceof IConfigurationProject) {
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
							extendedMethod.getValue(), coreObjects);

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

	private Map<String, Module> getFormatVersions(IProject mainProject, Module mdModule, Method mdMethod,
			EList<Object> coreObjects) {

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

			if (mdStatement instanceof IfStatement) {
				continue;
			}

			Invocation expression = (Invocation) ((SimpleStatement) mdStatement).getLeft();

			FeatureAccess methodAccess = expression.getMethodAccess();

			if (methodAccess instanceof DynamicFeatureAccess) {
				DynamicFeatureAccess dynamicMethodAccess = (DynamicFeatureAccess) methodAccess;
				StaticFeatureAccess source = (StaticFeatureAccess) dynamicMethodAccess.getSource();

				if (source.getName().equalsIgnoreCase(variableName)) {
					if (dynamicMethodAccess.getName().equalsIgnoreCase("Вставить")) {
						EList<Expression> params = expression.getParams();
						String versionNumber = ((StringLiteral) params.get(0)).getLines().get(0);
						versionNumber = versionNumber.substring(1, versionNumber.length() - 1);
						String moduleName = ((StaticFeatureAccess) params.get(1)).getName();

						QualifiedName qnModuleName = QualifiedName.create("CommonModule", moduleName);

						CommonModule mdFormatModule = getCommonModule(mainProject, qnModuleName);
						if (mdFormatModule == null) {
							mdFormatModule = getCommonModule(projectManager.getProject(mdMethod).getProject(),
									qnModuleName);
						}

						formatVersions.put(versionNumber, mdFormatModule.getModule());
					}
				} else {
					List<FeatureEntry> featureEntries = dynamicFeatureAccessComputer.resolveObject(dynamicMethodAccess,
							EcoreUtil2.getContainerOfType(dynamicMethodAccess, Environmental.class).environments());
					if (featureEntries.size() == 0) {
						continue;
					}
					FeatureEntry featureEntry = featureEntries.get(0);
					EObject feature = featureEntry.getFeature();

					BslContextDefMethod bslMethod = (BslContextDefMethod) feature;
					EObject newObject = EcoreFactory.eINSTANCE.createEObject();
					((InternalEObject) newObject).eSetProxyURI((bslMethod).getSourceUri());
					Method mdSubMethod = (Method) EcoreUtil.resolve(newObject, methodAccess);

					CommonModule mdSubCommonModule = getCommonModule(mainProject,
							QualifiedName.create("CommonModule", source.getName()));
					if (mdSubCommonModule == null) {
						mdSubCommonModule = getCommonModule(projectManager.getProject(mdSubMethod).getProject(),
								QualifiedName.create("CommonModule", source.getName()));
					}
					Module mdSubModule = mdSubCommonModule.getModule();
					coreObjects.add(mdSubModule);

					Map<String, Module> moduleFormatVersions = parseMethod(mainProject, mdSubModule, mdSubMethod,
							coreObjects);

					formatVersions.putAll(moduleFormatVersions);
				}
			} else {
				StaticFeatureAccess staticMethodAccess = (StaticFeatureAccess) methodAccess;

				List<FeatureEntry> featureEntries = dynamicFeatureAccessComputer.resolveObject(staticMethodAccess,
						EcoreUtil2.getContainerOfType(staticMethodAccess, Environmental.class).environments());
				if (featureEntries.size() == 0) {
					continue;
				}
				FeatureEntry featureEntry = featureEntries.get(0);
				EObject feature = featureEntry.getFeature();

				Method mdSubMethod = (Method) feature;

				coreObjects.add(mdModule);

				Map<String, Module> moduleFormatVersions = parseMethod(mainProject, mdModule, mdSubMethod, coreObjects);

				formatVersions.putAll(moduleFormatVersions);

			}

		}

		return formatVersions;
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
