package com.kodcu;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

    private ArrayList al = new ArrayList();

    public void add(String s) {
	al.add(s);
    }

    public String get(int indeks) {
	return (String)al.get(indeks);
    }

    public Iterator iteratorAl() {
      return al.iterator();
    }
}
