package com.kodcu;

public class CopNesne {

    public static void main(String args[]) {
        AmasyaElmasi e = new AmasyaElmasi(1);
        new AmasyaElmasi(2);
        System.gc(); // Çöp toplayıcısı çalıştı
    }
}

