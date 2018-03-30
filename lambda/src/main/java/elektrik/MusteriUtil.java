package elektrik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
            if(kural.uygula(musteri)) {
                sonuc.add(musteri);
            }
        }
        return sonuc;
    }
}
