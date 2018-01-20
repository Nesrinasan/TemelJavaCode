package com.kodcu;

import java.io.*;

public class IstisnaOrnek3 {

    public void cokCalis() throws IOException {

        File f = new File("ornek.txt");
        BufferedReader bf = new BufferedReader(new FileReader(f));
        System.out.println(bf.readLine());

    }

    public void calis() {
        try {
            cokCalis();
            System.out.println("calis() metodu");
        } catch (IOException ex) {
            System.out.println("Hata Yakalandi-calis() =" + ex);
        }

    }

    public static void main(String args[]) {
        IstisnaOrnek3 io3 = new IstisnaOrnek3();
        io3.calis();
        System.out.println("main() metodu");
    }

}
