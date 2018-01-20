package com.kodcu;

import java.io.*;

public class IstisnaOrnek4 {

    public void cokCalis() throws IOException {
        File f = new File("ornek.txt");
        BufferedReader bf = new BufferedReader( new FileReader( f ) );
        System.out.println(bf.readLine());   
    }

    public void calis() throws IOException {
        cokCalis();
        System.out.println("calis() metodu");
    }

    public static void main(String args[]) {
        try { 
            IstisnaOrnek4 io4 = new IstisnaOrnek4();
            io4.calis();
            System.out.println("main() metodu");
        } catch(IOException ex) {
            System.out.println("Hata Yakalandi-main() =" + ex);
        }

    }

}
