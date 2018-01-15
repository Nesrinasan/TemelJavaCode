package com.kodcu.java8.defaultexample;

public interface InterfaceYou {

    void methodYou();

    /**
     * TODO logYou > logMe cevir
     * @param str gelen parametre
     */
    default void logYou(String str){
        System.out.println("You logging::"+str);
    }

}