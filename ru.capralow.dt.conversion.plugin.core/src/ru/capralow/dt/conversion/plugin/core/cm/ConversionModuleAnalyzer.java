package ru.capralow.dt.conversion.plugin.core.cm;

import java.util.Comparator;
import java.util.Iterator;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bsl.model.BooleanLiteral;
import com._1c.g5.v8.dt.bsl.model.Conditional;
import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.Expression;
import com._1c.g5.v8.dt.bsl.model.FeatureAccess;
import com._1c.g5.v8.dt.bsl.model.FormalParam;
import com._1c.g5.v8.dt.bsl.model.Function;
import com._1c.g5.v8.dt.bsl.model.IfStatement;
import com._1c.g5.v8.dt.bsl.model.Invocation;
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
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

import ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl;
import ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl;

public class ConversionModuleAnalyzer {

	private IV8ProjectManager projectManager;
	private IBmEmfIndexManager bmEmfIndexManager;

	private ConversionModule conversionModule;

	public ConversionModule getConversionModule() {
		return conversionModule;
	}

	public ConversionModuleAnalyzer(IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {
		this.projectManager = projectManager;
		this.bmEmfIndexManager = bmEmfIndexManager;

		this.conversionModule = new ConversionModuleImpl();
	}

	public void analyze(CommonModule commonModule) {
		Module module = commonModule.getModule();

		EList<Method> methods = module.allMethods();

		conversionModule.setModuleURI(EcoreUtil.getURI(module));

		conversionModule.setStoreVersion("1");

		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		EList<CmAlgorithm> algorithms = conversionModule.getAlgorithms();

		dataRules.clear();
		objectRules.clear();
		algorithms.clear();

		Iterator<Method> itr = methods.iterator();
		while (itr.hasNext()) {
			Method method = itr.next();
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
				Iterator<Statement> itrStatements = statements.iterator();
				if (itrStatements.hasNext()) {
					Statement statement = itrStatements.next();
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
					analyzeV1(commonModule);

				} else if (storeVersion.equals("2")) {
					analyzeV2(commonModule);

				} else {
					throw new NullPointerException("Неизвестная версия формата: " + storeVersion);

				}

			}

		}

		ECollections.sort(algorithms, new Comparator<CmAlgorithm>() {
			@Override
			public int compare(CmAlgorithm arg1, CmAlgorithm arg2) {
				String algorithm1 = arg1.getName().replaceAll("_", "");
				String algorithm2 = arg2.getName().replaceAll("_", "");

				if (algorithm1.equalsIgnoreCase(algorithm2))
					return 0;

				return algorithm1.compareToIgnoreCase(algorithm2);
			}

		});

	}

