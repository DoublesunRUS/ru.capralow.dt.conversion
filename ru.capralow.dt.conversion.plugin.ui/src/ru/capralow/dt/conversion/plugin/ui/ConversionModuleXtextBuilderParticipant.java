package ru.capralow.dt.conversion.plugin.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IV8Project;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.EnterpriseDataAnalyzer;
import ru.capralow.dt.conversion.plugin.core.ExchangeProjectsAnalyzer;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;

public class ConversionModuleXtextBuilderParticipant implements org.eclipse.xtext.builder.IXtextBuilderParticipant {

	@Inject
	private IV8ProjectManager projectManager;
	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		// TODO: Сделать обновление только когда deltas соответствует пакетам
		IProject project = context.getBuiltProject();
		IV8Project v8Project = projectManager.getProject(project);
		if (!(v8Project instanceof IConfigurationProject))
			return;

		IConfigurationProject configurationProject = (IConfigurationProject) v8Project;
		Activator plugin = Activator.getDefault();

		URI xmiURI = ExchangeProjectsAnalyzer.getResourceURIforPlugin(project, plugin);

		ExchangeProject exchangeProject = ExchangeProjectsAnalyzer
				.analyzeProjectAndSave(configurationProject, xmiURI, projectManager, bmEmfIndexManager);

		for (EpFormatVersion epFormatVersion : exchangeProject.getFormatVersions()) {
			xmiURI = EnterpriseDataAnalyzer.getResourceURIforPlugin(epFormatVersion.getVersion(), project, plugin);

			EnterpriseDataAnalyzer.analyzeAndSave(epFormatVersion.getXdtoPackage(), xmiURI);
		}

		for (CommonModule commonModule : exchangeProject.getFormatModules()) {
			xmiURI = ConversionModuleAnalyzer.getResourceURIforPlugin(commonModule.getName(), project, plugin);

			ConversionModuleAnalyzer.analyzeAndSave(commonModule, xmiURI, projectManager, bmEmfIndexManager);
		}

	}
}
