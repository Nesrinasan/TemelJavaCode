package com.kodcu.televizyon3;

class Xmodel {
    public void sesAc() {
        System.out.println("X model televizyon sesAc()");
    }

    public void sesKapa() {
        System.out.println("X model televizyon sesKapa()");
    }

    public void kanalDegistir() {
        System.out.println("X model televizyon kanalDegistir()");
    }
}

class Ymodel extends Xmodel {
    public void sesAc() {  // iptal ediyor (override)
        System.out.println("Y model televizyon sesAc()");
    }

    public void sesKapa() {    // iptal ediyor (override)
        System.out.println("Y model televizyon sesKapa()");
    }

    public void kanalDegistir() {  // iptal ediyor (override)
        System.out.println("Y model televizyon kanalDegistir() ");
    }

    public void teleText() {
        System.out.println("Y model televizyon teleText()");
    }

}

public class Televizyon3 {
    public static void main(String args[]) {

        Object[] ob = new Object[2];
        ob[0] = new Xmodel();
        ob[1] = new Ymodel();

        for (int i = 0; i < ob.length; i++) {

            Object o = ob[i];
            if (o instanceof Ymodel) {    // RTTI
                Ymodel y_model_kumanda = (Ymodel) o; //artik guvenli
                y_model_kumanda.sesAc();
                y_model_kumanda.sesKapa();
                y_model_kumanda.kanalDegistir();
                y_model_kumanda.teleText();
            } else if (o instanceof Xmodel) { // RTTI
                Xmodel x_model_kumanda = (Xmodel) o; // artik guvenli
                x_model_kumanda.sesAc();
                x_model_kumanda.sesKapa();
                x_model_kumanda.kanalDegistir();

            }
        }

    }
}

