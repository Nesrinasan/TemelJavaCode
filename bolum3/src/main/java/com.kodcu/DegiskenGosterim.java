package com.kodcu;

public class DegiskenGosterim {

    private int x; //nesneye ait global alan
    static int y; // sinifa ait global alan

    public void metod() {
        int i; //yerel degisken
        //static int y = 5 ;  // yanlis
        x = 5 ;
    }
}

class Mouse {
    public static void main(String args[]) {
        DegiskenGosterim d = new DegiskenGosterim();

    }
}
