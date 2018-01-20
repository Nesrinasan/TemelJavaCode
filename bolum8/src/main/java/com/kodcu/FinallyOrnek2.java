package com.kodcu;

public class FinallyOrnek2 {


    public static void main(String args[]) {

        try {
            System.out.println("1-  try blogu");
            try {
                System.out.println("2-  try blogu");
                throw new Exception();
            } finally {
                System.out.println("2-  finally blogu");
            }  

        } catch(Exception ex) {
            System.out.println("1-  catch blogu");
        } finally {
            System.out.println("1-  finally blogu");
        }
    }
}






