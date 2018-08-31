package ru.capralow.dt.conversion.plugin.core.cm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class ConversionModuleLabelProvider implements ILabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof cpPOD) {
			return ((cpPOD) element).getName();

		} else if (element instanceof EList) {
			return "Какой-то список";

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
