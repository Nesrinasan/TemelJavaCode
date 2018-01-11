
package com.kodcu;

class Peynir {

	public Peynir(int i, String tur) {
		System.out.println("Peynir ("+i+") -->" + tur);
	}
}

class Tabak {

	public Tabak(int i, String tur) {
		System.out.println("Tabak ("+i+") -->" + tur);
	}

	static Peynir p1 = new Peynir(1,"statik alan");

	Peynir p2 = new Peynir(2,"statik-olmayan alan");
} 


class Catal {
	public Catal(int i , String tur) {
		System.out.println("Catal ("+i+") --> " + tur);
	}
}

public class Kahvalti {

	static Catal  c1 = new Catal(1,"statik alan");

	public Kahvalti() {
		System.out.println("Kahvalti() yapilandirici metod");
	}

	Tabak t1 = new Tabak(1,"statik-olmayan alan");

	
	public void islemTamam() {
		System.out.println("Islem tamam");  
	}

	static Catal  c2 = new Catal(2,"statik alan");

	public static void main (String args[]  ) throws Exception {
		Kahvalti d = new Kahvalti();
		d.islemTamam();
	}
	
	static Tabak t4 = new Tabak(4,"statik alan");
	static Tabak t5 = new Tabak(5,"statik alan"); 
}
