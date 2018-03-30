package elektrik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MusteriUtil {


    public static List<Musteri> binTlAltindaKalanlar(List<Musteri> musteriList) {

        List<Musteri> sonuc = new ArrayList<>();
        for(Musteri musteri: musteriList) {
            if(musteri.getBorc() < 1000) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }

    public static List<Musteri> erenkoyOturanlar(List<Musteri> musteriList) {
        List<Musteri> sonuc = new ArrayList<>();
        for(Musteri musteri: musteriList) {
            if(musteri.getSemt().equalsIgnoreCase("erenkoy")) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }


    public static List<Musteri> filter(Kural kural, List<Musteri> musteriList) {
        List<Musteri> sonuc = new ArrayList<>();
        for(Musteri musteri: musteriList) {
            if(kural.uygula(musteri, musteri)) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }


    public static List<Musteri> filterPredicate(Predicate<Musteri> predicate, List<Musteri> musteriList) {
        List<Musteri> sonuc = new ArrayList<>();
        for(Musteri musteri: musteriList) {
            if(predicate.test(musteri)) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }


    public static List<Musteri> filterFunction(Function<Musteri, Boolean> function,
                                               List<Musteri> musteriList) {
        List<Musteri> sonuc = new ArrayList<>();
        for(Musteri musteri: musteriList) {
            if(function.apply(musteri)) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }
}
