package com._rarus.dt.conversion.plugin.ui;

import com._rarus.dt.conversion.plugin.ui.model.Book;
import com._rarus.dt.conversion.plugin.ui.model.MovingBox;

import org.eclipse.jface.viewers.ViewerComparator;

public class BookBoxBoardSorter extends ViewerComparator {
	
	/*
	 * @see ViewerSorter#category(Object)
	 */
	/** Orders the items in such a way that books appear 
	 * before moving boxes, which appear before board games. */
	public int category(Object element) {
		if(element instanceof Book) return 1;
		if(element instanceof MovingBox) return 2;
		return 3;
	}

}
