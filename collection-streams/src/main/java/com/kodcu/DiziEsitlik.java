
package com.kodcu;

import java.util.Arrays;

public class DiziEsitlik {

	public static void main(String args[]) {
		

		int[] birinciDizi = { 4, 8, 12, 16} ;
		int[] ikinciDizi  = { 16, 12, 8, 4} ;
		int[] ucuncuDizi  = { 4, 8, 12, 16} ;

		boolean sonucBir = Arrays.equals(birinciDizi, ikinciDizi);
		System.out.println("birinciDizi = ikinciDizi :"  + sonucBir);

		boolean sonucIki = Arrays.equals(birinciDizi, ucuncuDizi);
		System.out.println("birinciDizi = ucuncuDizi :"  + sonucIki);
	}
}
