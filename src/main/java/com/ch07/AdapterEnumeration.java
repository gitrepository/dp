package com.ch07;

import java.util.Enumeration;
import java.util.Iterator;

public class AdapterEnumeration implements Iterator {
	Enumeration enm;

	public AdapterEnumeration(Enumeration enm) {
		this.enm = enm;
	}

	public boolean hasNext() {
		return enm.hasMoreElements();
	}

	public Object next() {
		return enm.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
