package com.kodcu;

class Sayi {
    int i;
}


public class NesnelerdeAtama {
    public static void main(String[] args) {
        Sayi s1 = new Sayi();
        Sayi s2 = new Sayi();
        s1.i = 50;
        s2.i = 100;
        System.out.println("1: s1.i: " + s1.i + ", s2.i: " + s2.i);
        s1 = s2; // ??
        System.out.println("2: s1.i: " + s1.i + ", s2.i: " + s2.i);
        s1.i = 200;
        System.out.println("3: s1.i: " + s1.i + ", s2.i: " + s2.i);

    }
}