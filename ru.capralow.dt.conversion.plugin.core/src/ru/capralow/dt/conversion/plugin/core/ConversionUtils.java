package ru.capralow.dt.conversion.plugin.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

public final class ConversionUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConversionUtils.class);

	public static Integer compareArraysOfString(String[] str1, String[] str2) {
		if (str1 == null || str2 == null)
			return 0;

		if (Arrays.equals(str1, str2))
			return 0;

		if (str1.length != str2.length)
			return str1.length - str2.length;

		for (Integer i = 0; i < str1.length; i++) {
			if (str1[i] == null)
				return -1;
			if (str2[i] == null)
				return 1;

			Integer result = str1[i].compareToIgnoreCase(str2[i]);
			if (result != 0)
				return result;
		}

		return 0;
	}

	public static MdObject getConfigurationObject(String objectFullName, IBmEmfIndexProvider bmEmfIndexProvider) {
		String[] objectArray = objectFullName.split("[.]");
		if (objectArray.length < 2)
			return null;

		String objectType = objectArray[0];
		String objectName = objectArray[1];

		QualifiedName qnObjectName = QualifiedName.create("");
		EClass mdLiteral = MdClassPackage.Literals.CONFIGURATION;

		if (objectType.equals("Подсистема")) {
			mdLiteral = MdClassPackage.Literals.SUBSYSTEM;
			if (objectArray.length == 2)
				qnObjectName = QualifiedName.create(mdLiteral.getName(), objectName);
			else
				qnObjectName = QualifiedName.create(mdLiteral.getName(), objectName, mdLiteral.getName(),
						objectArray[2]);

		} else if (objectType.equals("ОбщийМодуль")) {
			mdLiteral = MdClassPackage.Literals.COMMON_MODULE;
			qnObjectName = QualifiedName.create(mdLiteral.getName(), objectName);

		} else if (objectType.equals("Справочник")) {
			mdLiteral = MdClassPackage.Literals.CATALOG;
			qnObjectName = QualifiedName.create(mdLiteral.getName(), objectName);

		} else if (objectType.equals("Документ")) {
			mdLiteral = MdClassPackage.Literals.DOCUMENT;
			qnObjectName = QualifiedName.create(mdLiteral.getName(), objectName);

		} else if (objectType.equals("Перечисление")) {
			mdLiteral = MdClassPackage.Literals.ENUM;
			qnObjectName = QualifiedName.create(mdLiteral.getName(), objectName);

		} else if (objectType.equals("ПланВидовХарактеристик")) {
			mdLiteral = MdClassPackage.Literals.CHART_OF_CHARACTERISTIC_TYPES;
			qnObjectName = QualifiedName.create(mdLiteral.getName(), objectName);

		} else if (objectType.equals("ПланВидовРасчета")) {
			mdLiteral = MdClassPackage.Literals.CHART_OF_CALCULATION_TYPES;
			qnObjectName = QualifiedName.create(mdLiteral.getName(), objectName);

		} else if (objectType.equals("РегистрСведений")) {
			mdLiteral = MdClassPackage.Literals.INFORMATION_REGISTER;
			qnObjectName = QualifiedName.create(mdLiteral.getName(), objectName);

		}

		MdObject object = null;

		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider.getEObjectIndexByType(mdLiteral, qnObjectName,
				true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext())
			object = (MdObject) objectItr.next().getEObjectOrProxy();

		if (object == null) {
			String msg = String.format("Не найден объект конфигурации: \"%1$s\"", objectFullName);
			LOGGER.error(msg);
		}

		return object;
	}

	public static URI getResourceURIforPlugin(String projectName, String fileName, AbstractUIPlugin plugin) {
		String projectFileName = projectName + File.separator + fileName + ".xmi";
		URI uri = URI.createPlatformResourceURI(projectFileName, false);

		try {
			File file = ConversionUtils.getResourceFile(uri, plugin);

			return URI.createFileURI(file.getPath());

		} catch (FileNotFoundException e) {
			String msg = String.format("Не найден файл по следующему платформенному пути: \"%1$s\"", projectFileName);
			LOGGER.error(msg, e);

		}

		return null;
	}

	private static Boolean foundProjectInWorkspace(IWorkspace workspace, String projectName) {
		return workspace.getRoot().getProject(projectName) != null;
	}

	private static File getResourceFile(URI uri, AbstractUIPlugin plugin) throws FileNotFoundException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String[] segments = uri.segments();
		if (!foundProjectInWorkspace(workspace, URI.decode(segments[1]))) {
			throw new FileNotFoundException("Не найден проект с именем: " + segments[1]);
		}
		IPath resourcePath = plugin.getStateLocation();
		for (Integer i = 1; i < segments.length - 1; ++i) {
			resourcePath = resourcePath.append(segments[i]);
			File file = resourcePath.toFile();
			if (file.exists() && !file.isDirectory()) {
				try {
					Files.delete(file.toPath());

				} catch (IOException e) {
					String msg = String.format("Не получилось удалить файл: \"%1$s\"", file.toPath());
					LOGGER.error(msg, e);

				}
			} else if (!file.exists()) {
				file.mkdir();
			}
		}
		resourcePath = resourcePath.append(segments[segments.length - 1]);
		return resourcePath.toFile();
	}

	private ConversionUtils() {
		throw new IllegalStateException("Вспомогательный класс");
	}

}
