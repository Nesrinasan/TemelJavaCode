package com.kodcu;

public class IliskiselDeneme {

    public static void main(String[] args) {

        //bir kac sayi
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Degisken degerleri...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    k = " + k);

        //Buyuktur
        System.out.println("Buyuktur...");
        System.out.println("    i > j = " + (i > j));      //false - i , j den kucuktur
        System.out.println("    j > i = " + (j > i));     //true  - j , i den buyuktur
        System.out.println("    k > j = " + (k > j));    //false - k , j 'ye esit 

        //Buyuktur veya esittir
        System.out.println("Buyuktur veya esittir...");
        System.out.println("    i >= j = " + (i >= j));   //false - i , j den kucuktur
        System.out.println("    j >= i = " + (j >= i));   //true  - j , i den buyuktur
        System.out.println("    k >= j = " + (k >= j));   //true - k , j 'ye esit 

        //Kucuktur
        System.out.println("Kucuktur...");
        System.out.println("    i < j = " + (i < j));     //true - i , j den kucuktur
        System.out.println("    j < i = " + (j < i));     //false - j , i den buyuktur
        System.out.println("    k < j = " + (k < j));     //false - k , j 'ye esit 

        //Kucuktur veya esittir
        System.out.println("Kucuktur veya esittir...");
        System.out.println("    i <= j = " + (i <= j));   //true - i , j den kucuktur
        System.out.println("    j <= i = " + (j <= i));   //false - j , i den buyuktur
        System.out.println("    k <= j = " + (k <= j));   //true - k , j 'ye esit

        //Esittir
        System.out.println("Esittir...");
        System.out.println("    i == j = " + (i == j));   //false - i , j den kucuktur
        System.out.println("    k == j = " + (k == j));   //true - k , j 'ye esit

        //Esit degil
        System.out.println("Esit degil...");
        System.out.println("    i != j = " + (i != j));   //true - i , j den kucuktur
        System.out.println("    k != j = " + (k != j));   //false - k , j 'ye esit

    }
}


