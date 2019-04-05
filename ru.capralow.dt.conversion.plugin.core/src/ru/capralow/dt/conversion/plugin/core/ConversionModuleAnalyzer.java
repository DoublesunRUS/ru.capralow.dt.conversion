package ru.capralow.dt.conversion.plugin.core;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
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
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._1c.g5.v8.dt.metadata.mdclass.Document;
import com._1c.g5.v8.dt.metadata.mdclass.DocumentCommand;
import com._1c.g5.v8.dt.metadata.mdclass.InformationRegister;
import com._1c.g5.v8.dt.metadata.mdclass.InformationRegisterDimension;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;
import com._1c.g5.v8.dt.metadata.mdclass.StandardCommand;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;
import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObject;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

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

	private static final Logger LOGGER = LoggerFactory.getLogger(ConversionModuleAnalyzer.class);

	private static final String LS = System.lineSeparator();

	private static final String ADD_DATARULE = "ДобавитьПОД_";
	private static final String ADD_OBJECTRULE = "ДобавитьПКО_";

	private static final String OBJECT_RULE_NAME_PARAM = "ObjectRuleName";
	private static final String CONFIGURATION_OBJECT_PARAM = "ConfigurationObject";
	private static final String FORMAT_OBJECT_PARAM = "FormatObject";
	private static final String EVENTS_PARAM = "Events";

	private static final String PARAMS_FOR_OBJECTRULE = "(ПравилаКонвертации)";

	private static final String UNKNOWN_VALUE = "Неопределено";

	private static final String END_OF_REGION = "#КонецОбласти";

	private static final String REPLACE_EMPTY_PROPERTIES = "---\\r\\n|---\\r|---\\n";

	public static final Integer COMPARATOR_ORDER_BY_NAME = 1;
	public static final Integer COMPARATOR_ORDER_BY_SENDING = 2;
	public static final Integer COMPARATOR_ORDER_BY_RECEIVING = 3;

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

		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager
				.getEmfIndexProvider(configurationProject.getProject());

		Module module = commonModule.getModule();

		CmSubsystem cmMainSubsystem = addSubsystems(conversionModule.getSubsystems(),
				(CommandInterface) configuration.getCommandInterface());

		for (Method method : module.allMethods())
			parseMethod(method, module, cmMainSubsystem, configuration, conversionModule, bmEmfIndexProvider);

		return conversionModule;
	}

	public static void createObjectRuleReceivingText(CmObjectRule objectRule,
			StringBuilder objectRulesDeclarationReceivingText, StringBuilder objectRulesReceiving,
			StringBuilder objectRulesEventsText) {
		if (objectRule.getName().isEmpty())
			return;

		final String TEMPLATE_NAME_ObjectRuleReceiving = "ObjectRuleReceivingV2.txt";
		String templateObjectRuleReceivingContent = readContents(
				getFileInputSupplier(TEMPLATE_NAME_ObjectRuleReceiving));

		if (objectRulesDeclarationReceivingText.length() != 0)
			objectRulesDeclarationReceivingText.append(LS);
		objectRulesDeclarationReceivingText.append(ADD_OBJECTRULE).append(objectRule.getName())
				.append("(ПравилаКонвертации);");

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

	public static void createObjectRuleSendingText(CmObjectRule objectRule,
			StringBuilder objectRulesDeclarationSendingText, StringBuilder objectRulesSending,
			StringBuilder objectRulesEventsText) {
		if (objectRule.getName().isEmpty())
			return;

		final String TEMPLATE_NAME_ObjectRuleSending = "ObjectRuleSendingV2.txt";
		String templateObjectRuleSendingContent = readContents(getFileInputSupplier(TEMPLATE_NAME_ObjectRuleSending));

		if (objectRulesDeclarationSendingText.length() != 0)
			objectRulesDeclarationSendingText.append(LS);
		objectRulesDeclarationSendingText.append(ADD_OBJECTRULE).append(objectRule.getName())
				.append(PARAMS_FOR_OBJECTRULE).append(";");

		if (objectRulesSending.length() != 0)
			objectRulesSending.append(LS);
		StringTemplate templateObjectRuleSending = new StringTemplate(templateObjectRuleSendingContent);

		templateObjectRuleSending.setAttribute(OBJECT_RULE_NAME_PARAM, objectRule.getName());

		templateObjectRuleSending.setAttribute(CONFIGURATION_OBJECT_PARAM,
				objectRule.getConfigurationObjectName().isEmpty() ? UNKNOWN_VALUE
						: objectRule.getConfigurationObjectName());
		templateObjectRuleSending.setAttribute(FORMAT_OBJECT_PARAM, objectRule.getFormatObject());

		createObjectRuleSendingAttributeRulesText(objectRule, templateObjectRuleSending);

		createObjectRuleSendingEventsText(objectRule, templateObjectRuleSending, objectRulesEventsText);

		String objectRuleSending = replaceEmptyObjectRulePropertiesText(templateObjectRuleSending.toString());

		objectRulesSending.append(objectRuleSending);

	}

	public static Comparator<CmAlgorithm> getAlgorithmComparator() {
		return (CmAlgorithm cmArg1, CmAlgorithm cmArg2) -> {
			String[] str1 = new String[1];
			String[] str2 = new String[1];

			str1[0] = cmArg1.getName();

			str2[0] = cmArg2.getName();

			return ConversionUtils.compareArraysOfString(str1, str2);
		};
	}

	public static Comparator<CmAttributeRule> getAttributeRuleComparator(Integer comparatorOrder) {
		return (CmAttributeRule cmArg1, CmAttributeRule cmArg2) -> {
			String[] str1;
			String[] str2;

			str1 = new String[6];
			str2 = new String[6];

			str1[0] = cmArg1.getConfigurationTabularSection().isEmpty() && cmArg1.getFormatTabularSection().isEmpty()
					? "0"
					: "1";
			str1[1] = cmArg1.getIsCustomRule() ? "1" : "0";
			str1[2] = cmArg1.getConfigurationTabularSection();
			str1[3] = cmArg1.getFormatTabularSection();
			str1[4] = cmArg1.getConfigurationAttributeFullName();
			str1[5] = cmArg1.getFormatAttributeFullName();

			str2[0] = cmArg2.getConfigurationTabularSection().isEmpty() && cmArg2.getFormatTabularSection().isEmpty()
					? "0"
					: "1";
			str2[1] = cmArg2.getIsCustomRule() ? "1" : "0";
			str2[2] = cmArg2.getConfigurationTabularSection();
			str2[3] = cmArg2.getFormatTabularSection();
			str2[4] = cmArg2.getConfigurationAttributeFullName();
			str2[5] = cmArg2.getFormatAttributeFullName();

			return ConversionUtils.compareArraysOfString(str1, str2);
		};
	}

	public static Comparator<CmDataRule> getDataRuleComparator(Integer comparatorOrder) {
		return (CmDataRule cmArg1, CmDataRule cmArg2) -> {
			String[] str1;
			String[] str2;

			if (comparatorOrder.equals(COMPARATOR_ORDER_BY_SENDING)) {
				str1 = new String[3];
				str2 = new String[3];

				str1[0] = cmArg1.getConfigurationObjectName();
				str1[1] = cmArg1.getFormatObject();
				str1[2] = cmArg1.getName();

				str2[0] = cmArg2.getConfigurationObjectName();
				str2[1] = cmArg2.getFormatObject();
				str2[2] = cmArg2.getName();

			} else if (comparatorOrder.equals(COMPARATOR_ORDER_BY_RECEIVING)) {
				str1 = new String[3];
				str2 = new String[3];

				str1[0] = cmArg1.getFormatObject();
				str1[1] = cmArg1.getConfigurationObjectName();
				str1[2] = cmArg1.getName();

				str2[0] = cmArg2.getFormatObject();
				str2[1] = cmArg2.getConfigurationObjectName();
				str2[2] = cmArg2.getName();

			} else { // COMPARATOR_ORDER_BY_NAME
				str1 = new String[1];
				str2 = new String[1];

				str1[0] = cmArg1.getName();

				str2[0] = cmArg2.getName();

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
				str1 = new String[3];
				str2 = new String[3];

				str1[0] = cmArg1.getConfigurationObjectName();
				str1[1] = cmArg1.getFormatObject();
				str1[2] = cmArg1.getName();

				str2[0] = cmArg2.getConfigurationObjectName();
				str2[1] = cmArg2.getFormatObject();
				str2[2] = cmArg2.getName();

			} else if (comparatorOrder.equals(COMPARATOR_ORDER_BY_RECEIVING)) {
				str1 = new String[3];
				str2 = new String[3];

				str1[0] = cmArg1.getFormatObject();
				str1[1] = cmArg1.getConfigurationObjectName();
				str1[2] = cmArg1.getName();

				str2[0] = cmArg2.getFormatObject();
				str2[1] = cmArg2.getConfigurationObjectName();
				str2[2] = cmArg2.getName();

			} else { // COMPARATOR_ORDER_BY_NAME
				str1 = new String[1];
				str2 = new String[1];

				str1[0] = cmArg1.getName();

				str2[0] = cmArg2.getName();

			}

			return ConversionUtils.compareArraysOfString(str1, str2);
		};
	}

	public static Comparator<CmPredefined> getPredefinedComparator() {
		return (CmPredefined cmArg1, CmPredefined cmArg2) -> {
			String[] str1 = new String[1];
			String[] str2 = new String[1];

			str1[0] = cmArg1.getName();

			str2[0] = cmArg2.getName();

			return ConversionUtils.compareArraysOfString(str1, str2);
		};
	}

	public static URI getResourceURIforPlugin(String moduleName, IProject project, AbstractUIPlugin plugin) {
		return ConversionUtils.getResourceURIforPlugin(project.getName(), "conversionModule-" + moduleName, plugin);
	}

	public static ConversionModule loadResource(URI xmiUri, Configuration configuration) {
		if (xmiUri.toFileString() != null) {
			File file = new File(xmiUri.toFileString());
			if (!file.exists())
				return null;
		}
		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			// TODO: Сделать пересборку вторичных данных если файла нет
			final Map<Object, Object> loadOptions = xmiResource.getDefaultLoadOptions();
			xmiResource.load(loadOptions);
			ConversionModule conversionModule = (ConversionModule) xmiResource.getContents().get(0);

			resolveBmObjects(conversionModule, configuration);

			return conversionModule;

		} catch (IOException e) {
			String msg = "Не удалось загрузить вторичные данные для ConversionModule. Перезапустите сборку проекта.";
			LOGGER.error(msg, e);

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
			LOGGER.error(msg, e);

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

		ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

		StringBuilder params = new StringBuilder();

		for (FormalParam param : method.getFormalParams()) {
			if (params.length() != 0)
				params.append(", ");
			params.append(param.getName());

			Literal defaultValue = param.getDefaultValue();
			if (defaultValue == null)
				continue;

			if (defaultValue instanceof BooleanLiteral) {
				params.append(" = ").append((((BooleanLiteral) defaultValue).isIsTrue() ? "Истина" : "Ложь"));

			} else if (defaultValue instanceof StringLiteral) {
				params.append(" = ").append(((StringLiteral) defaultValue).getLines().get(0));

			} else if (defaultValue instanceof UndefinedLiteral) {
				params.append(" = ").append(UNKNOWN_VALUE);

			} else {
				throw new NullPointerException("Добавить Алгоритм: " + methodName + System.lineSeparator()
						+ "Необработанный тип значения переменной по умолчанию: " + defaultValue.getClass());

			}
		}

		algorithm.setMethodType(method instanceof Function ? CmMethodType.FUNCTION : CmMethodType.PROCEDURE);
		algorithm.setParams(params.toString());
		algorithm.setIsExport(method.isExport());
		algorithm.setBody(getMethodText(node.getText().trim()));

	}

	private static void addDataRule(Method method, Module module, SubsystemsFiller subsystemsFiller,
			ConversionModule conversionModule, IBmEmfIndexProvider bmEmfIndexProvider) {

		CmDataRule dataRule = parseDataRuleMethod(method, module, conversionModule);

		if (dataRule == null)
			throw new NullPointerException("Добавить ПОД: В методе не обнаружено имя правила: " + method.getName());

		MdObject configurationObject = ConversionUtils
				.getConfigurationObject(dataRule.getConfigurationObjectFormattedName(), bmEmfIndexProvider);
		dataRule.setConfigurationObject(configurationObject);

		dataRule.getSubsystems().addAll(subsystemsFiller.getSubsystems(dataRule.getConfigurationObject()));
	}

	private static void addDataRules(Method method, ConversionModule conversionModule) {
		EList<CmDataRule> dataRules = conversionModule.getDataRules();

		for (Statement statement : method.allStatements()) {
			if (!(statement instanceof IfStatement))
				throw new NullPointerException(
						"В процедуре ЗаполнитьПравилаОбработкиДанных ожидалась конструкция Если, но что-то пошло не так.");

			IfStatement ifStatement = (IfStatement) statement;
			EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
			EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

			parseDataRulesIfPartStatement(ifPartStatements, dataRules);
			parseDataRulesElseIfPartStatement(elseIfPartConditionals, dataRules);
		}
	}

	private static void addObjectRule(Method method, Module module, SubsystemsFiller subsystemsFiller,
			ConversionModule conversionModule, IBmEmfIndexProvider bmEmfIndexProvider) {

		CmObjectRule objectRule = parseObjectRuleMethod(method, module, conversionModule);

		if (objectRule == null)
			throw new NullPointerException("Добавить ПКО: В методе не обнаружено имя правила: " + method.getName());

		MdObject configurationObject = ConversionUtils
				.getConfigurationObject(objectRule.getConfigurationObjectFormattedName(), bmEmfIndexProvider);
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
			}
		}
	}

	private static void addPredefineds(Method method, ConversionModule conversionModule,
			IBmEmfIndexProvider bmEmfIndexProvider) {
		CmPredefined cmPredefined = null;

		for (Statement statement : method.allStatements()) {
			Expression leftExpression = ((SimpleStatement) statement).getLeft();

			if (leftExpression instanceof DynamicFeatureAccess) {
				DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;

				if (leftFeatureAccess.getName().equals("ИмяПКПД"))
					cmPredefined = createPredefined(statement, conversionModule);

				else
					parsePredefinedNewPredefined(statement, cmPredefined);

			} else if (leftExpression instanceof Invocation) {

				parsePredefinedValue(leftExpression, cmPredefined);

			} else if (leftExpression instanceof StaticFeatureAccess) {
				// Нечего делать

			} else {
				throw new NullPointerException(
						"Добавить ПКПД: необработанный Expression: " + leftExpression.getClass());
			}
		}

		for (CmPredefined predefined : conversionModule.getPredefineds())
			predefined.setConfigurationObject(ConversionUtils
					.getConfigurationObject(predefined.getConfigurationObjectFormattedName(), bmEmfIndexProvider));

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
			IBmEmfIndexProvider bmEmfIndexProvider, CommandInterface mainCommandInterface,
			CmSubsystem cmMainSubsystem) {

		String storeVersion = conversionModule.getStoreVersion();
		if (!storeVersion.equals("1") && !storeVersion.equals("2"))
			throw new NullPointerException("Неизвестная версия формата: " + storeVersion);

		SubsystemsFiller subsystemsFiller = new SubsystemsFiller(conversionModule, mainCommandInterface,
				cmMainSubsystem);

		String methodName = method.getName();

		// TODO: Реализовать чтение из первого формата
		if (methodName.equals("ЗаполнитьПравилаОбработкиДанных")) {
			addDataRules(method, conversionModule);

		} else if (methodName.startsWith(ADD_DATARULE)) {
			addDataRule(method, module, subsystemsFiller, conversionModule, bmEmfIndexProvider);

		} else if (methodName.equals("ЗаполнитьПравилаКонвертацииОбъектов")) {
			addObjectRules(method, conversionModule);

		} else if (methodName.startsWith(ADD_OBJECTRULE)) {
			addObjectRule(method, module, subsystemsFiller, conversionModule, bmEmfIndexProvider);

		} else if (methodName.equals("ЗаполнитьПравилаКонвертацииПредопределенныхДанных")) {
			addPredefineds(method, conversionModule, bmEmfIndexProvider);

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

	private static void createAlgorithmsText(StringTemplate templateMain, ConversionModule conversionModule) {
		String algorithms = conversionModule.getAllAlgorithmsText("");
		if (algorithms.isEmpty())
			algorithms = "---";

		templateMain.setAttribute("Algorithms", algorithms);
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

	private static void createDataRuleReceivingText(CmDataRule dataRule,
			StringBuilder dataRulesDeclarationReceivingText, StringBuilder dataRulesReceiving) {
		final String TEMPLATE_NAME_DataRuleReceiving = "DataRuleReceivingV2.txt";
		String templateDataRuleReceivingContent = readContents(getFileInputSupplier(TEMPLATE_NAME_DataRuleReceiving));

		if (dataRulesDeclarationReceivingText.length() != 0)
			dataRulesDeclarationReceivingText.append(LS);
		dataRulesDeclarationReceivingText.append(ADD_DATARULE).append(dataRule.getName())
				.append("(ПравилаОбработкиДанных);");

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

	private static void createDataRuleSendingText(CmDataRule dataRule, StringBuilder dataRulesDeclarationSendingText,
			StringBuilder dataRulesSending) {
		final String TEMPLATE_NAME_DataRuleSending = "DataRuleSendingV2.txt";
		String templateDataRuleSendingContent = readContents(getFileInputSupplier(TEMPLATE_NAME_DataRuleSending));

		if (dataRulesDeclarationSendingText.length() != 0)
			dataRulesDeclarationSendingText.append(LS);
		dataRulesDeclarationSendingText.append(ADD_DATARULE).append(dataRule.getName())
				.append("(ПравилаОбработкиДанных);");

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

	private static void createDataRulesText(StringTemplate templateMain, ConversionModule conversionModule) {
		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		if (dataRules.isEmpty()) {
			templateMain.setAttribute("DataRulesDeclaration", "	");
			templateMain.setAttribute("DataRulesSending", "---");
			return;
		}

		final String TEMPLATE_NAME_DATARULES_DECLARATION = "DataRulesDeclarationV2.txt";
		String templateDataRulesDeclarationContent = readContents(
				getFileInputSupplier(TEMPLATE_NAME_DATARULES_DECLARATION));
		StringTemplate templateDataRulesDeclaration = new StringTemplate(templateDataRulesDeclarationContent);

		StringBuilder dataRulesDeclarationSendingText = new StringBuilder();
		StringBuilder dataRulesDeclarationReceivingText = new StringBuilder();
		StringBuilder DataRulesSending = new StringBuilder();
		StringBuilder DataRulesReceiving = new StringBuilder();

		ECollections.sort(dataRules,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		for (CmDataRule dataRule : dataRules) {
			if (dataRule.getForSending() && dataRule.getForReceiving())
				throw new NullPointerException(
						"Правило Обработки Данных не может быть одновременно для отправки и получения.");

			else if (dataRule.getForSending())
				createDataRuleSendingText(dataRule, dataRulesDeclarationSendingText, DataRulesSending);

			else if (dataRule.getForReceiving())
				createDataRuleReceivingText(dataRule, dataRulesDeclarationReceivingText, DataRulesReceiving);

		}
		templateDataRulesDeclaration.setAttribute("DataRulesDeclarationSending", dataRulesDeclarationSendingText);
		templateDataRulesDeclaration.setAttribute("DataRulesDeclarationReceiving", dataRulesDeclarationReceivingText);

		if (DataRulesSending.length() != 0)
			DataRulesSending.insert(0, "#Область Отправка" + LS).append(LS + END_OF_REGION);
		if (DataRulesReceiving.length() != 0)
			DataRulesReceiving.insert(0, "#Область Получение" + LS).append(LS + END_OF_REGION);

		templateMain.setAttribute("DataRulesDeclaration", templateDataRulesDeclaration);
		templateMain.setAttribute("DataRulesSending", DataRulesSending);
		templateMain.setAttribute("DataRulesReceiving", DataRulesReceiving);
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
		attributeRulesText.append("	ДобавитьПКС(").append(variableName).append(", ").append("\"")
				.append(attributeRule.getConfigurationAttribute()).append("\",").append(formatAttributePrefix)
				.append(" \"").append(attributeRule.getFormatAttribute()).append("\"");

		if (attributeRule.getIsCustomRule() || attributeRule.getObjectRule() != null) {
			attributeRulesText.append(", ").append((attributeRule.getIsCustomRule() ? "1" : ""));
			if (attributeRule.getObjectRule() != null)
				attributeRulesText.append(",")
						.append((attributeRule.getConfigurationTabularSection().isEmpty()
								&& attributeRule.getFormatTabularSection().isEmpty() ? " " : ""))
						.append("\"").append(attributeRule.getObjectRule().getName()).append("\"");

		}

		attributeRulesText.append(");");
	}

	private static void createObjectRuleReceivingAttributeRulesText(CmObjectRule objectRule,
			StringTemplate templateObjectRuleSending) {
		EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();

		if (attributeRules.isEmpty()) {
			templateObjectRuleSending.setAttribute("AttributeRules", "	");
			return;
		}

		ECollections.sort(attributeRules, ConversionModuleAnalyzer
				.getAttributeRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		Map<String, Integer> mapFormatAttributeMaxLength = new HashMap<>();
		for (CmAttributeRule attributeRule : attributeRules) {
			Integer formatAttributeMaxLength = 0;

			String mapKey = attributeRule.getConfigurationTabularSection()
					.concat(attributeRule.getFormatTabularSection());
			formatAttributeMaxLength = getMaxLengthForTabularSection(mapKey, mapFormatAttributeMaxLength);
			if (attributeRule.getConfigurationAttribute().length() > formatAttributeMaxLength)
				mapFormatAttributeMaxLength.put(mapKey, attributeRule.getConfigurationAttribute().length());

			formatAttributeMaxLength = getMaxLengthForTabularSection("-", mapFormatAttributeMaxLength);
			if (attributeRule.getConfigurationTabularSection().length() > formatAttributeMaxLength)
				mapFormatAttributeMaxLength.put("-", attributeRule.getConfigurationTabularSection().length());
		}

		StringBuilder attributeRulesText = new StringBuilder();
		StringBuilder tabularSectionText = new StringBuilder();

		String configurationTabularSection = "-";
		String formatTabularSection = "-";
		for (CmAttributeRule attributeRule : attributeRules) {
			if (!attributeRule.getFormatTabularSection().isEmpty()
					&& attributeRule.getConfigurationAttribute().isEmpty())
				continue;

			if (!configurationTabularSection.equals(attributeRule.getConfigurationTabularSection())
					|| !formatTabularSection.equals(attributeRule.getFormatTabularSection())) {
				configurationTabularSection = attributeRule.getConfigurationTabularSection();
				formatTabularSection = attributeRule.getFormatTabularSection();

				if (configurationTabularSection.isEmpty() && formatTabularSection.isEmpty()) {
					attributeRulesText.append("	").append(LS);
					attributeRulesText.append("	СвойстваШапки = ПравилоКонвертации.Свойства;");

				} else {
					Integer formatAttributeMaxLength = getMaxLengthForTabularSection("-", mapFormatAttributeMaxLength);
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

			String mapKey = attributeRule.getConfigurationTabularSection()
					.concat(attributeRule.getFormatTabularSection());
			Integer formatAttributeMaxLength = getMaxLengthForTabularSection(mapKey, mapFormatAttributeMaxLength);

			if (configurationTabularSection.isEmpty() && formatTabularSection.isEmpty())
				createObjectRuleAttributeRow(attributeRule, attributeRulesText, "СвойстваШапки",
						formatAttributeMaxLength);
			else
				createObjectRuleAttributeRow(attributeRule, tabularSectionText, "СвойстваТЧ", formatAttributeMaxLength);
		}
		if (attributeRulesText.length() == 0)
			attributeRulesText.append("	");
		templateObjectRuleSending.setAttribute("AttributeRules", attributeRulesText);
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
			templateObjectRuleReceiving.setAttribute("IdentificationVariant", "ПоУникальномуИдентификатору");

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
			templateObjectRuleSending.setAttribute("AttributeRules", "	");
			return;
		}

		ECollections.sort(attributeRules, ConversionModuleAnalyzer
				.getAttributeRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		Map<String, Integer> mapFormatAttributeMaxLength = new HashMap<>();
		for (CmAttributeRule attributeRule : attributeRules) {
			Integer formatAttributeMaxLength = 0;

			String mapKey = attributeRule.getConfigurationTabularSection()
					.concat(attributeRule.getFormatTabularSection());
			formatAttributeMaxLength = getMaxLengthForTabularSection(mapKey, mapFormatAttributeMaxLength);
			if (attributeRule.getConfigurationAttribute().length() > formatAttributeMaxLength)
				mapFormatAttributeMaxLength.put(mapKey, attributeRule.getConfigurationAttribute().length());

			formatAttributeMaxLength = getMaxLengthForTabularSection("-", mapFormatAttributeMaxLength);
			if (attributeRule.getConfigurationTabularSection().length() > formatAttributeMaxLength)
				mapFormatAttributeMaxLength.put("-", attributeRule.getConfigurationTabularSection().length());
		}

		StringBuilder attributeRulesText = new StringBuilder();
		StringBuilder tabularSectionText = new StringBuilder();

		String configurationTabularSection = "-";
		String formatTabularSection = "-";
		for (CmAttributeRule attributeRule : attributeRules) {
			if (!attributeRule.getConfigurationTabularSection().isEmpty()
					&& attributeRule.getFormatAttribute().isEmpty())
				continue;

			if (!configurationTabularSection.equals(attributeRule.getConfigurationTabularSection())
					|| !formatTabularSection.equals(attributeRule.getFormatTabularSection())) {
				configurationTabularSection = attributeRule.getConfigurationTabularSection();
				formatTabularSection = attributeRule.getFormatTabularSection();

				if (configurationTabularSection.isEmpty() && formatTabularSection.isEmpty()) {
					attributeRulesText.append("	").append(LS);
					attributeRulesText.append("	СвойстваШапки = ПравилоКонвертации.Свойства;");

				} else {
					Integer formatAttributeMaxLength = getMaxLengthForTabularSection("-", mapFormatAttributeMaxLength);
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

			String mapKey = attributeRule.getConfigurationTabularSection()
					.concat(attributeRule.getFormatTabularSection());
			Integer formatAttributeMaxLength = getMaxLengthForTabularSection(mapKey, mapFormatAttributeMaxLength);

			if (configurationTabularSection.isEmpty() && formatTabularSection.isEmpty())
				createObjectRuleAttributeRow(attributeRule, attributeRulesText, "СвойстваШапки",
						formatAttributeMaxLength);
			else
				createObjectRuleAttributeRow(attributeRule, tabularSectionText, "СвойстваТЧ", formatAttributeMaxLength);
		}
		if (attributeRulesText.length() == 0)
			attributeRulesText.append("	");
		templateObjectRuleSending.setAttribute("AttributeRules", attributeRulesText);
		templateObjectRuleSending.setAttribute("TabularSectionRules", tabularSectionText);
	}

	private static void createObjectRuleSendingEventsText(CmObjectRule objectRule,
			StringTemplate templateObjectRuleSending, StringBuilder objectRulesEventsText) {
		templateObjectRuleSending.setAttribute("OnSendingEvent", objectRule.getOnSendingEventDeclaration());

		StringBuilder objectRuleEventsText = new StringBuilder();
		if (!objectRule.getOnSendingEvent().isEmpty()) {
			objectRuleEventsText.append(LS).append(objectRule.getOnSendingEventText());

			if (objectRulesEventsText.length() == 0)
				objectRulesEventsText.append("	Если");
			else
				objectRulesEventsText.append("	ИначеЕсли");
			objectRulesEventsText
					.append(" ИмяПроцедуры = \"ПКО_" + objectRule.getName() + "_ПриОтправкеДанных\" Тогда ").append(LS);
			objectRulesEventsText.append("		ПКО_" + objectRule.getName() + "_ПриОтправкеДанных(").append(LS);
			objectRulesEventsText.append(
					"			Параметры.ДанныеИБ, Параметры.ДанныеXDTO, Параметры.КомпонентыОбмена, Параметры.СтекВыгрузки);")
					.append(LS);
		}

		templateObjectRuleSending.setAttribute(EVENTS_PARAM, objectRuleEventsText);
	}

	private static void createObjectRulesText(StringTemplate templateMain, StringBuilder objectRulesEventsText,
			ConversionModule conversionModule) {
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		if (objectRules.isEmpty()) {
			templateMain.setAttribute("ObjectRulesDeclaration", "	");
			templateMain.setAttribute("ObjectRulesSending", "---");
			return;
		}

		final String TEMPLATE_NAME_OBJECTRULES_DECLARATION = "ObjectRulesDeclarationV2.txt";
		String templateObjectRulesDeclarationContent = readContents(
				getFileInputSupplier(TEMPLATE_NAME_OBJECTRULES_DECLARATION));
		StringTemplate templateObjectRulesDeclaration = new StringTemplate(templateObjectRulesDeclarationContent);

		StringBuilder objectRulesDeclarationSendingText = new StringBuilder();
		StringBuilder objectRulesDeclarationReceivingText = new StringBuilder();
		StringBuilder objectRulesDeclarationBothText = new StringBuilder();
		StringBuilder objectRulesSending = new StringBuilder();
		StringBuilder objectRulesReceiving = new StringBuilder();
		StringBuilder objectRulesBoth = new StringBuilder();

		ECollections.sort(objectRules,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		for (CmObjectRule objectRule : objectRules) {
			if (objectRule.getForSending() && objectRule.getForReceiving())
				createObjectRuleReceivingText(objectRule, objectRulesDeclarationBothText, objectRulesBoth,
						objectRulesEventsText);

			else if (objectRule.getForSending())
				createObjectRuleSendingText(objectRule, objectRulesDeclarationSendingText, objectRulesSending,
						objectRulesEventsText);

			else if (objectRule.getForReceiving())
				createObjectRuleReceivingText(objectRule, objectRulesDeclarationReceivingText, objectRulesReceiving,
						objectRulesEventsText);

		}
		templateObjectRulesDeclaration.setAttribute("ObjectRulesDeclarationSending", objectRulesDeclarationSendingText);
		templateObjectRulesDeclaration.setAttribute("ObjectRulesDeclarationReceiving",
				objectRulesDeclarationReceivingText);
		templateObjectRulesDeclaration.setAttribute("ObjectRulesDeclarationBoth", objectRulesDeclarationBothText);

		if (objectRulesSending.length() != 0)
			objectRulesSending.insert(0, "#Область Отправка" + LS).append(LS + END_OF_REGION);
		if (objectRulesReceiving.length() != 0)
			objectRulesReceiving.insert(0, "#Область Получение" + LS).append(LS + END_OF_REGION);
		if (objectRulesBoth.length() != 0)
			objectRulesBoth.insert(0, "#Область ОтправкаИПолучение" + LS).append(LS + END_OF_REGION);

		templateMain.setAttribute("ObjectRulesDeclaration", templateObjectRulesDeclaration);
		templateMain.setAttribute("ObjectRulesSending", objectRulesSending);
		templateMain.setAttribute("ObjectRulesReceiving", objectRulesReceiving);
		templateMain.setAttribute("ObjectRulesBoth", objectRulesBoth);
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

	private static CharSource getFileInputSupplier(String partName) {
		return Resources.asCharSource(ConversionModuleAnalyzer.class.getResource("/resources/module/" + partName),
				StandardCharsets.UTF_8);
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

		templateMain.setAttribute("ConvertationName", "// Конвертация " + name + " от "
				+ localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm:ss")) + "");

		templateMain.setAttribute("BeforeConvertationEvent", conversionModule.getBeforeConvertationEventText());
		templateMain.setAttribute("AfterConvertationEvent", conversionModule.getAfterConvertationEventText());
		templateMain.setAttribute("BeforeFillingEvent", conversionModule.getBeforeFillingEventText());

		templateMain.setAttribute("StoreVersion", conversionModule.getStoreVersion());

		StringBuilder objectRulesEventsText = new StringBuilder();

		createDataRulesText(templateMain, conversionModule);
		createObjectRulesText(templateMain, objectRulesEventsText, conversionModule);
		createAlgorithmsText(templateMain, conversionModule);

		if (objectRulesEventsText.length() != 0)
			objectRulesEventsText.append("	КонецЕсли;");

		templateMain.setAttribute(EVENTS_PARAM, objectRulesEventsText);

		return templateMain.toString().replaceAll(REPLACE_EMPTY_PROPERTIES, LS);

	}

	private static String getStoreVersion(Method method) {
		EList<Statement> statements = method.allStatements();
		if (statements.isEmpty())
			throw new NullPointerException("Невозможно определить версию формата.");

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

		if (!leftFeatureAccess.getName().equals("ПравилоОбработки"))
			throw new NullPointerException(
					"Добавить ПОД: неизвестный StaticFeatureAccess: " + leftFeatureAccess.getName());
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
				throw new NullPointerException("Добавить ПОД: необработанный Expression: " + leftExpression.getClass());

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

		else
			throw new NullPointerException("Добавить ПОД: неизвестное имя свойства: " + leftFeatureAccess.getName());

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
			Configuration configuration, ConversionModule conversionModule, IBmEmfIndexProvider bmEmfIndexProvider) {
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

		} else {
			CommandInterface mainCommandInterface = (CommandInterface) configuration.getMainSectionCommandInterface();

			analyzeRules(conversionModule, method, module, bmEmfIndexProvider, mainCommandInterface, cmMainSubsystem);

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
			throw new NullPointerException("Добавить ПКО: необработанный Source: " + leftSource.getName());

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
				parseObjectRuleMiscFields(statement, configurationTabularSection, formatTabularSection, objectRule,
						conversionModule);

			} else {
				throw new NullPointerException("Добавить ПКО: необработанный Expression: " + leftExpression.getClass());

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
			parseObjectRuleAttribute(params, configurationTabularSection, formatTabularSection, objectRule,
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

		else
			throw new NullPointerException("Добавить ПКО: неизвестное имя свойства: " + leftFeatureAccess.getName());

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
			throw new NullPointerException(
					"Добавить ПКПД: необработанный DynamicFeatureAccess: " + leftFeatureAccess.getName());
		}
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

		if (cmPredefined.predefinedMapExists(configurationValueName, formatValueName))
			return;

		CmPredefinedMap predefinedMap = cmFactory.eINSTANCE.createCmPredefinedMap();

		predefinedMap.setConfigurationValue(configurationValueName);
		predefinedMap.setFormatValue(formatValueName);

		cmPredefined.getPredefinedMaps().add(predefinedMap);
	}

	private static Pair<String, String> parseTabularSection(Statement statement, Expression leftExpression) {
		String configurationTabularSection = "";
		String formatTabularSection = "";

		StaticFeatureAccess leftFeatureAccess = (StaticFeatureAccess) leftExpression;

		if (leftFeatureAccess.getName().equals("ПравилоКонвертации")) {
			return null;

		} else if (leftFeatureAccess.getName().equals("СвойстваШапки")) {
			configurationTabularSection = "";
			formatTabularSection = "";

		} else if (leftFeatureAccess.getName().equals("СвойстваТЧ")) {
			Invocation rightInvocation = (Invocation) ((SimpleStatement) statement).getRight();

			EList<Expression> params = rightInvocation.getParams();

			configurationTabularSection = ((StringLiteral) params.get(1)).getLines().get(0).replace("\"", "");
			formatTabularSection = ((StringLiteral) params.get(2)).getLines().get(0).replace("\"", "");

		} else {
			throw new NullPointerException(
					"Добавить ПКО: неизвестный StaticFeatureAccess: " + leftFeatureAccess.getName());
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

	private ConversionModuleAnalyzer() {
		throw new IllegalStateException("Вспомогательный класс");
	}

}
