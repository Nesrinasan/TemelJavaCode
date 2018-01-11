package com.kodcu;

public class  NesneTipleri {
   String s ;
   
  public static void main(String args[]) {
  
	NesneTipleri nt = new NesneTipleri();
	
	System.out.println("s = " + nt.s );
	 nt.s = nt.s.trim(); //hata
  }
}



