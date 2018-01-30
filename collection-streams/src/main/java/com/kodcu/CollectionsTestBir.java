package com.kodcu;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class CollectionsTestBir {
     
    
    public static void ekranaBas(Collection c) {
	
	Iterator iterator = c.iterator();
	while (iterator.hasNext()) {
	    System.out.println("-->" + iterator.next());
	}
    }

    
    public static void main(String args[]) {
     
	 LinkedList torba = new LinkedList();
	 
	 for (int i=0; i<10; i++) {
	     int sayi = ((int) (Math.random() * 2000));
	     torba.add(new Integer(sayi));
	 }
	 
	 Collections.sort(torba) ;
	 System.out.println("------Siralanmis-------------------");
	 ekranaBas(torba);
	 Collections.shuffle(torba);
	 System.out.println("------Karistirilmis-------------------");
	 ekranaBas(torba);
	 Collections.reverse(torba);
	 System.out.println("------Tersten-------------------");
	 ekranaBas(torba);
     }
}






