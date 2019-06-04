package ru.capralow.dt.conversion.plugin.ui.conversionpanel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;

public class ConversionPanelLabelProvider implements ILabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof EpExchangePair) {
			return ((EpExchangePair) element).getConfigurationName1() + " - "
					+ ((EpExchangePair) element).getConfigurationName2();

		} else if (element instanceof EpExchangePairStatus) {
			return ((EpExchangePairStatus) element).getLiteral();

		} else if (element instanceof ExchangeProject) {
			return ((ExchangeProject) element).getName();

		} else if (element instanceof EpProjectStatus) {
			return ((EpProjectStatus) element).getLiteral();

		} else if (element instanceof EpFormatVersion) {
			EpFormatVersion formatVersion = (EpFormatVersion) element;

			String version = formatVersion.getVersion().intern();
			String module = formatVersion.getModuleName();

			if (!formatVersion.getExtensionName().isEmpty()) {
				module = formatVersion.getExtensionName() + "." + module;
			}

			return version + " [" + module + "]";

		} else if (element instanceof EList) {
			return "Доступные версии формата";

		} else if (element instanceof String) {
			return element.toString();

		}

		return null;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// Нечего делать
	}

	@Override
	public void dispose() {
		// Нечего делать
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// Нечего делать
	}

	@Override
	public Image getImage(Object element) {
		return null;
	}

}