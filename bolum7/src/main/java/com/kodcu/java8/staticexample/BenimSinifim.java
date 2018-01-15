package com.kodcu.java8.staticexample;

public class BenimSinifim implements Interface1, Interface2 {

    @Override
    public void method2() {
    }

    @Override
    public void method1(String str) {
    }



    public static void main(String args[]) {
        BenimSinifim benimSinifim = new BenimSinifim();

        Interface1.log(   "Hello"); // class seviyesinde bir ayrim var.
    }
}