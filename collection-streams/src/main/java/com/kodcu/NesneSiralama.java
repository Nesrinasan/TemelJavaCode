package com.kodcu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class NesneSiralama {

    public static void ekranaBas(Collection c) {
        System.out.println("-------------------------");
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println("-->" + iterator.next());
        }
    }

    public static void main(String args[]) {

        ArrayList stringTorbasi = new ArrayList();

        String f1 = "axdf";
        String f2 = "gab";
        String f3 = "zasd";
        String f4 = "bcv";

        stringTorbasi.add(f1);
        stringTorbasi.add(f2);
        stringTorbasi.add(f3);
        stringTorbasi.add(f4);

        ekranaBas(stringTorbasi);
        Collections.sort(stringTorbasi); // dikkat
        ekranaBas(stringTorbasi);
    }
}