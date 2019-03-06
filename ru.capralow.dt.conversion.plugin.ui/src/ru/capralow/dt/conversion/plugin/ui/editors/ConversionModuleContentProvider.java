package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredContentProvider;

public class ConversionModuleContentProvider implements IStructuredContentProvider {
	@Override
	public Object[] getElements(Object elements) {
		@SuppressWarnings("unchecked")
		EList<Object> listElements = (EList<Object>) elements;

		Object[] viewerContent = new Object[listElements.size()];

		int i = 0;
		for (Object object : listElements) {
			viewerContent[i] = object;
			i++;
		}

		return viewerContent;
	}
}
