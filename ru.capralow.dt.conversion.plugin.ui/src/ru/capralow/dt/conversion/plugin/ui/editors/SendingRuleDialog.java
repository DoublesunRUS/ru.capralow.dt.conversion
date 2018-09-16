package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SendingRuleDialog extends Dialog {

	private CmSendingRule sendingRule;
	private Text txtRuleName;
	private Text txtConfigurationObjectName;
	private Text txtFormatObjectName;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public SendingRuleDialog(Shell parentShell, CmSendingRule sendingRule) {
		super(parentShell);
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.PRIMARY_MODAL);

		this.sendingRule = sendingRule;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(new GridLayout(1, false));

		CTabFolder tabFolder = new CTabFolder(container, SWT.BORDER | SWT.FLAT);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tabFolder.setSelectionBackground(
				Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		CTabItem tabItem1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem1.setText("Основные сведения");

		Composite tabComposite1 = new Composite(tabFolder, 0);
		tabItem1.setControl(tabComposite1);
		tabComposite1.setLayout(new GridLayout(4, false));

		Label lblRuleName = new Label(tabComposite1, SWT.NONE);
		lblRuleName.setText("Идентификатор правила");

		txtRuleName = new Text(tabComposite1, SWT.BORDER);
		txtRuleName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		txtRuleName.setText("Идентификатор правила");

		Label lblConfigurationObjectName = new Label(tabComposite1, SWT.NONE);
		lblConfigurationObjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblConfigurationObjectName.setText("Объект конфигурации");

		txtConfigurationObjectName = new Text(tabComposite1, SWT.BORDER);
		txtConfigurationObjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtConfigurationObjectName.setText("Объект конфигурации");

		Label lblFormatObjectName = new Label(tabComposite1, SWT.NONE);
		lblFormatObjectName.setText("Объект формата");

		txtFormatObjectName = new Text(tabComposite1, SWT.BORDER);
		txtFormatObjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtFormatObjectName.setText("Объект формата");

		new Label(tabComposite1, SWT.NONE);

		Button btnCheckButton = new Button(tabComposite1, SWT.CHECK);
		btnCheckButton.setText("Правило для группы справочника");

		new Label(tabComposite1, SWT.NONE);
		new Label(tabComposite1, SWT.NONE);

		CTabItem tabItem2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem2.setText("Правила конвертации свойств");

		Tree tree3 = new Tree(tabFolder, SWT.NONE);
		tree3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tree3.setHeaderVisible(true);
		TreeColumn column31 = new TreeColumn(tree3, SWT.LEFT);
		column31.setText("Column 1");
		column31.setWidth(200);
		TreeColumn column32 = new TreeColumn(tree3, SWT.CENTER);
		column32.setText("Column 2");
		column32.setWidth(200);
		TreeColumn column33 = new TreeColumn(tree3, SWT.RIGHT);
		column33.setText("Column 3");
		column33.setWidth(200);
		tabItem2.setControl(tree3);

		CTabItem tabItem3 = new CTabItem(tabFolder, SWT.NONE);
		tabItem3.setText("При обработке");

		CTabItem tabItem4 = new CTabItem(tabFolder, SWT.NONE);
		tabItem4.setText("Выборка данных");

		txtRuleName.setText(sendingRule.getDataRule().getName());

		txtConfigurationObjectName.setText(sendingRule.getDataRule().getConfigurationObject().toString());

		txtFormatObjectName.setText(sendingRule.getDataRule().getConfigurationObject().toString());

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(800, 600);
	}

}
