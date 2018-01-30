package com.kodcu;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;

public class Degistirelemeyen {

    public static void main(String args[]) {

	Collection c = new ArrayList();

	c.add(new Integer(5));
	c.add(new Integer(15));
	c.add(new Integer(54));
	c.add(new Integer(8));

	Collection kapaliTorba = Collections.unmodifiableCollection(c);

	// calisma aninan istisna olusmasina sebebiyet verecektir.
	kapaliTorba.add(new Integer(69));
    }
}

