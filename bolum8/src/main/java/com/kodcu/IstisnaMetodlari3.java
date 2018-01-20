package com.kodcu;

import java.io.*;

public class IstisnaMetodlari3 {


    public void oku() throws Throwable {
        Exception ioEx  =  new IOException(); // dikkat
        Exception fnfEx =  new FileNotFoundException(); // dikkat
        Throwable th = ioEx.initCause(fnfEx);
        throw th;

    }


    public static void main(String args[]) {
        try {
           IstisnaMetodlari3 im3 = new IstisnaMetodlari3();
           im3.oku();
        } catch (Throwable th) {
            //Throwable th = ex.getCause();  // hata
            //Throwable th2 = ex.initCause(th); // hata
            System.out.println("Hata - th.initCause() : " + th );  
            System.out.println("Hata - th.getCause() : " + th.getCause() );  

        }
    }
}
