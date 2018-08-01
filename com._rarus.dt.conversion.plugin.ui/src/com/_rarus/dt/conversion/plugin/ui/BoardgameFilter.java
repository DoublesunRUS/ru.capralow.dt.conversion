package com._rarus.dt.conversion.plugin.ui;

import com._rarus.dt.conversion.plugin.ui.model.BoardGame;
import com._rarus.dt.conversion.plugin.ui.model.MovingBox;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class BoardgameFilter extends ViewerFilter {

	/*
	 * @see ViewerFilter#select(Viewer, Object, Object)
	 */
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return element instanceof BoardGame || element instanceof MovingBox;
	}

}
