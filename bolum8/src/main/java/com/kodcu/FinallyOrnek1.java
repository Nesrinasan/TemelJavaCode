package com.kodcu;

public class FinallyOrnek1 {

    public static void a(int deger) throws SeninHatan {
        if(deger < 0 ) {
            throw new SeninHatan();
        }
    }


    public void hesapla() {

        for(int i=-1 ; i < 1 ; i++ ) {
            try { 
                System.out.println("a() cagriliyor"); 
                a(i);
            } catch(SeninHatan shEx) {
                System.out.println("SeninHatan olustu : " + shEx);

            } finally {
                System.out.println("finally blogu calistirildi");
            }
        }
    }

    public static void main(String args[]) {
        FinallyOrnek1 fo1 = new FinallyOrnek1();
        fo1.hesapla();
    }

}
