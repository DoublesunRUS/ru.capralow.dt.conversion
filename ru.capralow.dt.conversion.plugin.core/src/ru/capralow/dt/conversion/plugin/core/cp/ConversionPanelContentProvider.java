package ru.capralow.dt.conversion.plugin.core.cp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ConversionPanelContentProvider implements ITreeContentProvider {
	
	private Map<String, String[]> contentMap = new HashMap<>();
	
	@Override
	public Object[] getElements(Object conversionPanel) {
		EList<cpConfiguration> cpConfigurations = ((ConversionPanel) conversionPanel).getConfigurations();
		
		Object[] treeContent = new Object[cpConfigurations.size() + 1];
		treeContent[0] = "Общие Данные";
		
		int i = 0;
		Iterator<cpConfiguration> itr = cpConfigurations.iterator();
		while (itr.hasNext()) {
			cpConfiguration cpConfiguration = (cpConfiguration) itr.next();
			i++;
			
			treeContent[i] = cpConfiguration.getConfigurationObject();
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
		return contentMap.get(arg0);
	}

	@Override
	public Object getParent(Object arg0) {
		return getParentOfEle(arg0);
	}

	@Override
	public boolean hasChildren(Object arg0) {
		return contentMap.containsKey(arg0);
	}

	private String getParentOfEle(Object arg0) {
		Set<String> keys = contentMap.keySet();

		for (String key : keys) {
			String[] values = contentMap.get(key);

			for (String val : values) {
				if (val.equals(arg0)) {
					return key;
				}
			}
		}
		return null;
	}

}
