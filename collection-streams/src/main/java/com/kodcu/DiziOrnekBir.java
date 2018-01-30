
package com.kodcu;

public class DiziOrnekBir {
    
    public static void main(String args[]) {

        int[] ilkelIntDizisi  = new int[5] ;
	
	ilkelIntDizisi[0] = 1 ;
	ilkelIntDizisi[1] = 2 ;
	ilkelIntDizisi[2] = 3 ;
	ilkelIntDizisi[3] = 4 ;
	ilkelIntDizisi[4] = 5 ;
	//ilkelIntDizisi[4] = "Selamlar" ; // !hata! 

	for (int i = 0 ; i < ilkelIntDizisi.length ; i ++) {
	    System.out.println("ilkelIntDizisi["+i+"] = " + ilkelIntDizisi[i] );
	}
    }
}
