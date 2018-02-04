package com.kodcu.gerekli;

class Kahve {     
	private int siparis_sayisi;
	private Kahve() {
	}
	
	private void  kahveHazirla() {
	    System.out.println(siparis_sayisi + " adet kahve hazirlandi");
    	}

	public static Kahve  siparisGarson(int sayi) {
	    Kahve kahve = new Kahve();
	    kahve.siparis_sayisi = sayi ;    
	    kahve.kahveHazirla();
	    return kahve;
	}
}

