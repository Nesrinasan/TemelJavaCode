package com.kodcu;

public class ContinueTest {

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            if (i == 9) {  //
                return;
            }
            System.out.println("i =" + i);
        }
        System.out.println("Donguden cikti");
    }
}
