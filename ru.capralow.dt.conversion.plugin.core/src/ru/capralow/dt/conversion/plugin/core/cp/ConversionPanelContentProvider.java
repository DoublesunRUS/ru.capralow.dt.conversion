package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
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
			cpConfiguration cpConfiguration = (cpConfiguration) itr.next();
			i++;
			
			treeContent[i] = cpConfiguration;
		}
//
//		
//		//		
////		String[] treeContents = new String[exchangePlanContents.size()];
////		for (int i = 0; i < exchangePlanContents.size(); i++) {
////			ExchangePlanContent exchangePlanContent = exchangePlanContents.get(i);
////			
////			treeContents[i] = exchangePlanContent.getMdObject();
////
////			contentMap.put(treeContents[i], new String[] { exchangePlanContent.getAutoRecord().getLiteral() });
////		}
//		
//		contentMap.put("root", treeContents);
//
////		contentMap.put("Конфигурация 1", new String[] { "1" });
//		
////		contentMap.put("root1", new String[] { "root1_child1", "root1_child2", "root1_child3" });
////		contentMap.put("root1_child1", new String[] { "root1_child1_child1", "root1_child1_child2" });
//		
		return treeContent;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getChildren(Object arg0) {
		if (arg0 instanceof cpConfigurationImpl) {
			Object[] treeContent = new Object[1];
			
			treeContent[0] = ((cpConfigurationImpl) arg0).getStatus();
			
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
		}
		return false;
	}

}
