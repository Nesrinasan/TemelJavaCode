package com.kodcu;

import java.util.*;


public class OzgunSiralama {

    public static void ekranaBas(Collection c) {
        System.out.println("-------------------------");
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println("-->" + iterator.next());
        }
    }

    public static void main(String args[]) {

        ArrayList kitapTorbasi = new ArrayList();

        Kitap k1 = new Kitap(50);
        Kitap k2 = new Kitap(70);
        Kitap k3 = new Kitap(150);
        Kitap k4 = new Kitap(1050);

        kitapTorbasi.add(k1);
        kitapTorbasi.add(k2);
        kitapTorbasi.add(k3);
        kitapTorbasi.add(k4);

        ekranaBas(kitapTorbasi);
        Collections.sort(kitapTorbasi,new Comparator<Kitap>() {
            public int compare(Kitap o1, Kitap o2) {
                return o1.olcegiNedir().compareTo(o2.olcegiNedir());
            }
        }); // dikkat
        ekranaBas(kitapTorbasi);
    }
}



