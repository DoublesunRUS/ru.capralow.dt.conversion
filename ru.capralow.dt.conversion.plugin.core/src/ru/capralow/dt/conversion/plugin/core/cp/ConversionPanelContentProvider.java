package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
<<<<<<< HEAD
=======
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

<<<<<<< HEAD
=======
import ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl;

>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git
public class ConversionPanelContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object conversionPanel) {
		EList<cpExchangePair> exchangePairs = ((ConversionPanel) conversionPanel).getExchangePairs();
		EList<cpConfiguration> configurations = ((ConversionPanel) conversionPanel).getConfigurations();

		Object[] treeContent = new Object[exchangePairs.size() + configurations.size()];

		int i = 0;

		Iterator<cpExchangePair> itr1 = exchangePairs.iterator();
		while (itr1.hasNext()) {
			cpExchangePair cpExchangePair = itr1.next();

			treeContent[i] = cpExchangePair;
			i++;
		}
		Iterator<cpConfiguration> itr2 = configurations.iterator();
		while (itr2.hasNext()) {
			cpConfiguration cpConfiguration = itr2.next();

			treeContent[i] = cpConfiguration;
			i++;
		}
		
		return treeContent;
	}

	@Override
	public Object[] getChildren(Object arg0) {
		if (arg0 instanceof cpExchangePair) {
			EList<String> availableFormatVersions = ((cpExchangePair) arg0).getVersions();
			
			int treeSize = 1;
			if (availableFormatVersions.size() != 0) {
				treeSize++;
			}
			Object[] treeContent = new Object[treeSize];

			treeContent[0] = ((cpExchangePair) arg0).getStatus();
			
			if (availableFormatVersions.size() != 0) {
				treeContent[1] = availableFormatVersions;
			}

			return treeContent;

		} else if (arg0 instanceof cpConfiguration) {
			EList<cpFormatVersion> availableFormatVersions = ((cpConfiguration) arg0).getAvailableFormatVersions();
			String storeVersion = ((cpConfiguration) arg0).getStoreVersion();
			
			int treeSize = 1;
			if (storeVersion != null) {
				treeSize++;
			}
			if (availableFormatVersions.size() != 0) {
				treeSize++;
			}
			Object[] treeContent = new Object[treeSize];

			treeContent[0] = ((cpConfiguration) arg0).getStatus();
			
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
			EList<cpFormatVersion> availableFormatVersions = (EList<cpFormatVersion>) arg0;

			Object[] treeContent = new Object[availableFormatVersions.size()];

			int i = 0;
			Iterator<cpFormatVersion> itr = (Iterator<cpFormatVersion>) availableFormatVersions.iterator();
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
		if (arg0 instanceof cpExchangePair) {
			return true;

		} else if (arg0 instanceof cpConfiguration) {
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

<<<<<<< HEAD
=======
	@Override
	public Object[] getChildren(Object arg0) {
		if (arg0 instanceof cpConfigurationImpl) {
			int treeSize = 1;
			if (((cpConfigurationImpl) arg0).getAvailableFormatVersions().size() !=0) {
				treeSize++;
			}
			
			Object[] treeContent = new Object[treeSize];

			treeContent[0] = ((cpConfigurationImpl) arg0).getStatus();
			if (((cpConfigurationImpl) arg0).getAvailableFormatVersions().size() !=0) {
				treeContent[1] = ((cpConfigurationImpl) arg0).getAvailableFormatVersions();
			}

			return treeContent;
		} else if (arg0 instanceof EList) {
			EList<cpFormatVersion> availableFormatVersions = (EList<cpFormatVersion>) arg0;

			Object[] treeContent = new Object[availableFormatVersions.size()];

			int i = 0;
			Iterator<cpFormatVersion> itr = (Iterator<cpFormatVersion>) availableFormatVersions.iterator();
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
		if (arg0 instanceof cpConfigurationImpl) {
			return true;

		} else if (arg0 instanceof EObjectContainmentEList) {
			return ((EList<cpFormatVersion>) arg0).size() != 0;

		} else if (arg0 instanceof cpFormatVersion) {
			return true;

		}

		return false;
	}

>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git
}
