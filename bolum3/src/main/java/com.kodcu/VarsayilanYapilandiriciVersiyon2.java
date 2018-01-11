package com.kodcu;

class Toyota {
	int kapi_sayisi;
	int vites_sayisi ;

	public Toyota(int adet) {
		kapi_sayisi = adet ;
	}

	public Toyota(int adet , int sayi) {
		kapi_sayisi =  adet ;
		vites_sayisi = sayi  ;
	}
}

public class VarsayilanYapilandiriciVersiyon2 {

	public static void main(String[] args) {
		//Toyota ar = new Toyota(); //yanlis ;
		Toyota ar1 = new Toyota(2);
		Toyota ar2 = new Toyota(4,5);
	}
} 


