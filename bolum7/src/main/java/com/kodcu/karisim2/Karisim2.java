package com.kodcu.karisim2;

interface Avlanabilir {
	public void avlan() ;

}

abstract class Kedi implements Avlanabilir {

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
