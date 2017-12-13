package com.kodcu;

public class BreakTestEtiketli {
    public static void main(String[] args) {

        kiril:
        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 100; i++) {
                if (i == 9) {// for dongusunu kiriyor
                    break kiril;
                }
                System.out.println("i =" + i);
            }
            System.out.println("Donguden cikti");
            System.out.println("j =" + j);

        }
    }
}
