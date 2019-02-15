package ru.capralow.dt.conversion.plugin.ui.editors;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent;
import ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule;

public class RegistrationModuleContentProvider implements ITreeContentProvider {
	
	private Map<String, String[]> contentMap = new HashMap<>();
	
	@Override
	public Object[] getElements(Object registrationModule) {
		EList<ExchangePlanContent> exchangePlanContents = ((RegistrationModule) registrationModule).getExchangePlanContent();
		
		String[] treeContents = new String[exchangePlanContents.size()];
		for (int i = 0; i < exchangePlanContents.size(); i++) {
			ExchangePlanContent exchangePlanContent = exchangePlanContents.get(i);
			
			treeContents[i] = exchangePlanContent.getMdObject();

			contentMap.put(treeContents[i], new String[] { exchangePlanContent.getAutoRecord().getLiteral() });
		}
		
		contentMap.put("exchangePlanContents", treeContents);
		
//		contentMap.put("root1", new String[] { "root1_child1", "root1_child2", "root1_child3" });
//		contentMap.put("root1_child1", new String[] { "root1_child1_child1", "root1_child1_child2" });
		
		return contentMap.get("exchangePlanContents");
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
