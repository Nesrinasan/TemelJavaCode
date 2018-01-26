package com.kodcu;

public class IstisnaMetodlari5 {

    

    public void cokOku() throws Exception {
        System.out.println("cokOku() metodu cagrildi");
        throw new Exception("istisna olustu");
    }

    public void oku() throws Exception {
        System.out.println("oku() metodu cagrildi");
        cokOku();
    }

    public static void main(String args[]) {
       try {
          IstisnaMetodlari5 im5 = new IstisnaMetodlari5();
          im5.oku();
       } catch (Exception ex) {
            Throwable t = ex.fillInStackTrace();
            System.err.println( t.getMessage() );
       }  
    }
}
