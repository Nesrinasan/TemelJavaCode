class Telefon {

    protected void aramaYap() {
        System.out.println("Telefon.aramaYap()");
    }
}

class CepTelefonu extends Telefon {

    private void aramaYap() {
        System.out.println("CepTelefon.aramaYap()");
    }
}
