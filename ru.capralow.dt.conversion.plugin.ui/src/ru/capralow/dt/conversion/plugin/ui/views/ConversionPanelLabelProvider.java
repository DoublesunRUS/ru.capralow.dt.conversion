package ru.capralow.dt.conversion.plugin.ui.views;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com._1c.g5.v8.dt.metadata.mdclass.Configuration;

public class ConversionPanelLabelProvider implements ILabelProvider {

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

	@Override
	public String getText(Object element) {
		if (element instanceof String) {
			return element.toString();
			
		} else if (element instanceof Configuration) {
			return ((Configuration) element).getName();
			
		}
		
		return null;
	}

}
