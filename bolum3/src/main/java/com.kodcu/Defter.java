package com.kodcu;

class Kagit {

    public Kagit(int i) {
        System.out.println("Kagit (" + i + ") ");
    }
}

public class Defter {

    Kagit k1 = new Kagit(1); // dikkat

    public Defter() {
        System.out.println("Defter() yapilandirici metod");
        k1.toString();
        k2 = new Kagit(33);
    }

    Kagit k2 = new Kagit(2); //dikkat

    public void islemTamam() {
        System.out.println("Islem tamam");
    }

    Kagit k3 = new Kagit(3); //dikkat


    public static void main(String args[]) throws Exception {
        Defter d = new Defter();
        d.islemTamam();
    }
}
