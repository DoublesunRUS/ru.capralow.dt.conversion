package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredContentProvider;

public class ConversionModuleContentProvider implements IStructuredContentProvider {
	@Override
	public Object[] getElements(Object inputElement) {
		@SuppressWarnings("unchecked")
		EList<Object> listObjects = (EList<Object>) inputElement;

		Object[] viewerContent = new Object[listObjects.size()];

		int i = 0;
		for (Object object : listObjects) {
			viewerContent[i] = object;
			i++;
		}

		return viewerContent;
	}
}
