package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ConversionPanelContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object conversionPanel) {
		EList<CpExchangePair> exchangePairs = ((ConversionPanel) conversionPanel).getExchangePairs();
		EList<CpConfiguration> configurations = ((ConversionPanel) conversionPanel).getConfigurations();

		Object[] treeContent = new Object[exchangePairs.size() + configurations.size()];

		int i = 0;

		Iterator<CpExchangePair> itr1 = exchangePairs.iterator();
		while (itr1.hasNext()) {
			CpExchangePair CpExchangePair = itr1.next();

			treeContent[i] = CpExchangePair;
			i++;
		}
		Iterator<CpConfiguration> itr2 = configurations.iterator();
		while (itr2.hasNext()) {
			CpConfiguration cpConfiguration = itr2.next();

			treeContent[i] = cpConfiguration;
			i++;
		}
		
		return treeContent;
	}

	@Override
	public Object[] getChildren(Object arg0) {
		if (arg0 instanceof CpExchangePair) {
			EList<String> availableFormatVersions = ((CpExchangePair) arg0).getVersions();
			
			int treeSize = 1;
			if (availableFormatVersions.size() != 0) {
				treeSize++;
			}
			Object[] treeContent = new Object[treeSize];

			treeContent[0] = ((CpExchangePair) arg0).getStatus();
			
			if (availableFormatVersions.size() != 0) {
				treeContent[1] = availableFormatVersions;
			}

			return treeContent;

		} else if (arg0 instanceof CpConfiguration) {
			EList<CpFormatVersion> availableFormatVersions = ((CpConfiguration) arg0).getAvailableFormatVersions();
			String storeVersion = ((CpConfiguration) arg0).getStoreVersion();
			
			int treeSize = 1;
			if (storeVersion != null) {
				treeSize++;
			}
			if (availableFormatVersions.size() != 0) {
				treeSize++;
			}
			Object[] treeContent = new Object[treeSize];

			treeContent[0] = ((CpConfiguration) arg0).getStatus();
			
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
			EList<CpFormatVersion> availableFormatVersions = (EList<CpFormatVersion>) arg0;

			Object[] treeContent = new Object[availableFormatVersions.size()];

			int i = 0;
			Iterator<CpFormatVersion> itr = (Iterator<CpFormatVersion>) availableFormatVersions.iterator();
			while (itr.hasNext()) {
				treeContent[i] = itr.next();
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
		if (arg0 instanceof CpExchangePair) {
			return true;

		} else if (arg0 instanceof CpConfiguration) {
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
