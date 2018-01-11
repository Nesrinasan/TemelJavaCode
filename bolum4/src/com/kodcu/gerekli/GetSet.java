package com.kodcu.gerekli;

import com.kodcu.util.*;
public class GetSet {

	public static void main(String args[]) {
		Makine2 m2 = new Makine2() ;      
		m2.set(5);
		int deger = m2.get();
		// m2.calis() ; // ! Hata !
		// m2.alinan ;  // ! Hata !
		// m2.geridondurulen ;  // ! Hata !
		System.out.println("Deger =" + deger);		
	}	
}
