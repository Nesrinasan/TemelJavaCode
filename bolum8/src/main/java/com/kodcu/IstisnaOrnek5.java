package com.kodcu;

import java.io.*;

public class IstisnaOrnek5 {

    public void cokCalis() throws IOException {
        File f = new File("a.txt");
        BufferedReader bf = new BufferedReader( new FileReader( f ) );
        System.out.println(bf.readLine());   
    }

    public void calis() throws IOException {
        cokCalis();
        System.out.println("calis() metodu");
    }

    public static void main(String args[]) throws IOException {
        IstisnaOrnek5 io5 = new IstisnaOrnek5();
        io5.calis();
        System.out.println("main() metodu");
    }
}
