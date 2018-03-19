public class BinVeUzeriKurali implements Kural{
    @Override
    public boolean uygulama(Musteri musteri) {
        if (musteri.getBorc()> 999)  {
            return true;
        }
        return false;
    }


}
