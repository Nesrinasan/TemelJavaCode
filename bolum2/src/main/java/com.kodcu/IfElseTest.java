package com.kodcu;

public class IfElseTest {
    public static void main(String[] args) {

        int puan = 76;
        char sonuc;

        if (puan >= 90) {
            sonuc = 'A';
        } else if (puan >= 80) {
            sonuc = 'B';
        } else if (puan >= 70) {
            sonuc = 'C';
        } else if (puan >= 60) {
            sonuc = 'D';
        } else {
            sonuc = 'F';
        }
        System.out.println("Sonuc = " + sonuc);
    }
}


