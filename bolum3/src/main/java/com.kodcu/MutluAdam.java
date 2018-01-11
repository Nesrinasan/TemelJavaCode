package com.kodcu;

public class MutluAdam {

    private String ruh_hali = "Mutluyum" ;  

     public static void main(String[] args) {
        MutluAdam obj1 = new MutluAdam();
        MutluAdam obj2 = new MutluAdam();

        obj1.ruhHaliniYansit();
        obj2.ruhHaliniYansit();

            obj1.kucakla();
        obj2.tokatAt();

        obj1.ruhHaliniYansit();
        obj2.ruhHaliniYansit();

     }

    public void ruhHaliniYansit() {
        System.out.println("Ben  " + ruh_hali);
    }

    public void tokatAt() {
        if (ruh_hali.equals("Mutluyum")) {
            ruh_hali = "Sinirlendim";
        }
    }

    public void kucakla() {
        if (ruh_hali.equals("Sinirlendim")) {
            ruh_hali = "Mutluyum";
        }
    }
}


