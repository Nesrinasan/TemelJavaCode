
package com.kodcu;

public class DiziOrnekIki {

	public static void main(String args[]) {


		String cikolata  = new String("Sutlu Cikolata");
		String sekerleme = new String("Sekerleme");
		String sakiz     = new String("Sakiz");

		String[] torba  = new String[3] ;
		torba[0] = cikolata ;
		torba[1] = sekerleme ;
		torba[2] = sakiz ;

		for (int i = 0 ; i < torba.length ; i ++) {
			System.out.println("torba["+i+"] = " + torba[i] );
		}
	}
}
