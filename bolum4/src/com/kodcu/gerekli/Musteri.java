package com.kodcu.gerekli;
public class Musteri {
	
	public  static void main(String args[]) {    
		// Kahve kh = new Kahve() ; // ! Hata !		
		// kh.kahveHazirla()  ; //! Hata !
		// kh.siparis_sayisi = 5 ; //	! Hata !
	        Kahve kh  = Kahve.siparisGarson(5);
	}
}

