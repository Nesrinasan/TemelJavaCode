package com.kodcu;

class Kopek {
    public Kopek() {
	System.out.println("Hav Hav");
    }
}

public class StatikTopluDegerAtama {

    static int x;
    static double y ;
    static Kopek kp ;
	
 static {   
	x = 5 ;
	y = 6.89 ;
	kp = new Kopek();
  }  
  
    public static void main(String args[]) {
	    new StatikTopluDegerAtama();

   }   
}
