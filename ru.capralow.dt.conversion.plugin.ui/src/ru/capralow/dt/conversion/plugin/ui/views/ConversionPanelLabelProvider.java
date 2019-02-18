package ru.capralow.dt.conversion.plugin.ui.views;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

import ru.capralow.dt.conversion.plugin.core.ev.EvConfiguration;
import ru.capralow.dt.conversion.plugin.core.ev.EvConfigurationStatus;
import ru.capralow.dt.conversion.plugin.core.ev.EvExchangePair;
import ru.capralow.dt.conversion.plugin.core.ev.EvExchangePairStatus;
import ru.capralow.dt.conversion.plugin.core.ev.EvFormatVersion;

public class ConversionPanelLabelProvider implements ILabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof EvExchangePair) {
			return ((EvExchangePair) element).getConfigurationName1() + " - "
					+ ((EvExchangePair) element).getConfigurationName2();

		} else if (element instanceof EvExchangePairStatus) {
			return ((EvExchangePairStatus) element).getLiteral();

		} else if (element instanceof EvConfiguration) {
			return ((EvConfiguration) element).getConfigurationName();

		} else if (element instanceof EvConfigurationStatus) {
			return ((EvConfigurationStatus) element).getLiteral();

		} else if (element instanceof EvFormatVersion) {
			EvFormatVersion formatVersion = (EvFormatVersion) element;

			String version = formatVersion.getVersion().intern();
			String module = ((CommonModule) formatVersion.getModule()).getName();

			if (formatVersion.getConfigurationName() != null) {
				module = formatVersion.getConfigurationName() + "." + module;
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
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public void dispose() {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public Image getImage(Object element) {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

}
