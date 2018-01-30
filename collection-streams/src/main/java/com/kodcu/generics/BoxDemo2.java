package com.kodcu.generics;

public class BoxDemo2 {

    public static void main(String[] args) {

        // ONLY place Integer objects 
        // into this box!
        Box integerBox = new Box();

        // Imagine this is one part of 
        // a large application
        // modified by one programmer. 
        // Note how the type is now 
        // String.
        integerBox.add("10");

        // ... and this is another, 
        // perhaps written by a 
        // different programmer
        Integer someInteger 
            = (Integer)integerBox.get();
        System.out.println(someInteger);
    }
}
