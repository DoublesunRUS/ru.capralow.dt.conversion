package ru.capralow.dt.conversion.plugin.core.cm;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class SendingRulesContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object conversionModule) {
		EList<CmSendingRule> sendingRules = ((ConversionModule) conversionModule).getSendingRules();

		Object[] treeContent = new Object[sendingRules.size()];

		int i = 0;
		Iterator<CmSendingRule> itr = sendingRules.iterator();
		while (itr.hasNext()) {
			treeContent[i] = itr.next();
			i++;
		}

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
