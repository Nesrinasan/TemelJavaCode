package com.kodcu;

import java.util.Arrays;

public class DiziOrnekUc {

	public static void elemanEkle(int dizi[]) {
		int eklenecek = 3 ;
		Arrays.fill(dizi,2,dizi.length, eklenecek);

	}

	public static void main(String args[]) {

		int[] intDizisi  = new int[5] ;
		intDizisi[0] = 1 ;
		intDizisi[1] = 2 ;
		elemanEkle(intDizisi);
		
		for (int i = 0 ; i < intDizisi.length ; i ++) {
			System.out.println("intDizisi["+i+"] = " + intDizisi[i] );
		}
	}
}
