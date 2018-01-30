package com.kodcu;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IterationOrnek {

    public static void main(String args[]) {

	ArrayList al = new ArrayList();

	al.add(new Double(1.26));
	al.add(new Double(3.89));
	al.add(new Double(1.54));
	

	Iterator iterator = al.iterator();
	while (iterator.hasNext()) {
	    Double d = (Double) iterator.next();
	    System.out.println("-->"+d);
	    
	    // calisma aninda istisna olusmasina sebebiyet verecektir.
	    al.add( new Double(4.55));
	}
    }
}


