package com.kodcu;

public class StatikTest {
    
       public static void hesapla(int a , int b) {
	   /*static metod dogrudan 
	     obje metodunu cagiramaz */
	    //islemYap(a,b);   // yanlis , 
       }
	
       public void islemYap(int a , int b) {
	   /*dogru , obje metodu static bir metodu cagrilabilir*/  
	   hesapla(a,b); 
       }
}
