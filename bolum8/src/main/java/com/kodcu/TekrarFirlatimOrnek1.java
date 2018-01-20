package com.kodcu;

public class TekrarFirlatimOrnek1 {


    public void cokCalis() throws Exception {
        try {
            throw new Exception("oylesine bir istisna");
        } catch(Exception ex) {
            System.out.println("cokCalis() istisna yakalandi : " + ex);
            throw ex ; // dikkat 
        }
    } 

    public void calis() throws Exception {
        try {
            cokCalis();
        } catch(Exception ex) {
            System.out.println("calis() istisna yakalandi : " + ex);
            throw ex ; // dikkat 

        }

    }

    public void basla() {
        try {
            calis();
        } catch(Exception ex) {
            ex.printStackTrace(); // dokum
        }

    }

    public static void main(String args[]) {
        TekrarFirlatimOrnek1 tfo1 = new TekrarFirlatimOrnek1();
        tfo1.basla();
    }

}
