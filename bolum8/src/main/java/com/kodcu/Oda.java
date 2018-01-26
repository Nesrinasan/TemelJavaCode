package com.kodcu;

class BeklenmeyenHata1 extends Exception {

    public  BeklenmeyenHata1(String ekAciklama) {
        super(ekAciklama);
    }
}

class BeklenmeyenHata2 extends Exception {

    public  BeklenmeyenHata2(String ekAciklama) {
        super(ekAciklama);
    }
}



public class Oda {

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
            isiklariKapat(); // dikkat
        } catch(BeklenmeyenHata1 bh1)  {
            System.out.println("BeklenmeyenHata1 yakalandi");
            isiklariKapat(); // dikkat

        } catch(BeklenmeyenHata2 bh2)  {
            System.out.println("isiklar acildi");
            isiklariKapat(); // dikkat
        }
    }

    public static void main(String args[]) {
        Oda o = new Oda();
        o.basla();
    }
}
