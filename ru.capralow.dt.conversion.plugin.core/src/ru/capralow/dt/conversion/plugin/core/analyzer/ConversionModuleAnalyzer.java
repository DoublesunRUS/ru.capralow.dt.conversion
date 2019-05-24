package ru.capralow.dt.conversion.plugin.core.analyzer;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import org.antlr.stringtemplate.StringTemplate;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Pair;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.bsl.model.BooleanLiteral;
import com._1c.g5.v8.dt.bsl.model.Conditional;
import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.Expression;
import com._1c.g5.v8.dt.bsl.model.FeatureAccess;
import com._1c.g5.v8.dt.bsl.model.FormalParam;
import com._1c.g5.v8.dt.bsl.model.Function;
import com._1c.g5.v8.dt.bsl.model.IfStatement;
import com._1c.g5.v8.dt.bsl.model.Invocation;
import com._1c.g5.v8.dt.bsl.model.Literal;
import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.NumberLiteral;
import com._1c.g5.v8.dt.bsl.model.RegionPreprocessorDeclareStatement;
import com._1c.g5.v8.dt.bsl.model.ReturnStatement;
import com._1c.g5.v8.dt.bsl.model.SimpleStatement;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.bsl.model.StaticFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.StringLiteral;
import com._1c.g5.v8.dt.bsl.model.UndefinedLiteral;
import com._1c.g5.v8.dt.cmi.model.CommandInterface;
import com._1c.g5.v8.dt.cmi.model.CommandsPlacementFragment;
import com._1c.g5.v8.dt.cmi.model.SubsystemsOrder;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IExtensionProject;
import com._1c.g5.v8.dt.core.platform.IV8Project;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.mcore.Command;
import com._1c.g5.v8.dt.mcore.Type;
import com._1c.g5.v8.dt.mcore.TypeItem;
import com._1c.g5.v8.dt.mcore.TypeSet;
import com._1c.g5.v8.dt.metadata.mdclass.Catalog;
import com._1c.g5.v8.dt.metadata.mdclass.CatalogCommand;
import com._1c.g5.v8.dt.metadata.mdclass.CatalogPredefinedItem;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._1c.g5.v8.dt.metadata.mdclass.Document;
import com._1c.g5.v8.dt.metadata.mdclass.DocumentCommand;
import com._1c.g5.v8.dt.metadata.mdclass.Enum;
import com._1c.g5.v8.dt.metadata.mdclass.EnumValue;
import com._1c.g5.v8.dt.metadata.mdclass.InformationRegister;
import com._1c.g5.v8.dt.metadata.mdclass.InformationRegisterDimension;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;
import com._1c.g5.v8.dt.metadata.mdclass.StandardCommand;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;
import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

import ru.capralow.dt.conversion.plugin.core.ConversionPlugin;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObject;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmParam;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedCatalogValue;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedEnumValue;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;
import ru.capralow.dt.conversion.plugin.core.utils.ConversionUtils;

public class ConversionModuleAnalyzer {
	private static class SubsystemsFiller {
		private EList<CmSubsystem> cmSubsystems;

		private ConversionModule conversionModule;
		private CommandInterface mainCommandInterface;
		private CmSubsystem cmMainSubsystem;

		public SubsystemsFiller(ConversionModule conversionModule, CommandInterface mainCommandInterface,
				CmSubsystem cmMainSubsystem) {
			this.conversionModule = conversionModule;
			this.mainCommandInterface = mainCommandInterface;
			this.cmMainSubsystem = cmMainSubsystem;
		}

		private void addSubsystemsFromCatalogCommand(Object object, Command placementCommand) {
			CatalogCommand placementCatalogCommand = (CatalogCommand) placementCommand;
			Catalog masterObject = org.eclipse.xtext.EcoreUtil2.getContainerOfType(placementCatalogCommand,
					Catalog.class);
			if (!masterObject.equals((Catalog) object))
				return;

			cmSubsystems.add(cmMainSubsystem);
		}

		private void addSubsystemsFromCatalogOwners(Object object) {
			if (!(object instanceof Catalog))
				return;

			for (MdObject masterObject : ((Catalog) object).getOwners())
				addSubsystemsFromObject(masterObject);
		}

		private void addSubsystemsFromCmSubsystems(Object object, EList<CmSubsystem> cmSubsystems) {
			for (CmSubsystem cmSubsystem : cmSubsystems) {
				Subsystem interfaceSubsystem = cmSubsystem.getSubsystem();
				if (interfaceSubsystem == null)
					continue;

				if (interfaceSubsystem.getContent().indexOf(object) != -1)
					cmSubsystems.add(cmSubsystem);

				else
					addSubsystemsFromInterface(object, cmSubsystem, interfaceSubsystem.getSubsystems());

			}
		}

		private void addSubsystemsFromDocumentCommand(Object object, Command placementCommand) {
			DocumentCommand placementDocumentCommand = (DocumentCommand) placementCommand;
			Document masterObject = org.eclipse.xtext.EcoreUtil2.getContainerOfType(placementDocumentCommand,
					Document.class);
			if (!masterObject.equals((Document) object))
				return;

			cmSubsystems.add(cmMainSubsystem);
		}

		private void addSubsystemsFromInterface(Object object, CmSubsystem cmSubsystem,
				EList<Subsystem> interfaceSubsystems) {
			for (Subsystem interfaceSubsystem : interfaceSubsystems) {
				if (interfaceSubsystem.getContent().indexOf(object) != -1)
					cmSubsystems.add(cmSubsystem);

				else
					addSubsystemsFromInterface(object, cmSubsystem, interfaceSubsystem.getSubsystems());

			}
		}

		private void addSubsystemsFromMainInterface(Object mainObject) {
			for (CommandsPlacementFragment placementFragment : mainCommandInterface.getCommandsPlacement()
					.getPlacementFragments()) {
				for (Command placementCommand : placementFragment.getCommands()) {
					if (mainObject instanceof Catalog && placementCommand instanceof CatalogCommand)
						addSubsystemsFromCatalogCommand(mainObject, placementCommand);

					else if (mainObject instanceof Document && placementCommand instanceof DocumentCommand)
						addSubsystemsFromDocumentCommand(mainObject, placementCommand);

					else if (placementCommand instanceof StandardCommand)
						addSubsystemsFromStandardCommand(mainObject, placementCommand);

				}
			}
		}

		private void addSubsystemsFromObject(Object object) {
			addSubsystemsFromMainInterface(object);

			addSubsystemsFromCmSubsystems(object, conversionModule.getSubsystems());

			addSubsystemsFromCatalogOwners(object);
		}

		private void addSubsystemsFromRegisterDimensions(Object object) {
			if (!(object instanceof InformationRegister))
				return;

			for (InformationRegisterDimension dimension : ((InformationRegister) object).getDimensions()) {
				if (!dimension.isMaster())
					continue;

				for (TypeItem type : dimension.getType().getTypes()) {
					if (type instanceof TypeSet) {
						for (Type subType : ((TypeSet) type).getTypes()) {
							MdObject masterObject = com._1c.g5.v8.dt.md.resource.MdTypeUtil.getTypeProducer(subType);
							addSubsystemsFromObject(masterObject);
						}

					} else {
						MdObject masterObject = com._1c.g5.v8.dt.md.resource.MdTypeUtil.getTypeProducer(type);
						addSubsystemsFromObject(masterObject);

					}
				}
			}
		}

		private void addSubsystemsFromStandardCommand(Object object, Command placementCommand) {
			StandardCommand placementStandardCommand = (StandardCommand) placementCommand;
			MdObject masterObject = org.eclipse.xtext.EcoreUtil2.getContainerOfType(placementStandardCommand,
					MdObject.class);
			if (!masterObject.equals(object))
				return;

			cmSubsystems.add(cmMainSubsystem);
		}

		EList<CmSubsystem> getSubsystems(Object mainObject) {
			cmSubsystems = new BasicEList<>();

			addSubsystemsFromObject(mainObject);

			addSubsystemsFromRegisterDimensions(mainObject);

			return cmSubsystems;
		}
	}

	private static final String LS = System.lineSeparator();

	private static final String ADD_DATARULE = "ДобавитьПОД_";
	private static final String ADD_OBJECTRULE = "ДобавитьПКО_";

	private static final String OBJECT_RULE_NAME_PARAM = "ObjectRuleName";
	private static final String CONFIGURATION_OBJECT_PARAM = "ConfigurationObject";
	private static final String FORMAT_OBJECT_PARAM = "FormatObject";
	private static final String ATTRIBUTERULES_PARAM = "AttributeRules";
	private static final String IDENTIFICATION_VARIANT_PARAM = "IdentificationVariant";
	private static final String EVENTS_PARAM = "Events";
	private static final String PREDEFINEDS_PARAM = "Predefineds";

	private static final String PARAMS_FOR_OBJECTRULE = "(ПравилаКонвертации)";

	private static final String UNKNOWN_VALUE = "Неопределено";

	private static final String END_OF_REGION = "#КонецОбласти";

	private static final String REPLACE_EMPTY_PROPERTIES = "---\\r\\n|---\\r|---\\n";

	public static final Integer COMPARATOR_ORDER_BY_NAME = 1;
	public static final Integer COMPARATOR_ORDER_BY_SENDING = 2;
	public static final Integer COMPARATOR_ORDER_BY_RECEIVING = 3;
	public static final Integer COMPARATOR_ORDER_BY_SENDING_RECEIVING = 4;
	public static final Integer COMPARATOR_ORDER_BY_ROUTE_NAME = 5;

	private static final String ROUTE_IF_ELSEIF = "	%1$sЕсли НаправлениеОбмена = \"%2$s\" Тогда";

	private static final String IF = "Если";
	private static final String ELSEIF = "ИначеЕсли";
	private static final String ENDIF = "	КонецЕсли;";

	private static final String SENDING_ROUTE = "Отправка";
	private static final String RECEIVING_ROUTE = "Получение";

	private static final String HEADER_ATTRIBUTES = "СвойстваШапки";
	private static final String TABULAR_ATTRIBUTES = "СвойстваТЧ";

	private static final String OBJECT_NOT_FOUND_ERROR_0 = "Не найден объект конфигурации: \"{0}\"";
	private static final String DATARULE_FOR_SENDING_RECEIVING_ERROR = "Правило Обработки Данных не может быть одновременно для отправки и получения.";

	public static ConversionModule analyze(CommonModule commonModule, IV8ProjectManager projectManager,
			IBmEmfIndexManager bmEmfIndexManager) {
		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();

		conversionModule.setStoreVersion("1");

		conversionModule.getDataRules().clear();
		conversionModule.getObjectRules().clear();
		conversionModule.getPredefineds().clear();
		conversionModule.getAlgorithms().clear();

		IV8Project configurationProject = projectManager.getProject(commonModule);
		if (configurationProject instanceof IExtensionProject)
			configurationProject = ((IExtensionProject) configurationProject).getParent();

		Configuration configuration = ((IConfigurationProject) configurationProject).getConfiguration();

		Module module = commonModule.getModule();

		CmSubsystem cmMainSubsystem = addSubsystems(conversionModule.getSubsystems(),
				(CommandInterface) configuration.getCommandInterface());

		for (Method method : module.allMethods())
			parseMethod(method,
					module,
					cmMainSubsystem,
					configuration,
					conversionModule,
					projectManager,
					bmEmfIndexManager);

		return conversionModule;
	}

	public static ConversionModule analyzeAndSave(CommonModule commonModule, URI xmiURI,
			IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {
		ConversionModule conversionModule = analyze(commonModule, projectManager, bmEmfIndexManager);
		saveResource(conversionModule, xmiURI);

		return conversionModule;
	}

	public static void createDataRuleReceivingText(CmDataRule dataRule, StringBuilder dataRulesReceiving) {
		final String TEMPLATE_NAME_DataRuleReceiving = "DataRuleReceivingV2.txt";
		String templateDataRuleReceivingContent = readContents(getFileInputSupplier(TEMPLATE_NAME_DataRuleReceiving));

		if (dataRulesReceiving.length() != 0)
			dataRulesReceiving.append(LS);
		StringTemplate templateDataRuleReceiving = new StringTemplate(templateDataRuleReceivingContent);

		templateDataRuleReceiving.setAttribute("DataRuleName", dataRule.getName());

		templateDataRuleReceiving.setAttribute(FORMAT_OBJECT_PARAM, dataRule.getFormatObject());
		templateDataRuleReceiving.setAttribute("OnProcessingEvent", dataRule.getOnProcessingEventDeclaration());

		StringBuilder objectRulesText = new StringBuilder();
		for (CmObjectRule objectRule : dataRule.getObjectRules()) {
			if (objectRulesText.length() != 0)
				objectRulesText.append(LS);

			objectRulesText.append("ПравилоОбработки.ИспользуемыеПКО.Добавить(\"").append(objectRule.getName())
					.append("\");");
		}
		templateDataRuleReceiving.setAttribute("ObjectRules", objectRulesText);

		StringBuilder dataRuleEventsText = new StringBuilder();
		if (!dataRule.getOnProcessingEvent().isEmpty())
			dataRuleEventsText.append(LS).append(dataRule.getOnProcessingEventText());

		templateDataRuleReceiving.setAttribute(EVENTS_PARAM, dataRuleEventsText);

		String dataRuleReceiving = replaceEmptyDataRulePropertiesText(templateDataRuleReceiving.toString());

		dataRulesReceiving.append(dataRuleReceiving);
	}

	public static String createDataRulesDeclarationText(EList<CmDataRule> dataRules) {
		if (dataRules.isEmpty())
			return "";

		StringBuilder sendingText = new StringBuilder();
		StringBuilder receivingText = new StringBuilder();

		for (CmDataRule dataRule : dataRules) {
			if (dataRule.getForSending() && dataRule.getForReceiving()) {
				String msg = DATARULE_FOR_SENDING_RECEIVING_ERROR;
				throw new NullPointerException(msg);
			}

			else if (dataRule.getForSending()) {
				if (sendingText.length() != 0)
					sendingText.append(LS);
				sendingText.append(ADD_DATARULE).append(dataRule.getName()).append("(ПравилаОбработкиДанных);");

			} else if (dataRule.getForReceiving()) {
				if (receivingText.length() != 0)
					receivingText.append(LS);
				receivingText.append(ADD_DATARULE).append(dataRule.getName()).append("(ПравилаОбработкиДанных);");

			}
		}

		final String ADD_COLUMN = String.join(LS,
				"		Если ПравилаОбработкиДанных.Колонки.Найти(\"ОчисткаДанных\") = Неопределено Тогда",
				"			ПравилаОбработкиДанных.Колонки.Добавить(\"ОчисткаДанных\");",
				"		КонецЕсли;");

		String templateDeclarationContent = "";
		if (sendingText.length() != 0)
			templateDeclarationContent += String
					.join(LS, String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE), ADD_COLUMN, "		$Sending$", "");
		if (receivingText.length() != 0)
			templateDeclarationContent += String.join(LS,
					String.format(ROUTE_IF_ELSEIF, sendingText.length() != 0 ? "Иначе" : "", RECEIVING_ROUTE),
					"		$Receiving$",
					"");
		templateDeclarationContent += String.join(LS, ENDIF);

		StringTemplate templateDeclaration = new StringTemplate(templateDeclarationContent);

		templateDeclaration.setAttribute("Sending", sendingText);
		templateDeclaration.setAttribute("Receiving", receivingText);

		return templateDeclaration.toString();

	}

