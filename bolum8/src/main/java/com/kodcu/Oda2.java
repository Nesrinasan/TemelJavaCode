package com.kodcu;

public class Oda2 {

    public void isiklariKapat() {
        System.out.println("isiklar kapatildi");
    }

    public void isiklariAc() {
        System.out.println("isiklar acildi");
    }

    public void aramaYap() throws BeklenmeyenHata1, BeklenmeyenHata2 {
          // istisna firlatabilecek olan govde
    }

    public void basla() {
        try {
            // riskli kod
            isiklariAc();
            aramaYap();
        } catch(BeklenmeyenHata1 bh1)  {
            System.out.println("BeklenmeyenHata1 yakalandi");
        } catch(BeklenmeyenHata2 bh2)  {
            System.out.println("isiklar acildi");
        } finally {
            isiklariKapat(); // dikkat

        }
    }

    public static void main(String args[]) {
        Oda2 o2 = new Oda2();
        o2.basla();
    }
}
