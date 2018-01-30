package com.kodcu;

import java.util.LinkedList;
import java.util.Iterator;


public class Yigin {

    private static LinkedList torba = new LinkedList();

    public void veriAt(Object o) {
	torba.addFirst(o);
    }
    
    public Object veriCek() {
	return torba.removeFirst();
    }


    public static void main(String[] args) {
	
	String u1 = "Turkiye" ; 
	String u2 = "Japonya" ; 
	String u3 = "Almanya" ; 
	
	Yigin y = new Yigin();
	y.veriAt(u3);
	y.veriAt(u2);
	System.out.println(" --> " + y.veriCek());
	y.veriAt(u1);
	System.out.println(" --> " + y.veriCek());
	
	 Iterator it=torba.iterator();
        while (it.hasNext()){
          System.out.println(it.next().toString());  
        }
		
    }
	
	 
}



