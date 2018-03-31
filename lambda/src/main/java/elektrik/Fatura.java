package elektrik;

public final class Fatura {

    private final String date;
    private final int tutar;

    public Fatura(String date, int tutar) {
        this.date = date;
        this.tutar = tutar;
    }

    public String getDate() {
        return date;
    }

    public int getTutar() {
        return tutar;
    }
}
