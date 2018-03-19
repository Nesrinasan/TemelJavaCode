import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MusteriUtil {
    public static List<Musteri> filterByErenkoy(List<Musteri> musteriList) {

        List<Musteri> sonuc = new ArrayList<>();
        for (Musteri musteri : musteriList)  {
            if (musteri.getSemt().equalsIgnoreCase("erenkoy")) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }

    public static List<Musteri> filterByBinVeUzeri(List<Musteri> musteriList) {

        List<Musteri> sonuc = new ArrayList<>();
        for (Musteri musteri : musteriList)  {
            if (musteri.getBorc()> 999) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }

    public static List<Musteri> filter(Kural kural,List<Musteri> musteriList) {

        List<Musteri> sonuc = new ArrayList<>();



        for (Musteri musteri : musteriList)  {
            if (kural.uygulama(musteri) ) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }

    public static List<Musteri> filterPrediate(Predicate<Musteri> kural, List<Musteri> musteriList) {

        List<Musteri> sonuc = new ArrayList<>();


        for (Musteri musteri : musteriList)  {
            if (kural.test(musteri) ) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }
}
