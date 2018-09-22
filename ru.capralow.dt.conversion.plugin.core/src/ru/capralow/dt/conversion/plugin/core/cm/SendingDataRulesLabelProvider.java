package ru.capralow.dt.conversion.plugin.core.cm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

public class SendingDataRulesLabelProvider implements ITableLabelProvider {

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof CmDataRule) {
			CmDataRule dataRule = (CmDataRule) element;
			
			if (columnIndex == 0) return dataRule.getName();
			else if (columnIndex == 1) return dataRule.getConfigurationObject().toString();
			else if (columnIndex == 2) return dataRule.getOnProcessingEvent().length() != 0 ? "Да" : "Нет";
			else if (columnIndex == 3) return dataRule.getDataSelectionEvent().length() != 0 ? "Да" : "Нет";

		} else if (element instanceof EList) {
			return "Какой-то список";

		} else if (element instanceof String) {
			if (columnIndex == 0) return "111";
			else if (columnIndex == 1) return "222";
			else if (columnIndex == 2) return "333";

		}

		return null;
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}
}
