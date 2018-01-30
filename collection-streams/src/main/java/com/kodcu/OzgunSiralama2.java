package com.kodcu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class OzgunSiralama2 {

    public static void ekranaBas(Collection c) {
        System.out.println("-------------------------");
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println("-->" + iterator.next());
        }
    }

    public static void main(String args[]) {

        ArrayList kitapTorbasi = new ArrayList();

        Kitap2 k1 = new Kitap2(150);
        Kitap2 k2 = new Kitap2(70);
        Kitap2 k3 = new Kitap2(50);
        Kitap2 k4 = new Kitap2(1050);

        kitapTorbasi.add(k1);
        kitapTorbasi.add(k2);
        kitapTorbasi.add(k3);
        kitapTorbasi.add(k4);

        ekranaBas(kitapTorbasi);
        Collections.sort(kitapTorbasi); // dikkat
        ekranaBas(kitapTorbasi);
    }
}




