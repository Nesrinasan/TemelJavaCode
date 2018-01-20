package com.kodcu;

public class BenimHatam extends Exception {

    private int id ;

    public BenimHatam() {
    }

    public BenimHatam(String aciklama) {
        super(aciklama);
    }

    public BenimHatam(String aciklama , int id) {
        super(aciklama); //dikkat
        this.id = id ;
    }

    @Override
    public String getLocalizedMessage() {  // iptal etme (override)

        switch(id) {
            case 0 : return "onemsiz hatacik" ;
            case 1 : return "hata" ;
            case 2 : return "! onemli hata !" ;
            default: return "tanimsiz hata";
        }

    }

    public int getId() {
        return id;
    }
}


