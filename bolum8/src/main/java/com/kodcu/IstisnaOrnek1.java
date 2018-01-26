package com.kodcu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IstisnaOrnek1 {

    public void cokCalis() {

        File f = new File("ornek.txt");
        //BufferedReader bf = new BufferedReader(new FileReader(f));
        //System.out.println(bf.readLine());

    }

    public void calis() {
        cokCalis();
    }

    public static void main(String args[]) throws Exception {
        IstisnaOrnek1 io1 = new IstisnaOrnek1();
        io1.calis();
    }

}
