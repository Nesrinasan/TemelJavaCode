package elektrik;

import java.util.List;

public final class Musteri {

    private final int borc ;
    private final String semt;
    private List<Fatura> faturalar ;

    public Musteri(int borc, String semt, List<Fatura> faturalar) {
        this.borc = borc;
        this.semt = semt;
        this.faturalar = faturalar;
    }


    public int getBorc() {
        return borc;
    }

    public String getSemt() {
        return semt;
    }
}
