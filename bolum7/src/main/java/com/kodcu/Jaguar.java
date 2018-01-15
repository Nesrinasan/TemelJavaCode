package com.kodcu;

interface Kosabilme {
    public void kos();
}

interface DahaHizliKosabilme extends Kosabilme {
    public void dahaHizliKos();
}

interface Avlanabilme  extends DahaHizliKosabilme {
    public void avlan();
}


class RoadRunner implements DahaHizliKosabilme {
    
    public void kos() {
	System.out.println("RoadRunner kosuyor , bip ");
    }

    public void dahaHizliKos() {
	System.out.println("RoadRunner kosuyor , bip bippp");
    }
}
    
public class Jaguar implements Avlanabilme {
    public void avlan() {
	System.out.println("Juguar avlaniyor");
    }
    public void dahaHizliKos() {
	System.out.println("Juguar daha hizli kos");    
    }
    public void kos() {
	System.out.println("Juguar Kosuyor");
    }
}
