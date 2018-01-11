package com.kodcu;

class Dinozor {
    public Dinozor() {
	System.out.println("Ben Denver");
    }
}

public class NonStatikTopluDegerAtama {

    int x  ;
    double y ;
    Dinozor dz ;
	
    {
        x = 5 ;
        y = 6.89 ;
        dz= new Dinozor();
    }
	
    public static void main(String args[]) {

        new NonStatikTopluDegerAtama();
   }   
}
