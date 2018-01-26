package com.kodcu;

import java.io.*;

public class IstisnaMetodlari2 {


    public void oku() throws Exception {
        throw new Exception("istisna firlatildi",
			                   new IOException()); // dikkat
    }


    public static void main(String args[]) {
        try {
           IstisnaMetodlari2 im2 = new IstisnaMetodlari2();
           im2.oku();
        } catch (Exception ex) {
             System.out.println("Hata- ex.getCause() : " + ex.getCause() );  
        }
    }
}
