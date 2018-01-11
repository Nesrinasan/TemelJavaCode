package com.kodcu.util;

public class Makine2 {     
	private int alinan  = 0;
	private int geridondurulen  = 0 ;
	
	public int  get() {
		return geridondurulen ;
	}
	
	public void set(int i ) {
		alinan = i ;
		calis();
	}
	
	private void calis() {
		for (int j = 0 ; j < alinan ; j++ ) {
			System.out.println("Sonuc =  "+j);
		}
		geridondurulen = alinan * 2 ; 	
	}
}



