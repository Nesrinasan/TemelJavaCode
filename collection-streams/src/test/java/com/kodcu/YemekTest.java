package com.kodcu;


import com.kodcu.streams.Yemek;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class YemekTest {


    public void yemekleriTiplerineGoreAyristir() {

        // TODO
        String beklenenSonuc = "{BALIK=[kalamar, somon], DIGER=[kizarmis patates, pilav, meyve, pizza], ET=[rosto, biftek, tavuk]}";



    }

    public void vejeteryanOlupOlmadiklarinaGoreBolumle() {

        // TODO

        String beklenenSonuc = "{false=[rosto, biftek, tavuk, kalamar, somon], true=[kizarmis patates, pilav, meyve, pizza]}";
    }

    @Test
    public void kolariHesapla() {

        // TODO

        int kalori = Yemek.menu.stream().mapToInt(yemek -> yemek.getKalorisi()).sum();
        Assert.assertEquals(4300, kalori );

        Optional<Integer> kolariIki = Yemek.menu.stream().map(yemek -> yemek.getKalorisi()).reduce(Integer::sum);
        kolariIki.ifPresent(System.out::print);
        Assert.assertEquals(4300, kolariIki.get().intValue() );

    }
}
