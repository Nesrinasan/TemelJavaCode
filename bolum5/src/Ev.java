

final class Televizyon {

    public void kanalBul() {
        System.out.println("Kanal bulunuyor.");
    }
}


class SuperTelevizyon extends Televizyon {

}


class Ev {

    int oda_sayisi = 5;
    Televizyon tv = new Televizyon();
    // Televizyon tv2 = new Televizyon() ;

    public static void main(String args[]) {

        Ev e = new Ev();
        e.tv.kanalBul();
    }

}

