package com.kodcu.isyeri;

class Calisan {
    public String pozisyon = "Calisan";

    public void calis() {
    }
}

class Mudur extends Calisan {

    public Mudur() { // yapilandirici
        pozisyon = "Mudur";
    }

    public void calis() {  // iptal etme (override)
        System.out.println("Mudur Calisiyor");
    }
}

class Programci extends Calisan {

    public Programci() { // yapilandirici
        pozisyon = "Programci";
    }

    public void calis() {  // iptal etme (override)
        System.out.println("Programci Calisiyor");
    }
}

class Pazarlamaci extends Calisan {

    public Pazarlamaci() { // yapilandirici
        pozisyon = "Pazarlamaci";
    }

    public void calis() { // iptal etme (override)
        System.out.println("Pazarlamaci Calisiyor");
    }
}


public class IsYeri {

    public static void mesaiBasla(Calisan[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i].calis(); // !Dikkat!
        }

    }

    public static void main(String args[]) {
        Calisan[] c = new Calisan[4];
        c[0] = new Calisan(); // yukari dogru cevirim gerekmiyor
        c[1] = new Programci(); // yukari dogru cevirim (upcasting)
        c[2] = new Pazarlamaci(); // yukari dogru cevirim (upcasting)
        c[3] = new Mudur(); // yukari dogru cevirim (upcasting)
        mesaiBasla(c);
    }
}
