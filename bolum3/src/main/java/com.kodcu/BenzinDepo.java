package com.kodcu;

class Ucak {
	
	String ucak_isim  ;
	boolean benzin_deposu_dolu = false ;
	boolean benzin_deposu_kapagi_acik_mi = false ; 

	
	Ucak(boolean depoyu_doldur ,String ucak_isim) {
		benzin_deposu_kapagi_acik_mi = true ; // kapagi aciyoruz
		benzin_deposu_dolu = depoyu_doldur ;//depo full
		this.ucak_isim =ucak_isim ;
	}
	
	
	/**
	 * Kapaklarin kapatilmasini finalize() metoduna biraktik
	 */
	public void finalize() {
		if (benzin_deposu_kapagi_acik_mi) {  // kapak aciksa
			benzin_deposu_kapagi_acik_mi = false ;// kapagi kapa
			System.out.println(ucak_isim + " - kapaklari kapatildi ");
		}
	} 
}

public class BenzinDepo {

	public static void main(String args[]) {
			
	    Ucak ucak_1 = new Ucak(true,"F-16"); // benzin doldur
	    new Ucak(true,"F-14");  //benzin doldur
	    
	    System.gc();//kapaklari kapat
	    System.out.println("Ucaklara benzin dolduruldu,kapaklari kapatildi");
	    
	}
}

