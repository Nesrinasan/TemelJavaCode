
class Hayvan {
    public void avYakala() {
        System.out.println("Hayvan avYakala");
    }
}

class Kartal extends Hayvan {
    public void avYakala() {
        System.out.println("Kartal avYakala");
    }
}

class Timsah extends Hayvan {
    public void avYakala() {
        System.out.println("Timsah avYakala");
    }
}

public class PolimorfizmOrnekIki {


    public static Hayvan rasgeleSec() {
        int sec = ((int) (Math.random() * 3));
        Hayvan h = null;
        if (sec == 0) h = new Hayvan();
        if (sec == 1) h = new Kartal();
        if (sec == 2) h = new Timsah();
        return h;
    }

    public static void main(String args[]) {
        Hayvan[] h = new Hayvan[3];
        // diziyi doldur
        for (int i = 0; i < 3; i++) {
            h[i] = rasgeleSec();
        }
        // dizi elemanlarini ekrana bas
        for (int j = 0; j < 3; j++) {
            h[j].avYakala();
        }
    }
}
