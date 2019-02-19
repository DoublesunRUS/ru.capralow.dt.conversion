package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import ru.capralow.dt.conversion.plugin.core.cm.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.CmPredefinedMap;

public class PredefinedDialog extends Dialog {

	private CmPredefined predefined;
	private Text txtpredefinedName;
	private Text txtConfigurationObjectName, txtFormatObjectName;

	private TableViewer viewerPredefinedMap;

	private Boolean editable;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public PredefinedDialog(Shell parentShell, CmPredefined predefined, Boolean editable) {
		super(parentShell);
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.PRIMARY_MODAL);

		this.predefined = predefined;

		this.editable = editable;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		IStructuredContentProvider viewerContentProvider = new ConversionModuleContentProvider();

		Composite container = (Composite) super.createDialogArea(parent);

		GridLayoutFactory.fillDefaults().applyTo(container);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(container);

		Composite compositeMain = new Composite(container, 0);
		GridData gd_compositeMain = new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1);
		gd_compositeMain.heightHint = 597;
		gd_compositeMain.widthHint = 1281;
		compositeMain.setLayoutData(gd_compositeMain);
		compositeMain.setLayout(new GridLayout(2, false));

		// 1.1
		Label lblRuleName = new Label(compositeMain, SWT.NONE);
		lblRuleName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRuleName.setText("Идентификатор правила");

		// 1.2
		txtpredefinedName = new Text(compositeMain, SWT.BORDER);
		txtpredefinedName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtpredefinedName.setText("<Идентификатор правила>");
		txtpredefinedName.setEditable(editable);

		// 2.1
		Label lblConfigurationObjectName = new Label(compositeMain, SWT.NONE);
		lblConfigurationObjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblConfigurationObjectName.setText("Объект конфигурации");

		// 2.2
		txtConfigurationObjectName = new Text(compositeMain, SWT.BORDER);
		txtConfigurationObjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtConfigurationObjectName.setText("<Объект конфигурации>");
		txtConfigurationObjectName.setEditable(editable);

		// 3.1
		Label lblFormatObjectName = new Label(compositeMain, SWT.NONE);
		lblFormatObjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFormatObjectName.setText("Объект формата");

		// 3.2
		txtFormatObjectName = new Text(compositeMain, SWT.BORDER);
		txtFormatObjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtFormatObjectName.setText("<Объект формата>");
		txtFormatObjectName.setEditable(editable);

		// 4.1
		Label lblSendingReceiving = new Label(compositeMain, SWT.NONE);
		lblSendingReceiving.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSendingReceiving.setText("Область применения");

		// 4.2
		ToolBar toolBarpredefinedsSize = new ToolBar(compositeMain, SWT.FLAT);

		ToolItem tltmpredefinedsSize1 = new ToolItem(toolBarpredefinedsSize, SWT.CHECK);
		tltmpredefinedsSize1.setText("Для отправки");
		tltmpredefinedsSize1.setEnabled(editable);

		new ToolItem(toolBarpredefinedsSize, SWT.SEPARATOR);

		ToolItem tltmpredefinedsSize2 = new ToolItem(toolBarpredefinedsSize, SWT.CHECK);
		tltmpredefinedsSize2.setText("Для получения");
		tltmpredefinedsSize2.setEnabled(editable);

		new ToolItem(toolBarpredefinedsSize, SWT.SEPARATOR);

		ToolItem tltmpredefinedsSize3 = new ToolItem(toolBarpredefinedsSize, SWT.CHECK);
		tltmpredefinedsSize3.setText("Для отправки и получения");
		tltmpredefinedsSize3.setEnabled(editable);

		// 5.1-2
		Composite compositePredefinedMap = new Composite(compositeMain, SWT.BORDER);
		GridData gd_compositePredefinedMap = new GridData(SWT.LEFT, SWT.CENTER, true, true, 2, 1);
		gd_compositePredefinedMap.widthHint = 1272;
		gd_compositePredefinedMap.heightHint = 485;
		compositePredefinedMap.setLayoutData(gd_compositePredefinedMap);
		TableColumnLayout tclPredefinedMap = new TableColumnLayout();
		compositePredefinedMap.setLayout(tclPredefinedMap);

		viewerPredefinedMap = new TableViewer(compositePredefinedMap, SWT.FULL_SELECTION | SWT.BORDER | SWT.V_SCROLL);

		Table tablePredefinedMap = viewerPredefinedMap.getTable();

		tablePredefinedMap.setHeaderVisible(true);
		tablePredefinedMap.setLinesVisible(true);

		TableViewerColumn tblclmnPredefinedMapColumn1 = new TableViewerColumn(viewerPredefinedMap, SWT.NONE);
		tclPredefinedMap.setColumnData(tblclmnPredefinedMapColumn1.getColumn(), new ColumnWeightData(2, 100, true));
		tblclmnPredefinedMapColumn1.getColumn().setText("Значение конфигурации");
		tblclmnPredefinedMapColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmPredefinedMap) element).getConfigurationValueName();
			}
		});
		TableViewerColumn tblclmnPredefinedMapColumn2 = new TableViewerColumn(viewerPredefinedMap, SWT.NONE);
		tclPredefinedMap.setColumnData(tblclmnPredefinedMapColumn2.getColumn(), new ColumnWeightData(2, 100, true));
		tblclmnPredefinedMapColumn2.getColumn().setText("Значение формата");
		tblclmnPredefinedMapColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CmPredefinedMap) element).getFormatValueName();
			}
		});

		viewerPredefinedMap.setContentProvider(viewerContentProvider);

		// Заполнение диалога

		txtpredefinedName.setText(predefined.getName());

		txtConfigurationObjectName.setText(predefined.getConfigurationObjectName());

		txtFormatObjectName.setText(predefined.getFormatObject());

		tltmpredefinedsSize1.setSelection(predefined.getForSending() && !predefined.getForReceiving());
		tltmpredefinedsSize2.setSelection(!predefined.getForSending() && predefined.getForReceiving());
		tltmpredefinedsSize3.setSelection(predefined.getForSending() && predefined.getForReceiving());

		viewerPredefinedMap.setInput(predefined.getPredefinedMaps());

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		if (editable)
			createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, !editable);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(1280, 668);
	}

	@Override
	protected void okPressed() {
		super.okPressed();
	}

}
