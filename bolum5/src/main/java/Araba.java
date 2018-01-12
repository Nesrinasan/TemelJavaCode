

class ArabaMotoru {
    public void calis() {
    }

    public void dur() {
    }
}

class Pencere {
    public void asagiyaCek() {
    }

    public void yukariyaCek() {
    }
}

class Kapi {
    Pencere pencere = new Pencere();

    public void ac() {
    }

    public void kapa() {
    }
}


class Tekerlek {
    public void havaPompala(int olcek) {
    }

}

public class Araba {

    ArabaMotoru arbm = new ArabaMotoru();
    // 2 kapili spor bir araba olsun 
    Kapi sag_kapi = new Kapi();
    Kapi sol_kapi = new Kapi();
    Tekerlek[] tekerlekler = new Tekerlek[4];

    public Araba() {
        for (int i = 0; i < 4; i++)
            tekerlekler[i] = new Tekerlek();

    }

    public static void main(String args[]) {

        Araba araba = new Araba();
        araba.sag_kapi.pencere.yukariyaCek();
        araba.tekerlekler[2].havaPompala(70);
    }
}