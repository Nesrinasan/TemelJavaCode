package com.kodcu;

class IstisnaBir extends Exception {
} 

class IstisnaIki extends IstisnaBir {
}


public class IstisnaSiralamasi {  

    public static void main(String args[]) {
	  try {
	     throw new IstisnaIki(); // dikkat
	  } catch (IstisnaIki is2) {
	      System.out.println("istisna yakalandi IstisnaIki: " );
	  } catch (IstisnaBir is1) {
	      System.out.println("istisna yakalandi IstisnaBir: " );
	  } 
    }
}

