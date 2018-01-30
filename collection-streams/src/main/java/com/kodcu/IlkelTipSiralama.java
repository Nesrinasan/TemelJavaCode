package com.kodcu;

import java.util.Arrays;

public class IlkelTipSiralama {

	public static void ekranaBas( int[] dizi) {

		System.out.println("-------------------");
		for (int i = 0 ; i < dizi.length ; i ++) {
			System.out.println("dizi["+i+"] = " + dizi[i] );
		}
	}

	public static void main(String args[]) {

		int[] ornekDizi = { 115, 10, 255, 23, 17, 8, 569} ;

		ekranaBas(ornekDizi);
		Arrays.sort( ornekDizi ) ; // dikkat
		ekranaBas(ornekDizi);
	}
}

