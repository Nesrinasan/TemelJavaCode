package com.kodcu;


public class ReturnOrnek { 

    public void calis(int deger) {
        try {
            System.out.println("calis metodu cagrildi, gelen deger : " + deger);
            if(deger == 0) {
                return ; // metodu sessizce terk et
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
          ReturnOrnek ro = new ReturnOrnek();
          ro.calis(1);
          ro.calis(0); // dikkat
    }
}
