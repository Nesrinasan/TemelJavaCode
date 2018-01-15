package com.kodcu.karisim2;

interface Hayvan {
	public void avlan() ;

}

abstract class Kedi implements Hayvan {

	public abstract  void takipEt() ;
}

class Kaplan extends Kedi {

	public void avlan() { // iptal etti (override)
		System.out.println("Kaplan takip ediyor...");
	}


	public void takipEt() {	// iptal etti (override)
		System.out.println("Kaplan takip ediyor...");
	}                         

}
