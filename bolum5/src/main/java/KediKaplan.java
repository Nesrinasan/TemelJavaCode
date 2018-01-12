

class Kedi {

    protected int ayakSayisi = 4;

    public static void main(String args[]) {
        Kedi kd = new Kedi();
        kd.avYakala();
    }

    public void avYakala() {
        System.out.println("Kedi sinifi Av yakaladi");
    }

}

class Kaplan extends Kedi {

    public static void main(String args[]) {
        Kaplan kp = new Kaplan();
        kp.avYakala();
        System.out.println("Ayak Sayisi = " + kp.ayakSayisi);
    }
}