class KontrolMerkezi {

    public static void checkUp(Sporcu s) {
        // ..
        s.calis();
    }
}

class Sporcu {

    public void calis() {
        System.out.println("Sporcu.calis()");
    }
}

class Futbolcu extends Sporcu {

    public static void main(String args[]) {

        Sporcu s = new Sporcu();
        Futbolcu f = new Futbolcu();
        KontrolMerkezi.checkUp(s);
        KontrolMerkezi.checkUp(f);
    }

    public void calis() {  // iptal etme (Overriding)
        System.out.println("Futbolcu.calis()");
    }
}
