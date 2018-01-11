package com.kodcu.util;

public class Makine {
     
    int devir_sayisi;
    public String model = "2002 model" ;
    
    public int degerAl() {
	return devir_sayisi;
    }

    public void degerAta(int deger) {
	this.devir_sayisi = deger;
	calis();
    }

    void calis() {
	  for (int i = 0 ; i < devir_sayisi ; i++) {
	    System.out.println("Calisiyor , devir_sayisi = " + i);
	  }
    }
}
