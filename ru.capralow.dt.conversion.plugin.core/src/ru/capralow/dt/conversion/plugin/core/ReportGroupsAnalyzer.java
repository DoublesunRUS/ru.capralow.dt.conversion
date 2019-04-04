package ru.capralow.dt.conversion.plugin.core;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups;

public class ReportGroupsAnalyzer {
	private static final Logger LOGGER = LoggerFactory.getLogger(ReportGroupsAnalyzer.class);

	public static URI getResourceURIforPlugin(String moduleName, IProject project) {
		return URI.createFileURI(project.getLocation() + File.separator + "exchangeDataReport-" + moduleName + ".xmi");
	}

	public static ReportGroups loadResource(URI xmiUri) {
		File file = new File(xmiUri.toFileString());
		if (!file.exists())
			return null;

		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			// TODO: Сделать пересборку вторичных данных если файла нет
			final Map<Object, Object> loadOptions = xmiResource.getDefaultLoadOptions();
			xmiResource.load(loadOptions);
			return (ReportGroups) xmiResource.getContents().get(0);

		} catch (IOException e) {
			String msg = "Не удалось загрузить вторичные данные для ReportGroups. Удалите группы и настройте заново.";
			LOGGER.error(msg, e);

		}

		return null;
	}

	public static void saveResource(ReportGroups reportGroups, URI xmiUri) {
		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			xmiResource.getContents().add(reportGroups);
			final Map<Object, Object> saveOptions = xmiResource.getDefaultSaveOptions();
			saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
			xmiResource.save(saveOptions);

		} catch (IOException e) {
			String msg = "Не удалось сохранить вторичные данные для ReportGroups. Удалите группы и настройте заново.";
			LOGGER.error(msg, e);

		}

	}

	private ReportGroupsAnalyzer() {
		throw new IllegalStateException("Вспомогательный класс");
	}

}