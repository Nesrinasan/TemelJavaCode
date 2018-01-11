package com.kodcu;

public class TarihHesaplama {

    int gun, ay, yil;

    public void gunEkle(int gun) {

        this.gun += gun;

    }

    public void gunuEkranaBas() {
        System.out.println("Gun = " + gun);
    }


    public static void main(String[] args) {

        TarihHesaplama th = new TarihHesaplama();

        th.gunEkle(2);
        th.gunEkle(3);
        th.gunuEkranaBas();
    }
}


