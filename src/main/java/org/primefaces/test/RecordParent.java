package org.primefaces.test;

import java.util.ArrayList;
import java.util.List;

public class RecordParent {

	private List<Record> children = new ArrayList<>();
	private List<Record> childrenSelected;
	
	public RecordParent(List<Record> children) {
		this.children = children;
	}

	public List<Record> getChildren() {
		return children;
	}

	public void setChildren(List<Record> children) {
		this.children = children;
	}

	public List<Record> getChildrenSelected() {
		return childrenSelected;
	}

	public void setChildrenSelected(List<Record> childrenSelected) {
		this.childrenSelected = childrenSelected;
	}
}
