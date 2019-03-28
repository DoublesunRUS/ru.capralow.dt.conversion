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
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;
import ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;

public class ConversionModuleAnalyzer {
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

			for (CmSubsystem cmSubsystem : conversionModule.getSubsystems())
				if (cmSubsystem.getSubsystem() != null)
					cmSubsystem.setSubsystem((Subsystem) EcoreUtil.resolve(cmSubsystem.getSubsystem(), configuration));

			for (CmDataRule cmDataRule : conversionModule.getDataRules())
				if (cmDataRule.getConfigurationObject() != null)
					cmDataRule.setConfigurationObject(
							(MdObject) EcoreUtil.resolve(cmDataRule.getConfigurationObject(), configuration));

			for (CmObjectRule cmObjectRule : conversionModule.getObjectRules())
				if (cmObjectRule.getConfigurationObject() != null)
					cmObjectRule.setConfigurationObject(
							(MdObject) EcoreUtil.resolve(cmObjectRule.getConfigurationObject(), configuration));

			for (CmPredefined cmPredefined : conversionModule.getPredefineds())
				if (cmPredefined.getConfigurationObject() != null)
					cmPredefined.setConfigurationObject(
							(MdObject) EcoreUtil.resolve(cmPredefined.getConfigurationObject(), configuration));

