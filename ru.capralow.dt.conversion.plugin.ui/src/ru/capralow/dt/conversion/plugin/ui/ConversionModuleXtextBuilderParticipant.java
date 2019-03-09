package ru.capralow.dt.conversion.plugin.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com.google.inject.Inject;

import ru.capralow.dt.conversion.plugin.core.ExchangeProjectsAnalyzer;
import ru.capralow.dt.conversion.plugin.core.ep.EpProjectStatus;
import ru.capralow.dt.conversion.plugin.core.ep.ExchangeProject;

public class ConversionModuleXtextBuilderParticipant implements org.eclipse.xtext.builder.IXtextBuilderParticipant {

	@Inject
	private IV8ProjectManager projectManager;
	@Inject
	private IBmEmfIndexManager bmEmfIndexManager;

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		IProject project = context.getBuiltProject();

		ExchangeProjectsAnalyzer exchangeProjectsAnalyzer = new ExchangeProjectsAnalyzer(projectManager,
				bmEmfIndexManager, Activator.getDefault());

		ExchangeProject exchangeProject = exchangeProjectsAnalyzer.loadResource(project);
		if (exchangeProject == null) {
			exchangeProject = exchangeProjectsAnalyzer.analyzeProject(project);
			exchangeProjectsAnalyzer.saveResource(exchangeProject, project);

		} else {
			if (exchangeProject.getStatus() == EpProjectStatus.READY) {
				// TODO: Сделать обновление только когда deltas соответствует модулям
				exchangeProject = exchangeProjectsAnalyzer.analyzeProject(project);
				exchangeProjectsAnalyzer.saveResource(exchangeProject, project);

			} else {
				exchangeProject = exchangeProjectsAnalyzer.analyzeProject(project);
				exchangeProjectsAnalyzer.saveResource(exchangeProject, project);

			}

		}

	}
}
