package com.kodcu;

public class IstisnaSiralamasi2 {

    public static void main(String args[]) {
	  try {
	     throw new IstisnaIki(); // dikkat
	  } catch (IstisnaBir is1) {
	      System.out.println("istisna yakalandi IstisnaBir: " );
	  } 
    }
}

