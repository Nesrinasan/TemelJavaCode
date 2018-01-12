class Kedi2 {

    public final void yakalaAv() {
        System.out.println("Kedi sinifi Av yakaladi");
    }

}

class Kaplan2 extends Kedi2 {

    public static void goster(Kedi2 k) {
        // k.yakalaAv();  // ! polimorfizm yok !
    }

    /* // iptal edemez (override)
    public void yakalaAv() {
		System.out.println("Kaplan sinifi Av yakaladi");
    }
    */
    public static void main(String args[]) {
        Kedi2 k = new Kedi2();
        Kaplan2 kp = new Kaplan2();
        goster(k); //upcasting
        goster(kp);  //upcasting
    }
}

