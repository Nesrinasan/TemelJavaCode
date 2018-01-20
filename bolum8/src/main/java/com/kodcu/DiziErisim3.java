package com.kodcu;

public class DiziErisim3 {


    
    public void calis() {
        try {
            int sayilar[] = {1,2,3,4};
            for (int i=0 ; i < 5 ; i++) {
                System.out.println("--> " + sayilar[i]);
            }
        }
		catch (ArrayIndexOutOfBoundsException ex) {
           System.out.println("Hata Yakalandi");
        }
         
    }

    public static void main(String args[]) {

        System.out.println("Basla");
        DiziErisim3 de3 = new DiziErisim3();
        de3.calis();
        System.out.println("Bitti");
    }
}
