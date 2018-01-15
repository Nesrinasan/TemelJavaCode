package com.kodcu.java8.defaultexample;

public class BenimSinifim implements InterfaceMe, InterfaceYou {


    public static void main(String args[]) {
        BenimSinifim benimSinifim = new BenimSinifim();
        benimSinifim.logMe(   "Hello");
    }

    @Override
    public void methodMe() {

    }

    @Override
    public void methodYou() {

    }

    /**
     * Default ozellik eziliyor.
     * @param str
     */
    /*
    @Override
    public void logMe(String str) {
        System.out.println("Its my Logging ::"+str);
    }*/

}