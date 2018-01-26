package com.kodcu;

public class SeninHatan extends Exception {

    public SeninHatan() {
    }

    public SeninHatan(String aciklama) {
        super(aciklama); // dikkat
    }
}
