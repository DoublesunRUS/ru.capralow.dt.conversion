package ru.capralow.dt.conversion.plugin.core.cm;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bsl.model.Conditional;
import com._1c.g5.v8.dt.bsl.model.IfStatement;
import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.bsl.resource.BslResource;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

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

		conversionModule.setStoreVersion("1");
		
		Iterator<Method> itr = methods.iterator();
		while (itr.hasNext()) {
			Method method = itr.next();
			String methodName = method.getName();

			if (methodName.equals("ПередКонвертацией")) {

			} else if (methodName.equals("ПослеКонвертации")) {

			} else if (methodName.equals("ПередОтложеннымЗаполнением")) {

			} else if (methodName.equals("ВерсияФорматаМенеджераОбмена")) {

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
				
			}
		}

	}
}
