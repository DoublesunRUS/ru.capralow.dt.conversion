package ru.capralow.dt.conversion.plugin.core.cm;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bsl.model.Conditional;
import com._1c.g5.v8.dt.bsl.model.IfStatement;
import com._1c.g5.v8.dt.bsl.model.Invocation;
import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.SimpleStatement;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.bsl.model.StaticFeatureAccess;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

import ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmSendingRuleImpl;

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

		conversionModule.setStoreVersion("1");

		Iterator<Method> itr = methods.iterator();
		while (itr.hasNext()) {
			Method method = itr.next();
			String methodName = method.getName();

			if (methodName.equals("ПередКонвертацией")) {
				ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

				conversionModule.setBeforeConvertationEvent(node.getText());

			} else if (methodName.equals("ПослеКонвертации")) {
				ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

				conversionModule.setAfterConvertationEvent(node.getText());

			} else if (methodName.equals("ПередОтложеннымЗаполнением")) {
				ICompositeNode node = NodeModelUtils.findActualNodeFor(method);

				conversionModule.setBeforeFillingEvent(node.getText());

			} else if (methodName.equals("ВерсияФорматаМенеджераОбмена")) {

			} else if (methodName.equals("ЗаполнитьПравилаОбработкиДанных")) {
				EList<CmDataRule> dataRules = conversionModule.getDataRules();
				
				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					Statement statement = itrStatements.next();

					if (statement instanceof IfStatement) {
						IfStatement ifStatement = (IfStatement) statement;
						EList<Statement> ifPartStatements = ifStatement.getIfPart().getStatements();
						EList<Conditional> elseIfPart = ifStatement.getElsIfParts();
						
						Iterator<Statement> itrPartStatement = ifPartStatements.iterator();
						while (itrPartStatement.hasNext()) {
							Statement partStatement = itrPartStatement.next();
							if (partStatement instanceof SimpleStatement) {
								SimpleStatement partSimpleStatement = (SimpleStatement) partStatement;
								Invocation partExpression = (Invocation) partSimpleStatement.getLeft();
								StaticFeatureAccess partMethodAccess = (StaticFeatureAccess) partExpression.getMethodAccess();
								
								CmDataRuleImpl dataRule = new CmDataRuleImpl();
								
								dataRule.setName(partMethodAccess.getName().substring(8));
								dataRule.setForSending(true);
								dataRule.setForReceiving(false);
								
								dataRules.add(dataRule);
							}
							
						}
					}
				}

			} else if (methodName.startsWith("ДобавитьПОД_")) {
				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					Statement statement = itrStatements.next();

					if (statement instanceof IfStatement) {
						IfStatement ifStatement = (IfStatement) statement;
						Conditional ifPart = ifStatement.getIfPart();
						EList<Conditional> elseIfPart = ifStatement.getElsIfParts();
					}
				}

			} else {
				EList<Statement> statements = method.allStatements();
				Iterator<Statement> itrStatements = statements.iterator();
				while (itrStatements.hasNext()) {
					Statement statement = itrStatements.next();

					if (statement instanceof IfStatement) {
						IfStatement ifStatement = (IfStatement) statement;
						Conditional ifPart = ifStatement.getIfPart();
						EList<Conditional> elseIfPart = ifStatement.getElsIfParts();
					}
				}
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
			if (!dataRule.getForSending()) continue;
			
			CmSendingRuleImpl sendingRule = new CmSendingRuleImpl();
			sendingRule.setDataRule(dataRule);
			
			sendingRules.add(sendingRule);
		}
		
	}
}
