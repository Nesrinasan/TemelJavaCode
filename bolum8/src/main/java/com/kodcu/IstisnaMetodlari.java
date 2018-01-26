package com.kodcu;

public class IstisnaMetodlari  {


    public void oku() throws Exception {
        throw new Exception("istisna firlatildi"); // dikkat
    }


    public static void main(String args[]) {
        try {
           IstisnaMetodlari im = new IstisnaMetodlari();
           im.oku();
        } catch (Exception ex) {
             System.out.println("Hata- ex.getMessage() : " + ex.getMessage() );
             System.out.println("Hata-ex.getLocalizedMessage() : " + 
                                                    ex.getLocalizedMessage() );
             
             System.out.println("Hata- ex.toString() : " + ex.toString() );
        }
    }
}
