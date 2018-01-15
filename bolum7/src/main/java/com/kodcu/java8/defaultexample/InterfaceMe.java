package com.kodcu.java8.defaultexample;

public interface InterfaceMe {

    void methodMe();

    default void logMe(String str){
        System.out.println("Me logging::"+str);
    }

}