	public static void createDataRuleSendingText(CmDataRule dataRule, StringBuilder dataRulesSending) {
		final String TEMPLATE_NAME_DATA_RULE_SENDING = "DataRuleSendingV2.txt";
		String templateDataRuleSendingContent = readContents(getFileInputSupplier(TEMPLATE_NAME_DATA_RULE_SENDING));

		if (dataRulesSending.length() != 0)
			dataRulesSending.append(LS);
		StringTemplate templateDataRuleSending = new StringTemplate(templateDataRuleSendingContent);

		templateDataRuleSending.setAttribute("DataRuleName", dataRule.getName());

		templateDataRuleSending.setAttribute(CONFIGURATION_OBJECT_PARAM,
				dataRule.getConfigurationObjectName().isEmpty() ? UNKNOWN_VALUE
						: dataRule.getConfigurationObjectName());
		templateDataRuleSending.setAttribute("OnProcessingEvent", dataRule.getOnProcessingEventDeclaration());
		templateDataRuleSending.setAttribute("DataSelectionEvent", dataRule.getDataSelectionEventDeclaration());
		templateDataRuleSending.setAttribute("IsDataCleaning", dataRule.getDataCleaningDeclaration());

		StringBuilder objectRulesText = new StringBuilder();
		for (CmObjectRule objectRule : dataRule.getObjectRules()) {
			if (objectRulesText.length() != 0)
				objectRulesText.append(LS);

			objectRulesText.append("ПравилоОбработки.ИспользуемыеПКО.Добавить(\"").append(objectRule.getName())
					.append("\");");
		}
		templateDataRuleSending.setAttribute("ObjectRules", objectRulesText);

		StringBuilder dataRuleEventsText = new StringBuilder();
		if (!dataRule.getOnProcessingEvent().isEmpty())
			dataRuleEventsText.append(LS).append(dataRule.getOnProcessingEventText());
		if (!dataRule.getDataSelectionEvent().isEmpty())
			dataRuleEventsText.append(LS).append(dataRule.getDataSelectionEventText());

		templateDataRuleSending.setAttribute(EVENTS_PARAM, dataRuleEventsText);

		String dataRuleSending = replaceEmptyDataRulePropertiesText(templateDataRuleSending.toString());

		dataRulesSending.append(dataRuleSending);
	}

	public static void createEventsDeclaratioAlgorithmText(CmAlgorithm algorithm, StringBuilder proceduresText,
			StringBuilder functionsText) {
		if (!algorithm.getExists())
			return;

		final String afterReceivingAlgorithm = String
				.join(LS, "	%3$s ИмяПроцедуры = \"%1$s\" Тогда ", "		%1$s(", "			%2$s);", "");

		StringBuilder methodParams = new StringBuilder();
		for (CmParam cmParam : algorithm.getParams()) {
			if (methodParams.length() != 0)
				methodParams.append(", ");

			methodParams.append("Параметры.").append(cmParam.getName());
			if (!cmParam.getDefaultValue().isEmpty())
				methodParams.append(" = ").append(cmParam.getDefaultValue());
		}

		if (algorithm.getMethodType() == CmMethodType.PROCEDURE) {
			String objectRulesPrefix = proceduresText.length() == 0 ? IF : ELSEIF;
			proceduresText.append(
					String.format(afterReceivingAlgorithm, algorithm.getName(), methodParams, objectRulesPrefix));

		} else if (algorithm.getMethodType() == CmMethodType.FUNCTION) {
			String objectRulesPrefix = functionsText.length() == 0 ? IF : ELSEIF;
			functionsText.append(
					String.format(afterReceivingAlgorithm, algorithm.getName(), methodParams, objectRulesPrefix));

		}
	}

	public static Map<CmMethodType, StringBuilder> createEventsDeclarationText(ConversionModule conversionModule) {
		StringBuilder proceduresText = new StringBuilder();
		StringBuilder functionsText = new StringBuilder();

		EList<CmAlgorithm> afterReceivingAlgorithms = new BasicEList<>();

		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		ECollections.sort(dataRules, getDataRuleComparator(COMPARATOR_ORDER_BY_NAME));
		for (CmDataRule dataRule : dataRules)
			createEventsDeclarationDataRuleText(dataRule, proceduresText, functionsText);

		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		ECollections.sort(objectRules, getObjectRuleComparator(COMPARATOR_ORDER_BY_NAME));
		for (CmObjectRule objectRule : objectRules) {
			createEventsDeclarationObjectRuleText(objectRule, proceduresText);

			if (objectRule.getAfterReceivingAlgorithm() != null
					&& !afterReceivingAlgorithms.contains(objectRule.getAfterReceivingAlgorithm()))
				afterReceivingAlgorithms.add(objectRule.getAfterReceivingAlgorithm());
		}

		ECollections.sort(afterReceivingAlgorithms, getAlgorithmComparator());
		for (CmAlgorithm algorithm : afterReceivingAlgorithms)
			createEventsDeclaratioAlgorithmText(algorithm, proceduresText, functionsText);

		if (proceduresText.length() != 0)
			proceduresText.append(ENDIF);
		if (functionsText.length() != 0)
			functionsText.append(ENDIF);

		Map<CmMethodType, StringBuilder> events = new EnumMap<>(CmMethodType.class);
		events.put(CmMethodType.PROCEDURE, proceduresText);
		events.put(CmMethodType.FUNCTION, functionsText);

		return events;
	}

	public static void createObjectRuleReceivingText(CmObjectRule objectRule, StringBuilder objectRulesReceiving) {
		if (objectRule.getName().isEmpty())
			return;

		final String TEMPLATE_NAME_ObjectRuleReceiving = "ObjectRuleReceivingV2.txt";
		String templateObjectRuleReceivingContent = readContents(
				getFileInputSupplier(TEMPLATE_NAME_ObjectRuleReceiving));

		if (objectRulesReceiving.length() != 0)
			objectRulesReceiving.append(LS);
		StringTemplate templateObjectRuleReceiving = new StringTemplate(templateObjectRuleReceivingContent);

		templateObjectRuleReceiving.setAttribute(OBJECT_RULE_NAME_PARAM, objectRule.getName());

		templateObjectRuleReceiving.setAttribute(CONFIGURATION_OBJECT_PARAM,
				objectRule.getConfigurationObjectName().isEmpty() ? UNKNOWN_VALUE
						: objectRule.getConfigurationObjectName());
		templateObjectRuleReceiving.setAttribute(FORMAT_OBJECT_PARAM, objectRule.getFormatObject());
		templateObjectRuleReceiving.setAttribute("ForGroup", objectRule.getForGroupDeclaration());

		createObjectRuleReceivingAttributeRulesText(objectRule, templateObjectRuleReceiving);

		createObjectRuleReceivingEventsText(objectRule, templateObjectRuleReceiving);

		createObjectRuleReceivingIdentificationText(objectRule, templateObjectRuleReceiving);

		String objectRuleReceiving = replaceEmptyObjectRulePropertiesText(templateObjectRuleReceiving.toString());

		objectRulesReceiving.append(objectRuleReceiving);
	}

	public static String createObjectRulesDeclarationText(EList<CmObjectRule> objectRules) {
		if (objectRules.isEmpty())
			return "";

		StringBuilder bothText = new StringBuilder();
		StringBuilder sendingText = new StringBuilder();
		StringBuilder receivingText = new StringBuilder();

		for (CmObjectRule objectRule : objectRules) {
			if (objectRule.getForSending() && objectRule.getForReceiving()) {
				if (bothText.length() != 0)
					bothText.append(LS);
				bothText.append(ADD_OBJECTRULE).append(objectRule.getName()).append(PARAMS_FOR_OBJECTRULE).append(";");

			} else if (objectRule.getForSending()) {
				if (sendingText.length() != 0)
					sendingText.append(LS);
				sendingText.append(ADD_OBJECTRULE).append(objectRule.getName()).append(PARAMS_FOR_OBJECTRULE)
						.append(";");

			} else if (objectRule.getForReceiving()) {
				if (receivingText.length() != 0)
					receivingText.append(LS);
				receivingText.append(ADD_OBJECTRULE).append(objectRule.getName()).append(PARAMS_FOR_OBJECTRULE)
						.append(";");

			}
		}

		StringBuilder templateDeclarationContent = new StringBuilder();
		if (sendingText.length() != 0)
			templateDeclarationContent.append(
					String.join(LS, String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE), "		$Sending$", ""));
		if (receivingText.length() != 0)
			templateDeclarationContent.append(String.join(LS,
					String.format(ROUTE_IF_ELSEIF, sendingText.length() != 0 ? "Иначе" : "", RECEIVING_ROUTE),
					"		$Receiving$",
					""));
		if (sendingText.length() != 0 || receivingText.length() != 0)
			templateDeclarationContent.append(ENDIF);
		if ((sendingText.length() != 0 || receivingText.length() != 0) && bothText.length() != 0)
			templateDeclarationContent.append(LS);
		if (bothText.length() != 0)
			templateDeclarationContent.append("	$Both$");

		StringTemplate templateDeclaration = new StringTemplate(templateDeclarationContent.toString());

		templateDeclaration.setAttribute("Sending", sendingText);
		templateDeclaration.setAttribute("Receiving", receivingText);
		templateDeclaration.setAttribute("Both", bothText);

