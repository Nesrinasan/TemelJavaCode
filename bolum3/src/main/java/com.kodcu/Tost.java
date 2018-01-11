package com.kodcu;

public class Tost {
    
    static int sayi ;
    static String malzeme ;
	
    public Tost() {
        this(5);
        //this(5,"sucuklu"); yanlis-iki this kullanilamaz
        System.out.println("parametresiz yapilandirici");
    }

    public Tost(int sayi) {
        this(sayi,"Sucuklu");
        this.sayi =  sayi ;
        System.out.println("Tost(int sayi) " );
    }

    public Tost(int sayi ,String malzeme) {
       this.sayi = sayi ;
       this.malzeme = malzeme ;
       System.out.println("Tost(int sayi ,String malzeme) " );
    }

    public static void siparisGoster() {
        //this(5,"Kasarli"); // yanlis-sadece yapilandiricilarda kullanilir
        System.out.println("Tost sayisi =" + sayi + " malzeme =" + malzeme );
    }
	
    public static void main(String[] args) {
        Tost t = new Tost();
        t.siparisGoster();
    }
}
