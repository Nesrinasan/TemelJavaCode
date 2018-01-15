package com.kodcu.hayvankartal;

class Hayvan {

    abstract class Kus {  
        public abstract void uc ();
        public abstract void kon();
    }

    public void avlan() {
       System.out.println("Hayvan avlaniyor...");
    }
}

class Kartal extends Hayvan.Kus {
    public void uc() {
       System.out.println("Kartal Ucuyor...");
    }
    public void kon() {
        System.out.println("Kartal Konuyor...");
    }

    
    // public Kartal() {  } // ! Hata !

    public Kartal(Hayvan hv) {
                hv.super();       //Dikkat
    }

    public static void main(String args[]) {
        Hayvan h = new Hayvan();  //Dikkat
        Kartal k = new Kartal(h);
        k.uc();
        k.kon();
    }
     
}
