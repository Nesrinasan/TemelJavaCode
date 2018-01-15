package com.kodcu;

interface Aylar {
	int
	OCAK = 1, SUBAT = 2, MART = 3, 
	NISAN = 4, MAYIS = 5, HAZIRAN = 6, TEMMUZ = 7, 
	AGUSTOS = 8, EYLUL = 9, EKIM = 10,
	KASIM = 11, ARALIK = 12;
}


public class AyBul {

	public static void main(String args[]) {

		int ay =  (int)(Math.random()*13) ;
		System.out.println("Gelen ay = " + ay);
		switch ( ay ) {
			case Aylar.OCAK    : System.out.println("Ocak");break;
			case Aylar.SUBAT   : System.out.println("Subat");break;
			case Aylar.MART    : System.out.println("Mart");break;
			case Aylar.NISAN   : System.out.println("Nisan");break;
			case Aylar.MAYIS   : System.out.println("Mayis");break;
			case Aylar.HAZIRAN : System.out.println("Haziran");break;
			case Aylar.TEMMUZ  : System.out.println("Temmuz");break;
			case Aylar.AGUSTOS : System.out.println("Agustos");break;
			case Aylar.EYLUL   : System.out.println("Eylul");break;
			case Aylar.EKIM    : System.out.println("Ekim");break;
			case Aylar.KASIM   : System.out.println("Kasim");break;
			case Aylar.ARALIK  : System.out.println("Aralik");break;
			default:System.out.println("Tanimsiz Ay"); 
		}
	}
}



