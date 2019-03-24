package ru.capralow.dt.conversion.plugin.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IV8Project;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.EnterpriseDataAnalyzer;
import ru.capralow.dt.conversion.plugin.core.ExchangeProjectsAnalyzer;
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

		ExchangeProject exchangeProject = ExchangeProjectsAnalyzer.loadResource(project, configuration, plugin);
		if (exchangeProject == null) {
			exchangeProject = ExchangeProjectsAnalyzer.analyzeProject(configurationProject, projectManager,
					bmEmfIndexManager);
			ExchangeProjectsAnalyzer.saveResource(exchangeProject, project, plugin);

		} else {
			if (exchangeProject.getStatus() == EpProjectStatus.READY) {
				// TODO: Сделать обновление только когда deltas соответствует модулям
				exchangeProject = ExchangeProjectsAnalyzer.analyzeProject(configurationProject, projectManager,
						bmEmfIndexManager);
				ExchangeProjectsAnalyzer.saveResource(exchangeProject, project, plugin);

			} else {
				exchangeProject = ExchangeProjectsAnalyzer.analyzeProject(configurationProject, projectManager,
						bmEmfIndexManager);
				ExchangeProjectsAnalyzer.saveResource(exchangeProject, project, plugin);

			}

		}

		for (EpFormatVersion epFormatVersion : exchangeProject.getFormatVersions()) {
			EnterpriseData enterpriseDataPackage = EnterpriseDataAnalyzer.loadResource(epFormatVersion.getVersion(),
					project, configuration, plugin);
			if (enterpriseDataPackage == null) {
				enterpriseDataPackage = EnterpriseDataAnalyzer.analyze(epFormatVersion.getXdtoPackage());
				EnterpriseDataAnalyzer.saveResource(enterpriseDataPackage, project, plugin);

			} else {
				// TODO: Сделать обновление только когда deltas соответствует пакетам
				enterpriseDataPackage = EnterpriseDataAnalyzer.analyze(epFormatVersion.getXdtoPackage());
				EnterpriseDataAnalyzer.saveResource(enterpriseDataPackage, project, plugin);

			}
		}

	}
}
