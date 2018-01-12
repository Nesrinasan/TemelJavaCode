

class Insan {

    public Insan(int par) {
        System.out.println("Insan Yapilandiricisi " + par);
    }
}

class ZekiInsan extends Insan {

    public ZekiInsan(int par) {

        super(par + 1);
        System.out.println("ZekiInsan Yapilandiricisi " + par);

    }
}

class Hacker extends ZekiInsan {

    public Hacker(int par) {

        super(par + 1);
        System.out.println("Hacker Yapilandiricisi " + par);
    }

    public static void main(String args[]) {
        Hacker hck = new Hacker(5);
    }
}