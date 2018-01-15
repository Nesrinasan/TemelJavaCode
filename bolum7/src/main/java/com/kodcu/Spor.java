package com.kodcu;

abstract class Sporcu {
	public abstract  void calis();
}

class BuzPatenci extends Sporcu {
	public void calis() {
		System.out.println("BuzPatenci calisiyor ....") ;
	}
}

class Basketbolcu extends Sporcu {
	public void calis() {
		System.out.println("Basketbolcu calisiyor ....") ;
	}
}

/*
Bu ornegimiz derleme aninda hata alicaktir.
Java, coklu kalitimi desteklemez

class  SportmenMehmet extends BuzPatenci , Basketbolcu {

}
*/