		return templateDeclaration.toString();

	}

	public static void createObjectRuleSendingText(CmObjectRule objectRule, StringBuilder objectRulesSending) {
		if (objectRule.getName().isEmpty())
			return;

		final String TEMPLATE_NAME_ObjectRuleSending = "ObjectRuleSendingV2.txt";
		String templateObjectRuleSendingContent = readContents(getFileInputSupplier(TEMPLATE_NAME_ObjectRuleSending));

		if (objectRulesSending.length() != 0)
			objectRulesSending.append(LS);
		StringTemplate templateObjectRuleSending = new StringTemplate(templateObjectRuleSendingContent);

		templateObjectRuleSending.setAttribute(OBJECT_RULE_NAME_PARAM, objectRule.getName());

		templateObjectRuleSending.setAttribute(CONFIGURATION_OBJECT_PARAM,
				objectRule.getConfigurationObjectName().isEmpty() ? UNKNOWN_VALUE
						: objectRule.getConfigurationObjectName());
		templateObjectRuleSending.setAttribute(FORMAT_OBJECT_PARAM, objectRule.getFormatObject());

		createObjectRuleSendingAttributeRulesText(objectRule, templateObjectRuleSending);

		createObjectRuleSendingEventsText(objectRule, templateObjectRuleSending);

		String objectRuleSending = replaceEmptyObjectRulePropertiesText(templateObjectRuleSending.toString());

		objectRulesSending.append(objectRuleSending);

	}

	public static String createPredefinedsDeclarationText(EList<CmPredefined> predefineds) {
		if (predefineds.isEmpty()) {
			return "";
		}

		StringBuilder predefinedsSendingText = new StringBuilder();
		StringBuilder predefinedsReceivingText = new StringBuilder();
		StringBuilder predefinedsBothText = new StringBuilder();

		ECollections.sort(predefineds, getPredefinedComparator(COMPARATOR_ORDER_BY_ROUTE_NAME));

		for (CmPredefined predefined : predefineds) {
			if (predefined.getForSending() && predefined.getForReceiving()) {
				if (predefinedsBothText.length() != 0)
					predefinedsBothText.append(LS);
				createPredefinedText(predefined, predefinedsBothText);
				predefinedsBothText.append(LS);

			} else if (predefined.getForSending()) {
				if (predefinedsSendingText.length() != 0)
					predefinedsSendingText.append("	").append(LS);
				createPredefinedText(predefined, predefinedsSendingText);
				predefinedsSendingText.append(LS);

			} else if (predefined.getForReceiving()) {
				if (predefinedsReceivingText.length() != 0)
					predefinedsReceivingText.append("	").append(LS);
				createPredefinedText(predefined, predefinedsReceivingText);
				predefinedsReceivingText.append(LS);

			}
		}
		if (predefinedsSendingText.length() != 0) {
			predefinedsSendingText.insert(0, "	Если НаправлениеОбмена = \"Отправка\" Тогда".concat(LS));
			predefinedsSendingText.append(ENDIF);
		}
		if (predefinedsReceivingText.length() != 0) {
			predefinedsReceivingText.insert(0, "	Если НаправлениеОбмена = \"Получение\" Тогда".concat(LS));
			predefinedsReceivingText.append(ENDIF);
			if (predefinedsSendingText.length() != 0)
				predefinedsReceivingText.insert(0, LS);
		}

		StringBuilder predefinedsText = new StringBuilder();
		predefinedsText.append(predefinedsSendingText);
		predefinedsText.append(predefinedsReceivingText);
		if (predefinedsBothText.length() != 0) {
			if (predefinedsSendingText.length() != 0 || predefinedsReceivingText.length() != 0)
				predefinedsBothText.insert(0, LS);
			predefinedsText.append(LS).append(predefinedsBothText);
		}

		return predefinedsText.toString();
	}

	public static void createPredefinedText(CmPredefined predefined, StringBuilder predefinedsText) {
		final String TEMPLATE_NAME_PREDEFINED_DECLARATION = (!predefined.getForSending()
				|| !predefined.getForReceiving()) ? "PredefinedOneV2.txt" : "PredefinedBothV2.txt";
		String prefix = (!predefined.getForSending() || !predefined.getForReceiving()) ? "	" : "";

		String templatePredefinedDeclarationContent = readContents(
				getFileInputSupplier(TEMPLATE_NAME_PREDEFINED_DECLARATION));
		StringTemplate templatePredefinedDeclaration = new StringTemplate(templatePredefinedDeclarationContent);

		templatePredefinedDeclaration.setAttribute("PredefinedName", predefined.getName());
		templatePredefinedDeclaration.setAttribute(CONFIGURATION_OBJECT_PARAM,
				predefined.getConfigurationObjectName().isEmpty() ? UNKNOWN_VALUE
						: predefined.getConfigurationObjectName());
		templatePredefinedDeclaration.setAttribute(FORMAT_OBJECT_PARAM, predefined.getFormatObject());

		predefinedsText.append(templatePredefinedDeclaration).append(LS).append(prefix);

		if (predefined.getForSending()) {
			predefinedsText.append(LS).append(prefix).append("	ЗначенияДляОтправки = Новый Соответствие;");
			for (CmPredefinedValue predefinedMap : predefined.getPredefinedValues())
				predefinedsText.append(LS).append(prefix)
						.append(String.format("	ЗначенияДляОтправки.Вставить(%1$s, \"%2$s\");",
								predefinedMap.getConfigurationValueName(),
								predefinedMap.getFormatValue()));
			predefinedsText.append(LS).append(prefix)
					.append("	ПравилоКонвертации.КонвертацииЗначенийПриОтправке = ЗначенияДляОтправки;");
		}
		if (predefined.getForReceiving()) {
			predefinedsText.append(LS).append(prefix).append("	ЗначенияДляПолучения = Новый Соответствие;");
			for (CmPredefinedValue predefinedMap : predefined.getPredefinedValues())
				predefinedsText.append(LS).append(prefix)
						.append(String.format("	ЗначенияДляПолучения.Вставить(\"%1$s\", %2$s);",
								predefinedMap.getFormatValue(),
								predefinedMap.getConfigurationValueName()));
			predefinedsText.append(LS).append(prefix)
					.append("	ПравилоКонвертации.КонвертацииЗначенийПриПолучении = ЗначенияДляПолучения;");
		}
	}

	public static Comparator<CmAlgorithm> getAlgorithmComparator() {
		return (CmAlgorithm cmArg1, CmAlgorithm cmArg2) -> {
			String[] str1 = new String[1];
			String[] str2 = new String[1];

			str1 = new String[] { cmArg1.getName() };

			str2 = new String[] { cmArg2.getName() };

			return ConversionUtils.compareArraysOfString(str1, str2);
		};
	}

	public static Comparator<CmAttributeRule> getAttributeRuleComparator(Integer comparatorOrder) {
		return (CmAttributeRule cmArg1, CmAttributeRule cmArg2) -> {
			String[] str1;
			String[] str2;

			if (comparatorOrder.equals(COMPARATOR_ORDER_BY_SENDING)) {
				String configurationTabularSection1 = getConfigurationTabularSection(cmArg1, cmArg1.getOwner());
				String formatTabularSection1 = getFormatTabularSection(cmArg1, cmArg1.getOwner());

				str1 = new String[] {
						formatTabularSection1,
						configurationTabularSection1.isEmpty() && formatTabularSection1.isEmpty() ? "0" : "1",
						cmArg1.getIsCustomRule() ? "1" : "0",
						cmArg1.getConfigurationAttribute(),
						cmArg1.getFormatAttribute() };

				String configurationTabularSection2 = getConfigurationTabularSection(cmArg2, cmArg2.getOwner());
				String formatTabularSection2 = getFormatTabularSection(cmArg2, cmArg2.getOwner());

				str2 = new String[] {
						formatTabularSection2,
						configurationTabularSection2.isEmpty() && formatTabularSection2.isEmpty() ? "0" : "1",
						cmArg2.getIsCustomRule() ? "1" : "0",
						cmArg2.getConfigurationAttribute(),
						cmArg2.getFormatAttribute() };

			} else if (comparatorOrder.equals(COMPARATOR_ORDER_BY_RECEIVING)) {
				String configurationTabularSection1 = getConfigurationTabularSection(cmArg1, cmArg1.getOwner());
				String formatTabularSection1 = getFormatTabularSection(cmArg1, cmArg1.getOwner());

				str1 = new String[] {
						configurationTabularSection1,
						configurationTabularSection1.isEmpty() && formatTabularSection1.isEmpty() ? "0" : "1",
						cmArg1.getIsCustomRule() ? "1" : "0",
						cmArg1.getConfigurationAttribute(),
						cmArg1.getFormatAttribute() };

				String configurationTabularSection2 = getConfigurationTabularSection(cmArg2, cmArg2.getOwner());
				String formatTabularSection2 = getFormatTabularSection(cmArg2, cmArg2.getOwner());

				str2 = new String[] {
						configurationTabularSection2,
						configurationTabularSection2.isEmpty() && formatTabularSection2.isEmpty() ? "0" : "1",
						cmArg2.getIsCustomRule() ? "1" : "0",
						cmArg2.getConfigurationAttribute(),
						cmArg2.getFormatAttribute() };

			} else { // SENDING AND RECEIVING
				String configurationTabularSection1 = getConfigurationTabularSection(cmArg1, cmArg1.getOwner());
				String formatTabularSection1 = getFormatTabularSection(cmArg1, cmArg1.getOwner());

				str1 = new String[] {
						!configurationTabularSection1.isEmpty() && !formatTabularSection1.isEmpty() ? "0" : "1",
						configurationTabularSection1,
						formatTabularSection1,
						cmArg1.getIsCustomRule() ? "1" : "0",
						cmArg1.getConfigurationAttribute(),
						cmArg1.getFormatAttribute() };

				String configurationTabularSection2 = getConfigurationTabularSection(cmArg2, cmArg2.getOwner());
				String formatTabularSection2 = getFormatTabularSection(cmArg2, cmArg2.getOwner());

				str2 = new String[] {
						!configurationTabularSection2.isEmpty() && !formatTabularSection2.isEmpty() ? "0" : "1",
						configurationTabularSection2,
						formatTabularSection2,
						cmArg2.getIsCustomRule() ? "1" : "0",
						cmArg2.getConfigurationAttribute(),
						cmArg2.getFormatAttribute() };

			}

			return ConversionUtils.compareArraysOfString(str1, str2);
		};
	}

	public static Comparator<CmDataRule> getDataRuleComparator(Integer comparatorOrder) {
		return (CmDataRule cmArg1, CmDataRule cmArg2) -> {
			String[] str1;
			String[] str2;

			if (comparatorOrder.equals(COMPARATOR_ORDER_BY_SENDING)) {
				str1 = new String[] { cmArg1.getConfigurationObjectName(), cmArg1.getFormatObject(), cmArg1.getName() };
				str2 = new String[] { cmArg2.getConfigurationObjectName(), cmArg2.getFormatObject(), cmArg2.getName() };

			} else if (comparatorOrder.equals(COMPARATOR_ORDER_BY_RECEIVING)) {
				str1 = new String[] { cmArg1.getFormatObject(), cmArg1.getConfigurationObjectName(), cmArg1.getName() };
				str2 = new String[] { cmArg2.getFormatObject(), cmArg2.getConfigurationObjectName(), cmArg2.getName() };

			} else { // COMPARATOR_ORDER_BY_NAME
				str1 = new String[] { getSendingReceivingPriority(cmArg1), cmArg1.getName() };
				str2 = new String[] { getSendingReceivingPriority(cmArg2), cmArg2.getName() };

			}

			return ConversionUtils.compareArraysOfString(str1, str2);
		};
	}

	public static String getModuleText(ConversionModule conversionModule, String name, LocalDateTime localDateTime) {
		if (conversionModule.getStoreVersion().equals("2"))
			return getModuleTextV2(conversionModule, name, localDateTime);
		else
			return getModuleTextV1(conversionModule, name, localDateTime);
	}

	public static Comparator<CmObjectRule> getObjectRuleComparator(Integer comparatorOrder) {
		return (CmObjectRule cmArg1, CmObjectRule cmArg2) -> {
			String[] str1;
			String[] str2;

			if (comparatorOrder.equals(COMPARATOR_ORDER_BY_SENDING)) {
				str1 = new String[] {
						getSendingReceivingPriority(cmArg1),
						cmArg1.getConfigurationObjectName(),
						cmArg1.getFormatObject(),
						cmArg1.getName() };
				str2 = new String[] {
						getSendingReceivingPriority(cmArg2),
						cmArg2.getConfigurationObjectName(),
						cmArg2.getFormatObject(),
						cmArg2.getName() };

			} else if (comparatorOrder.equals(COMPARATOR_ORDER_BY_RECEIVING)) {
				str1 = new String[] {
						getSendingReceivingPriority(cmArg1),
						cmArg1.getFormatObject(),
						cmArg1.getConfigurationObjectName(),
						cmArg1.getName() };
				str2 = new String[] {
						getSendingReceivingPriority(cmArg2),
						cmArg2.getFormatObject(),
						cmArg2.getConfigurationObjectName(),
						cmArg2.getName() };

			} else { // COMPARATOR_ORDER_BY_NAME
				str1 = new String[] { getSendingReceivingPriority(cmArg1), cmArg1.getName() };
				str2 = new String[] { getSendingReceivingPriority(cmArg2), cmArg2.getName() };

			}

			return ConversionUtils.compareArraysOfString(str1, str2);
		};
	}

	public static Comparator<CmPredefined> getPredefinedComparator(Integer comparatorOrder) {
		return (CmPredefined cmArg1, CmPredefined cmArg2) -> {
			String[] str1;
			String[] str2;

			if (comparatorOrder.equals(COMPARATOR_ORDER_BY_ROUTE_NAME)) {
				str1 = new String[] { getSendingReceivingPriority(cmArg1), cmArg1.getName() };
				str2 = new String[] { getSendingReceivingPriority(cmArg2), cmArg2.getName() };

			} else { // COMPARATOR_ORDER_BY_NAME
				str1 = new String[] { cmArg1.getName() };
				str2 = new String[] { cmArg2.getName() };

			}

			return ConversionUtils.compareArraysOfString(str1, str2);
		};
	}

	public static URI getResourceURIforPlugin(String moduleName, IProject project) {
		return ConversionUtils.getResourceURIforPlugin(project.getName(), "conversionModule-" + moduleName);
	}

	public static ConversionModule loadResource(URI xmiUri, Configuration configuration) {
		if (xmiUri.toFileString() != null) {
			File file = new File(xmiUri.toFileString());
			if (!file.exists())
				return null;
		}
		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			final Map<Object, Object> loadOptions = xmiResource.getDefaultLoadOptions();
			xmiResource.load(loadOptions);
			ConversionModule conversionModule = (ConversionModule) xmiResource.getContents().get(0);

			resolveBmObjects(conversionModule, configuration);

			return conversionModule;

		} catch (IOException e) {
			String msg = "Не удалось загрузить вторичные данные для ConversionModule. Перезапустите сборку проекта.";
			ConversionPlugin.log(ConversionPlugin.createErrorStatus(msg, e));

		}

		return null;
	}

	public static void saveResource(ConversionModule conversionModule, URI xmiUri) {
		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			xmiResource.getContents().add(conversionModule);
			final Map<Object, Object> saveOptions = xmiResource.getDefaultSaveOptions();
			saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
			xmiResource.save(saveOptions);

		} catch (IOException e) {
			String msg = "Не удалось сохранить вторичные данные для ConversionModule. Перезапустите сборку проекта.";
			ConversionPlugin.log(ConversionPlugin.createErrorStatus(msg, e));

		}

	}

	private static void addAlgorithm(Method method, ConversionModule conversionModule) {
		String methodName = method.getName();

		CmAlgorithm algorithm = conversionModule.getAlgorithm(methodName);
		if (algorithm == null) {
			algorithm = cmFactory.eINSTANCE.createCmAlgorithm();

			algorithm.setName(methodName);

			conversionModule.getAlgorithms().add(algorithm);
		}
		algorithm.setExists(true);

		ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

		EList<CmParam> cmParams = new BasicEList<>();

		for (FormalParam param : method.getFormalParams()) {
			CmParam cmParam = cmFactory.eINSTANCE.createCmParam();
			cmParams.add(cmParam);
			cmParam.setName(param.getName());
			cmParam.setByValue(param.isByValue());

			Literal defaultValue = param.getDefaultValue();
			if (defaultValue == null)
				continue;

			if (defaultValue instanceof BooleanLiteral) {
				cmParam.setDefaultValue((((BooleanLiteral) defaultValue).isIsTrue() ? "Истина" : "Ложь"));

			} else if (defaultValue instanceof StringLiteral) {
				cmParam.setDefaultValue(((StringLiteral) defaultValue).getLines().get(0));

			} else if (defaultValue instanceof UndefinedLiteral) {
				cmParam.setDefaultValue(UNKNOWN_VALUE);

			} else {
				String msg = MessageFormat.format(
						"Добавить Алгоритм: {0}. Необработанный тип значения переменной по умолчанию:{1}.",
						methodName,
						defaultValue.getClass());
				throw new NullPointerException(msg);

			}
		}

		algorithm.setMethodType(method instanceof Function ? CmMethodType.FUNCTION : CmMethodType.PROCEDURE);
		algorithm.getParams().addAll(cmParams);
		algorithm.setIsExport(method.isExport());
		algorithm.setBody(getMethodText(node.getText().trim()));

	}

	private static void addDataRule(Method method, Module module, SubsystemsFiller subsystemsFiller,
			ConversionModule conversionModule, IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {

		CmDataRule dataRule = parseDataRuleMethod(method, module, conversionModule);

		if (dataRule == null) {
			String msg = MessageFormat.format("Добавить ПОД: В методе не обнаружено имя правила: {0}",
					method.getName());
			throw new NullPointerException(msg);
		}

		if (dataRule.getConfigurationObjectFormattedName().isEmpty())
			return;

		MdObject configurationObject = getConfigurationObject(dataRule.getConfigurationObjectFormattedName(),
				module,
				projectManager,
				bmEmfIndexManager);
		if (configurationObject == null) {
			String msg = MessageFormat.format(OBJECT_NOT_FOUND_ERROR_0, dataRule.getConfigurationObjectFormattedName());
			throw new NullPointerException(msg);
		}

		dataRule.setConfigurationObject(configurationObject);

		dataRule.getSubsystems().addAll(subsystemsFiller.getSubsystems(dataRule.getConfigurationObject()));
	}

	private static void addDataRules(Method method, ConversionModule conversionModule) {
		EList<CmDataRule> dataRules = conversionModule.getDataRules();

		for (Statement statement : method.allStatements()) {
			if (!(statement instanceof IfStatement)) {
				String msg = "В процедуре ЗаполнитьПравилаОбработкиДанных ожидалась конструкция Если, но что-то пошло не так.";
				throw new NullPointerException(msg);
			}

			IfStatement ifStatement = (IfStatement) statement;
			EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
			EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

			parseDataRulesIfPartStatement(ifPartStatements, dataRules);
			parseDataRulesElseIfPartStatement(elseIfPartConditionals, dataRules);
		}
	}

	private static void addObjectRule(Method method, Module module, SubsystemsFiller subsystemsFiller,
			ConversionModule conversionModule, IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {

		CmObjectRule objectRule = parseObjectRuleMethod(method, module, conversionModule);

		if (objectRule == null) {
			String msg = MessageFormat.format("Добавить ПКО: В методе не обнаружено имя правила: {0}",
					method.getName());
			throw new NullPointerException(msg);
		}

		if (objectRule.getConfigurationObjectFormattedName().isEmpty())
			return;

		MdObject configurationObject = getConfigurationObject(objectRule.getConfigurationObjectFormattedName(),
				module,
				projectManager,
				bmEmfIndexManager);
		if (configurationObject == null) {
			String msg = MessageFormat.format(OBJECT_NOT_FOUND_ERROR_0,
					objectRule.getConfigurationObjectFormattedName());
			throw new NullPointerException(msg);
		}

		objectRule.setConfigurationObject(configurationObject);

		objectRule.getSubsystems().addAll(subsystemsFiller.getSubsystems(configurationObject));
	}

	private static void addObjectRules(Method method, ConversionModule conversionModule) {
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();

		for (Statement statement : method.allStatements()) {
			if (statement instanceof IfStatement) {
				parseObjectRulesIfStatement((IfStatement) statement, conversionModule);

			} else if (statement instanceof SimpleStatement) {
				SimpleStatement simpleStatement = (SimpleStatement) statement;
				Invocation invocation = (Invocation) simpleStatement.getLeft();
				StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) invocation.getMethodAccess();

				String objectRuleName = partMethodAccess.getName().substring(12);

				CmObjectRule objectRule = conversionModule.getObjectRule(objectRuleName);
				if (objectRule == null) {
					objectRule = cmFactory.eINSTANCE.createCmObjectRule();

					objectRule.setName(objectRuleName);

					objectRules.add(objectRule);
				}

				objectRule.setForSending(true);
				objectRule.setForReceiving(true);

			} else {
				String msg = MessageFormat.format("Добавить ПКО: необработанный Statement: {0}", statement.getClass());
				throw new NullPointerException(msg);

			}
		}
	}

	private static void addPredefineds(Method method, ConversionModule conversionModule,
			IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {
		CmPredefined cmPredefined = null;

		for (Statement statement : method.allStatements()) {
			if (statement instanceof IfStatement) {
				parsePredefinedsIfStatement((IfStatement) statement, conversionModule);

			} else if (statement instanceof SimpleStatement) {
				cmPredefined = parsePredefined(cmPredefined, (SimpleStatement) statement, conversionModule);

			} else {
				String msg = MessageFormat.format("Добавить ПКПД: необработанный Statement: {0}", statement.getClass());
				throw new NullPointerException(msg);

			}
		}

		for (CmPredefined predefined : conversionModule.getPredefineds()) {
			MdObject configurationObject = getConfigurationObject(predefined.getConfigurationObjectFormattedName(),
					method,
					projectManager,
					bmEmfIndexManager);
			if (configurationObject == null) {
				String msg = MessageFormat.format(OBJECT_NOT_FOUND_ERROR_0,
						predefined.getConfigurationObjectFormattedName());
				throw new NullPointerException(msg);
			}

			predefined.setConfigurationObject(configurationObject);

			if (configurationObject instanceof Catalog)
				setPredefinedCatalogConfigurationValues((Catalog) configurationObject, predefined);

			else if (configurationObject instanceof Enum)
				setPredefinedEnumConfigurationValues((Enum) configurationObject, predefined);

			else {
				String msg = MessageFormat.format("Добавить ПКПД: необработанный тип предопределенных элементов: {0}",
						configurationObject.getClass());
				throw new NullPointerException(msg);
			}

			checkPredefinedValuesWithoutConfigurationObject(configurationObject, predefined);
		}

	}

	private static CmSubsystem addSubsystems(EList<CmSubsystem> cmSubsystems, CommandInterface commandInterface) {
		cmSubsystems.clear();

		CmSubsystem cmMainSubsystem = cmFactory.eINSTANCE.createCmSubsystem();
		cmMainSubsystem.setSpecialSubsystemType(CmSpecialSubsystemType.MAIN);
		cmSubsystems.add(cmMainSubsystem);

		SubsystemsOrder subsystemsOrder = commandInterface.getSubsystemsOrder();
		if (subsystemsOrder != null)
			for (Subsystem confSubsystem : subsystemsOrder.getSubsystems()) {
				if (!confSubsystem.isIncludeInCommandInterface())
					continue;

				CmSubsystem subsystem = cmFactory.eINSTANCE.createCmSubsystem();
				subsystem.setSubsystem(confSubsystem);

				cmSubsystems.add(subsystem);
			}
		CmSubsystem subsystem = cmFactory.eINSTANCE.createCmSubsystem();
		subsystem.setSpecialSubsystemType(CmSpecialSubsystemType.EMPTY);
		cmSubsystems.add(subsystem);

		return cmMainSubsystem;
	}

	private static void analyzeRules(ConversionModule conversionModule, Method method, Module module,
			IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager,
			CommandInterface mainCommandInterface, CmSubsystem cmMainSubsystem) {

		String storeVersion = conversionModule.getStoreVersion();
		if (!storeVersion.equals("1") && !storeVersion.equals("2")) {
			String msg = MessageFormat.format("Неизвестная версия формата: {0}", storeVersion);
			throw new NullPointerException(msg);
		}

		SubsystemsFiller subsystemsFiller = new SubsystemsFiller(conversionModule,
				mainCommandInterface,
				cmMainSubsystem);

		String methodName = method.getName();

		// TODO: Реализовать чтение из первого формата
		if (methodName.equals("ЗаполнитьПравилаОбработкиДанных")) {
			addDataRules(method, conversionModule);

		} else if (methodName.startsWith(ADD_DATARULE)) {
			addDataRule(method, module, subsystemsFiller, conversionModule, projectManager, bmEmfIndexManager);

		} else if (methodName.equals("ЗаполнитьПравилаКонвертацииОбъектов")) {
			addObjectRules(method, conversionModule);

		} else if (methodName.startsWith(ADD_OBJECTRULE)) {
			addObjectRule(method, module, subsystemsFiller, conversionModule, projectManager, bmEmfIndexManager);

		} else if (methodName.equals("ЗаполнитьПравилаКонвертацииПредопределенныхДанных")) {
			addPredefineds(method, conversionModule, projectManager, bmEmfIndexManager);

		} else {
			EObject region = method.eContainer().eContainer();
			if (!(region instanceof RegionPreprocessorDeclareStatement))
				return;
			String regionName = ((RegionPreprocessorDeclareStatement) method.eContainer().eContainer()).getName();
			if (!regionName.equals("Алгоритмы"))
				return;

			addAlgorithm(method, conversionModule);

		}
	}

	private static void checkPredefinedValuesWithoutConfigurationObject(MdObject configurationObject,
			CmPredefined predefined) {
		for (CmPredefinedValue predefinedValue : predefined.getPredefinedValues()) {
			EObject cmPredefinedValue = null;
			if (configurationObject instanceof Catalog)
				cmPredefinedValue = ((CmPredefinedCatalogValue) predefinedValue).getConfigurationValue();
			else if (configurationObject instanceof Enum)
				cmPredefinedValue = ((CmPredefinedEnumValue) predefinedValue).getConfigurationValue();

			if (cmPredefinedValue == null) {
				String valueFormattedName = predefined.getConfigurationObjectFormattedName() + "."
						+ predefinedValue.getConfigurationValueFormattedName();

				String msg = MessageFormat.format("Не найдено свойство конфигурации: \"{0}\"", valueFormattedName);
				ConversionPlugin.log(ConversionPlugin.createWarningStatus(msg));
			}
		}
	}

	private static void createAlgorithmsText(StringTemplate templateMain, ConversionModule conversionModule) {
		EList<CmAlgorithm> algorithms = conversionModule.getAlgorithms();
		if (algorithms.isEmpty()) {
			templateMain.setAttribute("Algorithms", "---");
			return;
		}

		ECollections.sort(algorithms, getAlgorithmComparator());

		String algorithmsText = conversionModule.getAllAlgorithmsText("");

		templateMain.setAttribute("Algorithms", algorithmsText);
	}

	private static CmDataRule createDataRule(EList<Statement> allStatements, ConversionModule conversionModule) {
		for (Statement statement : allStatements) {
			Expression leftExpression = ((SimpleStatement) statement).getLeft();

			if (!(leftExpression instanceof DynamicFeatureAccess)
					|| !((DynamicFeatureAccess) leftExpression).getName().equals("Имя"))
				continue;

			Expression rightExpression = ((SimpleStatement) statement).getRight();
			StringLiteral stringLiteral = (StringLiteral) rightExpression;
			String ruleName = stringLiteral.getLines().get(0).replace("\"", "");

			return conversionModule.getDataRule(ruleName);
		}

		return null;
	}

	private static void createDataRulesText(StringTemplate templateMain, ConversionModule conversionModule) {
		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		if (dataRules.isEmpty()) {
			templateMain.setAttribute("DataRulesDeclaration", "	");
			templateMain.setAttribute("DataRulesSending", "---");
			return;
		}

		StringBuilder dataRulesSending = new StringBuilder();
		StringBuilder dataRulesReceiving = new StringBuilder();

		ECollections.sort(dataRules, getDataRuleComparator(COMPARATOR_ORDER_BY_NAME));

		for (CmDataRule dataRule : dataRules) {
			if (dataRule.getForSending() && dataRule.getForReceiving()) {
				String msg = DATARULE_FOR_SENDING_RECEIVING_ERROR;
				throw new NullPointerException(msg);
			}

			else if (dataRule.getForSending())
				createDataRuleSendingText(dataRule, dataRulesSending);

			else if (dataRule.getForReceiving())
				createDataRuleReceivingText(dataRule, dataRulesReceiving);

		}

		if (dataRulesSending.length() != 0)
			dataRulesSending.insert(0, "#Область Отправка" + LS).append(LS + END_OF_REGION);
		if (dataRulesReceiving.length() != 0)
			dataRulesReceiving.insert(0, "#Область Получение" + LS).append(LS + END_OF_REGION);

		templateMain.setAttribute("DataRulesDeclaration", createDataRulesDeclarationText(dataRules));
		templateMain.setAttribute("DataRulesSending", dataRulesSending);
		templateMain.setAttribute("DataRulesReceiving", dataRulesReceiving);
	}

	private static void createEventsDeclarationDataRuleText(CmDataRule dataRule, StringBuilder proceduresText,
			StringBuilder functionsText) {
		final String onProcessingEvent = String.join(LS,
				"	%2$s ИмяПроцедуры = \"ПОД_%1$s_ПриОбработке\" Тогда ",
				"		ПОД_%1$s_ПриОбработке(",
				"			Параметры.ОбъектОбработки, Параметры.ИспользованиеПКО, Параметры.КомпонентыОбмена);",
				"");
		final String dataSelectionEvent = String.join(LS,
				"	%2$s ИмяФункции = \"ПОД_%1$s_ВыборкаДанных\" Тогда ",
				"		Возврат ПОД_%1$s_ВыборкаДанных(",
				"			Параметры.КомпонентыОбмена);",
				"");

		if (!dataRule.getOnProcessingEvent().isEmpty()) {
			String prefix = proceduresText.length() == 0 ? IF : ELSEIF;
			proceduresText.append(String.format(onProcessingEvent, dataRule.getName(), prefix));
		}
		if (dataRule.getForSending() && !dataRule.getDataSelectionEvent().isEmpty()) {
			String prefix = functionsText.length() == 0 ? IF : ELSEIF;
			functionsText.append(String.format(dataSelectionEvent, dataRule.getName(), prefix));
		}

	}

	private static void createEventsDeclarationObjectRuleText(CmObjectRule objectRule, StringBuilder proceduresText) {
		final String onSendingEvent = String.join(LS,
				"	%2$s ИмяПроцедуры = \"ПКО_%1$s_ПриОтправкеДанных\" Тогда ",
				"		ПКО_%1$s_ПриОтправкеДанных(",
				"			Параметры.ДанныеИБ, Параметры.ДанныеXDTO, Параметры.КомпонентыОбмена, Параметры.СтекВыгрузки);",
				"");
		final String beforeReceivingEvent = String.join(LS,
				"	%2$s ИмяПроцедуры = \"ПКО_%1$s_ПриКонвертацииДанныхXDTO\" Тогда ",
				"		ПКО_%1$s_ПриКонвертацииДанныхXDTO(",
				"			Параметры.ДанныеXDTO, Параметры.ПолученныеДанные, Параметры.КомпонентыОбмена);",
				"");
		final String onReceivingEvent = String.join(LS,
				"	%2$s ИмяПроцедуры = \"ПКО_%1$s_ПередЗаписьюПолученныхДанных\" Тогда ",
				"		ПКО_%1$s_ПередЗаписьюПолученныхДанных(",
				"			Параметры.ПолученныеДанные, Параметры.ДанныеИБ, Параметры.КонвертацияСвойств, Параметры.КомпонентыОбмена);",
				"");

		if (objectRule.getForSending() && !objectRule.getOnSendingEvent().isEmpty()) {
			String prefix = proceduresText.length() == 0 ? IF : ELSEIF;
			proceduresText.append(String.format(onSendingEvent, objectRule.getName(), prefix));
		}
		if (objectRule.getForReceiving()) {
			if (!objectRule.getBeforeReceivingEvent().isEmpty()) {
				String prefix = proceduresText.length() == 0 ? IF : ELSEIF;
				proceduresText.append(String.format(beforeReceivingEvent, objectRule.getName(), prefix));
			}
			if (!objectRule.getOnReceivingEvent().isEmpty()) {
				String prefix = proceduresText.length() == 0 ? IF : ELSEIF;
				proceduresText.append(String.format(onReceivingEvent, objectRule.getName(), prefix));
			}
		}

	}

	private static void createEventsText(StringTemplate templateMain, ConversionModule conversionModule) {
		Map<CmMethodType, StringBuilder> events = createEventsDeclarationText(conversionModule);

		StringBuilder proceduresText = events.get(CmMethodType.PROCEDURE);
		StringBuilder functionsText = events.get(CmMethodType.FUNCTION);

		final String TEMPLATE_NAME = functionsText.length() == 0 ? "EventsNoFunctionsV2.txt" : "EventsFullV2.txt";
		String templateContent = readContents(getFileInputSupplier(TEMPLATE_NAME));

		StringTemplate template = new StringTemplate(templateContent);

		template.setAttribute("Procedures", proceduresText);
		template.setAttribute("Functions", functionsText);

		templateMain.setAttribute(EVENTS_PARAM, template);
	}

	private static CmObjectRule createObjectRule(EList<Statement> allStatements, ConversionModule conversionModule) {
		for (Statement statement : allStatements) {
			Expression leftExpression = ((SimpleStatement) statement).getLeft();

			if (!(leftExpression instanceof DynamicFeatureAccess)
					|| !((DynamicFeatureAccess) leftExpression).getName().equals("ИмяПКО"))
				continue;

			Expression rightExpression = ((SimpleStatement) statement).getRight();
			StringLiteral stringLiteral = (StringLiteral) rightExpression;
			String ruleName = stringLiteral.getLines().get(0).replace("\"", "");

			return conversionModule.getObjectRule(ruleName);
		}

		return null;
	}

	private static void createObjectRuleAttributeRow(CmAttributeRule attributeRule, StringBuilder attributeRulesText,
			String variableName, Integer formatAttributeMaxLength) {
		StringBuilder formatAttributePrefix = new StringBuilder();
		for (Integer prefixLength = 0; prefixLength < formatAttributeMaxLength
				- attributeRule.getConfigurationAttribute().length(); prefixLength++)
			formatAttributePrefix.append(" ");

		attributeRulesText.append(LS);

		String customRuleText = "";
		String objectRuleText = "";
		if (attributeRule.getIsCustomRule() || attributeRule.getObjectRule() != null) {
			customRuleText = ", ".concat(attributeRule.getIsCustomRule() ? "1" : "");
			if (attributeRule.getObjectRule() != null)
				objectRuleText = ","
						.concat((attributeRule.getConfigurationTabularSection().isEmpty()
								&& attributeRule.getFormatTabularSection().isEmpty() ? " " : ""))
						.concat("\"").concat(attributeRule.getObjectRule().getName()).concat("\"");
		}

		String attributeText = "	ДобавитьПКС(%1$s, \"%2$s\", %3$s\"%4$s\"%5$s%6$s);";
		attributeRulesText.append(String.format(attributeText,
				variableName,
				attributeRule.getConfigurationAttribute(),
				formatAttributePrefix,
				attributeRule.getFormatAttribute(),
				customRuleText,
				objectRuleText));
	}

	private static void createObjectRuleReceivingAttributeRulesText(CmObjectRule objectRule,
			StringTemplate templateObjectRuleSending) {
		EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();

		if (attributeRules.isEmpty()) {
			templateObjectRuleSending.setAttribute(ATTRIBUTERULES_PARAM, "	");
			return;
		}

		Map<String, Integer> mapFormatAttributeMaxLength = new HashMap<>();
		for (CmAttributeRule attributeRule : attributeRules) {
			String realConfigurationTabularSection = getConfigurationTabularSection(attributeRule, objectRule);
			String realFormatTabularSection = getFormatTabularSection(attributeRule, objectRule);

			Integer formatAttributeMaxLength = 0;

			String mapKey = "-".concat(realConfigurationTabularSection).concat("-").concat(realFormatTabularSection);
			formatAttributeMaxLength = getMaxLengthForTabularSection(mapKey, mapFormatAttributeMaxLength);
			if (attributeRule.getConfigurationAttribute().length() > formatAttributeMaxLength)
				mapFormatAttributeMaxLength.put(mapKey, attributeRule.getConfigurationAttribute().length());

			formatAttributeMaxLength = getMaxLengthForTabularSection("---", mapFormatAttributeMaxLength);
			if (realConfigurationTabularSection.length() > formatAttributeMaxLength)
				mapFormatAttributeMaxLength.put("---", realConfigurationTabularSection.length());
		}

		StringBuilder attributeRulesText = new StringBuilder();
		StringBuilder tabularSectionText = new StringBuilder();

		String configurationTabularSection = "-";
		String formatTabularSection = "-";
		for (CmAttributeRule attributeRule : attributeRules) {
			if (!objectRule.getForSending() && !attributeRule.getFormatTabularSection().isEmpty()
					&& attributeRule.getConfigurationAttribute().isEmpty())
				continue;

			String realConfigurationTabularSection = getConfigurationTabularSection(attributeRule, objectRule);
			String realFormatTabularSection = getFormatTabularSection(attributeRule, objectRule);
			if (!configurationTabularSection.equals(realConfigurationTabularSection)
					|| !formatTabularSection.equals(realFormatTabularSection)) {
				configurationTabularSection = realConfigurationTabularSection;
				formatTabularSection = realFormatTabularSection;

				if (configurationTabularSection.isEmpty() && formatTabularSection.isEmpty()) {
					attributeRulesText.append("	").append(LS);
					attributeRulesText.append("	СвойстваШапки = ПравилоКонвертации.Свойства;");

				} else {
					Integer formatAttributeMaxLength = getMaxLengthForTabularSection("---",
							mapFormatAttributeMaxLength);
					StringBuilder formatAttributePrefix = new StringBuilder();
					for (Integer prefixLength = 0; prefixLength < formatAttributeMaxLength
							- realConfigurationTabularSection.length(); prefixLength++)
						formatAttributePrefix.append(" ");

					if (tabularSectionText.length() != 0)
						tabularSectionText.append(LS);
					tabularSectionText.append("	").append(LS);
					tabularSectionText.append("	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, ").append("\"")
							.append(configurationTabularSection).append("\",").append(formatAttributePrefix)
							.append(" \"").append(formatTabularSection).append("\");");

				}
			}

			String mapKey = "-".concat(realConfigurationTabularSection).concat("-").concat(realFormatTabularSection);
			Integer formatAttributeMaxLength = getMaxLengthForTabularSection(mapKey, mapFormatAttributeMaxLength);

			if (configurationTabularSection.isEmpty() && formatTabularSection.isEmpty())
				createObjectRuleAttributeRow(attributeRule,
						attributeRulesText,
						HEADER_ATTRIBUTES,
						formatAttributeMaxLength);
			else
				createObjectRuleAttributeRow(attributeRule,
						tabularSectionText,
						TABULAR_ATTRIBUTES,
						formatAttributeMaxLength);
		}
		if (attributeRulesText.length() == 0)
			attributeRulesText.append("	");
		templateObjectRuleSending.setAttribute(ATTRIBUTERULES_PARAM, attributeRulesText);
		templateObjectRuleSending.setAttribute("TabularSectionRules", tabularSectionText);
	}

	private static void createObjectRuleReceivingEventsText(CmObjectRule objectRule,
			StringTemplate templateObjectRuleReceiving) {
		templateObjectRuleReceiving.setAttribute("OnSendingEvent", objectRule.getOnSendingEventDeclaration());
		templateObjectRuleReceiving.setAttribute("BeforeReceivingEvent",
				objectRule.getBeforeReceivingEventDeclaration());
		templateObjectRuleReceiving.setAttribute("OnReceivingEvent", objectRule.getOnReceivingEventDeclaration());
		templateObjectRuleReceiving.setAttribute("AfterReceivingAlgorithm",
				objectRule.getAfterReceivingAlgorithmDeclaration());

		StringBuilder objectRuleEventsText = new StringBuilder();
		if (!objectRule.getOnSendingEvent().isEmpty())
			objectRuleEventsText.append(LS).append(objectRule.getOnSendingEventText());

		if (!objectRule.getBeforeReceivingEvent().isEmpty())
			objectRuleEventsText.append(LS).append(objectRule.getBeforeReceivingEventText());

		if (!objectRule.getOnReceivingEvent().isEmpty())
			objectRuleEventsText.append(LS).append(objectRule.getOnReceivingEventText());

		templateObjectRuleReceiving.setAttribute(EVENTS_PARAM, objectRuleEventsText);

	}

	private static void createObjectRuleReceivingIdentificationText(CmObjectRule objectRule,
			StringTemplate templateObjectRuleReceiving) {
		if (objectRule.getIdentificationVariant() == CmIdentificationVariant.UUID)
			templateObjectRuleReceiving.setAttribute(IDENTIFICATION_VARIANT_PARAM, "ПоУникальномуИдентификатору");
		else if (objectRule.getIdentificationVariant() == CmIdentificationVariant.SEARCH_FIELDS)
			templateObjectRuleReceiving.setAttribute(IDENTIFICATION_VARIANT_PARAM, "ПоПолямПоиска");
		else if (objectRule.getIdentificationVariant() == CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS)
			templateObjectRuleReceiving.setAttribute(IDENTIFICATION_VARIANT_PARAM,
					"СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска");

		StringBuilder identificationFields = new StringBuilder();
		for (String identificationField : objectRule.getIdentificationFields()) {
			if (identificationFields.length() != 0)
				identificationFields.append(LS);

			identificationFields.append("	ПравилоКонвертации.ПоляПоиска.Добавить(\"" + identificationField + "\");");
		}
		templateObjectRuleReceiving.setAttribute("IdentificationFields", identificationFields);
	}

	private static void createObjectRuleSendingAttributeRulesText(CmObjectRule objectRule,
			StringTemplate templateObjectRuleSending) {
		EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();

		if (attributeRules.isEmpty()) {
			templateObjectRuleSending.setAttribute(ATTRIBUTERULES_PARAM, "	");
			return;
		}

		Map<String, Integer> mapFormatAttributeMaxLength = new HashMap<>();
		for (CmAttributeRule attributeRule : attributeRules) {
			String realConfigurationTabularSection = getConfigurationTabularSection(attributeRule, objectRule);
			String realFormatTabularSection = getFormatTabularSection(attributeRule, objectRule);

			Integer formatAttributeMaxLength = 0;

			String mapKey = "-".concat(realConfigurationTabularSection).concat("-").concat(realFormatTabularSection);
			formatAttributeMaxLength = getMaxLengthForTabularSection(mapKey, mapFormatAttributeMaxLength);
			if (attributeRule.getConfigurationAttribute().length() > formatAttributeMaxLength)
				mapFormatAttributeMaxLength.put(mapKey, attributeRule.getConfigurationAttribute().length());

			formatAttributeMaxLength = getMaxLengthForTabularSection("---", mapFormatAttributeMaxLength);
			if (realConfigurationTabularSection.length() > formatAttributeMaxLength)
				mapFormatAttributeMaxLength.put("---", realConfigurationTabularSection.length());
		}

		StringBuilder attributeRulesText = new StringBuilder();
		StringBuilder tabularSectionText = new StringBuilder();

		String configurationTabularSection = "-";
		String formatTabularSection = "-";
		for (CmAttributeRule attributeRule : attributeRules) {
			if (!attributeRule.getConfigurationTabularSection().isEmpty()
					&& attributeRule.getFormatAttribute().isEmpty())
				continue;

			String realConfigurationTabularSection = getConfigurationTabularSection(attributeRule, objectRule);
			String realFormatTabularSection = getFormatTabularSection(attributeRule, objectRule);
			if (!configurationTabularSection.equals(realConfigurationTabularSection)
					|| !formatTabularSection.equals(realFormatTabularSection)) {
				configurationTabularSection = realConfigurationTabularSection;
				formatTabularSection = realFormatTabularSection;

				if (configurationTabularSection.isEmpty() && formatTabularSection.isEmpty()) {
					attributeRulesText.append("	").append(LS);
					attributeRulesText.append("	СвойстваШапки = ПравилоКонвертации.Свойства;");

				} else {
					Integer formatAttributeMaxLength = getMaxLengthForTabularSection("---",
							mapFormatAttributeMaxLength);
					StringBuilder formatAttributePrefix = new StringBuilder();
					for (Integer prefixLength = 0; prefixLength < formatAttributeMaxLength
							- attributeRule.getConfigurationTabularSection().length(); prefixLength++)
						formatAttributePrefix.append(" ");

					if (tabularSectionText.length() != 0)
						tabularSectionText.append(LS);
					tabularSectionText.append("	").append(LS);
					tabularSectionText.append("	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, ").append("\"")
							.append(configurationTabularSection).append("\",").append(formatAttributePrefix)
							.append(" \"").append(formatTabularSection).append("\");");

				}
			}

			String mapKey = "-".concat(configurationTabularSection).concat("-").concat(formatTabularSection);
			Integer formatAttributeMaxLength = getMaxLengthForTabularSection(mapKey, mapFormatAttributeMaxLength);

			if (configurationTabularSection.isEmpty() && formatTabularSection.isEmpty())
				createObjectRuleAttributeRow(attributeRule,
						attributeRulesText,
						HEADER_ATTRIBUTES,
						formatAttributeMaxLength);
			else
				createObjectRuleAttributeRow(attributeRule,
						tabularSectionText,
						TABULAR_ATTRIBUTES,
						formatAttributeMaxLength);
		}
		if (attributeRulesText.length() == 0)
			attributeRulesText.append("	");
		templateObjectRuleSending.setAttribute(ATTRIBUTERULES_PARAM, attributeRulesText);
		templateObjectRuleSending.setAttribute("TabularSectionRules", tabularSectionText);
	}

	private static void createObjectRuleSendingEventsText(CmObjectRule objectRule,
			StringTemplate templateObjectRuleSending) {
		templateObjectRuleSending.setAttribute("OnSendingEvent", objectRule.getOnSendingEventDeclaration());

		StringBuilder objectRuleEventsText = new StringBuilder();
		if (!objectRule.getOnSendingEvent().isEmpty())
			objectRuleEventsText.append(LS).append(objectRule.getOnSendingEventText());

		templateObjectRuleSending.setAttribute(EVENTS_PARAM, objectRuleEventsText);
	}

	private static void createObjectRulesText(StringTemplate templateMain, ConversionModule conversionModule) {
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		if (objectRules.isEmpty()) {
			templateMain.setAttribute("ObjectRulesDeclaration", "	");
			templateMain.setAttribute("ObjectRulesSending", "---");
			return;
		}

		StringBuilder objectRulesSending = new StringBuilder();
		StringBuilder objectRulesReceiving = new StringBuilder();
		StringBuilder objectRulesBoth = new StringBuilder();

		ECollections.sort(objectRules, getObjectRuleComparator(COMPARATOR_ORDER_BY_NAME));

		for (CmObjectRule objectRule : objectRules) {
			if (objectRule.getForSending() && objectRule.getForReceiving())
				createObjectRuleReceivingText(objectRule, objectRulesBoth);

			else if (objectRule.getForSending())
				createObjectRuleSendingText(objectRule, objectRulesSending);

			else if (objectRule.getForReceiving())
				createObjectRuleReceivingText(objectRule, objectRulesReceiving);

		}

		if (objectRulesSending.length() != 0)
			objectRulesSending.insert(0, "#Область Отправка" + LS).append(LS + END_OF_REGION);
		if (objectRulesReceiving.length() != 0)
			objectRulesReceiving.insert(0, "#Область Получение" + LS).append(LS + END_OF_REGION);
		if (objectRulesBoth.length() != 0)
			objectRulesBoth.insert(0, "#Область ОтправкаИПолучение" + LS).append(LS + END_OF_REGION);

		templateMain.setAttribute("ObjectRulesDeclaration", createObjectRulesDeclarationText(objectRules));
		templateMain.setAttribute("ObjectRulesSending", objectRulesSending);
		templateMain.setAttribute("ObjectRulesReceiving", objectRulesReceiving);
		templateMain.setAttribute("ObjectRulesBoth", objectRulesBoth);
	}

	private static void createParamsText(StringTemplate templateMain, ConversionModule conversionModule) {
		StringBuilder paramsText = new StringBuilder();

		for (String param : conversionModule.getParams()) {
			if (paramsText.length() != 0)
				paramsText.append(LS);
			paramsText.append(String.format("	ПараметрыКонвертации.Вставить(\"%1$s\");", param));
		}

		templateMain.setAttribute("Params", paramsText);
	}

	private static CmPredefined createPredefined(Statement statement, ConversionModule conversionModule) {
		Expression rightExpression = ((SimpleStatement) statement).getRight();
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String predefinedName = stringLiteral.getLines().get(0).replace("\"", "");

		CmPredefined cmPredefined = cmFactory.eINSTANCE.createCmPredefined();

		cmPredefined.setName(predefinedName);

		conversionModule.getPredefineds().add(cmPredefined);

		return cmPredefined;
	}

	private static void createPredefinedsText(StringTemplate templateMain, ConversionModule conversionModule) {
		templateMain.setAttribute(PREDEFINEDS_PARAM,
				createPredefinedsDeclarationText(conversionModule.getPredefineds()));
	}

	private static MdObject getConfigurationObject(String objectName, EObject sourceObject,
			IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {
		IV8Project v8Project = projectManager.getProject(sourceObject);
		IConfigurationProject configurationProject;
		if (v8Project instanceof IConfigurationProject)
			configurationProject = (IConfigurationProject) v8Project;
		else if (v8Project instanceof IExtensionProject)
			configurationProject = ((IExtensionProject) v8Project).getParent();
		else {
			String msg = MessageFormat.format("При добавлении правила получен неподдержимаемый тип проекта {0}",
					v8Project.getClass());
			throw new NullPointerException(msg);
		}

		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager
				.getEmfIndexProvider(configurationProject.getProject());
		MdObject configurationObject = ConversionUtils.getConfigurationObject(objectName, bmEmfIndexProvider);
		if (configurationObject != null)
			return configurationObject;

		for (IExtensionProject extensionProject : projectManager.getProjects(IExtensionProject.class)) {
			if (!extensionProject.getParent().equals(configurationProject))
				continue;

			bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(extensionProject.getProject());
			configurationObject = ConversionUtils.getConfigurationObject(objectName, bmEmfIndexProvider);

			if (configurationObject != null)
				return configurationObject;
		}

		return null;
	}

	private static String getConfigurationTabularSection(CmAttributeRule attributeRule, CmObjectRule objectRule) {
		String configurationTabularSection = attributeRule.getConfigurationTabularSection();
		if (objectRule == null)
			return configurationTabularSection;

		if (objectRule.getForSending() && objectRule.getForReceiving()
				&& attributeRule.getConfigurationAttribute().isEmpty())
			return "";

		if (configurationTabularSection.isEmpty() && !attributeRule.getFormatTabularSection().isEmpty())
			for (CmAttributeRule attributeRuleForTabular : objectRule.getAttributeRules())
				if (attributeRuleForTabular.getFormatTabularSection().equals(attributeRule.getFormatTabularSection())
						&& !attributeRuleForTabular.getConfigurationTabularSection().isEmpty())
					return attributeRuleForTabular.getConfigurationTabularSection();

		return configurationTabularSection;
	}

	private static CharSource getFileInputSupplier(String partName) {
		return Resources.asCharSource(ConversionModuleAnalyzer.class.getResource("/resources/module/" + partName),
				StandardCharsets.UTF_8);
	}

	private static String getFormatTabularSection(CmAttributeRule attributeRule, CmObjectRule objectRule) {
		String formatTabularSection = attributeRule.getFormatTabularSection();
		if (objectRule == null)
			return formatTabularSection;

		if (objectRule.getForSending() && objectRule.getForReceiving() && attributeRule.getFormatAttribute().isEmpty())
			return "";

		if (formatTabularSection.isEmpty() && !attributeRule.getConfigurationTabularSection().isEmpty())
			for (CmAttributeRule attributeRuleForTabular : objectRule.getAttributeRules())
				if (attributeRuleForTabular.getConfigurationTabularSection()
						.equals(attributeRule.getConfigurationTabularSection())
						&& !attributeRuleForTabular.getFormatTabularSection().isEmpty())
					return attributeRuleForTabular.getFormatTabularSection();

		return formatTabularSection;
	}

	private static Integer getMaxLengthForTabularSection(String mapKey,
			Map<String, Integer> mapFormatAttributeMaxLength) {
		Integer formatAttributeMaxLength = 0;
		if (mapFormatAttributeMaxLength.containsKey(mapKey))
			formatAttributeMaxLength = mapFormatAttributeMaxLength.get(mapKey);

		return formatAttributeMaxLength;
	}

	private static Method getMethod(Module mdModule, String methodName) {
		for (Method mdMethod : mdModule.allMethods()) {
			if (mdMethod.getName().equals(methodName))
				return mdMethod;
		}

		return null;
	}

	private static String getMethodText(String method) {
		String result = "";

		String[] methodArray = method.split(System.lineSeparator());

		if (methodArray.length < 3)
			return result;

		String prefix = methodArray[0];
		String suffix = methodArray[methodArray.length - 1];
		result = method.substring(prefix.length() + System.lineSeparator().length(),
				method.length() - suffix.length() - System.lineSeparator().length());

		return result;

	}

	private static String getModuleTextV1(ConversionModule conversionModule, String name, LocalDateTime localDateTime) {
		// TODO: Реализовать сохранение в первом формате
		return getModuleTextV2(conversionModule, name, localDateTime);
	}

	private static String getModuleTextV2(ConversionModule conversionModule, String name, LocalDateTime localDateTime) {
		final String TEMPLATE_NAME_MAIN = "ConversionModuleV2.txt";
		String templateMainContent = readContents(getFileInputSupplier(TEMPLATE_NAME_MAIN));

		StringTemplate templateMain = new StringTemplate(templateMainContent);

		templateMain.setAttribute("ConvertationName",
				"// Конвертация " + name + " от "
						+ localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm:ss")) + "");

		templateMain.setAttribute("BeforeConvertationEvent", conversionModule.getBeforeConvertationEventText());
		templateMain.setAttribute("AfterConvertationEvent", conversionModule.getAfterConvertationEventText());
		templateMain.setAttribute("BeforeFillingEvent", conversionModule.getBeforeFillingEventText());

		templateMain.setAttribute("StoreVersion", conversionModule.getStoreVersion());

		createDataRulesText(templateMain, conversionModule);
		createObjectRulesText(templateMain, conversionModule);
		createPredefinedsText(templateMain, conversionModule);
		createAlgorithmsText(templateMain, conversionModule);
		createParamsText(templateMain, conversionModule);
		createEventsText(templateMain, conversionModule);

		return templateMain.toString().replaceAll(REPLACE_EMPTY_PROPERTIES, LS);

	}

	private static String getSendingReceivingPriority(CmObject cmObject) {
		String result = "-1";
		if (cmObject.getForSending() && cmObject.getForReceiving())
			result = "2";

		else if (cmObject.getForSending())
			result = "0";

		else if (cmObject.getForReceiving())
			result = "1";

		return result;
	}

	private static String getStoreVersion(Method method) {
		EList<Statement> statements = method.allStatements();
		if (statements.isEmpty()) {
			String msg = "Невозможно определить версию формата.";
			throw new NullPointerException(msg);
		}

		Statement statement = statements.get(0);
		ReturnStatement returnStatement = (ReturnStatement) statement;
		Expression returnExpression = returnStatement.getExpression();
		StringLiteral stringLiteral = (StringLiteral) returnExpression;

		return stringLiteral.getLines().get(0).replace("\"", "");
	}

	private static void parseAfterReceivingAlgorithm(Expression rightExpression, CmObjectRule objectRule,
			ConversionModule conversionModule) {
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String algorithmName = stringLiteral.getLines().get(0).replace("\"", "");

		CmAlgorithm algorithm = conversionModule.getAlgorithm(algorithmName);
		if (algorithm == null) {
			algorithm = cmFactory.eINSTANCE.createCmAlgorithm();

			algorithm.setName(algorithmName);

			conversionModule.getAlgorithms().add(algorithm);
		}

		objectRule.setAfterReceivingAlgorithm(algorithm);
	}

	private static void parseDataRuleCheckMethod(Statement statement) {
		Expression leftExpression = ((SimpleStatement) statement).getLeft();
		StaticFeatureAccess leftFeatureAccess = (StaticFeatureAccess) leftExpression;

		if (!leftFeatureAccess.getName().equals("ПравилоОбработки")) {
			String msg = MessageFormat.format("Добавить ПОД: неизвестный StaticFeatureAccess: {0}",
					leftFeatureAccess.getName());
			throw new NullPointerException(msg);
		}
	}

	private static void parseDataRuleConfigurationObject(Expression rightExpression, CmDataRule dataRule) {
		if (rightExpression instanceof UndefinedLiteral) {
			dataRule.setSelectionVariant(CmSelectionVariant.CUSTOM);
			return;
		}

		DynamicFeatureAccess rightFeatureAccess1 = (DynamicFeatureAccess) rightExpression;
		DynamicFeatureAccess rightFeatureAccess2 = (DynamicFeatureAccess) rightFeatureAccess1.getSource();
		StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2.getSource();
		String configurationObjectName = rightFeatureAccess3.getName() + "." + rightFeatureAccess2.getName() + "."
				+ rightFeatureAccess1.getName();

		dataRule.setConfigurationObjectName(configurationObjectName);

		dataRule.setSelectionVariant(CmSelectionVariant.STANDART);
	}

	private static void parseDataRuleDataSelectionEvent(Expression rightExpression, Module module,
			CmDataRule dataRule) {
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String eventName = stringLiteral.getLines().get(0).replace("\"", "");

		Method eventMethod = getMethod(module, eventName);
		ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

		dataRule.setDataSelectionEvent(getMethodText(node.getText().trim()));
	}

	private static void parseDataRuleFormatObject(Expression rightExpression, CmDataRule dataRule) {
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String eventName = stringLiteral.getLines().get(0).replace("\"", "");

		dataRule.setFormatObject(eventName);
	}

	private static void parseDataRuleIsDataCleaning(Expression rightExpression, CmDataRule dataRule) {
		BooleanLiteral booleanLiteral = (BooleanLiteral) rightExpression;

		dataRule.setIsDataCleaning(booleanLiteral.isIsTrue());
	}

	private static CmDataRule parseDataRuleMethod(Method method, Module module, ConversionModule conversionModule) {
		CmDataRule dataRule = createDataRule(method.allStatements(), conversionModule);
		if (dataRule == null)
			return null;

		for (Statement statement : method.allStatements()) {
			Expression leftExpression = ((SimpleStatement) statement).getLeft();

			if (leftExpression instanceof DynamicFeatureAccess) {
				parseDataRuleNewDataRule(statement, module, dataRule);

			} else if (leftExpression instanceof StaticFeatureAccess) {
				parseDataRuleCheckMethod(statement);

			} else if (leftExpression instanceof Invocation) {
				parseDataRuleNewObjectRule(statement, dataRule, conversionModule);

			} else {
				String msg = MessageFormat.format("Добавить ПОД: необработанный Expression: {0}",
						leftExpression.getClass());
				throw new NullPointerException(msg);

			}
		}

		return dataRule;
	}

	private static void parseDataRuleNewDataRule(Statement statement, Module module, CmDataRule dataRule) {
		Expression leftExpression = ((SimpleStatement) statement).getLeft();
		DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;
		if (leftFeatureAccess.getName().equals("Имя"))
			// Обработали при создании нового правила
			return;

		Expression rightExpression = ((SimpleStatement) statement).getRight();

		if (leftFeatureAccess.getName().equals("ОбъектВыборкиМетаданные"))
			parseDataRuleConfigurationObject(rightExpression, dataRule);

		else if (leftFeatureAccess.getName().equals("ОбъектВыборкиФормат"))
			parseDataRuleFormatObject(rightExpression, dataRule);

		else if (leftFeatureAccess.getName().equals("ОчисткаДанных"))
			parseDataRuleIsDataCleaning(rightExpression, dataRule);

		else if (leftFeatureAccess.getName().equals("ПриОбработке"))
			parseDataRuleOnProcessingEvent(rightExpression, module, dataRule);

		else if (leftFeatureAccess.getName().equals("ВыборкаДанных"))
			parseDataRuleDataSelectionEvent(rightExpression, module, dataRule);

		else {
			String msg = MessageFormat.format("Добавить ПОД: неизвестное имя свойства: {0}",
					leftFeatureAccess.getName());
			throw new NullPointerException(msg);

		}

	}

	private static void parseDataRuleNewObjectRule(Statement statement, CmDataRule dataRule,
			ConversionModule conversionModule) {
		Expression leftExpression = ((SimpleStatement) statement).getLeft();
		Invocation leftInvocation = (Invocation) leftExpression;

		String ruleName = ((StringLiteral) leftInvocation.getParams().get(0)).getLines().get(0).replace("\"", "");

		CmObjectRule objectRule = conversionModule.getObjectRule(ruleName);
		if (objectRule == null) {
			objectRule = cmFactory.eINSTANCE.createCmObjectRule();

			objectRule.setName(ruleName);

			conversionModule.getObjectRules().add(objectRule);
		}

		EList<CmObjectRule> dataObjectRules = dataRule.getObjectRules();
		dataObjectRules.add(objectRule);
	}

	private static void parseDataRuleOnProcessingEvent(Expression rightExpression, Module module, CmDataRule dataRule) {
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String eventName = stringLiteral.getLines().get(0).replace("\"", "");

		Method eventMethod = getMethod(module, eventName);
		ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

		dataRule.setOnProcessingEvent(getMethodText(node.getText().trim()));
	}

	private static void parseDataRulesElseIfPartStatement(EList<Conditional> elseIfPartConditionals,
			EList<CmDataRule> dataRules) {
		EList<Statement> elseIfPartStatements = elseIfPartConditionals.get(0).getStatements();
		for (Statement partStatement : elseIfPartStatements) {
			if (partStatement instanceof SimpleStatement) {
				SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
				Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
				StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression.getMethodAccess();

				CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();

				dataRule.setName(partMethodAccess.getName().substring(12));
				dataRule.setForSending(false);
				dataRule.setForReceiving(true);

				dataRules.add(dataRule);
			}
		}
	}

	private static void parseDataRulesIfPartStatement(EList<Statement> ifPartStatements, EList<CmDataRule> dataRules) {
		for (Statement partStatement : ifPartStatements) {
			if (partStatement instanceof SimpleStatement) {
				SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
				Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
				StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression.getMethodAccess();

				CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();

				dataRule.setName(partMethodAccess.getName().substring(12));
				dataRule.setForSending(true);
				dataRule.setForReceiving(false);

				dataRules.add(dataRule);
			}
		}
	}

	private static void parseMethod(Method method, Module module, CmSubsystem cmMainSubsystem,
			Configuration configuration, ConversionModule conversionModule, IV8ProjectManager projectManager,
			IBmEmfIndexManager bmEmfIndexManager) {
		String methodName = method.getName();

		if (methodName.equals("ПередКонвертацией")) {
			ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

			conversionModule.setBeforeConvertationEvent(getMethodText(node.getText().trim()));

		} else if (methodName.equals("ПередОтложеннымЗаполнением")) {
			ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

			conversionModule.setBeforeFillingEvent(getMethodText(node.getText().trim()));

		} else if (methodName.equals("ПослеКонвертации")) {
			ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

			conversionModule.setAfterConvertationEvent(getMethodText(node.getText().trim()));

		} else if (methodName.equals("ВерсияФорматаМенеджераОбмена")) {
			String storeVersion = getStoreVersion(method);
			if (storeVersion != null)
				conversionModule.setStoreVersion(storeVersion);

		} else if (methodName.equals("ЗаполнитьПараметрыКонвертации")) {
			parseParams(method, conversionModule);

		} else {
			CommandInterface mainCommandInterface = (CommandInterface) configuration.getMainSectionCommandInterface();

			analyzeRules(conversionModule,
					method,
					module,
					projectManager,
					bmEmfIndexManager,
					mainCommandInterface,
					cmMainSubsystem);

		}
	}

	private static void parseObjectBeforeReceivingEvent(Expression rightExpression, Module module,
			CmObjectRule objectRule) {
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String eventName = stringLiteral.getLines().get(0).replace("\"", "");

		Method eventMethod = getMethod(module, eventName);
		ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

		objectRule.setBeforeReceivingEvent(getMethodText(node.getText().trim()));
	}

	private static void parseObjectOnReceivingEvent(Expression rightExpression, Module module,
			CmObjectRule objectRule) {
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String eventName = stringLiteral.getLines().get(0).replace("\"", "");

		Method eventMethod = getMethod(module, eventName);
		ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

		objectRule.setOnReceivingEvent(getMethodText(node.getText().trim()));
	}

	private static void parseObjectRuleAttribute(EList<Expression> params, String configurationTabularSection,
			String formatTabularSection, CmObjectRule objectRule, ConversionModule conversionModule) {
		String configurationAttribute = "";
		String formatAttribute = "";
		boolean isCustomRule = false;

		CmObjectRule attributeObjectRule = null;

		if (params.size() >= 2 && params.get(1) instanceof StringLiteral)
			configurationAttribute = ((StringLiteral) params.get(1)).getLines().get(0).replace("\"", "");

		if (params.size() >= 3 && params.get(2) instanceof StringLiteral)
			formatAttribute = ((StringLiteral) params.get(2)).getLines().get(0).replace("\"", "");

		if (params.size() >= 4 && params.get(3) instanceof NumberLiteral)
			isCustomRule = !((NumberLiteral) params.get(3)).getValue().get(0).equals("0");

		if (params.size() >= 5 && params.get(4) instanceof StringLiteral) {
			String attributeRuleName = ((StringLiteral) params.get(4)).getLines().get(0).replace("\"", "");
			attributeObjectRule = conversionModule.getObjectRule(attributeRuleName);

			if (attributeObjectRule == null) {
				attributeObjectRule = cmFactory.eINSTANCE.createCmObjectRule();

				attributeObjectRule.setName(attributeRuleName);

				conversionModule.getObjectRules().add(attributeObjectRule);
			}
		}

		EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();

		CmAttributeRule attributeRule = cmFactory.eINSTANCE.createCmAttributeRule();

		attributeRule.setConfigurationTabularSection(configurationTabularSection);
		attributeRule.setConfigurationAttribute(configurationAttribute);
		if (configurationAttribute.length() == 0)
			attributeRule.setConfigurationTabularSection("");

		attributeRule.setFormatTabularSection(formatTabularSection);
		attributeRule.setFormatAttribute(formatAttribute);
		if (formatAttribute.isEmpty())
			attributeRule.setFormatTabularSection("");

		attributeRule.setIsCustomRule(isCustomRule);
		attributeRule.setObjectRule(attributeObjectRule);

		attributeRules.add(attributeRule);
	}

	private static void parseObjectRuleConfigurationObject(Expression rightExpression, CmObjectRule objectRule) {
		DynamicFeatureAccess rightFeatureAccess1 = (DynamicFeatureAccess) rightExpression;
		DynamicFeatureAccess rightFeatureAccess2 = (DynamicFeatureAccess) rightFeatureAccess1.getSource();
		StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2.getSource();
		String configurationObjectName = rightFeatureAccess3.getName() + "." + rightFeatureAccess2.getName() + "."
				+ rightFeatureAccess1.getName();

		objectRule.setConfigurationObjectName(configurationObjectName);
	}

	private static void parseObjectRuleForGroup(Expression rightExpression, CmObjectRule objectRule) {
		BooleanLiteral booleanLiteral = (BooleanLiteral) rightExpression;

		objectRule.setForGroup(booleanLiteral.isIsTrue());
	}

	private static void parseObjectRuleFormatObject(Expression rightExpression, CmObjectRule objectRule) {
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String formatObject = stringLiteral.getLines().get(0).replace("\"", "");

		objectRule.setFormatObject(formatObject);
	}

	private static void parseObjectRuleIdentificationField(FeatureAccess leftMethodAccess, EList<Expression> params,
			CmObjectRule objectRule) {
		DynamicFeatureAccess leftSource = (DynamicFeatureAccess) ((DynamicFeatureAccess) leftMethodAccess).getSource();

		if (leftSource.getName().equals("ПоляПоиска")) {
			EList<String> identificationFields = objectRule.getIdentificationFields();
			identificationFields.add(((StringLiteral) params.get(0)).getLines().get(0).replace("\"", ""));

		} else {
			String msg = MessageFormat.format("Добавить ПКО: необработанный Source: {0}", leftSource.getName());
			throw new NullPointerException(msg);

		}
	}

	private static void parseObjectRuleIdentificationVariant(Expression rightExpression, CmObjectRule objectRule) {
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String identificationVariant = stringLiteral.getLines().get(0).replace("\"", "");

		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID);
		if (identificationVariant.equals("ПоПолямПоиска"))
			objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);
		else if (identificationVariant.equals("СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска"))
			objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);
	}

	private static CmObjectRule parseObjectRuleMethod(Method method, Module module, ConversionModule conversionModule) {
		CmObjectRule objectRule = createObjectRule(method.allStatements(), conversionModule);

		if (objectRule == null)
			return null;

		String configurationTabularSection = "";
		String formatTabularSection = "";

		for (Statement statement : method.allStatements()) {
			Expression leftExpression = ((SimpleStatement) statement).getLeft();

			if (leftExpression instanceof DynamicFeatureAccess) {
				parseObjectRuleNewObjectRule(statement, module, objectRule, conversionModule);

			} else if (leftExpression instanceof StaticFeatureAccess) {
				Pair<String, String> tabularSection = parseTabularSection(statement, leftExpression);
				if (tabularSection != null) {
					configurationTabularSection = tabularSection.getKey();
					formatTabularSection = tabularSection.getValue();
				}

			} else if (leftExpression instanceof Invocation) {
				parseObjectRuleMiscFields(statement,
						configurationTabularSection,
						formatTabularSection,
						objectRule,
						conversionModule);

			} else {
				String msg = MessageFormat.format("Добавить ПКО: необработанный Expression: {0}",
						leftExpression.getClass());
				throw new NullPointerException(msg);

			}
		}

		return objectRule;

	}

	private static void parseObjectRuleMiscFields(Statement statement, String configurationTabularSection,
			String formatTabularSection, CmObjectRule objectRule, ConversionModule conversionModule) {
		Expression leftExpression = ((SimpleStatement) statement).getLeft();
		Invocation leftInvocation = (Invocation) leftExpression;
		EList<Expression> params = leftInvocation.getParams();

		FeatureAccess leftMethodAccess = leftInvocation.getMethodAccess();
		if (leftMethodAccess instanceof StaticFeatureAccess)
			parseObjectRuleAttribute(params,
					configurationTabularSection,
					formatTabularSection,
					objectRule,
					conversionModule);

		else if (leftMethodAccess instanceof DynamicFeatureAccess)
			parseObjectRuleIdentificationField(leftMethodAccess, params, objectRule);
	}

	private static void parseObjectRuleNewObjectRule(Statement statement, Module module, CmObjectRule objectRule,
			ConversionModule conversionModule) {
		Expression leftExpression = ((SimpleStatement) statement).getLeft();
		DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;

		if (leftFeatureAccess.getName().equals("ИмяПКО"))
			// Обработали при создании правила
			return;

		Expression rightExpression = ((SimpleStatement) statement).getRight();
		if (rightExpression instanceof UndefinedLiteral)
			return;

		if (leftFeatureAccess.getName().equals("ОбъектДанных"))
			parseObjectRuleConfigurationObject(rightExpression, objectRule);

		else if (leftFeatureAccess.getName().equals("ОбъектФормата"))
			parseObjectRuleFormatObject(rightExpression, objectRule);

		else if (leftFeatureAccess.getName().equals("ПравилоДляГруппыСправочника"))
			parseObjectRuleForGroup(rightExpression, objectRule);

		else if (leftFeatureAccess.getName().equals("ВариантИдентификации"))
			parseObjectRuleIdentificationVariant(rightExpression, objectRule);

		else if (leftFeatureAccess.getName().equals("ПриОтправкеДанных"))
			parseObjectRuleOnSendingEvent(rightExpression, module, objectRule);

		else if (leftFeatureAccess.getName().equals("ПриКонвертацииДанныхXDTO"))
			parseObjectBeforeReceivingEvent(rightExpression, module, objectRule);

		else if (leftFeatureAccess.getName().equals("ПередЗаписьюПолученныхДанных"))
			parseObjectOnReceivingEvent(rightExpression, module, objectRule);

		else if (leftFeatureAccess.getName().equals("ПослеЗагрузкиВсехДанных"))
			parseAfterReceivingAlgorithm(rightExpression, objectRule, conversionModule);

		else {
			String msg = MessageFormat.format("Добавить ПКО: неизвестное имя свойства: {0}",
					leftFeatureAccess.getName());
			throw new NullPointerException(msg);
		}

	}

	private static void parseObjectRuleOnSendingEvent(Expression rightExpression, Module module,
			CmObjectRule objectRule) {
		StringLiteral stringLiteral = (StringLiteral) rightExpression;
		String eventName = stringLiteral.getLines().get(0).replace("\"", "");

		Method eventMethod = getMethod(module, eventName);
		ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

		objectRule.setOnSendingEvent(getMethodText(node.getText().trim()));
	}

	private static void parseObjectRulesIfStatement(IfStatement ifStatement, ConversionModule conversionModule) {
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();

		EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
		EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

		for (Statement partStatement : ifPartStatements) {
			if (partStatement instanceof SimpleStatement) {
				SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
				Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
				StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression.getMethodAccess();

				String objectRuleName = partMethodAccess.getName().substring(12);

				CmObjectRule objectRule = conversionModule.getObjectRule(objectRuleName);
				if (objectRule == null) {
					objectRule = cmFactory.eINSTANCE.createCmObjectRule();

					objectRule.setName(objectRuleName);

					objectRules.add(objectRule);
				}

				objectRule.setForSending(true);
				objectRule.setForReceiving(false);
			}

		}

		EList<Statement> elseIfPartStatements = elseIfPartConditionals.get(0).getStatements();
		for (Statement partStatement : elseIfPartStatements) {
			if (partStatement instanceof SimpleStatement) {
				SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
				Invocation partInvocation = (Invocation) partSimpleStatement.getLeft();
				StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partInvocation.getMethodAccess();

				String objectRuleName = partMethodAccess.getName().substring(12);

				CmObjectRule objectRule = conversionModule.getObjectRule(objectRuleName);
				if (objectRule == null) {
					objectRule = cmFactory.eINSTANCE.createCmObjectRule();

					objectRule.setName(objectRuleName);

					objectRules.add(objectRule);
				}

				objectRule.setForSending(false);
				objectRule.setForReceiving(true);
			}

		}
	}

	private static void parseParams(Method method, ConversionModule conversionModule) {
		EList<String> params = new BasicEList<>();
		for (Statement statement : method.allStatements()) {
			Invocation leftInvocation = (Invocation) ((SimpleStatement) statement).getLeft();
			String paramName = ((StringLiteral) leftInvocation.getParams().get(0)).getLines().get(0).replace("\"", "");
			params.add(paramName);
		}
		conversionModule.getParams().addAll(params);
	}

	private static CmPredefined parsePredefined(CmPredefined cmPredefined, SimpleStatement statement,
			ConversionModule conversionModule) {
		Expression leftExpression = statement.getLeft();

		if (leftExpression instanceof DynamicFeatureAccess) {
			DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;

			if (leftFeatureAccess.getName().equals("ИмяПКПД"))
				return createPredefined(statement, conversionModule);

			else
				parsePredefinedNewPredefined(statement, cmPredefined);

		} else if (leftExpression instanceof Invocation) {
			parsePredefinedValue(leftExpression, cmPredefined);

		} else if (leftExpression instanceof StaticFeatureAccess) {
			// Нечего делать

		} else {
			String msg = MessageFormat.format("Добавить ПКПД: необработанный Expression: {0}",
					leftExpression.getClass());
			throw new NullPointerException(msg);

		}

		return cmPredefined;
	}

	private static void parsePredefinedNewPredefined(Statement statement, CmPredefined cmPredefined) {
		if (cmPredefined == null)
			return;

		Expression leftExpression = ((SimpleStatement) statement).getLeft();
		DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;
		Expression rightExpression = ((SimpleStatement) statement).getRight();

		if (leftFeatureAccess.getName().equals("ТипДанных")) {
			DynamicFeatureAccess rightFeatureAccess1 = (DynamicFeatureAccess) rightExpression;
			DynamicFeatureAccess rightFeatureAccess2 = (DynamicFeatureAccess) rightFeatureAccess1.getSource();
			StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2.getSource();
			String configurationObjectName = rightFeatureAccess3.getName() + "." + rightFeatureAccess2.getName() + "."
					+ rightFeatureAccess1.getName();

			cmPredefined.setConfigurationObjectName(configurationObjectName);

		} else if (leftFeatureAccess.getName().equals("ТипXDTO")) {
			StringLiteral stringLiteral = (StringLiteral) rightExpression;
			String formatObject = stringLiteral.getLines().get(0).replace("\"", "");

			cmPredefined.setFormatObject(formatObject);

		} else if (leftFeatureAccess.getName().equals("КонвертацииЗначенийПриОтправке")) {
			cmPredefined.setForSending(true);

		} else if (leftFeatureAccess.getName().equals("КонвертацииЗначенийПриПолучении")) {
			cmPredefined.setForReceiving(true);

		} else {
			String msg = MessageFormat.format("Добавить ПКПД: необработанный DynamicFeatureAccess: {0}",
					leftFeatureAccess.getName());
			throw new NullPointerException(msg);
		}
	}

	private static void parsePredefinedsIfStatement(IfStatement ifStatement, ConversionModule conversionModule) {
		CmPredefined cmPredefined = null;

		EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
		for (Statement partStatement : ifPartStatements)
			if (partStatement instanceof SimpleStatement)
				cmPredefined = parsePredefined(cmPredefined, (SimpleStatement) partStatement, conversionModule);
	}

	private static void parsePredefinedValue(Expression leftExpression, CmPredefined cmPredefined) {
		if (cmPredefined == null)
			return;

		Invocation leftInvocation = (Invocation) leftExpression;

		EList<Expression> params = leftInvocation.getParams();

		DynamicFeatureAccess configurationValueParam;
		StringLiteral formatValueParam;
		if (params.get(0) instanceof DynamicFeatureAccess) {
			configurationValueParam = (DynamicFeatureAccess) params.get(0);
			formatValueParam = (StringLiteral) params.get(1);

		} else {
			configurationValueParam = (DynamicFeatureAccess) params.get(1);
			formatValueParam = (StringLiteral) params.get(0);

		}

		DynamicFeatureAccess configurationValueParam2 = (DynamicFeatureAccess) configurationValueParam.getSource();
		StaticFeatureAccess configurationValueParam3 = (StaticFeatureAccess) configurationValueParam2.getSource();
		String configurationValueName = configurationValueParam3.getName() + "." + configurationValueParam2.getName()
				+ "." + configurationValueParam.getName();

		String formatValueName = formatValueParam.getLines().get(0).replace("\"", "");

		if (cmPredefined.predefinedValueExists(configurationValueName, formatValueName))
			return;

		CmPredefinedValue predefinedValue;
		if (cmPredefined.getPredefinedType().equals(CmPredefinedType.ENUM))
			predefinedValue = cmFactory.eINSTANCE.createCmPredefinedEnumValue();
		else
			predefinedValue = cmFactory.eINSTANCE.createCmPredefinedCatalogValue();

		predefinedValue.setConfigurationValueName(configurationValueName);
		predefinedValue.setFormatValue(formatValueName);

		cmPredefined.getPredefinedValues().add(predefinedValue);
	}

	private static Pair<String, String> parseTabularSection(Statement statement, Expression leftExpression) {
		String configurationTabularSection = "";
		String formatTabularSection = "";

		StaticFeatureAccess leftFeatureAccess = (StaticFeatureAccess) leftExpression;

		if (leftFeatureAccess.getName().equals("ПравилоКонвертации")) {
			return null;

		} else if (leftFeatureAccess.getName().equals(HEADER_ATTRIBUTES)) {
			configurationTabularSection = "";
			formatTabularSection = "";

		} else if (leftFeatureAccess.getName().equals(TABULAR_ATTRIBUTES)) {
			Invocation rightInvocation = (Invocation) ((SimpleStatement) statement).getRight();

			EList<Expression> params = rightInvocation.getParams();

			configurationTabularSection = ((StringLiteral) params.get(1)).getLines().get(0).replace("\"", "");
			formatTabularSection = ((StringLiteral) params.get(2)).getLines().get(0).replace("\"", "");

		} else {
			String msg = MessageFormat.format("Добавить ПКО: неизвестный StaticFeatureAccess: {0}",
					leftFeatureAccess.getName());
			throw new NullPointerException(msg);
		}

		return new Pair<>(configurationTabularSection, formatTabularSection);
	}

	private static String readContents(CharSource source) {
		try (Reader reader = source.openBufferedStream()) {
			return CharStreams.toString(reader);

		} catch (IOException | NullPointerException e) {
			return "";

		}
	}

	private static String replaceEmptyDataRulePropertiesText(String dataRuleText) {
		return dataRuleText.replace("	ПравилоОбработки.ПриОбработке            = \"\";", "---")
				.replace("	ПравилоОбработки.ВыборкаДанных           = \"\";", "---")
				.replaceAll(REPLACE_EMPTY_PROPERTIES, "");
	}

	private static String replaceEmptyObjectRulePropertiesText(String objectRuleText) {
		return objectRuleText.replace("	ПравилоКонвертации.ПравилоДляГруппыСправочника  = Ложь;", "---")
				.replace("	ПравилоКонвертации.ПриОтправкеДанных = \"\";", "---")
				.replace("	ПравилоКонвертации.ПриОтправкеДанных            = \"\";", "---")
				.replace("	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"\";", "---")
				.replace("	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"\";", "---")
				.replace("	ПравилоКонвертации.ПослеЗагрузкиВсехДанных      = \"\";", "---")
				.replaceAll(REPLACE_EMPTY_PROPERTIES, "");
	}

	private static void resolveBmObjects(ConversionModule conversionModule, Configuration configuration) {
		for (CmSubsystem cmSubsystem : conversionModule.getSubsystems()) {
			if (cmSubsystem.getSubsystem() == null)
				continue;
			cmSubsystem.setSubsystem((Subsystem) EcoreUtil.resolve(cmSubsystem.getSubsystem(), configuration));
		}
		for (CmObject cmObject : conversionModule.getDataRules()) {
			if (cmObject.getConfigurationObject() == null)
				continue;
			cmObject.setConfigurationObject(
					(MdObject) EcoreUtil.resolve(cmObject.getConfigurationObject(), configuration));
		}
		for (CmObject cmObject : conversionModule.getObjectRules()) {
			if (cmObject.getConfigurationObject() == null)
				continue;
			cmObject.setConfigurationObject(
					(MdObject) EcoreUtil.resolve(cmObject.getConfigurationObject(), configuration));
		}
		for (CmObject cmObject : conversionModule.getPredefineds()) {
			if (cmObject.getConfigurationObject() == null)
				continue;
			cmObject.setConfigurationObject(
					(MdObject) EcoreUtil.resolve(cmObject.getConfigurationObject(), configuration));
		}

	}

	private static void setPredefinedCatalogConfigurationValue(CatalogPredefinedItem enumValue,
			CmPredefined predefined) {
		CmPredefinedCatalogValue cmPredefinedValue = (CmPredefinedCatalogValue) predefined
				.getPredefinedConfigurationValue(enumValue.getName());
		if (cmPredefinedValue != null)
			cmPredefinedValue.setConfigurationValue(enumValue);
	}

	private static void setPredefinedCatalogConfigurationValues(Catalog configurationObject, CmPredefined predefined) {
		for (CatalogPredefinedItem enumValue : configurationObject.getPredefined().getItems()) {
			setPredefinedCatalogConfigurationValue(enumValue, predefined);

			if (enumValue.isIsFolder())
				for (CatalogPredefinedItem enumSubValue : enumValue.getContent())
					setPredefinedCatalogConfigurationValue(enumSubValue, predefined);

		}
	}

	private static void setPredefinedEnumConfigurationValues(Enum configurationObject, CmPredefined predefined) {
		for (EnumValue enumValue : configurationObject.getEnumValues()) {
			CmPredefinedEnumValue cmPredefinedValue = (CmPredefinedEnumValue) predefined
					.getPredefinedConfigurationValue(enumValue.getName());
			if (cmPredefinedValue != null)
				cmPredefinedValue.setConfigurationValue(enumValue);
		}
	}

	private ConversionModuleAnalyzer() {
		throw new IllegalStateException("Вспомогательный класс");
	}

}
