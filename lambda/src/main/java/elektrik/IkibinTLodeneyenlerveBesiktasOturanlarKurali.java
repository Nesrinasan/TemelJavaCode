package elektrik;

public class IkibinTLodeneyenlerveBesiktasOturanlarKurali implements Kural {
    @Override
    public boolean uygula(Musteri musteri, Musteri musteri2) {
        if(musteri.getSemt().equalsIgnoreCase("besiktas")
                && (musteri.getBorc() == 2000)) {
            return true;
        }
        return false;
    }
}
