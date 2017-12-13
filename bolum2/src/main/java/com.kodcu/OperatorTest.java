package com.kodcu;

public class OperatorTest {

    public static void main(String args[]) {
        char a = 'A';
        int b = +a; //otomatik olarak int ilkel tipine cevrildi
        int c = -b; // degeri negatif yapti
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
