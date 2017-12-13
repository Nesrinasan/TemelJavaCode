package com.kodcu;

public class KisaDevre {

    public static boolean hesaplaBir(int a) {
        System.out.println("hesaplaBir metoduna girildi");
        return a > 1;
    }

    public static boolean hesaplaIki(int a) {
        System.out.println("hesaplaIki metoduna girildi");
        return a > 2;
    }

    public static void main(String[] args) {
        System.out.println("Baslangic");
        //hesaplaBir(0) --> false deger doner
        //hesaplaIki(3) --> true deger doner

        System.out.println("hesaplaBir(0) && hesaplaIki(3)");
        if (hesaplaBir(0) && hesaplaIki(3)) {
            System.out.println(" 1 -true ");
        } else {
            System.out.println(" 1 -false ");
        }
        System.out.println("--------");
        System.out.println("hesaplaBir(0) || hesaplaIki(3)");
        if (hesaplaBir(0) || hesaplaIki(3)) {
            System.out.println(" 2 -true ");
        } else {
            System.out.println(" 2 -false ");
        }
        System.out.println("--------");
        System.out.println("hesaplaBir(0) & hesaplaIki(3)");
        if (hesaplaBir(0) & hesaplaIki(3)) {
            System.out.println(" 3 -true ");
        } else {
            System.out.println(" 3 -false ");
        }
        System.out.println("--------");
        System.out.println("hesaplaBir(0) | hesaplaIki(3)");
        if (hesaplaBir(0) | hesaplaIki(3)) {
            System.out.println(" 4 -true ");
        } else {
            System.out.println(" 4 -false ");
        }
        System.out.println("--------");
        System.out.println("hesaplaBir(0) ^ hesaplaIki(3)");
        if (hesaplaBir(0) ^ hesaplaIki(3)) {
            System.out.println(" 5 -true ");
        } else {
            System.out.println(" 5 -true ");
        }
        System.out.println("Son..");

    }

}
