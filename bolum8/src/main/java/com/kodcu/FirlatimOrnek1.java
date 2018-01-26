package com.kodcu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FirlatimOrnek1 {


    public void basla(int a, int b) throws Exception {
        int sonuc = 0;
        try {
            sonuc = a / b;
        } catch (Exception ex) {
            System.out.println("basla() istisna yakalandi");
            throw ex;
        } finally {
            System.out.println("sonuc : " + sonuc);
        }
    }

    public static void main(String args[]) {
        try {
            FirlatimOrnek1 fo1 = new FirlatimOrnek1();
            fo1.basla(1, 0);
        } catch (Exception ex) {
            System.out.println("main() istisna yakalandi : " + ex);
        }
    }
}
