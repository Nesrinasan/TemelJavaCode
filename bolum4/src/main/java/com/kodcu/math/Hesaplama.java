package com.kodcu.math;

public class Hesaplama {

    public static void main(String args[]) {

        double sonuc = DortIslem.topla(9.6, 8.7);
        System.out.println("9.6 + 8.7 = " + sonuc);

        sonuc = DortIslem.cikart(9.6, 8.7);
        System.out.println("9.6 - 8.7 = " + sonuc);

        sonuc = DortIslem.carp(5.6, 8.7);
        System.out.println("9.6 * 8.7 = " + sonuc);

        sonuc = DortIslem.bol(5.6, 8.7);
        System.out.println("9.6 / 8.7 = " + sonuc);
    }
}
