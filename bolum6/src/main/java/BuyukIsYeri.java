
class Calisan {
    public String pozisyon;

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

class GenelMudur extends Mudur {

    public GenelMudur() { // yapilandirici
        pozisyon = "GenelMudur";
    }

    public void calis() {  // iptal etme (override)
        System.out.println("GenelMudur Calisiyor");
    }

    public void toplantiYonet() {  // iptal etme (override)
        System.out.println("GenelMudur toplanti yonetiyor");
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

class AnalizProgramci extends Programci {

    public AnalizProgramci() { // yapilandirici
        pozisyon = "AnalizProgramci";
    }

    public void analizYap() {
        System.out.println("Analiz Yapiliyor");
    }
}

class SistemProgramci extends Programci {

    public SistemProgramci() { // yapilandirici
        pozisyon = "SistemProgramci";
    }

    public void sistemIncele() {
        System.out.println("Sistem Inceleniyor");
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


class Sekreter extends Calisan {

    public Sekreter() { // yapilandirici
        pozisyon = "Sekreter";
    }

    public void calis() { // iptal etme (override)
        System.out.println("Sekreter Calisiyor");
    }
}


public class BuyukIsYeri {

    public static void mesaiBasla(Calisan[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i].calis(); // ! Dikkat !
        }
    }

    public static void main(String args[]) {
        Calisan[] c = new Calisan[7];
        c[0] = new Calisan(); // yukari dogru cevirim gerekmiyor
        c[1] = new Programci(); //yukari dogru cevirim (upcasting)
        c[2] = new Pazarlamaci();     //yukari dogru cevirim (upcasting)
        c[3] = new Mudur();  //yukari dogru cevirim (upcasting)
        c[4] = new GenelMudur();  //yukari dogru cevirim (upcasting)
        c[5] = new AnalizProgramci(); //yukari dogru cevirim (upcasting)
        c[6] = new SistemProgramci();//yukari dogru cevirim (upcasting)
        mesaiBasla(c);
    }
}

