package com.kodcu;

import java.util.Collections;
import java.util.LinkedList;

public class AramaTestBir {

	public static void main(String args[]) {

		
		Integer i1 = new Integer(347);
		Integer i2 = new Integer(891);
		Integer i3 = new Integer(256);
		Integer i4 = new Integer(1569);
		Integer i5 = new Integer(17);
		Integer i6 = new Integer(99);
		


		// nesneleri torbanin icerisine atiyoruz
		LinkedList torba = new LinkedList();
		torba.add(i1);
		torba.add(i2);
		torba.add(i3);
		torba.add(i4);
		torba.add(i5);
		torba.add(i6);
		
		// arama isleminden evvel artan sirada siralanmali
		Collections.sort(torba);

		// arama islemi 
		// 256 sayisini arattiralim
		int indeksBir = Collections.binarySearch(torba, new Integer(256));
		System.out.println("-->"  + indeksBir);

		int indeksIki = Collections.binarySearch(torba, new Integer(159));
		System.out.println("-->"  + indeksIki);
		
	}
}





