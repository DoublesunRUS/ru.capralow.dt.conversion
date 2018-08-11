package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl;

public class ConversionPanelContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object conversionPanel) {
		EList<cpConfiguration> cpConfigurations = ((ConversionPanelImpl) conversionPanel).getConfigurations();

		Object[] treeContent = new Object[cpConfigurations.size() + 1];
		treeContent[0] = conversionPanel;

		int i = 0;
		Iterator<cpConfiguration> itr = cpConfigurations.iterator();
		while (itr.hasNext()) {
			cpConfiguration cpConfiguration = itr.next();
			i++;

			treeContent[i] = cpConfiguration;
		}
		return treeContent;
	}

	@Override
	public void dispose() {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public Object[] getChildren(Object arg0) {
		if (arg0 instanceof cpConfigurationImpl) {
			Object[] treeContent = new Object[2];

			treeContent[0] = ((cpConfigurationImpl) arg0).getStatus();
			treeContent[1] = ((cpConfigurationImpl) arg0).getAvailableFormatVersions();

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

}
