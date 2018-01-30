package com.kodcu;

import java.util.Arrays;

public class AramaBir {

	public static void ekranaBas( int[] dizi) {

		for (int i = 0 ; i < dizi.length ; i ++) {
			System.out.println("dizi["+i+"] = " + dizi[i] );
		}
		System.out.println("-------------------");
	}

	public static void main(String args[]) {

		int[] ornekDizi = { 1, 45, 21, 7, 16} ;

		Arrays.sort(ornekDizi);	// kesin olmasi gerek 
		ekranaBas(ornekDizi);

		int arananBir = 7 ;	 // bulanacak
		int arananIki = 777 ; // bulunamayacak

		int sonucBir = Arrays.binarySearch(ornekDizi, arananBir);
		System.out.println("Birinci aranilan bulundu mu :" + sonucBir);

		int sonucIki = Arrays.binarySearch(ornekDizi, arananIki);
		System.out.println("Ikinci aranilan bulundu mu :" + sonucIki);
	}
}

