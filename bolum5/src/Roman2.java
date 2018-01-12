class Kitap2 {
    public int sayfaSayisiOgren() {
        System.out.println("Kitap2 - sayfaSayisiOgren() ");
        return 440;
    }

    public double fiyatOgren() {
        System.out.println("Kitap2 - fiyatOgren() ");
        return 2500000;
    }

    public String yazarIsmiOgren() {
        System.out.println("Kitap2 - yazarIsmiOgren() ");
        return "xy";
    }
}

class Roman2 extends Kitap2 {

    public static void main(String args[]) {
        Roman2 r2 = new Roman2();
        int sayfasayisi = r2.sayfaSayisiOgren();
        double fiyat = r2.fiyatOgren();
        String yazar = r2.yazarIsmiOgren();
    }

    public int sayfaSayisiOgren() {
        System.out.println("Roman2 - sayfaSayisiOgren() ");
        return 569;
    }

    public double fiyatOgren() {
        System.out.println("Roman2 - fiyatOgren() ");
        return 8500000;
    }
}
