
class Calisan {

    public void isYap(double a) {

        System.out.println("Calisan.isYap()");
    }
}


class Mudur extends Calisan {

    public static void main(String args[]) {

        Mudur m = new Mudur();
        m.isYap(3.3);
    }

    public void isYap(int a) {

        System.out.println("Mudur.isYap()");
    }
}