	public void analyzeV2(CommonModule commonModule) {
		Module module = commonModule.getModule();

		EList<Method> methods = module.allMethods();

		conversionModule.setModuleURI(EcoreUtil.getURI(module));

		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		EList<CmAlgorithm> algorithms = conversionModule.getAlgorithms();

		Iterator<Method> itr = methods.iterator();
		while (itr.hasNext()) {
			Method method = itr.next();
			String methodName = method.getName();

			if (methodName.equals("ЗаполнитьПравилаОбработкиДанных")) {
				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					Statement statement = itrStatements.next();

					if (statement instanceof IfStatement) {
						IfStatement ifStatement = (IfStatement) statement;
						EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
						EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

						Iterator<Statement> itrPartStatements = ifPartStatements.iterator();
						while (itrPartStatements.hasNext()) {
							Statement partStatement = itrPartStatements.next();
							if (partStatement instanceof SimpleStatement) {
								SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
								Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
								StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
										.getMethodAccess();

								CmDataRuleImpl dataRule = new CmDataRuleImpl();

								dataRule.setName(partMethodAccess.getName().substring(12));
								dataRule.setForSending(true);
								dataRule.setForReceiving(false);

								dataRules.add(dataRule);
							}

						}

						EList<Statement> elseIfPartStatements = elseIfPartConditionals.get(0).getStatements();
						Iterator<Statement> itrElseIfPartStatements = elseIfPartStatements.iterator();
						while (itrElseIfPartStatements.hasNext()) {
							Statement partStatement = (Statement) itrElseIfPartStatements.next();
							if (partStatement instanceof SimpleStatement) {
								SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
								Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
								StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
										.getMethodAccess();

								CmDataRuleImpl dataRule = new CmDataRuleImpl();

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

				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					SimpleStatement statement = (SimpleStatement) itrStatements.next();

					Expression leftExpression = statement.getLeft();

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

						Expression rightExpression = statement.getRight();

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
							StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2
									.getSource();
							String configurationObject = rightFeatureAccess3.getName() + "."
									+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

							dataRule.setConfigurationObject(configurationObject);

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
							objectRule = new CmObjectRuleImpl();

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
				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					Statement statement = itrStatements.next();

					if (statement instanceof IfStatement) {
						IfStatement ifStatement = (IfStatement) statement;
						EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
						EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

						Iterator<Statement> itrPartStatements = ifPartStatements.iterator();
						while (itrPartStatements.hasNext()) {
							Statement partStatement = itrPartStatements.next();
							if (partStatement instanceof SimpleStatement) {
								SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
								Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
								StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
										.getMethodAccess();

								String objectRuleName = partMethodAccess.getName().substring(12);

								CmObjectRule objectRule = conversionModule.getObjectRule(objectRuleName);
								if (objectRule == null) {
									objectRule = new CmObjectRuleImpl();

									objectRule.setName(objectRuleName);

									objectRules.add(objectRule);
								}

								objectRule.setForSending(true);
								objectRule.setForReceiving(false);
							}

						}

						EList<Statement> elseIfPartStatements = elseIfPartConditionals.get(0).getStatements();
						Iterator<Statement> itrElseIfPartStatements = elseIfPartStatements.iterator();
						while (itrElseIfPartStatements.hasNext()) {
							Statement partStatement = (Statement) itrElseIfPartStatements.next();
							if (partStatement instanceof SimpleStatement) {
								SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
								Invocation partInvocation = (Invocation) partSimpleStatement.getLeft();
								StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partInvocation
										.getMethodAccess();

								String objectRuleName = partMethodAccess.getName().substring(12);

								CmObjectRule objectRule = conversionModule.getObjectRule(objectRuleName);
								if (objectRule == null) {
									objectRule = new CmObjectRuleImpl();

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
							objectRule = new CmObjectRuleImpl();

							objectRule.setName(objectRuleName);

							objectRules.add(objectRule);
						}

						objectRule.setForSending(true);
						objectRule.setForReceiving(true);
					}
				}

			} else if (methodName.startsWith("ДобавитьПКО_")) {
				CmObjectRule objectRule = null;

				String configurationTabularSectionName = "";
				String formatTabularSectionName = "";

				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					SimpleStatement statement = (SimpleStatement) itrStatements.next();

					Expression leftExpression = statement.getLeft();

					if (leftExpression instanceof StaticFeatureAccess) {
						StaticFeatureAccess leftFeatureAccess = (StaticFeatureAccess) leftExpression;

						if (leftFeatureAccess.getName().equals("ПравилоКонвертации"))
							continue;

						else if (leftFeatureAccess.getName().equals("СвойстваШапки")) {
							configurationTabularSectionName = "";
							formatTabularSectionName = "";

						} else if (leftFeatureAccess.getName().equals("СвойстваТЧ")) {
							Invocation rightInvocation = (Invocation) statement.getRight();

							EList<Expression> params = rightInvocation.getParams();

							configurationTabularSectionName = ((StringLiteral) params.get(1)).getLines().get(0)
									.replace("\"", "");
							formatTabularSectionName = ((StringLiteral) params.get(2)).getLines().get(0).replace("\"",
									"");

						} else {
							throw new NullPointerException(
									"Добавить ПКО: неизвестный StaticFeatureAccess: " + leftFeatureAccess.getName());
						}

					} else if (leftExpression instanceof DynamicFeatureAccess) {
						DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;

						Expression rightExpression = statement.getRight();
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
							StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2
									.getSource();
							String configurationObject = rightFeatureAccess3.getName() + "."
									+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

							objectRule.setConfigurationObject(configurationObject);

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
							else if (identificationVariant
									.equals("СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска"))
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
								algorithm = new CmAlgorithmImpl();

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
								isCustomRule = ((NumberLiteral) params.get(3)).getValue().get(0).equals("0") ? false
										: true;

							if (params.size() >= 5 && params.get(4) instanceof StringLiteral) {
								String attributeRuleName = ((StringLiteral) params.get(4)).getLines().get(0)
										.replace("\"", "");
								attributeObjectRule = conversionModule.getObjectRule(attributeRuleName);

								if (attributeObjectRule == null) {
									attributeObjectRule = new CmObjectRuleImpl();

									attributeObjectRule.setName(attributeRuleName);

									objectRules.add(attributeObjectRule);
								}
							}

							EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();

							CmAttributeRuleImpl attributeRule = new CmAttributeRuleImpl();

							attributeRule.setConfigurationTabularSectionName(configurationTabularSectionName);
							attributeRule.setConfigurationAttributeName(configurationAttribute);
							if (configurationAttribute.length() == 0)
								attributeRule.setConfigurationTabularSectionName("");

							attributeRule.setFormatTabularSectionName(formatTabularSectionName);
							attributeRule.setFormatAttributeName(formatAttribute);
							if (formatAttribute.length() == 0)
								attributeRule.setFormatTabularSectionName("");

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

			} else {
				EObject region = method.eContainer().eContainer();
				if (!(region instanceof RegionPreprocessorDeclareStatement))
					continue;
				String regionName = ((RegionPreprocessorDeclareStatement) method.eContainer().eContainer()).getName();
				if (!regionName.equals("Алгоритмы"))
					continue;

				CmAlgorithm algorithm = conversionModule.getAlgorithm(methodName);
				if (algorithm == null) {
					algorithm = new CmAlgorithmImpl();

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

		ECollections.sort(algorithms, new Comparator<CmAlgorithm>() {
			@Override
			public int compare(CmAlgorithm arg1, CmAlgorithm arg2) {
				String algorithm1 = arg1.getName().replaceAll("_", "");
				String algorithm2 = arg2.getName().replaceAll("_", "");

				if (algorithm1.equalsIgnoreCase(algorithm2))
					return 0;

				return algorithm1.compareToIgnoreCase(algorithm2);
			}

		});

	}

	public void analyzeV1(CommonModule commonModule) {
		Module module = commonModule.getModule();

		EList<Method> methods = module.allMethods();

		conversionModule.setModuleURI(EcoreUtil.getURI(module));

		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		EList<CmAlgorithm> algorithms = conversionModule.getAlgorithms();

		dataRules.clear();
		objectRules.clear();
		algorithms.clear();

		Iterator<Method> itr = methods.iterator();
		while (itr.hasNext()) {
			Method method = itr.next();
			String methodName = method.getName();

			if (methodName.equals("ЗаполнитьПравилаОбработкиДанных")) {
				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					Statement statement = itrStatements.next();

					if (statement instanceof IfStatement) {
						IfStatement ifStatement = (IfStatement) statement;
						EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
						EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

						Iterator<Statement> itrPartStatements = ifPartStatements.iterator();
						while (itrPartStatements.hasNext()) {
							Statement partStatement = itrPartStatements.next();
							if (partStatement instanceof SimpleStatement) {
								SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
								Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
								StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
										.getMethodAccess();

								CmDataRuleImpl dataRule = new CmDataRuleImpl();

								dataRule.setName(partMethodAccess.getName().substring(12));
								dataRule.setForSending(true);
								dataRule.setForReceiving(false);

								dataRules.add(dataRule);
							}

						}

						EList<Statement> elseIfPartStatements = elseIfPartConditionals.get(0).getStatements();
						Iterator<Statement> itrElseIfPartStatements = elseIfPartStatements.iterator();
						while (itrElseIfPartStatements.hasNext()) {
							Statement partStatement = (Statement) itrElseIfPartStatements.next();
							if (partStatement instanceof SimpleStatement) {
								SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
								Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
								StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
										.getMethodAccess();

								CmDataRuleImpl dataRule = new CmDataRuleImpl();

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

				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					SimpleStatement statement = (SimpleStatement) itrStatements.next();

					Expression leftExpression = statement.getLeft();

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

						Expression rightExpression = statement.getRight();

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
							StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2
									.getSource();
							String configurationObject = rightFeatureAccess3.getName() + "."
									+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

							dataRule.setConfigurationObject(configurationObject);

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
							objectRule = new CmObjectRuleImpl();

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
				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					Statement statement = itrStatements.next();

					if (statement instanceof IfStatement) {
						IfStatement ifStatement = (IfStatement) statement;
						EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
						EList<Conditional> elseIfPartConditionals = ifStatement.getElsIfParts();

						Iterator<Statement> itrPartStatements = ifPartStatements.iterator();
						while (itrPartStatements.hasNext()) {
							Statement partStatement = itrPartStatements.next();
							if (partStatement instanceof SimpleStatement) {
								SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
								Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
								StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression
										.getMethodAccess();

								String objectRuleName = partMethodAccess.getName().substring(12);

								CmObjectRule objectRule = conversionModule.getObjectRule(objectRuleName);
								if (objectRule == null) {
									objectRule = new CmObjectRuleImpl();

									objectRule.setName(objectRuleName);

									objectRules.add(objectRule);
								}

								objectRule.setForSending(true);
								objectRule.setForReceiving(false);
							}

						}

						EList<Statement> elseIfPartStatements = elseIfPartConditionals.get(0).getStatements();
						Iterator<Statement> itrElseIfPartStatements = elseIfPartStatements.iterator();
						while (itrElseIfPartStatements.hasNext()) {
							Statement partStatement = (Statement) itrElseIfPartStatements.next();
							if (partStatement instanceof SimpleStatement) {
								SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
								Invocation partInvocation = (Invocation) partSimpleStatement.getLeft();
								StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partInvocation
										.getMethodAccess();

								String objectRuleName = partMethodAccess.getName().substring(12);

								CmObjectRule objectRule = conversionModule.getObjectRule(objectRuleName);
								if (objectRule == null) {
									objectRule = new CmObjectRuleImpl();

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
							objectRule = new CmObjectRuleImpl();

							objectRule.setName(objectRuleName);

							objectRules.add(objectRule);
						}

						objectRule.setForSending(true);
						objectRule.setForReceiving(true);
					}
				}

			} else if (methodName.startsWith("ДобавитьПКО_")) {
				CmObjectRule objectRule = null;

				String configurationTabularSectionName = "";
				String formatTabularSectionName = "";

				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					SimpleStatement statement = (SimpleStatement) itrStatements.next();

					Expression leftExpression = statement.getLeft();

					if (leftExpression instanceof StaticFeatureAccess) {
						StaticFeatureAccess leftFeatureAccess = (StaticFeatureAccess) leftExpression;

						if (leftFeatureAccess.getName().equals("НоваяСтрока")) {
							Invocation rightInvocation = (Invocation) statement.getRight();
							DynamicFeatureAccess rightFeatureAccess = (DynamicFeatureAccess) rightInvocation
									.getMethodAccess();

							DynamicFeatureAccess source = (DynamicFeatureAccess) rightFeatureAccess.getSource();
							if (source.getName().equals("Свойства")) {
								configurationTabularSectionName = "";
								formatTabularSectionName = "";
							}

						} else {
							throw new NullPointerException(
									"Добавить ПКО: неизвестный StaticFeatureAccess: " + leftFeatureAccess.getName());
						}

					} else if (leftExpression instanceof DynamicFeatureAccess) {
						DynamicFeatureAccess leftFeatureAccess = (DynamicFeatureAccess) leftExpression;

						Expression rightExpression = statement.getRight();
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
							StaticFeatureAccess rightFeatureAccess3 = (StaticFeatureAccess) rightFeatureAccess2
									.getSource();
							String configurationObject = rightFeatureAccess3.getName() + "."
									+ rightFeatureAccess2.getName() + "." + rightFeatureAccess1.getName();

							objectRule.setConfigurationObject(configurationObject);

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
							else if (identificationVariant
									.equals("СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска"))
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
								algorithm = new CmAlgorithmImpl();

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
								isCustomRule = ((NumberLiteral) params.get(3)).getValue().get(0).equals("0") ? false
										: true;

							if (params.size() >= 5 && params.get(4) instanceof StringLiteral) {
								String attributeRuleName = ((StringLiteral) params.get(4)).getLines().get(0)
										.replace("\"", "");
								attributeObjectRule = conversionModule.getObjectRule(attributeRuleName);

								if (attributeObjectRule == null) {
									attributeObjectRule = new CmObjectRuleImpl();

									attributeObjectRule.setName(attributeRuleName);

									objectRules.add(attributeObjectRule);
								}
							}

							EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();

							CmAttributeRuleImpl attributeRule = new CmAttributeRuleImpl();

							attributeRule.setConfigurationTabularSectionName(configurationTabularSectionName);
							attributeRule.setConfigurationAttributeName(configurationAttribute);
							if (configurationAttribute.length() == 0)
								attributeRule.setConfigurationTabularSectionName("");

							attributeRule.setFormatTabularSectionName(formatTabularSectionName);
							attributeRule.setFormatAttributeName(formatAttribute);
							if (formatAttribute.length() == 0)
								attributeRule.setFormatTabularSectionName("");

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

			} else {
				EObject region = method.eContainer().eContainer();
				if (!(region instanceof RegionPreprocessorDeclareStatement))
					continue;
				String regionName = ((RegionPreprocessorDeclareStatement) method.eContainer().eContainer()).getName();
				if (!regionName.equals("Алгоритмы"))
					continue;

				CmAlgorithm algorithm = conversionModule.getAlgorithm(methodName);
				if (algorithm == null) {
					algorithm = new CmAlgorithmImpl();

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

		ECollections.sort(algorithms, new Comparator<CmAlgorithm>() {
			@Override
			public int compare(CmAlgorithm arg1, CmAlgorithm arg2) {
				String algorithm1 = arg1.getName().replaceAll("_", "");
				String algorithm2 = arg2.getName().replaceAll("_", "");

				if (algorithm1.equalsIgnoreCase(algorithm2))
					return 0;

				return algorithm1.compareToIgnoreCase(algorithm2);
			}

		});

	}

	private static Method getMethod(Module mdModule, String methodName) {
		Iterator<Method> itr = mdModule.allMethods().iterator();
		while (itr.hasNext()) {
			Method mdMethod = (Method) itr.next();

			if (mdMethod.getName().equals(methodName)) {
				return mdMethod;
			}
		}

		return null;
	}

	private String getMethodText(String method) {
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

}
