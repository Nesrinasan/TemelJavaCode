package elektrik;

public class ErenkoydeOturanlarKurali implements Kural {
    @Override
    public boolean uygula(Musteri musteri) {
        if(musteri.getSemt().equalsIgnoreCase("erenkoy")) {
            return true;
        }
        return false;
    }
}
