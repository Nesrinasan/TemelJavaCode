package com.kodcu;

import java.io.*;

class C {

    public void basla() throws  IOException {
	// ...
    } 
}     

public class CD extends C  {
    public void basla() {
	//...
    }
}

class Test {
    public static void main(String args[] ) {
        C c = new CD();
        //c.basla();


    }
}
