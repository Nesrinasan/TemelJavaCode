package com.kodcu;

public class IstisnaMetodlari7 {
    
    public void cokOku() throws Exception {
        System.out.println("cokOku() metodu cagrildi");
        Exception eE = new Exception("istisna olustu-1");
        System.out.println("------------");
        Exception eE2 = new Exception("olusan istisna-2");
        eE2.setStackTrace( eE.getStackTrace() );
        throw eE2;

    }

    public void oku() throws Exception {
        System.out.println("oku() metodu cagrildi");
        cokOku();
    }


    public static void main(String args[]) {
        try {
           IstisnaMetodlari7 im7 = new IstisnaMetodlari7();
           im7.oku();
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
