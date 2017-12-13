package com.kodcu;

public class AritmetikOrnek {

    public static void main(String[] args) {
        //Degisken degerleri
        int a = 2;
        int b = 42;
        double c = 27.475;
        double d = 7.5;
        System.out.println("Degisken Degerleri...");
        System.out.println("    a = " + a);
        System.out.println("    b = " + b);
        System.out.println("    c = " + c);
        System.out.println("    d = " + d);

        double e = a * d;
        //Sayilari topluyoruz

        System.out.println("Toplama...");
        System.out.println("    a + b = " + (a + b));
        System.out.println("    c + d = " + (c + d));

        //Sayilari cikartiyoruz
        System.out.println("Cikartma...");
        System.out.println("    a - b = " + (a - b));
        System.out.println("    c - d = " + (c - d));

        //Sayilari Carpiyoruz
        System.out.println("Carpma...");
        System.out.println("    a * b = " + (a * b));
        System.out.println("    c * d = " + (c * d));

        //Sayilari boluyoruz
        System.out.println("Bolme...");
        System.out.println("    a / b = " + (a / b));
        System.out.println("    c / d = " + (c / d));

        //Bolme islemlerinden kalan sayiyi hesapliyoruz
        System.out.println("Kalan sayiyi hesaplama ...");
        System.out.println("    a % b = " + (a % b));
        System.out.println("    c % d = " + (c % d));

        //double ve int tiplerini karisik bir sekilde kullaniyoruz 
        System.out.println("Karisik tipler...");
        System.out.println("    b + d = " + (b + d));
        System.out.println("    a * c = " + (a * c));
    }
}


