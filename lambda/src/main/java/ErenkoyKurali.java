public class ErenkoyKurali implements Kural{
    @Override
    public boolean uygulama(Musteri musteri) {
        if ("erenkoy".equalsIgnoreCase(musteri.getSemt())) {
            return true ;
        }

        return false;


    }


}
