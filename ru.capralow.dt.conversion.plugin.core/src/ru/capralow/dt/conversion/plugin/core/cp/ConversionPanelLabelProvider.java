package ru.capralow.dt.conversion.plugin.core.cp;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl;

public class ConversionPanelLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ConversionPanelImpl) {
			return "Все конфигурации";
			
		} else if (element instanceof cpConfiguration) {
			return ((cpConfiguration) element).getConfigurationName();
			
		} else if (element instanceof WorkspaceStatus) {
			return ((WorkspaceStatus) element).getLiteral();
			
		}
		
		return null;
	}

}
