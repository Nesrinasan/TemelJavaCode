package com.kodcu;

public class WhileDoOrnek {

    public static void main(String args[]) {
        int i = 10;       //döngü kontrol degiskeni
        do {
            System.out.println("i = " + i);
            i--;
        } while (i > 0);

        System.out.println("Sayma islemi tamamlandi.");
    }
}


