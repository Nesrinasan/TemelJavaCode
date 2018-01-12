
class Polis {

    private final void sucluYakala() {
        System.out.println("Polis.sucluYakala()");
    }
}

public class SivilPolis extends Polis {

    public static void main(String[] args) {

        new SivilPolis().sucluYakala();

    }

    public void sucluYakala() {
        System.out.println("SivilPolis.sucluYakala()");
    }
}
