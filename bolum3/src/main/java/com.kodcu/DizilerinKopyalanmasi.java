package com.kodcu;

public class DizilerinKopyalanmasi {

    public static void main(String args[]) {
		// ilk dizimiz
		int[] dizi1 = { 1,2,3,4 } ;

		// daha genis olan 2. dizimiz
		int[] dizi2 = { 100 , 90 , 78 , 45 ,40 , 30 , 20 ,10} ;

		// kopyalama islemini baslatiyoruz
		// 0. indeksten dizi1 uzunlugu kadar kopyalama yap
		System.arraycopy(dizi1,0,dizi2,0,dizi1.length);

		for (int i = 0 ; i < dizi2.length ; i++) {
			System.out.println("dizi2["+i+"] = "+ dizi2[i] );
		}
    }
}
