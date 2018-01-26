package com.kodcu;

public class TekrarFirlatimOrnek2 {


    public void cokCalis() throws Exception {
        try {
            throw new Exception("oylesine bir istisna");
        } catch(Exception ex) {
            System.out.println("cokCalis() istisna yakalandi : " + ex);
            throw ex ; // dikkat 
        }
    } 


    public void calis() throws Throwable {
        try {
            cokCalis();
        } catch(Exception ex) {
            System.out.println("calis() istisna yakalandi : " + ex);
            throw ex.fillInStackTrace() ; // dikkat 

        } 
    }


    public void basla() {
        try {
            calis();
        } catch(Throwable th) {
            th.printStackTrace(); // dokum
        } 
    }

    public static void main(String args[]) {
        TekrarFirlatimOrnek2 tfo2 = new TekrarFirlatimOrnek2();
        tfo2.basla();
    }  
}
