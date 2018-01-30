package com.kodcu;

import java.util.Collections;
import java.util.LinkedList;


public class MinMaxBulma {

    public static void main(String args[]) {

        LinkedList torba = new LinkedList();



        for (int i = 0; i < 15; i++) {
            int sayi = ((int) (Math.random() * 3000));
            torba.add(new Integer(sayi));
            System.out.println("-->" + sayi);
        }

        System.out.println("------");
        Integer maksimumSayi = (Integer) Collections.max(torba);
        System.out.println(" Maksimimum Sayi : " + maksimumSayi);
        Integer minimumSayi = (Integer) Collections.min(torba);
        System.out.println(" Minimum Sayi : " + minimumSayi);
        Collections.sort(torba);

    }
}





