package com.kodcu;

public class DiziErisim {

    static String  ad;

    public static void main(String args[]) {

        try {


            int sayilar[] = new int[3];
            System.out.println("Basla");
            for (int i = 0; i < 5; i++) {
                System.out.println("--> " + sayilar[i]);
            }
            System.out.println("Bitti");


            System.out.println(" " + ad.trim());
        }  catch (RuntimeException ex) {
            System.out.println(" Hata oluştu " + ex.getLocalizedMessage());
        }
    }
}
