package com.kodcu;

public class Kitap {

    private int sayfaSayisi;
    private String kitabinAdi;
    private String olcek;

    public Kitap(String kitabinAdi, int sayfa) {
        sayfaSayisi = sayfa;
        olcekBul();
    }

    public Kitap(int sayfa) {
        sayfaSayisi = sayfa;
        olcekBul();
    }

    private void olcekBul() {
        if ((sayfaSayisi > 0) && (sayfaSayisi <= 100)) {
            olcek = "ince kitap";
        } else if ((sayfaSayisi > 100) && (sayfaSayisi <= 300)) {
            olcek = "orta kitap";
        } else if ((sayfaSayisi > 300) && (sayfaSayisi <= 800)) {
            olcek = "kalin kitap";
        } else if (sayfaSayisi > 800) {
            olcek = "cok kalin kitap";
        }
    }

    public String olcegiNedir() {
        return olcek;
    }

    public String toString() {
        return olcek;
    }

    public String getKitabinAdi() {
        return kitabinAdi;
    }

    public void setKitabinAdi(String kitabinAdi) {
        this.kitabinAdi = kitabinAdi;
    }
}
