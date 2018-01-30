
package com.kodcu;

public class Kitap2 implements Comparable {

    private int sayfaSayisi;
    private String olcek;

    public Kitap2(int sayfa) {
        sayfaSayisi = sayfa;
        olcekBul();
    }

    private void olcekBul() {
        if ((sayfaSayisi > 0) && (sayfaSayisi < 100)) {
            olcek = "ince kitap";
        } else if ((sayfaSayisi > 100) && (sayfaSayisi < 300)) {
            olcek = "orta kitap";
        } else if ((sayfaSayisi > 300) && (sayfaSayisi < 800)) {
            olcek = "kalin kitap";
        } else if (sayfaSayisi > 800) {
            olcek = "cok kalin kitap";
        }
    }

    public String olcegiNedir() {
        return olcek;
    }

    public int sayfaSayisiNedir() {
        return sayfaSayisi;
    }

    public String toString() {
        return olcek;
    }

    public int compareTo(Object o) {

        Kitap2 k = (Kitap2) o;

        int sonuc = 0;

        if (this.sayfaSayisi < k.sayfaSayisiNedir()) {
            sonuc = -1;
        } else if (this.sayfaSayisi == k.sayfaSayisiNedir()) {
            sonuc = 0;
        } else if (this.sayfaSayisi > k.sayfaSayisiNedir()) {
            sonuc = 1;
        }
        return sonuc;
    }
}

