import java.util.List;

public class Musteri {

    private int borc;
    private String semt;
    List<Fatura> faturaList;


    public Musteri(int borc, String semt, List<Fatura> listOfFatura) {

        this.borc = borc;
        this.semt = semt;
        this.faturaList = listOfFatura;
    }

    public int getBorc() {
        return borc;
    }

    public String getSemt() {
        return semt;
    }
}
