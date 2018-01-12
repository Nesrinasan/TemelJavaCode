
abstract class Sporcu {
    public Sporcu() {    // yapilandirici metod
        System.out.println("calis() cagrilmadan evvel");
        calis();    // ! Dikkat !
        System.out.println("calis() cagrildiktan sonra");
    }

    public abstract void calis();
}

class Futbolcu extends Sporcu {
    int antraman_sayisi = 4;

    public Futbolcu() { // yapilandirici metod
        System.out.println("Futbolcu yapilandirici");
        calis();
    }

    public void calis() {
        System.out.println("Futbolcu calis() " + antraman_sayisi);
    }
}

public class Spor {
    public static void main(String args[]) {
        Futbolcu f = new Futbolcu();
        // Sporcu s = new Sporcu(); // ! Hata  soyut sinif !
    }
}
