package com.kodcu;

public class IlkelPas {

    static void hesapla(Double a) {

        System.out.println(a + " gonderildi");
        a = new Double(10);
        System.out.println("a=" + a);
        System.out.println("gonderilen parametrenin degeri 10'a esitlendi");
    }

    public static void main(String[] args) {

        Double a = new Double(5);
        hesapla(a);
        System.out.println("a --> " + a);

    }
}

