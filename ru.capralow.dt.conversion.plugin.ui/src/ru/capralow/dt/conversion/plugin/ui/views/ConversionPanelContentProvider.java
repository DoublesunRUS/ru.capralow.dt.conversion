package ru.capralow.dt.conversion.plugin.ui.views;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;

public class ConversionPanelContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object object) {
		ExchangeData exchangeData = (ExchangeData) object;

		EList<EpExchangePair> exchangePairs = exchangeData.getPairs();
		EList<ExchangeProject> exchangeProjects = exchangeData.getProjects();

		Object[] treeContent = new Object[exchangePairs.size() + exchangeProjects.size()];

		Integer i = 0;

		for (EpExchangePair epExchangePair : exchangePairs) {
			treeContent[i] = epExchangePair;
			i++;
		}
		for (ExchangeProject exchangeProject : exchangeProjects) {
			treeContent[i] = exchangeProject;
			i++;
		}

		return treeContent;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] getChildren(Object object) {
		if (object instanceof EpExchangePair) {
			EList<String> availableFormatVersions = ((EpExchangePair) object).getVersions();

			Integer treeSize = 1;
			if (!availableFormatVersions.isEmpty())
				treeSize++;

			Object[] treeContent = new Object[treeSize];

			treeContent[0] = ((EpExchangePair) object).getStatus();

			if (!availableFormatVersions.isEmpty())
				treeContent[1] = availableFormatVersions;

			return treeContent;

		} else if (object instanceof ExchangeProject) {
			EList<EpFormatVersion> formatVersions = ((ExchangeProject) object).getFormatVersions();
			String storeVersion = ((ExchangeProject) object).getStoreVersion();

			Integer treeSize = 1;
			if (!storeVersion.isEmpty())
				treeSize++;

			if (!formatVersions.isEmpty())
				treeSize++;

			Object[] treeContent = new Object[treeSize];

			treeContent[0] = ((ExchangeProject) object).getStatus();

			Integer i = 0;
			if (!storeVersion.isEmpty()) {
				i++;
				treeContent[i] = "Версия модуля обмена данными: " + storeVersion;
			}

			if (!formatVersions.isEmpty()) {
				i++;
				treeContent[i] = formatVersions;
			}

			return treeContent;

		} else if (object instanceof EList<?>) {
			EList<EpFormatVersion> formatVersions = (EList<EpFormatVersion>) object;

			Object[] treeContent = new Object[formatVersions.size()];

			Integer i = 0;
			for (Object formatVersion : formatVersions) {
				treeContent[i] = formatVersion;
				i++;
			}

			return treeContent;

		}

		return new Object[0];
	}

	@Override
	public Object getParent(Object object) {
		return null;
	}

	@Override
	public boolean hasChildren(Object object) {
		if (object instanceof EpExchangePair) {
			return true;

		} else if (object instanceof ExchangeProject) {
			return true;

		} else if (object instanceof EList) {
			return !((EList<?>) object).isEmpty();

		}

		return false;
	}

	@Override
	public void dispose() {
		// Нечего делать
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldObject, Object newObject) {
		// Нечего делать
	}

}
