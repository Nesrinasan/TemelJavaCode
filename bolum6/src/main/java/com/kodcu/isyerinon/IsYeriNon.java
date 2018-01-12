package com.kodcu.isyerinon;

class Calisan {
    public String pozisyon = "Calisan";

    public void calis() {
    }
}

class Mudur {

    public String pozisyon = "Mudur";

    public Mudur() { // yapilandirici
        pozisyon = "Mudur";
    }

    public void calis() {
        System.out.println("Mudur Calisiyor");
    }
}

class Programci {

    public String pozisyon = "Programci";

    public Programci() {  // yapilandirici
        pozisyon = "Programci";
    }

    public void calis() {
        System.out.println("Programci Calisiyor");
    }
}

class Pazarlamaci {

    public String pozisyon = "Pazarlamaci";

    public Pazarlamaci() {    // yapilandirici
        pozisyon = "Pazarlamaci";
    }

    public void calis() {  // iptal etme (override)
        System.out.println("Pazarlamaci Calisiyor");
    }
}


public class IsYeriNon {

    public static void mesaiBasla(Object[] o) {

        for (int i = 0; i < o.length; i++) {

            if (o[i] instanceof Calisan) {
                Calisan c = (Calisan) o[i]; // asagiya dogru cevirim
                c.calis();

            } else if (o[i] instanceof Mudur) {
                Mudur m = (Mudur) o[i]; // asagiya dogru cevirim
                m.calis();

            } else if (o[i] instanceof Programci) {
                Programci p = (Programci) o[i]; // asagiya dogru cevirim
                p.calis();
            } else if (o[i] instanceof Pazarlamaci) {
                Pazarlamaci paz = (Pazarlamaci) o[i]; // asagiya dogru cevirim
                paz.calis();
            }

            //...
        }
    }

    public static void main(String args[]) {

        Object[] o = new Object[4];
        o[0] = new Calisan();     // yukari dogru cevirim (upcasting)
        o[1] = new Programci();      // yukari dogru cevirim (upcasting)
        o[2] = new Pazarlamaci(); // yukari dogru cevirim (upcasting)
        o[3] = new Mudur();          // yukari dogru cevirim (upcasting)
        mesaiBasla(o);
    }
}

