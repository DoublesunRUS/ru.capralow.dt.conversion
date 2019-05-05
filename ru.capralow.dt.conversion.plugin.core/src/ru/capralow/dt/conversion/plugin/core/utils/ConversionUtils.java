package ru.capralow.dt.conversion.plugin.core.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

import ru.capralow.dt.conversion.plugin.core.ConversionPlugin;

public final class ConversionUtils {
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

			Integer result = str1[i].replace("_", "0").compareToIgnoreCase(str2[i].replace("_", "0"));
			if (result != 0)
				return result;
		}

		return 0;
	}

	public static MdObject getConfigurationObject(String objectFullName, IBmEmfIndexProvider bmEmfIndexProvider) {
		EClass mdLiteral = getMdLiteral(objectFullName);
		QualifiedName qnObjectName = getConfigurationObjectQualifiedName(objectFullName, mdLiteral);

		MdObject object = null;

		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider
				.getEObjectIndexByType(mdLiteral, qnObjectName, true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext())
			object = (MdObject) objectItr.next().getEObjectOrProxy();

		if (object == null)
			return null;

		return object;
	}

	public static URI getResourceURIforPlugin(String projectName, String fileName) {
		String projectFileName = projectName + File.separator + fileName + ".xmi";
		URI uri = URI.createPlatformResourceURI(projectFileName, false);

		try {
			File file = getResourceFile(uri);

			return URI.createFileURI(file.getPath());

		} catch (FileNotFoundException e) {
			String msg = MessageFormat.format("Не найден файл по следующему платформенному пути: \"{0}\"",
					projectFileName);
			ConversionPlugin.log(ConversionPlugin.createErrorStatus(msg, e));

		}

		return null;
	}

	private static Boolean foundProjectInWorkspace(IWorkspace workspace, String projectName) {
		return workspace.getRoot().getProject(projectName) != null;
	}

	private static QualifiedName getConfigurationObjectQualifiedName(String objectFullName, EClass mdLiteral) {
		String[] objectArray = objectFullName.substring(objectFullName.indexOf('.') + 1).split("[.]");

		QualifiedName qnObjectName = null;
		for (String objectValue : objectArray) {
			if (qnObjectName == null)
				qnObjectName = QualifiedName.create(mdLiteral.getName(), objectValue);

			else {
				if (mdLiteral.equals(MdClassPackage.Literals.SUBSYSTEM))
					qnObjectName = qnObjectName.append(QualifiedName.create(mdLiteral.getName(), objectValue));

				else
					qnObjectName = qnObjectName.append(QualifiedName.create(objectValue));

				// else if (mdLiteral.equals(MdClassPackage.Literals.CATALOG))
				// qnObjectName = qnObjectName.append(
				// QualifiedName.create(MdClassPackage.Literals.CATALOG_PREDEFINED.getName(),
				// objectValue));
				//
				// else if (mdLiteral.equals(MdClassPackage.Literals.ENUM))
				// qnObjectName = qnObjectName
				// .append(QualifiedName.create(MdClassPackage.Literals.ENUM_VALUE.getName(),
				// objectValue));
				//
				// else {
				// String msg = MessageFormat.format(
				// "Не удалось сформировать QualifiedName для объекта метаданных: \"{0}\"",
				// objectFullName);
				// throw new NullPointerException(msg);
				//
				// }
			}

		}

		return qnObjectName;
	}

	private static EClass getMdLiteral(String objectFullName) {
		EClass mdLiteral = MdClassPackage.Literals.CONFIGURATION;

		String objectType = objectFullName.substring(0, objectFullName.indexOf('.'));

		if (objectType.equals("Подсистема"))
			mdLiteral = MdClassPackage.Literals.SUBSYSTEM;

		else if (objectType.equals("ОбщийМодуль"))
			mdLiteral = MdClassPackage.Literals.COMMON_MODULE;

		else if (objectType.equals("Справочник"))
			mdLiteral = MdClassPackage.Literals.CATALOG;

		else if (objectType.equals("Документ"))
			mdLiteral = MdClassPackage.Literals.DOCUMENT;

		else if (objectType.equals("Перечисление"))
			mdLiteral = MdClassPackage.Literals.ENUM;

		else if (objectType.equals("ПланВидовХарактеристик"))
			mdLiteral = MdClassPackage.Literals.CHART_OF_CHARACTERISTIC_TYPES;

		else if (objectType.equals("ПланВидовРасчета"))
			mdLiteral = MdClassPackage.Literals.CHART_OF_CALCULATION_TYPES;

		else if (objectType.equals("РегистрСведений"))
			mdLiteral = MdClassPackage.Literals.INFORMATION_REGISTER;

		return mdLiteral;
	}

	private static File getResourceFile(URI uri) throws FileNotFoundException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String[] segments = uri.segments();
		if (!foundProjectInWorkspace(workspace, URI.decode(segments[1]))) {
			throw new FileNotFoundException("Не найден проект с именем: " + segments[1]);
		}
		IPath resourcePath = ConversionPlugin.getDefault().getStateLocation();
		for (Integer i = 1; i < segments.length - 1; ++i) {
			resourcePath = resourcePath.append(segments[i]);
			File file = resourcePath.toFile();
			if (file.exists() && !file.isDirectory()) {
				try {
					Files.delete(file.toPath());

				} catch (IOException e) {
					String msg = MessageFormat.format("Не получилось удалить файл: \"{0}\"", file.toPath());
					ConversionPlugin.log(ConversionPlugin.createErrorStatus(msg, e));

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
