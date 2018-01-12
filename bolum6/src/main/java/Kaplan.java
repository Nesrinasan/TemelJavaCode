class Kedi {

    public void yakalaAv() {
        System.out.println("Kedi sinifi Av yakaladi");
    }

}

class Kaplan extends Kedi {

    public static void goster(Kedi k) {
        k.yakalaAv();
    }


    public static void main(String args[]) {
        Kedi k = new Kedi();
        Kaplan kp = new Kaplan();
        goster(k);
        goster(kp);     // yukari dogru cevirim (upcasting)
    }
}

