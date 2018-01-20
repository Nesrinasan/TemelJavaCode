package com.kodcu;



public class IstisnaMetodlari4 {


    
    public void cokOku() throws Exception {
        System.out.println("cokOku() metodu cagrildi");
        throw new Exception("istisna olustu"); // dikkat
    }

    public void oku() throws Exception {
        System.out.println("oku() metodu cagrildi");
        cokOku();
    }


    public static void main(String args[]) {
        try {
           IstisnaMetodlari4 im4 = new IstisnaMetodlari4();
           im4.oku();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(" Hata oluştu " + ex);
        }
    }
}
