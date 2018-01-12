

class HesapMakinesi {

    void hesapla(double a, double b) {
        System.out.println("HesapMakinesi.hesapla()");
    }
}

class Bilgisayar extends HesapMakinesi {

    protected void hesapla(double a, double b) {
        System.out.println("HesapMakinesi.hesapla()");
    }
}
