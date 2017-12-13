package com.kodcu;

public class Denklik {

    public static void main(String[] args) {
        Integer s1 = new Integer(50);
        Integer s2 = new Integer(50);
        s2 = s1;
        System.out.println(s1 == s2);  // Dikkat

    }
}

