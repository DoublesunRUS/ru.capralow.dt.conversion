package ru.capralow.dt.conversion.plugin.core.cm;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ConversionModuleContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object conversionModule) {
		Object[] treeContent = new Object[1];

		treeContent[0] = "Test";
		
		return treeContent;
	}

	@Override
	public Object[] getChildren(Object arg0) {
		return new Object[0];
	}

	@Override
	public Object getParent(Object arg0) {
		return null;
	}

	@Override
	public boolean hasChildren(Object arg0) {
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
