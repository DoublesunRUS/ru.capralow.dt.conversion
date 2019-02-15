package ru.capralow.dt.conversion.plugin.ui.views;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ru.capralow.dt.conversion.plugin.core.ev.EvConfiguration;
import ru.capralow.dt.conversion.plugin.core.ev.EvExchangePair;
import ru.capralow.dt.conversion.plugin.core.ev.EvFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ev.ExchangeVersions;

public class ConversionPanelContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object conversionPanel) {
		EList<EvExchangePair> exchangePairs = ((ExchangeVersions) conversionPanel).getExchangePairs();
		EList<EvConfiguration> configurations = ((ExchangeVersions) conversionPanel).getConfigurations();

		Object[] treeContent = new Object[exchangePairs.size() + configurations.size()];

		int i = 0;

		for (EvExchangePair EvExchangePair : exchangePairs) {
			treeContent[i] = EvExchangePair;
			i++;
		}
		for (EvConfiguration EvConfiguration : configurations) {
			treeContent[i] = EvConfiguration;
			i++;
		}

		return treeContent;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] getChildren(Object arg0) {
		if (arg0 instanceof EvExchangePair) {
			EList<String> availableFormatVersions = ((EvExchangePair) arg0).getVersions();

			int treeSize = 1;
			if (availableFormatVersions.size() != 0) {
				treeSize++;
			}
			Object[] treeContent = new Object[treeSize];

			treeContent[0] = ((EvExchangePair) arg0).getStatus();

			if (availableFormatVersions.size() != 0) {
				treeContent[1] = availableFormatVersions;
			}

			return treeContent;

		} else if (arg0 instanceof EvConfiguration) {
			EList<EvFormatVersion> availableFormatVersions = ((EvConfiguration) arg0).getAvailableFormatVersions();
			String storeVersion = ((EvConfiguration) arg0).getStoreVersion();

			int treeSize = 1;
			if (storeVersion != null) {
				treeSize++;
			}
			if (availableFormatVersions.size() != 0) {
				treeSize++;
			}
			Object[] treeContent = new Object[treeSize];

			treeContent[0] = ((EvConfiguration) arg0).getStatus();

			int i = 0;
			if (storeVersion != null) {
				i++;
				treeContent[i] = "Версия модуля обмена данными: " + storeVersion;
			}

			if (availableFormatVersions.size() != 0) {
				i++;
				treeContent[i] = availableFormatVersions;
			}

			return treeContent;

		} else if (arg0 instanceof EList<?>) {
			EList<EvFormatVersion> availableFormatVersions = (EList<EvFormatVersion>) arg0;

			Object[] treeContent = new Object[availableFormatVersions.size()];

			int i = 0;
			for (Object object : availableFormatVersions) {
				treeContent[i] = object;
				i++;
			}

			return treeContent;

		}

		return new Object[0];
	}

	@Override
	public Object getParent(Object arg0) {
		return null;
	}

	@Override
	public boolean hasChildren(Object arg0) {
		if (arg0 instanceof EvExchangePair) {
			return true;

		} else if (arg0 instanceof EvConfiguration) {
			return true;

		} else if (arg0 instanceof EList) {
			return ((EList<?>) arg0).size() != 0;

		}

		return false;
	}

	@Override
	public void dispose() {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
		// TODO Автоматически созданная заглушка метода

	}

}
