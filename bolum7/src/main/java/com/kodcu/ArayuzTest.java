package com.kodcu;

import java.util.*;

public class ArayuzTest {


    public Iterator iterator() {
	    
	 return new Iterator() {
		 
		 public boolean hasNext() {
		     System.out.println("Selam hasNext() ");
		     return true;
		 }
		 

		 public Object next() {
		     System.out.println("Selam next() ");
		     return null;
		 }
		 
		 
		 public void remove() {
		     System.out.println("Selam remove() ");
		 }
	     };
    }


    public static void main(String args[]){
	ArayuzTest at = new ArayuzTest();
	Iterator iter = at.iterator();
	iter.hasNext();
	iter.next();
	iter.remove();
	
    }
}
