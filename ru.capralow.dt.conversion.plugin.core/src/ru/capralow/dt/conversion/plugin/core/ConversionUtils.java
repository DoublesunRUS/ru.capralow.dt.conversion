package ru.capralow.dt.conversion.plugin.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

public final class ConversionUtils {
	private static final String PLUGIN_ID = "ru.capralow.dt.conversion.plugin.ui";
	private static ILog LOG = Platform.getLog(Platform.getBundle(PLUGIN_ID));

	public static MdObject getConfigurationObject(String objectFullName, IBmEmfIndexProvider bmEmfIndexProvider) {
		String[] objectArray = objectFullName.split("[.]");

		String objectType = objectArray[0];
		String objectName = objectArray[1];

		QualifiedName qnObjectName = QualifiedName.create("");
		EClass mdLiteral = MdClassPackage.Literals.CONFIGURATION;

		if (objectType.equals("Подсистема")) {
			if (objectArray.length == 2)
				qnObjectName = QualifiedName.create("Subsystem", objectName);
			else
				qnObjectName = QualifiedName.create("Subsystem", objectName, "Subsystem", objectArray[2]);
			mdLiteral = MdClassPackage.Literals.SUBSYSTEM;

		} else if (objectType.equals("ОбщийМодуль")) {
			qnObjectName = QualifiedName.create("CommonModule", objectName);
			mdLiteral = MdClassPackage.Literals.COMMON_MODULE;

		} else if (objectType.equals("Справочник")) {
			qnObjectName = QualifiedName.create("Catalog", objectName);
			mdLiteral = MdClassPackage.Literals.CATALOG;

		} else if (objectType.equals("Документ")) {
			qnObjectName = QualifiedName.create("Document", objectName);
			mdLiteral = MdClassPackage.Literals.DOCUMENT;

		} else if (objectType.equals("Перечисление")) {
			qnObjectName = QualifiedName.create("Enum", objectName);
			mdLiteral = MdClassPackage.Literals.ENUM;

		} else if (objectType.equals("ПланВидовХарактеристик")) {
			qnObjectName = QualifiedName.create("ChartOfCharacteristicTypes", objectName);
			mdLiteral = MdClassPackage.Literals.CHART_OF_CHARACTERISTIC_TYPES;

		} else if (objectType.equals("ПланВидовРасчета")) {
			qnObjectName = QualifiedName.create("ChartOfCalculationTypes", objectName);
			mdLiteral = MdClassPackage.Literals.CHART_OF_CALCULATION_TYPES;

		} else if (objectType.equals("РегистрСведений")) {
			qnObjectName = QualifiedName.create("InformationRegister", objectName);
			mdLiteral = MdClassPackage.Literals.INFORMATION_REGISTER;

		}

		MdObject object = null;

		Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider.getEObjectIndexByType(mdLiteral, qnObjectName,
				true);
		Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
		if (objectItr.hasNext())
			object = (MdObject) objectItr.next().getEObjectOrProxy();

		if (object == null)
			LOG.log(new Status(IStatus.WARNING, PLUGIN_ID, "Не найден объект конфигурации: " + objectFullName));

		return object;
	}

	public static URI getResourceURIforPlugin(String projectName, String fileName, AbstractUIPlugin plugin) {
		URI uri = URI.createPlatformResourceURI(projectName + File.separator + fileName + ".xmi", false);

		try {
			File file = ConversionUtils.getResourceFile(uri, plugin);

			return URI.createFileURI(file.getPath());

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

		return null;
	}

	private static File getResourceFile(URI uri, AbstractUIPlugin plugin) throws FileNotFoundException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String[] segments = uri.segments();
		if (!foundProjectInWorkspace(workspace, URI.decode(segments[1]))) {
			throw new FileNotFoundException("Не найден проект с именем: " + segments[1]);
		}
		IPath resourcePath = plugin.getStateLocation();
		for (int i = 1; i < segments.length - 1; ++i) {
			resourcePath = resourcePath.append(segments[i]);
			File file = resourcePath.toFile();
			if (file.exists() && !file.isDirectory()) {
				file.delete();
			} else if (!file.exists()) {
				file.mkdir();
			}
		}
		resourcePath = resourcePath.append(segments[segments.length - 1]);
		File file = resourcePath.toFile();
		return file;
	}

	private static Boolean foundProjectInWorkspace(IWorkspace workspace, String projectName) {
		return workspace.getRoot().getProject(projectName) != null;
	}

}