			return conversionModule;

		} catch (IOException e) {
			e.printStackTrace();

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
			e.printStackTrace();

		}

	}

	public static ConversionModule analyze(CommonModule commonModule, ExchangeProject exchangeProject,
			HashMap<String, EnterpriseData> enterpriseDataPackages, IV8ProjectManager projectManager,
			IBmEmfIndexManager bmEmfIndexManager, AbstractUIPlugin plugin) {
		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();

		IV8Project configurationProject = projectManager.getProject(commonModule);
		if (configurationProject instanceof IExtensionProject)
			configurationProject = ((IExtensionProject) configurationProject).getParent();
		IProject project = configurationProject.getProject();
		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(project);

		Configuration configuration = ((IConfigurationProject) configurationProject).getConfiguration();

		Module module = commonModule.getModule();

		EList<Method> methods = module.allMethods();

		conversionModule.setStoreVersion("1");

		EList<CmSubsystem> subsystems = conversionModule.getSubsystems();
		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		EList<CmPredefined> predefineds = conversionModule.getPredefineds();
		EList<CmAlgorithm> algorithms = conversionModule.getAlgorithms();

		subsystems.clear();
		dataRules.clear();
		objectRules.clear();
		predefineds.clear();
		algorithms.clear();

		CommandInterface commandInterface = (CommandInterface) configuration.getCommandInterface();

		CommandInterface mainCommandInterface = (CommandInterface) configuration.getMainSectionCommandInterface();
		CmSubsystem cmMainSubsystem = cmFactory.eINSTANCE.createCmSubsystem();
		cmMainSubsystem.setSpecialSubsystemType(CmSpecialSubsystemType.MAIN);
		subsystems.add(cmMainSubsystem);

		SubsystemsOrder subsystemsOrder = commandInterface.getSubsystemsOrder();
		if (subsystemsOrder != null)
			for (Subsystem confSubsystem : subsystemsOrder.getSubsystems()) {
				if (!confSubsystem.isIncludeInCommandInterface())
					continue;

				CmSubsystem subsystem = cmFactory.eINSTANCE.createCmSubsystem();
				subsystem.setSubsystem(confSubsystem);

				subsystems.add(subsystem);
			}
		CmSubsystem subsystem = cmFactory.eINSTANCE.createCmSubsystem();
		subsystem.setSpecialSubsystemType(CmSpecialSubsystemType.EMPTY);
		subsystems.add(subsystem);

		for (Method method : methods) {
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
				EList<Statement> statements = method.allStatements();
				if (statements.size() != 0) {
					Statement statement = statements.get(0);
					ReturnStatement returnStatement = (ReturnStatement) statement;
					Expression returnExpression = returnStatement.getExpression();
					StringLiteral stringLiteral = (StringLiteral) returnExpression;
					String storeVersion = stringLiteral.getLines().get(0).replace("\"", "");

					conversionModule.setStoreVersion(storeVersion);

				} else {
					throw new NullPointerException("Невозможно определить версию формата.");

				}

			} else {
				String storeVersion = conversionModule.getStoreVersion();

				if (storeVersion.equals("1")) {
					analyzeV1(conversionModule, method, module, bmEmfIndexProvider, mainCommandInterface,
							cmMainSubsystem);

				} else if (storeVersion.equals("2")) {
					analyzeV2(conversionModule, method, module, bmEmfIndexProvider, mainCommandInterface,
							cmMainSubsystem);

				} else {
					throw new NullPointerException("Неизвестная версия формата: " + storeVersion);

				}

			}

		}

		return conversionModule;
	}

	private static void analyzeV2(ConversionModule conversionModule, Method method, Module module,
			IBmEmfIndexProvider bmEmfIndexProvider, CommandInterface mainCommandInterface,
			CmSubsystem cmMainSubsystem) {
		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		EList<CmPredefined> predefineds = conversionModule.getPredefineds();
		EList<CmAlgorithm> algorithms = conversionModule.getAlgorithms();

		String methodName = method.getName();

		if (methodName.equals("ЗаполнитьПравилаОбработкиДанных")) {
			for (Statement statement : method.allStatements()) {
				if (statement instanceof IfStatement) {
					IfStatement ifStatement = (IfStatement) statement;
					EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
					EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

					for (Statement partStatement : ifPartStatements) {
						if (partStatement instanceof SimpleStatement) {
							SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
							Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
							StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
									.getMethodAccess();

							CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();

							dataRule.setName(partMethodAccess.getName().substring(12));
							dataRule.setForSending(true);
							dataRule.setForReceiving(false);

							dataRules.add(dataRule);
						}

					}

					EList<Statement> elseIfPartStatements = elseIfPartConditionals.get(0).getStatements();
					for (Statement partStatement : elseIfPartStatements) {
						if (partStatement instanceof SimpleStatement) {
							SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
							Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
							StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
									.getMethodAccess();

							CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();

							dataRule.setName(partMethodAccess.getName().substring(12));
							dataRule.setForSending(false);
							dataRule.setForReceiving(true);

							dataRules.add(dataRule);
						}

					}
				}
			}

		} else if (methodName.startsWith("ДобавитьПОД_")) {
			CmDataRule dataRule = null;

			for (Statement statement : method.allStatements()) {

				Expression leftExpression = ((SimpleStatement) statement).getLeft();

				if (leftExpression instanceof StaticFeatureAccess) {
					StaticFeatureAccess leftFeatureAccess = (StaticFeatureAccess) leftExpression;

					if (leftFeatureAccess.getName().equals("ПравилоОбработки"))
						continue;

					else {
						throw new NullPointerException(
								"Добавить ПОД: неизвестный StaticFeatureAccess: " + leftFeatureAccess.getName());
					}

				} else if (leftExpression instanceof DynamicFeatureAccess) {
					DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;

					Expression rightExpression = ((SimpleStatement) statement).getRight();

					if (leftFeatureAccess.getName().equals("Имя")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String ruleName = stringLiteral.getLines().get(0).replace("\"", "");

						dataRule = conversionModule.getDataRule(ruleName);

					} else if (leftFeatureAccess.getName().equals("ОбъектВыборкиМетаданные")) {
						if (rightExpression instanceof UndefinedLiteral) {
							dataRule.setSelectionVariant(CmSelectionVariant.CUSTOM);

							continue;
						}

						DynamicFeatureAccess rightFeatureAccess1 = (DynamicFeatureAccess) rightExpression;
						DynamicFeatureAccess rightFeatureAccess2 = (DynamicFeatureAccess) rightFeatureAccess1
								.getSource();
						StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2.getSource();
						String configurationObjectName = rightFeatureAccess3.getName() + "."
								+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

						dataRule.setConfigurationObjectName(configurationObjectName);

						MdObject configurationObject = ConversionUtils.getConfigurationObject(
								dataRule.getConfigurationObjectFormattedName(), bmEmfIndexProvider);

						dataRule.setSelectionVariant(CmSelectionVariant.STANDART);
						dataRule.setConfigurationObject(configurationObject);
						fillSubsystemsforObject(conversionModule, configurationObject, dataRule.getSubsystems(),
								mainCommandInterface, cmMainSubsystem);

					} else if (leftFeatureAccess.getName().equals("ОбъектВыборкиФормат")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						dataRule.setFormatObject(eventName);

					} else if (leftFeatureAccess.getName().equals("ОчисткаДанных")) {
						BooleanLiteral booleanLiteral = (BooleanLiteral) rightExpression;

						dataRule.setIsDataCleaning(booleanLiteral.isIsTrue());

					} else if (leftFeatureAccess.getName().equals("ПриОбработке")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						dataRule.setOnProcessingEvent(getMethodText(node.getText().trim()));

					} else if (leftFeatureAccess.getName().equals("ВыборкаДанных")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						dataRule.setDataSelectionEvent(getMethodText(node.getText().trim()));

					} else {
						throw new NullPointerException(
								"Добавить ПОД: неизвестное имя свойства: " + leftFeatureAccess.getName());

					}

				} else if (leftExpression instanceof Invocation) {
					Invocation leftInvocation = (Invocation) leftExpression;

					String ruleName = ((StringLiteral) leftInvocation.getParams().get(0)).getLines().get(0)
							.replace("\"", "");

					CmObjectRule objectRule = conversionModule.getObjectRule(ruleName);
					if (objectRule == null) {
						objectRule = cmFactory.eINSTANCE.createCmObjectRule();

						objectRule.setName(ruleName);

						objectRules.add(objectRule);
					}

					EList<CmObjectRule> dataObjectRules = dataRule.getObjectRules();
					dataObjectRules.add(objectRule);

				} else {
					throw new NullPointerException(
							"Добавить ПОД: необработанный Expression: " + leftExpression.getClass());

				}
			}

		} else if (methodName.equals("ЗаполнитьПравилаКонвертацииОбъектов")) {
			for (Statement statement : method.allStatements()) {
				if (statement instanceof IfStatement) {
					IfStatement ifStatement = (IfStatement) statement;
					EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
					EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

					for (Statement partStatement : ifPartStatements) {
						if (partStatement instanceof SimpleStatement) {
							SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
							Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
							StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
									.getMethodAccess();

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
							StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partInvocation
									.getMethodAccess();

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

		} else if (methodName.startsWith("ДобавитьПКО_")) {
			CmObjectRule objectRule = null;

			String configurationTabularSection = "";
			String formatTabularSection = "";

			for (Statement statement : method.allStatements()) {
				Expression leftExpression = ((SimpleStatement) statement).getLeft();

				if (leftExpression instanceof StaticFeatureAccess) {
					StaticFeatureAccess leftFeatureAccess = (StaticFeatureAccess) leftExpression;

					if (leftFeatureAccess.getName().equals("ПравилоКонвертации"))
						continue;

					else if (leftFeatureAccess.getName().equals("СвойстваШапки")) {
						configurationTabularSection = "";
						formatTabularSection = "";

					} else if (leftFeatureAccess.getName().equals("СвойстваТЧ")) {
						Invocation rightInvocation = (Invocation) ((SimpleStatement) statement).getRight();

						EList<Expression> params = rightInvocation.getParams();

						configurationTabularSection = ((StringLiteral) params.get(1)).getLines().get(0).replace("\"",
								"");
						formatTabularSection = ((StringLiteral) params.get(2)).getLines().get(0).replace("\"", "");

					} else {
						throw new NullPointerException(
								"Добавить ПКО: неизвестный StaticFeatureAccess: " + leftFeatureAccess.getName());
					}

				} else if (leftExpression instanceof DynamicFeatureAccess) {
					DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;

					Expression rightExpression = ((SimpleStatement) statement).getRight();
					if (rightExpression instanceof UndefinedLiteral)
						continue;

					if (leftFeatureAccess.getName().equals("ИмяПКО")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String ruleName = stringLiteral.getLines().get(0).replace("\"", "");

						objectRule = conversionModule.getObjectRule(ruleName);

					} else if (leftFeatureAccess.getName().equals("ОбъектДанных")) {
						DynamicFeatureAccess rightFeatureAccess1 = (DynamicFeatureAccess) rightExpression;
						DynamicFeatureAccess rightFeatureAccess2 = (DynamicFeatureAccess) rightFeatureAccess1
								.getSource();
						StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2.getSource();
						String configurationObjectName = rightFeatureAccess3.getName() + "."
								+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

						objectRule.setConfigurationObjectName(configurationObjectName);

						MdObject configurationObject = ConversionUtils.getConfigurationObject(
								objectRule.getConfigurationObjectFormattedName(), bmEmfIndexProvider);

						objectRule.setConfigurationObject(configurationObject);

						fillSubsystemsforObject(conversionModule, configurationObject, objectRule.getSubsystems(),
								mainCommandInterface, cmMainSubsystem);

					} else if (leftFeatureAccess.getName().equals("ОбъектФормата")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String formatObject = stringLiteral.getLines().get(0).replace("\"", "");

						objectRule.setFormatObject(formatObject);

					} else if (leftFeatureAccess.getName().equals("ПравилоДляГруппыСправочника")) {
						BooleanLiteral booleanLiteral = (BooleanLiteral) rightExpression;

						objectRule.setForGroup(booleanLiteral.isIsTrue());

					} else if (leftFeatureAccess.getName().equals("ВариантИдентификации")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String identificationVariant = stringLiteral.getLines().get(0).replace("\"", "");

						objectRule.setIdentificationVariant(CmIdentificationVariant.UUID);
						if (identificationVariant.equals("ПоПолямПоиска"))
							objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);
						else if (identificationVariant.equals("СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска"))
							objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);

					} else if (leftFeatureAccess.getName().equals("ПриОтправкеДанных")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						objectRule.setOnSendingEvent(getMethodText(node.getText().trim()));

					} else if (leftFeatureAccess.getName().equals("ПриКонвертацииДанныхXDTO")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						objectRule.setBeforeReceivingEvent(getMethodText(node.getText().trim()));

					} else if (leftFeatureAccess.getName().equals("ПередЗаписьюПолученныхДанных")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						objectRule.setOnReceivingEvent(getMethodText(node.getText().trim()));

					} else if (leftFeatureAccess.getName().equals("ПослеЗагрузкиВсехДанных")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String algorithmName = stringLiteral.getLines().get(0).replace("\"", "");

						CmAlgorithm algorithm = conversionModule.getAlgorithm(algorithmName);
						if (algorithm == null) {
							algorithm = cmFactory.eINSTANCE.createCmAlgorithm();

							algorithm.setName(algorithmName);

							algorithms.add(algorithm);
						}

						objectRule.setAfterReceivingAlgorithm(algorithm);

					} else {
						throw new NullPointerException(
								"Добавить ПКО: неизвестное имя свойства: " + leftFeatureAccess.getName());

					}

				} else if (leftExpression instanceof Invocation) {
					Invocation leftInvocation = (Invocation) leftExpression;

					EList<Expression> params = leftInvocation.getParams();

					FeatureAccess leftMethodAccess = leftInvocation.getMethodAccess();
					if (leftMethodAccess instanceof StaticFeatureAccess) {
						String configurationAttribute = "";
						String formatAttribute = "";
						boolean isCustomRule = false;
						CmObjectRule attributeObjectRule = null;

						if (params.size() >= 2 && params.get(1) instanceof StringLiteral)
							configurationAttribute = ((StringLiteral) params.get(1)).getLines().get(0).replace("\"",
									"");

						if (params.size() >= 3 && params.get(2) instanceof StringLiteral)
							formatAttribute = ((StringLiteral) params.get(2)).getLines().get(0).replace("\"", "");

						if (params.size() >= 4 && params.get(3) instanceof NumberLiteral)
							isCustomRule = ((NumberLiteral) params.get(3)).getValue().get(0).equals("0") ? false : true;

						if (params.size() >= 5 && params.get(4) instanceof StringLiteral) {
							String attributeRuleName = ((StringLiteral) params.get(4)).getLines().get(0).replace("\"",
									"");
							attributeObjectRule = conversionModule.getObjectRule(attributeRuleName);

							if (attributeObjectRule == null) {
								attributeObjectRule = cmFactory.eINSTANCE.createCmObjectRule();

								attributeObjectRule.setName(attributeRuleName);

								objectRules.add(attributeObjectRule);
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
						if (formatAttribute.length() == 0)
							attributeRule.setFormatTabularSection("");

						attributeRule.setIsCustomRule(isCustomRule);
						attributeRule.setObjectRule(attributeObjectRule);

						attributeRules.add(attributeRule);

					} else if (leftMethodAccess instanceof DynamicFeatureAccess) {
						DynamicFeatureAccess leftSource = (DynamicFeatureAccess) ((DynamicFeatureAccess) leftMethodAccess)
								.getSource();

						if (leftSource.getName().equals("ПоляПоиска")) {
							EList<String> identificationFields = objectRule.getIdentificationFields();
							identificationFields
									.add(((StringLiteral) params.get(0)).getLines().get(0).replace("\"", ""));

						} else
							throw new NullPointerException(
									"Добавить ПКО: необработанный Source: " + leftSource.getName());

					}

				} else {
					throw new NullPointerException(
							"Добавить ПКО: необработанный Expression: " + leftExpression.getClass());

				}
			}

		} else if (methodName.equals("ЗаполнитьПравилаКонвертацииПредопределенныхДанных")) {
			CmPredefined predefined = null;

			for (Statement statement : method.allStatements()) {
				Expression leftExpression = ((SimpleStatement) statement).getLeft();

				if (leftExpression instanceof StaticFeatureAccess) {
					continue;

				} else if (leftExpression instanceof Invocation) {
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

					DynamicFeatureAccess configurationValueParam2 = (DynamicFeatureAccess) configurationValueParam
							.getSource();
					StaticFeatureAccess configurationValueParam3 = (StaticFeatureAccess) configurationValueParam2
							.getSource();
					String configurationValueName = configurationValueParam3.getName() + "."
							+ configurationValueParam2.getName() + "." + configurationValueParam.getName();

					String formatValueName = formatValueParam.getLines().get(0).replace("\"", "");

					if (predefined.predefinedMapExists(configurationValueName, formatValueName))
						continue;

					CmPredefinedMap predefinedMap = cmFactory.eINSTANCE.createCmPredefinedMap();

					predefinedMap.setConfigurationValue(configurationValueName);
					predefinedMap.setFormatValue(formatValueName);

					predefined.getPredefinedMaps().add(predefinedMap);

				} else if (leftExpression instanceof DynamicFeatureAccess) {
					DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;
					Expression rightExpression = ((SimpleStatement) statement).getRight();

					if (leftFeatureAccess.getName().equals("ИмяПКПД")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String predefinedName = stringLiteral.getLines().get(0).replace("\"", "");

						predefined = cmFactory.eINSTANCE.createCmPredefined();

						predefined.setName(predefinedName);

						predefined.setForSending(false);
						predefined.setForReceiving(false);

						predefineds.add(predefined);

					} else if (leftFeatureAccess.getName().equals("ТипДанных")) {
						DynamicFeatureAccess rightFeatureAccess1 = (DynamicFeatureAccess) rightExpression;
						DynamicFeatureAccess rightFeatureAccess2 = (DynamicFeatureAccess) rightFeatureAccess1
								.getSource();
						StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2.getSource();
						String configurationObjectName = rightFeatureAccess3.getName() + "."
								+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

						predefined.setConfigurationObjectName(configurationObjectName);

						predefined.setConfigurationObject(ConversionUtils.getConfigurationObject(
								predefined.getConfigurationObjectFormattedName(), bmEmfIndexProvider));

					} else if (leftFeatureAccess.getName().equals("ТипXDTO")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String formatObject = stringLiteral.getLines().get(0).replace("\"", "");

						predefined.setFormatObject(formatObject);

					} else if (leftFeatureAccess.getName().equals("КонвертацииЗначенийПриОтправке")) {
						predefined.setForSending(true);

					} else if (leftFeatureAccess.getName().equals("КонвертацииЗначенийПриПолучении")) {
						predefined.setForReceiving(true);

					} else {
						throw new NullPointerException(
								"Добавить ПКПД: необработанный DynamicFeatureAccess: " + leftFeatureAccess.getName());
					}

				} else {
					throw new NullPointerException(
							"Добавить ПКПД: необработанный Expression: " + leftExpression.getClass());
				}
			}

		} else {
			EObject region = method.eContainer().eContainer();
			if (!(region instanceof RegionPreprocessorDeclareStatement))
				return;
			String regionName = ((RegionPreprocessorDeclareStatement) method.eContainer().eContainer()).getName();
			if (!regionName.equals("Алгоритмы"))
				return;

			CmAlgorithm algorithm = conversionModule.getAlgorithm(methodName);
			if (algorithm == null) {
				algorithm = cmFactory.eINSTANCE.createCmAlgorithm();

				algorithm.setName(methodName);

				algorithms.add(algorithm);
			}
			ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

			String params = "";

			for (FormalParam param : method.getFormalParams()) {
				if (params.length() != 0)
					params += ", ";
				params += param.getName();

				Literal defaultValue = param.getDefaultValue();
				if (defaultValue == null)
					continue;

				if (defaultValue instanceof BooleanLiteral) {
					params += " = " + (((BooleanLiteral) defaultValue).isIsTrue() ? "Истина" : "Ложь");

				} else if (defaultValue instanceof StringLiteral) {
					params += " = " + ((StringLiteral) defaultValue).getLines().get(0);

				} else if (defaultValue instanceof UndefinedLiteral) {
					params += " = " + "Неопределено";

				} else {
					throw new NullPointerException("Добавить Алгоритм: " + methodName + System.lineSeparator()
							+ "Необработанный тип значения переменной по умолчанию: " + defaultValue.getClass());

				}
			}

			algorithm.setMethodType(method instanceof Function ? CmMethodType.FUNCTION : CmMethodType.PROCEDURE);
			algorithm.setParams(params);
			algorithm.setIsExport(method.isExport());
			algorithm.setBody(getMethodText(node.getText().trim()));

		}

	}

	private static void analyzeV1(ConversionModule conversionModule, Method method, Module module,
			IBmEmfIndexProvider bmEmfIndexProvider, CommandInterface mainCommandInterface,
			CmSubsystem cmMainSubsystem) {
		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		EList<CmPredefined> predefineds = conversionModule.getPredefineds();
		EList<CmAlgorithm> algorithms = conversionModule.getAlgorithms();

		String methodName = method.getName();

		if (methodName.equals("ЗаполнитьПравилаОбработкиДанных")) {
			for (Statement statement : method.allStatements()) {
				if (statement instanceof IfStatement) {
					IfStatement ifStatement = (IfStatement) statement;
					EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
					EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

					for (Statement partStatement : ifPartStatements) {
						if (partStatement instanceof SimpleStatement) {
							SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
							Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
							StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
									.getMethodAccess();

							CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();

							dataRule.setName(partMethodAccess.getName().substring(12));
							dataRule.setForSending(true);
							dataRule.setForReceiving(false);

							dataRules.add(dataRule);
						}

					}

					EList<Statement> elseIfPartStatements = elseIfPartConditionals.get(0).getStatements();
					for (Statement partStatement : elseIfPartStatements) {
						if (partStatement instanceof SimpleStatement) {
							SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
							Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
							StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
									.getMethodAccess();

							CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();

							dataRule.setName(partMethodAccess.getName().substring(12));
							dataRule.setForSending(false);
							dataRule.setForReceiving(true);

							dataRules.add(dataRule);
						}

					}
				}
			}

		} else if (methodName.startsWith("ДобавитьПОД_")) {
			CmDataRule dataRule = null;

			for (Statement statement : method.allStatements()) {
				Expression leftExpression = ((SimpleStatement) statement).getLeft();

				if (leftExpression instanceof StaticFeatureAccess) {
					StaticFeatureAccess leftFeatureAccess = (StaticFeatureAccess) leftExpression;

					if (leftFeatureAccess.getName().equals("ПравилоОбработки"))
						continue;

					else {
						throw new NullPointerException(
								"Добавить ПОД: неизвестный StaticFeatureAccess: " + leftFeatureAccess.getName());
					}

				} else if (leftExpression instanceof DynamicFeatureAccess) {
					DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;

					Expression rightExpression = ((SimpleStatement) statement).getRight();

					if (leftFeatureAccess.getName().equals("Имя")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String ruleName = stringLiteral.getLines().get(0).replace("\"", "");

						dataRule = conversionModule.getDataRule(ruleName);

					} else if (leftFeatureAccess.getName().equals("ОбъектВыборкиМетаданные")) {
						if (rightExpression instanceof UndefinedLiteral)
							continue;

						DynamicFeatureAccess rightFeatureAccess1 = (DynamicFeatureAccess) rightExpression;
						DynamicFeatureAccess rightFeatureAccess2 = (DynamicFeatureAccess) rightFeatureAccess1
								.getSource();
						StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2.getSource();
						String configurationObjectName = rightFeatureAccess3.getName() + "."
								+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

						dataRule.setConfigurationObjectName(configurationObjectName);

						dataRule.setConfigurationObject(ConversionUtils.getConfigurationObject(
								dataRule.getConfigurationObjectFormattedName(), bmEmfIndexProvider));

					} else if (leftFeatureAccess.getName().equals("ОбъектВыборкиФормат")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						dataRule.setFormatObject(eventName);

					} else if (leftFeatureAccess.getName().equals("ОчисткаДанных")) {
						BooleanLiteral booleanLiteral = (BooleanLiteral) rightExpression;

						dataRule.setIsDataCleaning(booleanLiteral.isIsTrue());

					} else if (leftFeatureAccess.getName().equals("ПриОбработке")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						dataRule.setOnProcessingEvent(getMethodText(node.getText().trim()));

					} else if (leftFeatureAccess.getName().equals("ВыборкаДанных")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						dataRule.setDataSelectionEvent(getMethodText(node.getText().trim()));

					} else {
						throw new NullPointerException(
								"Добавить ПОД: неизвестное имя свойства: " + leftFeatureAccess.getName());

					}

				} else if (leftExpression instanceof Invocation) {
					Invocation leftInvocation = (Invocation) leftExpression;

					String ruleName = ((StringLiteral) leftInvocation.getParams().get(0)).getLines().get(0)
							.replace("\"", "");

					CmObjectRule objectRule = conversionModule.getObjectRule(ruleName);
					if (objectRule == null) {
						objectRule = cmFactory.eINSTANCE.createCmObjectRule();

						objectRule.setName(ruleName);

						objectRules.add(objectRule);
					}

					EList<CmObjectRule> dataObjectRules = dataRule.getObjectRules();
					dataObjectRules.add(objectRule);

				} else {
					throw new NullPointerException(
							"Добавить ПОД: необработанный Expression: " + leftExpression.getClass());

				}
			}

		} else if (methodName.equals("ЗаполнитьПравилаКонвертацииОбъектов")) {
			for (Statement statement : method.allStatements()) {
				if (statement instanceof IfStatement) {
					IfStatement ifStatement = (IfStatement) statement;
					EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
					EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

					for (Statement partStatement : ifPartStatements) {
						if (partStatement instanceof SimpleStatement) {
							SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
							Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
							StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
									.getMethodAccess();

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
							StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partInvocation
									.getMethodAccess();

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

		} else if (methodName.startsWith("ДобавитьПКО_")) {
			CmObjectRule objectRule = null;

			String configurationTabularSection = "";
			String formatTabularSectionName = "";

			for (Statement statement : method.allStatements()) {
				Expression leftExpression = ((SimpleStatement) statement).getLeft();

				if (leftExpression instanceof StaticFeatureAccess) {
					StaticFeatureAccess leftFeatureAccess = (StaticFeatureAccess) leftExpression;

					if (leftFeatureAccess.getName().equals("НоваяСтрока")) {
						Invocation rightInvocation = (Invocation) ((SimpleStatement) statement).getRight();
						DynamicFeatureAccess rightFeatureAccess = (DynamicFeatureAccess) rightInvocation
								.getMethodAccess();

						DynamicFeatureAccess source = (DynamicFeatureAccess) rightFeatureAccess.getSource();
						if (source.getName().equals("Свойства")) {
							configurationTabularSection = "";
							formatTabularSectionName = "";
						}

					} else {
						throw new NullPointerException(
								"Добавить ПКО: неизвестный StaticFeatureAccess: " + leftFeatureAccess.getName());
					}

				} else if (leftExpression instanceof DynamicFeatureAccess) {
					DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;

					Expression rightExpression = ((SimpleStatement) statement).getRight();
					if (rightExpression instanceof UndefinedLiteral)
						continue;

					if (leftFeatureAccess.getName().equals("ИмяПКО")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String ruleName = stringLiteral.getLines().get(0).replace("\"", "");

						objectRule = conversionModule.getObjectRule(ruleName);

					} else if (leftFeatureAccess.getName().equals("ОбъектДанных")) {
						DynamicFeatureAccess rightFeatureAccess1 = (DynamicFeatureAccess) rightExpression;
						DynamicFeatureAccess rightFeatureAccess2 = (DynamicFeatureAccess) rightFeatureAccess1
								.getSource();
						StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2.getSource();
						String configurationObjectName = rightFeatureAccess3.getName() + "."
								+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

						objectRule.setConfigurationObjectName(configurationObjectName);

						objectRule.setConfigurationObject(ConversionUtils.getConfigurationObject(
								objectRule.getConfigurationObjectFormattedName(), bmEmfIndexProvider));

					} else if (leftFeatureAccess.getName().equals("ОбъектФормата")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String formatObject = stringLiteral.getLines().get(0).replace("\"", "");

						objectRule.setFormatObject(formatObject);

					} else if (leftFeatureAccess.getName().equals("ПравилоДляГруппыСправочника")) {
						BooleanLiteral booleanLiteral = (BooleanLiteral) rightExpression;

						objectRule.setForGroup(booleanLiteral.isIsTrue());

					} else if (leftFeatureAccess.getName().equals("ВариантИдентификации")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String identificationVariant = stringLiteral.getLines().get(0).replace("\"", "");

						objectRule.setIdentificationVariant(CmIdentificationVariant.UUID);
						if (identificationVariant.equals("ПоПолямПоиска"))
							objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);
						else if (identificationVariant.equals("СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска"))
							objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);

					} else if (leftFeatureAccess.getName().equals("ПриОтправкеДанных")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						objectRule.setOnSendingEvent(getMethodText(node.getText().trim()));

					} else if (leftFeatureAccess.getName().equals("ПриКонвертацииДанныхXDTO")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						objectRule.setBeforeReceivingEvent(getMethodText(node.getText().trim()));

					} else if (leftFeatureAccess.getName().equals("ПередЗаписьюПолученныхДанных")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String eventName = stringLiteral.getLines().get(0).replace("\"", "");

						Method eventMethod = getMethod(module, eventName);
						ICompositeNode node = NodeModelUtils.findActualNodeFor(eventMethod);

						objectRule.setOnReceivingEvent(getMethodText(node.getText().trim()));

					} else if (leftFeatureAccess.getName().equals("ПослеЗагрузкиВсехДанных")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String algorithmName = stringLiteral.getLines().get(0).replace("\"", "");

						CmAlgorithm algorithm = conversionModule.getAlgorithm(algorithmName);
						if (algorithm == null) {
							algorithm = cmFactory.eINSTANCE.createCmAlgorithm();

							algorithm.setName(algorithmName);

							algorithms.add(algorithm);
						}

						objectRule.setAfterReceivingAlgorithm(algorithm);

					} else {
						throw new NullPointerException(
								"Добавить ПКО: неизвестное имя свойства: " + leftFeatureAccess.getName());

					}

				} else if (leftExpression instanceof Invocation) {
					Invocation leftInvocation = (Invocation) leftExpression;

					EList<Expression> params = leftInvocation.getParams();

					FeatureAccess leftMethodAccess = leftInvocation.getMethodAccess();
					if (leftMethodAccess instanceof StaticFeatureAccess) {
						String configurationAttribute = "";
						String formatAttribute = "";
						boolean isCustomRule = false;
						CmObjectRule attributeObjectRule = null;

						if (params.size() >= 2 && params.get(1) instanceof StringLiteral)
							configurationAttribute = ((StringLiteral) params.get(1)).getLines().get(0).replace("\"",
									"");

						if (params.size() >= 3 && params.get(2) instanceof StringLiteral)
							formatAttribute = ((StringLiteral) params.get(2)).getLines().get(0).replace("\"", "");

						if (params.size() >= 4 && params.get(3) instanceof NumberLiteral)
							isCustomRule = ((NumberLiteral) params.get(3)).getValue().get(0).equals("0") ? false : true;

						if (params.size() >= 5 && params.get(4) instanceof StringLiteral) {
							String attributeRuleName = ((StringLiteral) params.get(4)).getLines().get(0).replace("\"",
									"");
							attributeObjectRule = conversionModule.getObjectRule(attributeRuleName);

							if (attributeObjectRule == null) {
								attributeObjectRule = cmFactory.eINSTANCE.createCmObjectRule();

								attributeObjectRule.setName(attributeRuleName);

								objectRules.add(attributeObjectRule);
							}
						}

						EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();

						CmAttributeRule attributeRule = cmFactory.eINSTANCE.createCmAttributeRule();

						attributeRule.setConfigurationTabularSection(configurationTabularSection);
						attributeRule.setConfigurationAttribute(configurationAttribute);
						if (configurationAttribute.length() == 0)
							attributeRule.setConfigurationTabularSection("");

						attributeRule.setFormatTabularSection(formatTabularSectionName);
						attributeRule.setFormatAttribute(formatAttribute);
						if (formatAttribute.length() == 0)
							attributeRule.setFormatTabularSection("");

						attributeRule.setIsCustomRule(isCustomRule);
						attributeRule.setObjectRule(attributeObjectRule);

						attributeRules.add(attributeRule);

					} else if (leftMethodAccess instanceof DynamicFeatureAccess) {
						DynamicFeatureAccess leftSource = (DynamicFeatureAccess) ((DynamicFeatureAccess) leftMethodAccess)
								.getSource();

						if (leftSource.getName().equals("ПоляПоиска")) {
							EList<String> identificationFields = objectRule.getIdentificationFields();
							identificationFields
									.add(((StringLiteral) params.get(0)).getLines().get(0).replace("\"", ""));

						} else
							throw new NullPointerException(
									"Добавить ПКО: необработанный Source: " + leftSource.getName());

					}

				} else {
					throw new NullPointerException(
							"Добавить ПКО: необработанный Expression: " + leftExpression.getClass());

				}
			}

		} else if (methodName.equals("ЗаполнитьПравилаКонвертацииПредопределенныхДанных")) {
			CmPredefined predefined = null;

			for (Statement statement : method.allStatements()) {
				Expression leftExpression = ((SimpleStatement) statement).getLeft();

				if (leftExpression instanceof StaticFeatureAccess) {
					continue;

				} else if (leftExpression instanceof Invocation) {
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

					DynamicFeatureAccess configurationValueParam2 = (DynamicFeatureAccess) configurationValueParam
							.getSource();
					StaticFeatureAccess configurationValueParam3 = (StaticFeatureAccess) configurationValueParam2
							.getSource();
					String configurationValueName = configurationValueParam3.getName() + "."
							+ configurationValueParam2.getName() + "." + configurationValueParam.getName();

					String formatValueName = formatValueParam.getLines().get(0).replace("\"", "");

					if (predefined.predefinedMapExists(configurationValueName, formatValueName))
						continue;

					CmPredefinedMap predefinedMap = cmFactory.eINSTANCE.createCmPredefinedMap();

					predefinedMap.setConfigurationValue(configurationValueName);
					predefinedMap.setFormatValue(formatValueName);

					predefined.getPredefinedMaps().add(predefinedMap);

				} else if (leftExpression instanceof DynamicFeatureAccess) {
					DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;
					Expression rightExpression = ((SimpleStatement) statement).getRight();

					if (leftFeatureAccess.getName().equals("ИмяПКПД")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String predefinedName = stringLiteral.getLines().get(0).replace("\"", "");

						predefined = cmFactory.eINSTANCE.createCmPredefined();

						predefined.setName(predefinedName);

						predefineds.add(predefined);

					} else if (leftFeatureAccess.getName().equals("ТипДанных")) {
						DynamicFeatureAccess rightFeatureAccess1 = (DynamicFeatureAccess) rightExpression;
						DynamicFeatureAccess rightFeatureAccess2 = (DynamicFeatureAccess) rightFeatureAccess1
								.getSource();
						StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2.getSource();
						String configurationObjectName = rightFeatureAccess3.getName() + "."
								+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

						predefined.setConfigurationObjectName(configurationObjectName);

						predefined.setConfigurationObject(ConversionUtils.getConfigurationObject(
								predefined.getConfigurationObjectFormattedName(), bmEmfIndexProvider));

					} else if (leftFeatureAccess.getName().equals("ТипXDTO")) {
						StringLiteral stringLiteral = (StringLiteral) rightExpression;
						String formatObject = stringLiteral.getLines().get(0).replace("\"", "");

						predefined.setFormatObject(formatObject);

					} else if (leftFeatureAccess.getName().equals("КонвертацииЗначенийПриОтправке")) {
						predefined.setForSending(true);

					} else if (leftFeatureAccess.getName().equals("КонвертацииЗначенийПриПолучении")) {
						predefined.setForReceiving(true);

					} else {
						throw new NullPointerException(
								"Добавить ПКПД: необработанный DynamicFeatureAccess: " + leftFeatureAccess.getName());
					}

				} else {
					throw new NullPointerException(
							"Добавить ПКПД: необработанный Expression: " + leftExpression.getClass());
				}
			}

		} else {
			EObject region = method.eContainer().eContainer();
			if (!(region instanceof RegionPreprocessorDeclareStatement))
				return;
			String regionName = ((RegionPreprocessorDeclareStatement) method.eContainer().eContainer()).getName();
			if (!regionName.equals("Алгоритмы"))
				return;

			CmAlgorithm algorithm = conversionModule.getAlgorithm(methodName);
			if (algorithm == null) {
				algorithm = cmFactory.eINSTANCE.createCmAlgorithm();

				algorithm.setName(methodName);

				algorithms.add(algorithm);
			}
			ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

			String params = "";

			for (FormalParam param : method.getFormalParams()) {
				if (params.length() != 0)
					params += ", ";
				params += param.getName();
			}

			algorithm.setMethodType(method instanceof Function ? CmMethodType.FUNCTION : CmMethodType.PROCEDURE);
			algorithm.setParams(params);
			algorithm.setIsExport(method.isExport());
			algorithm.setBody(getMethodText(node.getText().trim()));

		}
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

	private static void fillSubsystemsforObject(ConversionModule conversionModule, Object object,
			EList<CmSubsystem> objectSubsystems, CommandInterface mainCommandInterface, CmSubsystem cmMainSubsystem) {

		for (CommandsPlacementFragment placementFragment : mainCommandInterface.getCommandsPlacement()
				.getPlacementFragments()) {
			for (Command placementCommand : placementFragment.getCommands()) {
				if (object instanceof Catalog && placementCommand instanceof CatalogCommand) {
					CatalogCommand placementCatalogCommand = (CatalogCommand) placementCommand;
					Catalog masterObject = org.eclipse.xtext.EcoreUtil2.getContainerOfType(placementCatalogCommand,
							Catalog.class);
					if (masterObject.equals((Catalog) object)) {
						objectSubsystems.add(cmMainSubsystem);
						return;
					}

				} else if (object instanceof Document && placementCommand instanceof DocumentCommand) {
					DocumentCommand placementDocumentCommand = (DocumentCommand) placementCommand;
					Document masterObject = org.eclipse.xtext.EcoreUtil2.getContainerOfType(placementDocumentCommand,
							Document.class);
					if (masterObject.equals((Document) object)) {
						objectSubsystems.add(cmMainSubsystem);
						return;
					}

				} else if (placementCommand instanceof StandardCommand) {
					StandardCommand placementStandardCommand = (StandardCommand) placementCommand;
					MdObject masterObject = org.eclipse.xtext.EcoreUtil2.getContainerOfType(placementStandardCommand,
							MdObject.class);
					if (masterObject.equals(object)) {
						objectSubsystems.add(cmMainSubsystem);
						return;
					}

				}
			}
		}

		if (object instanceof Catalog) {
			for (MdObject masterObject : ((Catalog) object).getOwners()) {
				fillSubsystemsforObject(conversionModule, masterObject, objectSubsystems, mainCommandInterface,
						cmMainSubsystem);
			}
		}

		EList<CmSubsystem> interfaceSubsystems = conversionModule.getSubsystems();

		for (CmSubsystem cmSubsystem : interfaceSubsystems) {
			Subsystem interfaceSubsystem = (Subsystem) cmSubsystem.getSubsystem();
			if (interfaceSubsystem == null)
				continue;

			if (interfaceSubsystem.getContent().indexOf(object) != -1) {
				objectSubsystems.add(cmSubsystem);
				return;

			} else {
				Boolean added = fillSubsystemsforObject(conversionModule, object, cmSubsystem, objectSubsystems,
						interfaceSubsystem.getSubsystems());

				if (added)
					return;

			}
		}

		if (object instanceof InformationRegister) {
			for (InformationRegisterDimension dimension : ((InformationRegister) object).getDimensions()) {
				if (!dimension.isMaster())
					continue;

				for (TypeItem type : dimension.getType().getTypes()) {
					if (type instanceof TypeSet) {
						for (Type subType : ((TypeSet) type).getTypes()) {
							MdObject masterObject = com._1c.g5.v8.dt.md.resource.MdTypeUtil.getTypeProducer(subType);
							fillSubsystemsforObject(conversionModule, masterObject, objectSubsystems,
									mainCommandInterface, cmMainSubsystem);
						}

					} else {
						MdObject masterObject = com._1c.g5.v8.dt.md.resource.MdTypeUtil.getTypeProducer(type);
						fillSubsystemsforObject(conversionModule, masterObject, objectSubsystems, mainCommandInterface,
								cmMainSubsystem);

					}
				}
			}
		}
	}

	private static Boolean fillSubsystemsforObject(ConversionModule conversionModule, Object object,
			CmSubsystem mainSubsystem, EList<CmSubsystem> objectSubsystems, EList<Subsystem> interfaceSubsystems) {
		for (Subsystem interfaceSubsystem : interfaceSubsystems) {
			if (interfaceSubsystem.getContent().indexOf(object) != -1) {
				objectSubsystems.add(mainSubsystem);
				return true;
			} else {
				Boolean added = fillSubsystemsforObject(conversionModule, object, mainSubsystem, objectSubsystems,
						interfaceSubsystem.getSubsystems());

				if (added)
					return true;

			}

		}

		return false;
	}

	public static String getModuleText(ConversionModule conversionModule, String name, LocalDateTime localDateTime) {
		if (conversionModule.getStoreVersion() == "2")
			return getModuleTextV2(conversionModule, name, localDateTime);
		else
			return getModuleTextV2(conversionModule, name, localDateTime);
	}

	private static String getModuleTextV2(ConversionModule conversionModule, String name, LocalDateTime localDateTime) {
		String ls = System.lineSeparator();

		final String TEMPLATE_NAME_MAIN = "ConversionModuleV2.txt";
		String templateMainContent = readContents(getFileInputSupplier(TEMPLATE_NAME_MAIN), TEMPLATE_NAME_MAIN);

		final String TEMPLATE_NAME_SENDINGDATARULE = "SendingDataRuleV2.txt";
		String templateSendingDataRuleContent = readContents(getFileInputSupplier(TEMPLATE_NAME_SENDINGDATARULE),
				TEMPLATE_NAME_SENDINGDATARULE);

		final String TEMPLATE_NAME_RECEIVINGDATARULE = "ReceivingDataRuleV2.txt";
		String templateReceivingDataRuleContent = readContents(getFileInputSupplier(TEMPLATE_NAME_RECEIVINGDATARULE),
				TEMPLATE_NAME_RECEIVINGDATARULE);

		final String TEMPLATE_NAME_SENDINGOBJECTRULE = "SendingObjectRuleV2.txt";
		String templateSendingObjectRuleContent = readContents(getFileInputSupplier(TEMPLATE_NAME_SENDINGOBJECTRULE),
				TEMPLATE_NAME_SENDINGOBJECTRULE);

		final String TEMPLATE_NAME_RECEIVINGOBJECTRULE = "ReceivingObjectRuleV2.txt";
		String templateReceivingObjectRuleContent = readContents(
				getFileInputSupplier(TEMPLATE_NAME_RECEIVINGOBJECTRULE), TEMPLATE_NAME_RECEIVINGOBJECTRULE);

		StringTemplate templateMain = new StringTemplate(templateMainContent);

		templateMain.setAttribute("ConvertationName", "// Конвертация " + name + " от "
				+ localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm:ss")) + "");

		templateMain.setAttribute("BeforeConvertationEvent", conversionModule.getBeforeConvertationEventText());
		templateMain.setAttribute("AfterConvertationEvent", conversionModule.getAfterConvertationEventText());
		templateMain.setAttribute("BeforeFillingEvent", conversionModule.getBeforeFillingEventText());

		templateMain.setAttribute("StoreVersion", conversionModule.getStoreVersion());

		String dataRulesDeclarationSendingText = "";
		String dataRulesDeclarationReceivingText = "";
		String sendingDataRules = "";
		String receivingDataRules = "";

		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		ECollections.sort(dataRules,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		for (CmDataRule dataRule : dataRules) {
			if (dataRule.getForSending()) {
				if (!dataRulesDeclarationSendingText.isEmpty())
					dataRulesDeclarationSendingText += ls;
				dataRulesDeclarationSendingText += "ДобавитьПОД_" + dataRule.getName() + "(ПравилаОбработкиДанных);";

				if (!sendingDataRules.isEmpty())
					sendingDataRules += ls;
				StringTemplate templateSendingDataRule = new StringTemplate(templateSendingDataRuleContent);

				templateSendingDataRule.setAttribute("DataRuleName", dataRule.getName());

				templateSendingDataRule.setAttribute("ConfigurationObject",
						dataRule.getConfigurationObjectName().isEmpty() ? "Неопределено"
								: dataRule.getConfigurationObjectName());
				templateSendingDataRule.setAttribute("OnProcessingEvent", dataRule.getOnProcessingEventDeclaration());
				templateSendingDataRule.setAttribute("DataSelectionEvent", dataRule.getDataSelectionEventDeclaration());
				templateSendingDataRule.setAttribute("IsDataCleaning", dataRule.getDataCleaningDeclaration());

				String objectRulesText = "";
				for (CmObjectRule objectRule : dataRule.getObjectRules()) {
					if (!objectRulesText.isEmpty())
						objectRulesText += ls;

					objectRulesText += "ПравилоОбработки.ИспользуемыеПКО.Добавить(\"" + objectRule.getName() + "\");";
				}
				templateSendingDataRule.setAttribute("ObjectRules", objectRulesText);

				String dataRuleEventsText = "";
				if (!dataRule.getOnProcessingEvent().isEmpty())
					dataRuleEventsText += ls + dataRule.getOnProcessingEventText();
				if (!dataRule.getDataSelectionEvent().isEmpty())
					dataRuleEventsText += ls + dataRule.getDataSelectionEventText();

				templateSendingDataRule.setAttribute("Events", dataRuleEventsText);

				String sendingDataRule = templateSendingDataRule.toString()
						.replace("	ПравилоОбработки.ПриОбработке            = \"\";", "---")
						.replace("	ПравилоОбработки.ВыборкаДанных           = \"\";", "---")
						.replaceAll("---\\r\\n|---\\r|---\\n", "");

				sendingDataRules += sendingDataRule;

			}

			if (dataRule.getForReceiving()) {
				if (!dataRulesDeclarationReceivingText.isEmpty())
					dataRulesDeclarationReceivingText += ls;
				dataRulesDeclarationReceivingText += "ДобавитьПОД_" + dataRule.getName() + "(ПравилаОбработкиДанных);";

				if (!receivingDataRules.isEmpty())
					receivingDataRules += ls;
				StringTemplate templateReceivingDataRule = new StringTemplate(templateReceivingDataRuleContent);

				templateReceivingDataRule.setAttribute("DataRuleName", dataRule.getName());

				templateReceivingDataRule.setAttribute("FormatObject", dataRule.getFormatObject());
				templateReceivingDataRule.setAttribute("OnProcessingEvent", dataRule.getOnProcessingEventDeclaration());

				String objectRulesText = "";
				for (CmObjectRule objectRule : dataRule.getObjectRules()) {
					if (!objectRulesText.isEmpty())
						objectRulesText += ls;

					objectRulesText += "ПравилоОбработки.ИспользуемыеПКО.Добавить(\"" + objectRule.getName() + "\");";
				}
				templateReceivingDataRule.setAttribute("ObjectRules", objectRulesText);

				String dataRuleEventsText = "";
				if (!dataRule.getOnProcessingEvent().isEmpty())
					dataRuleEventsText += ls + dataRule.getOnProcessingEventText();

				templateReceivingDataRule.setAttribute("Events", dataRuleEventsText);

				String receivingDataRule = templateReceivingDataRule.toString()
						.replace("	ПравилоОбработки.ПриОбработке            = \"\";", "---")
						.replaceAll("---\\r\\n|---\\r|---\\n", "");

				receivingDataRules += receivingDataRule;
			}
		}
		templateMain.setAttribute("DataRulesDeclarationSending", dataRulesDeclarationSendingText);
		templateMain.setAttribute("DataRulesDeclarationReceiving", dataRulesDeclarationReceivingText);
		templateMain.setAttribute("SendingDataRules", sendingDataRules);
		templateMain.setAttribute("ReceivingDataRules", receivingDataRules);

		String objectRulesDeclarationSendingText = "";
		String objectRulesDeclarationReceivingText = "";
		String objectRulesDeclarationBothText = "";
		String sendingObjectRules = "";
		String receivingObjectRules = "";
		String bothObjectRules = "";

		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		ECollections.sort(objectRules,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		for (CmObjectRule objectRule : objectRules) {
			if (objectRule.getForSending() && objectRule.getForReceiving()) {
				if (!objectRulesDeclarationBothText.isEmpty())
					objectRulesDeclarationBothText += ls;
				objectRulesDeclarationBothText += "ДобавитьПКО_" + objectRule.getName() + "(ПравилаКонвертации);";

			} else {
				if (objectRule.getForSending()) {
					if (!objectRulesDeclarationSendingText.isEmpty())
						objectRulesDeclarationSendingText += ls;
					objectRulesDeclarationSendingText += "ДобавитьПКО_" + objectRule.getName()
							+ "(ПравилаКонвертации);";

					if (!sendingObjectRules.isEmpty())
						sendingObjectRules += ls;
					StringTemplate templateSendingObjectRule = new StringTemplate(templateSendingObjectRuleContent);

					templateSendingObjectRule.setAttribute("ObjectRuleName", objectRule.getName());

					String sendingObjectRule = templateSendingObjectRule.toString()
							.replace("	ПравилоОбработки.ПриОбработке            = \"\";", "---")
							.replace("	ПравилоОбработки.ВыборкаДанных           = \"\";", "---")
							.replaceAll("---\\r\\n|---\\r|---\\n", "");

					sendingObjectRules += sendingObjectRule;

				}

				if (objectRule.getForReceiving()) {
					if (!objectRulesDeclarationReceivingText.isEmpty())
						objectRulesDeclarationReceivingText += ls;
					objectRulesDeclarationReceivingText += "ДобавитьПКО_" + objectRule.getName()
							+ "(ПравилаКонвертации);";

					if (!receivingObjectRules.isEmpty())
						receivingObjectRules += ls;
					StringTemplate templateReceivingObjectRule = new StringTemplate(templateReceivingObjectRuleContent);

					templateReceivingObjectRule.setAttribute("ObjectRuleName", objectRule.getName());

					String receivingObjectRule = templateReceivingObjectRule.toString()
							.replace("	ПравилоОбработки.ПриОбработке            = \"\";", "---")
							.replaceAll("---\\r\\n|---\\r|---\\n", "");

					receivingObjectRules += receivingObjectRule;
				}
			}
		}
		templateMain.setAttribute("ObjectRulesDeclarationSending", objectRulesDeclarationSendingText);
		templateMain.setAttribute("ObjectRulesDeclarationReceiving", objectRulesDeclarationReceivingText);
		templateMain.setAttribute("ObjectRulesDeclarationBoth", objectRulesDeclarationBothText);
		templateMain.setAttribute("SendingObjectRules", sendingObjectRules);
		templateMain.setAttribute("ReceivingObjectRules", receivingObjectRules);
		templateMain.setAttribute("BothObjectRules", bothObjectRules);

		templateMain.setAttribute("Algorithms", conversionModule.getAllAlgorithmsText(""));

		return templateMain.toString();

	}

	private static String readContents(CharSource source, String path) {
		try (Reader reader = source.openBufferedStream()) {
			return CharStreams.toString(reader);
		} catch (IOException | NullPointerException e) {
			return "";
		}
	}

	private static CharSource getFileInputSupplier(String partName) {
		return Resources.asCharSource(ConversionModuleAnalyzer.class.getResource("/resources/module/" + partName),
				StandardCharsets.UTF_8);
	}

	public static int COMPARATOR_ORDER_BY_NAME = 1;
	public static int COMPARATOR_ORDER_BY_SENDING = 2;
	public static int COMPARATOR_ORDER_BY_RECEIVING = 3;

	public static Comparator<CmDataRule> getDataRuleComparator(int comparatorOrder) {
		return new Comparator<CmDataRule>() {
			@Override
			public int compare(CmDataRule cmArg1, CmDataRule cmArg2) {
				String[] str1;
				String[] str2;

				if (comparatorOrder == COMPARATOR_ORDER_BY_SENDING) {
					str1 = new String[2];
					str2 = new String[2];

					str1[0] = cmArg1.getConfigurationObjectName().replaceAll("_", "");
					str1[1] = cmArg1.getName().replaceAll("_", "");

					str2[0] = cmArg2.getConfigurationObjectName().replaceAll("_", "");
					str2[1] = cmArg2.getName().replaceAll("_", "");

				} else if (comparatorOrder == COMPARATOR_ORDER_BY_RECEIVING) {
					str1 = new String[2];
					str2 = new String[2];

					str1[0] = cmArg1.getFormatObject().replaceAll("_", "");
					str1[1] = cmArg1.getName().replaceAll("_", "");

					str2[0] = cmArg2.getFormatObject().replaceAll("_", "");
					str2[1] = cmArg2.getName().replaceAll("_", "");

				} else { // COMPARATOR_ORDER_BY_NAME
					str1 = new String[1];
					str2 = new String[1];

					str1[0] = cmArg1.getName().replaceAll("_", "");

					str2[0] = cmArg2.getName().replaceAll("_", "");

				}

				return compareArraysOfString(str1, str2);
			}

		};
	}

	public static Comparator<CmObjectRule> getObjectRuleComparator(int comparatorOrder) {
		return new Comparator<CmObjectRule>() {
			@Override
			public int compare(CmObjectRule cmArg1, CmObjectRule cmArg2) {
				String[] str1;
				String[] str2;

				if (comparatorOrder == COMPARATOR_ORDER_BY_SENDING) {
					str1 = new String[3];
					str2 = new String[3];

					str1[0] = cmArg1.getConfigurationObjectName().replaceAll("_", "");
					str1[1] = cmArg1.getFormatObject().replaceAll("_", "");
					str1[2] = cmArg1.getName().replaceAll("_", "");

					str2[0] = cmArg2.getConfigurationObjectName().replaceAll("_", "");
					str1[1] = cmArg2.getFormatObject().replaceAll("_", "");
					str2[2] = cmArg2.getName().replaceAll("_", "");

				} else if (comparatorOrder == COMPARATOR_ORDER_BY_RECEIVING) {
					str1 = new String[3];
					str2 = new String[3];

					str1[0] = cmArg1.getFormatObject().replaceAll("_", "");
					str1[1] = cmArg1.getConfigurationObjectName().replaceAll("_", "");
					str1[2] = cmArg1.getName().replaceAll("_", "");

					str2[0] = cmArg2.getFormatObject().replaceAll("_", "");
					str2[1] = cmArg2.getConfigurationObjectName().replaceAll("_", "");
					str1[2] = cmArg2.getName().replaceAll("_", "");

				} else { // COMPARATOR_ORDER_BY_NAME
					str1 = new String[1];
					str2 = new String[1];

					str1[0] = cmArg1.getName().replaceAll("_", "");

					str2[0] = cmArg2.getName().replaceAll("_", "");

				}

				return compareArraysOfString(str1, str2);
			}
		};
	}

	public static Comparator<CmPredefined> getPredefinedComparator() {
		return new Comparator<CmPredefined>() {
			@Override
			public int compare(CmPredefined cmArg1, CmPredefined cmArg2) {
				String[] str1 = new String[1];
				String[] str2 = new String[1];

				str1[0] = cmArg1.getName().replaceAll("_", "");

				str2[0] = cmArg2.getName().replaceAll("_", "");

				return compareArraysOfString(str1, str2);
			}
		};
	}

	public static Comparator<CmAlgorithm> getAlgorithmComparator() {
		return new Comparator<CmAlgorithm>() {
			@Override
			public int compare(CmAlgorithm cmArg1, CmAlgorithm cmArg2) {
				String[] str1 = new String[1];
				String[] str2 = new String[1];

				str1[0] = cmArg1.getName().replaceAll("_", "");

				str2[0] = cmArg2.getName().replaceAll("_", "");

				return compareArraysOfString(str1, str2);
			}
		};
	}

	private static int compareArraysOfString(String[] str1, String[] str2) {
		if (str1.equals(str2))
			return 0;

		if (str1.length != str2.length)
			return str1.length - str2.length;

		for (int i = 0; i < str1.length; i++) {
			int result = str1[i].compareToIgnoreCase(str2[i]);
			if (result != 0)
				return result;
		}

		return 0;
	}
}
