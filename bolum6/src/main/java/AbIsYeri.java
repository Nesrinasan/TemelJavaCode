package main.java;

abstract class Calisan {

    public String pozisyon = "Calisan";

    public abstract void calis();

    public void zamIste() {
        System.out.println("Calisan zamIste");
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

    public void zamIste() {  // iptal etme (override)
        System.out.println("Programci Zam Istiyor");
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


public class AbIsYeri {

    public static void mesaiBasla(Calisan[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i].calis(); // !Dikkat!
        }

    }

    public static void main(String args[]) {
        Calisan[] c = new Calisan[3];
        // c[0] = new Calisan(); // soyut siniflar new ile direk olusturulamazlar
        c[0] = new Programci(); // yukari dogru cevirim (upcasting)
        c[1] = new Pazarlamaci(); // yukari dogru cevirim (upcasting)
        c[2] = new Mudur(); // yukari dogru cevirim (upcasting)

        mesaiBasla(c);
    }
}
