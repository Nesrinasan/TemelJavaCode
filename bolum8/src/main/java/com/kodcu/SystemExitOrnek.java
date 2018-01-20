package com.kodcu;

public class SystemExitOrnek {

    public void calis(int deger) {
        try {
            System.out.println("calis metodu cagrildi, gelen deger : " + deger);
            if(deger == 0) {
                System.exit(-1) ; // JVM'i kapat
            }
            System.out.println("-- calis metodu normal bir sekilde bitti--");
        } catch (Exception ex) {
            System.out.println("catch blogu icerisinde");      
        } finally {
            System.out.println("finally blogu cagrildi");
            System.out.println("----------------------");

        }
    }


    public static void main(String args[]) {
          SystemExitOrnek seo = new SystemExitOrnek();
          seo.calis(1);
          seo.calis(0); // dikkat
    }
}
