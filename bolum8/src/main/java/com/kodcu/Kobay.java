package com.kodcu;

public class Kobay {


    public void cikart(int a , int b) throws BenimHatam, SeninHatan {
         if(a == 0) {
             throw new SeninHatan("a parametresi sifir geldi");
         }
         if(b == 0) {
             throw new SeninHatan("b parametresi sifir geldi");
         }
         if( (a<0) || (b<0) ) {
            throw new SeninHatan(); // kotu, aciklama yok
         }

         int sonuc = a - b ; // hesaplama islemi
         
         if(sonuc < 0) {
            throw new BenimHatam("sonuc eksi",2);
         }else if( sonuc == 0) {
            throw new BenimHatam("sonuc sifir",1);
         }
    }

    public static void main(String args[]) {
        System.out.println("----------------------"); 
        try {
            Kobay it = new Kobay();
            it.cikart(1,2);
            it.cikart(-1,2);
            it.cikart(1,-2);
            it.cikart(0,0);
            it.cikart(-1,-2);
         } catch (BenimHatam ex1) {
             System.out.println( "Hata Olustu-1:"+ ex1.getMessage() );
             System.out.println(ex1.getLocalizedMessage());
             System.out.println(ex1.getId()); 
         } catch (SeninHatan ex2) {
             System.out.println("Hata Olustu-2:"+ ex2);
         }
	

         System.out.println("----------------------");
         try {
            Kobay it = new Kobay();
            it.cikart(1,0);
         } catch (BenimHatam ex1) {
             System.out.println("Hata Olustu-1:"+ ex1.getMessage());
             System.out.println(ex1.getLocalizedMessage());
             System.out.println(ex1.getId());
         } catch (SeninHatan ex2) {
             System.out.println("Hata Olustu-2:"+ ex2);
         }

         System.out.println("----------------------");
         try {
            Kobay it = new Kobay();
            it.cikart(1,-124); 
         } catch (BenimHatam ex1) {
             System.out.println("Hata Olustu-1:"+ ex1.getMessage());
             System.out.println(ex1.getLocalizedMessage());
             System.out.println(ex1.getId());
         } catch (SeninHatan ex2) {
             System.out.println("Hata Olustu-2:"+ ex2);
         }
    }    
}
