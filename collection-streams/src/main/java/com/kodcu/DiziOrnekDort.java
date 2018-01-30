package com.kodcu;

import java.util.Arrays;

public class DiziOrnekDort {

	public static void elemanEkle(String dizi[]) {

		String eklenecek = "kiraz" ;
		Arrays.fill(dizi,2,dizi.length, eklenecek);
	}

	public static void main(String args[]) {

		String[] meyvaSepeti  = new String[5] ;
		meyvaSepeti[0] = "elma" ;
		meyvaSepeti[1] = "armut" ;
		elemanEkle(meyvaSepeti);

		for (int i = 0 ; i < meyvaSepeti.length ; i ++) {
			System.out.println("intDizisi["+i+"] = " + meyvaSepeti[i] );
		}
	}
}

