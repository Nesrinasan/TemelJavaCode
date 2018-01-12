class Kitap {

    public int sayfaSayisiOgren() {
        System.out.println("Kitap - sayfaSayisiOgren() ");
        return 440;
    }

    public double fiyatOgren() {
        System.out.println("Kitap - fiyatOgren() ");
        return 2500000;
    }

    public String yazarIsmiOgren() {
        System.out.println("Kitap - yazarIsmiOgren() ");
        return "xy";
    }
}

class Roman extends Kitap {

    public static void main(String args[]) {

        Roman r = new Roman();
        int sayfasayisi = r.sayfaSayisiOgren();
        double fiyat = r.fiyatOgren();
        String yazar = r.yazarIsmiOgren();
    }
}
