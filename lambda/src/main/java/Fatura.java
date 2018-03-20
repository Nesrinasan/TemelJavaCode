public class Fatura {

    private int faturaMiktar;
    private  String tarih ;


    public Fatura(int faturaMiktar, String tarih){
        this.faturaMiktar = faturaMiktar;
        this.tarih = tarih ;
    }

    public int getFaturaMiktar() {
        return faturaMiktar;
    }

    public void setFaturaMiktar(int faturaMiktar) {
        this.faturaMiktar = faturaMiktar;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "  fatura Miktar  : "   + faturaMiktar + " tarih : "  + tarih ;
    }
}
