package elektrik;

public final class Musteri {

    private final int borc ;
    private final String semt;

    public Musteri(int borc, String semt) {
        this.borc = borc;
        this.semt = semt;
    }


    public int getBorc() {
        return borc;
    }

    public String getSemt() {
        return semt;
    }
}
