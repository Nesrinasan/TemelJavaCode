package com.kodcu;

public class ReturnTest {


    public double toplamaYap(double a, double b) {

        double sonuc = a + b;
        return sonuc; // normal return kullanimi
    }


    public void biseyYapma(double a) {

        if (a == 0) {
            return; // metodu acilen terk et
        } else {
            System.out.println("-->" + a);
        }
    }
}
