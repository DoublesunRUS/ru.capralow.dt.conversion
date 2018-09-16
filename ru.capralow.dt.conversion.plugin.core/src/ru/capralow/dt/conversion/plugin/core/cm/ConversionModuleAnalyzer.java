package ru.capralow.dt.conversion.plugin.core.cm;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bsl.model.BooleanLiteral;
import com._1c.g5.v8.dt.bsl.model.Conditional;
import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.EmptyExpression;
import com._1c.g5.v8.dt.bsl.model.Expression;
import com._1c.g5.v8.dt.bsl.model.IfStatement;
import com._1c.g5.v8.dt.bsl.model.Invocation;
import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.NumberLiteral;
import com._1c.g5.v8.dt.bsl.model.SimpleStatement;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.bsl.model.StaticFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.StringLiteral;
import com._1c.g5.v8.dt.bsl.model.UndefinedLiteral;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

import ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmSendingRuleImpl;
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

		Iterator<Method> itr = methods.iterator();
		while (itr.hasNext()) {
			Method method = itr.next();
			String methodName = method.getName();

			if (methodName.equals("ПередКонвертацией")) {
				ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

				conversionModule.setBeforeConvertationEvent(node.getText());
				conversionModule.setBeforeConvertationEventMethod(method);

			} else if (methodName.equals("ПослеКонвертации")) {
				ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

				conversionModule.setAfterConvertationEvent(node.getText());

			} else if (methodName.equals("ПередОтложеннымЗаполнением")) {
				ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

				conversionModule.setBeforeFillingEvent(node.getText());

			} else if (methodName.equals("ВерсияФорматаМенеджераОбмена")) {
				conversionModule.setStoreVersion("2");

			} else if (methodName.equals("ЗаполнитьПравилаОбработкиДанных")) {
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

							dataRule.setOnProcessingEvent(eventName);

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

							configurationTabularSectionName = ((StringLiteral) params.get(1)).getLines().get(0);
							formatTabularSectionName = ((StringLiteral) params.get(2)).getLines().get(0);

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

							objectRule.setIsForGroup(booleanLiteral.isIsTrue());

						} else if (leftFeatureAccess.getName().equals("ВариантИдентификации")) {
							StringLiteral stringLiteral = (StringLiteral) rightExpression;
							String identificationVariant = stringLiteral.getLines().get(0).replace("\"", "");

							objectRule.setIdentificationVariant(CmIdentificationVariant.UUID);
							if (identificationVariant == "ПоПолямПоиска")
								objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);
							else if (identificationVariant == "СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска")
								objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SERACH_FIELDS);

						} else if (leftFeatureAccess.getName().equals("ПриОтправкеДанных")) {
							StringLiteral stringLiteral = (StringLiteral) rightExpression;
							String eventName = stringLiteral.getLines().get(0).replace("\"", "");

							objectRule.setOnSendingEvent(eventName);

						} else if (leftFeatureAccess.getName().equals("ПриКонвертацииДанныхXDTO")) {
							StringLiteral stringLiteral = (StringLiteral) rightExpression;
							String eventName = stringLiteral.getLines().get(0).replace("\"", "");

							objectRule.setBeforeReceivingEvent(eventName);

						} else if (leftFeatureAccess.getName().equals("ПередЗаписьюПолученныхДанных")) {
							StringLiteral stringLiteral = (StringLiteral) rightExpression;
							String eventName = stringLiteral.getLines().get(0).replace("\"", "");

							objectRule.setOnReceivingEvent(eventName);

						} else if (leftFeatureAccess.getName().equals("ПослеЗагрузкиВсехДанных")) {
							StringLiteral stringLiteral = (StringLiteral) rightExpression;
							String algorithmName = stringLiteral.getLines().get(0).replace("\"", "");

							objectRule.setAfterReceivingAlgorithm(algorithmName);

						} else {
							throw new NullPointerException(
									"Добавить ПКО: неизвестное имя свойства: " + leftFeatureAccess.getName());

						}

					} else if (leftExpression instanceof Invocation) {
						Invocation leftInvocation = (Invocation) leftExpression;

						EList<Expression> params = leftInvocation.getParams();

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
								attributeObjectRule = new CmObjectRuleImpl();
								attributeObjectRule.setName(attributeRuleName);
								objectRules.add(attributeObjectRule);
							}
						}

						EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();

						CmAttributeRuleImpl attributeRule = new CmAttributeRuleImpl();
						attributeRule.setConfigurationTabularSectionName(configurationTabularSectionName);
						attributeRule.setConfigurationAttributeName(configurationAttribute);

						attributeRule.setFormatTabularSectionName(formatTabularSectionName);
						attributeRule.setFormatAttributeName(formatAttribute);

						attributeRule.setIsCustomRule(isCustomRule);
						attributeRule.setObjectRule(attributeObjectRule);

						attributeRules.add(attributeRule);

					} else {
						throw new NullPointerException(
								"Добавить ПКО: необработанный Expression: " + leftExpression.getClass());

					}
				}

			} else {
				continue;
			}
		}

		updateRules();

	}

	private void updateRules() {
		EList<CmSendingRule> sendingRules = conversionModule.getSendingRules();
		sendingRules.clear();

		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		Iterator<CmDataRule> itr = dataRules.iterator();
		while (itr.hasNext()) {
			CmDataRule dataRule = itr.next();
			if (!dataRule.getForSending())
				continue;

			CmSendingRuleImpl sendingRule = new CmSendingRuleImpl();
			sendingRule.setDataRule(dataRule);

			sendingRules.add(sendingRule);
		}

	}
}
