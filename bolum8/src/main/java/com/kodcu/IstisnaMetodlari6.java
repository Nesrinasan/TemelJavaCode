package com.kodcu;

public class IstisnaMetodlari6 {
    
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
           IstisnaMetodlari6 im6 = new IstisnaMetodlari6();
           im6.oku();
        } catch (Exception ex) {
             StackTraceElement[] ste = ex.getStackTrace();
             for(int i=0 ;i < ste.length;i++) {
                System.err.println("--> " + ste[i].getFileName() +" - "+
                                            ste[i].getMethodName()+" - "+
                                            ste[i].getLineNumber() );
             }  
        }
    }
}
