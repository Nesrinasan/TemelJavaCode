package com.kodcu;

import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Kasa {


	private static HashMap hm = new HashMap();// dikkat

	public static Musteri[] odemeTablosunuGetir() {

		Musteri[] musteriler = new Musteri[10];

		musteriler[0] = new Musteri("Musteri3", 10);
		musteriler[1] = new Musteri("Musteri2", 5);
		musteriler[2] = new Musteri("Musteri2", 140);
		musteriler[3] = new Musteri("Musteri3", 5);
		musteriler[4] = new Musteri("Musteri1", 90);
		musteriler[5] = new Musteri("Musteri2", 15);
		musteriler[6] = new Musteri("Musteri1", 40);
		musteriler[7] = new Musteri("Musteri3", 65);
		musteriler[8] = new Musteri("Musteri2", 15);
		musteriler[9] = new Musteri("Musteri1", 25);
		return musteriler;
	}



	public static void main(String args[]) {


		Musteri[] musteriler = odemeTablosunuGetir();

		for (int i=0; i<musteriler.length; i++) {

			Musteri m = (Musteri) hm.get(musteriler[i].toString());
			if (m == null) { // musteri yi ekle
				hm.put(musteriler[i].toString(), musteriler[i]);
			} else { // musterinin bakiyesini guncelle
				m.bakiyeGuncelle(musteriler[i].bakiyeOgren());
			}
		}

		// sonuclari ekrana yansitiyoruz
		Musteri m = (Musteri)hm.get("Musteri1");
		System.out.println("Musteri1:"+ m.bakiyeOgren());
		
		m = (Musteri)hm.get("Musteri2");
		System.out.println("Musteri2:"+ m.bakiyeOgren());

		m = (Musteri)hm.get("Musteri3");
		System.out.println("Musteri3:"+ m.bakiyeOgren());
	} 
}

