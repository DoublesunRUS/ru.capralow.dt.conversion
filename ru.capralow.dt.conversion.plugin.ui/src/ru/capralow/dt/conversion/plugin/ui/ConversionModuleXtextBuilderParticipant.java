package ru.capralow.dt.conversion.plugin.ui;

import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IV8Project;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.EnterpriseDataAnalyzer;
import ru.capralow.dt.conversion.plugin.core.ExchangeProjectsAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;

public class ConversionModuleXtextBuilderParticipant implements org.eclipse.xtext.builder.IXtextBuilderParticipant {

	@Inject
	private IV8ProjectManager projectManager;
	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		IProject project = context.getBuiltProject();
		IV8Project v8Project = projectManager.getProject(project);
		if (!(v8Project instanceof IConfigurationProject))
			return;

		IConfigurationProject configurationProject = (IConfigurationProject) v8Project;
		Configuration configuration = configurationProject.getConfiguration();
		Activator plugin = Activator.getDefault();

		URI xmiURI = ExchangeProjectsAnalyzer.getResourceURIforPlugin(project, plugin);

		ExchangeProject exchangeProject = ExchangeProjectsAnalyzer.loadResource(xmiURI, configuration);
		if (exchangeProject == null) {
			exchangeProject = ExchangeProjectsAnalyzer.analyzeProject(configurationProject, projectManager,
					bmEmfIndexManager);
			ExchangeProjectsAnalyzer.saveResource(exchangeProject, xmiURI);

		} else {
			if (exchangeProject.getStatus() == EpProjectStatus.READY) {
				// TODO: Сделать обновление только когда deltas соответствует модулям
				exchangeProject = ExchangeProjectsAnalyzer.analyzeProject(configurationProject, projectManager,
						bmEmfIndexManager);
				ExchangeProjectsAnalyzer.saveResource(exchangeProject, xmiURI);

			} else {
				exchangeProject = ExchangeProjectsAnalyzer.analyzeProject(configurationProject, projectManager,
						bmEmfIndexManager);
				ExchangeProjectsAnalyzer.saveResource(exchangeProject, xmiURI);

			}

		}

		HashMap<String, EnterpriseData> enterpriseDataPackages = new HashMap<String, EnterpriseData>();

		for (EpFormatVersion epFormatVersion : exchangeProject.getFormatVersions()) {
			xmiURI = EnterpriseDataAnalyzer.getResourceURIforPlugin(epFormatVersion.getVersion(), project, plugin);

			EnterpriseData enterpriseDataPackage = EnterpriseDataAnalyzer.loadResource(xmiURI, configuration);
			if (enterpriseDataPackage == null) {
				enterpriseDataPackage = EnterpriseDataAnalyzer.analyze(epFormatVersion.getXdtoPackage());
				EnterpriseDataAnalyzer.saveResource(enterpriseDataPackage, xmiURI);

			} else {
				// TODO: Сделать обновление только когда deltas соответствует пакетам
				enterpriseDataPackage = EnterpriseDataAnalyzer.analyze(epFormatVersion.getXdtoPackage());
				EnterpriseDataAnalyzer.saveResource(enterpriseDataPackage, xmiURI);

			}

			enterpriseDataPackages.put(epFormatVersion.getVersion(), enterpriseDataPackage);
		}

		for (CommonModule commonModule : exchangeProject.getFormatModules()) {
			xmiURI = ConversionModuleAnalyzer.getResourceURIforPlugin(commonModule.getName(), project, plugin);

			ConversionModule conversionModule = ConversionModuleAnalyzer.loadResource(xmiURI, configuration);
			if (conversionModule == null) {
				conversionModule = ConversionModuleAnalyzer.analyze(commonModule, exchangeProject,
						enterpriseDataPackages, projectManager, bmEmfIndexManager, plugin);
				ConversionModuleAnalyzer.saveResource(conversionModule, xmiURI);

			} else {
				// TODO: Сделать обновление только когда deltas соответствует пакетам
				conversionModule = ConversionModuleAnalyzer.analyze(commonModule, exchangeProject,
						enterpriseDataPackages, projectManager, bmEmfIndexManager, plugin);
				ConversionModuleAnalyzer.saveResource(conversionModule, xmiURI);

			}
		}

	}
}
