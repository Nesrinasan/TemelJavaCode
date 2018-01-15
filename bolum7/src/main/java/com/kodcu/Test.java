package com.kodcu;

interface A7 {

    int devir_sayisi  = (int) ( Math.random() *6 ) ;
    String isim = "A7";
    double t1 = ( Math.random() * 8 ) ;
}


public class Test {

    public static void main(String args[] ) {


        System.out.println("devir_sayisi = " + A7.devir_sayisi );
        System.out.println("isim = " + A7.isim );
        System.out.println("t1 = " +  A7.t1 );
    }
}


