package com.kodcu.streams.advanced;

import com.kodcu.streams.Yemek;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.function.BinaryOperator;

import static com.kodcu.streams.Yemek.menu;
import static java.util.stream.Collectors.*;


public class Ozet {

    public static void main(String ... args) {
        System.out.println("Yemeklerin adeti : " + kacAdetYemekVar());
        System.out.println("En Kalorili Yemek : " + enKaloriliYemek());
        System.out.println("Comparator kullanarak en kalorili yemegi bul : " + enKaloriliYemekComparator());
        System.out.println("Menu icindeki toplam kalori: " + toplamKaloriyiHesapla());
        System.out.println("Average kalori: " + toplamAvarageKaloriyiHesapla());
        System.out.println("Menu istatistikleri: " + calculateMenuStatistics());

    }


    private static long kacAdetYemekVar() {
        return menu.stream().collect(counting());
    }

    private static Yemek enKaloriliYemek() {
        return menu.stream().collect(reducing((d1, d2) -> d1.getKalorisi() > d2.getKalorisi()? d1 : d2)).get();
    }

    private static Yemek enKaloriliYemekComparator() {
        Comparator<Yemek> YemekCaloriesComparator = Comparator.comparingInt(Yemek::getKalorisi);
        BinaryOperator<Yemek> moreCaloricOf = BinaryOperator.maxBy(YemekCaloriesComparator);
        return menu.stream().collect(reducing(moreCaloricOf)).get();
    }

    private static int toplamKaloriyiHesapla() {
        return menu.stream().collect(summingInt(Yemek::getKalorisi));
    }

    private static Double toplamAvarageKaloriyiHesapla() {
        return menu.stream().collect(averagingInt(Yemek::getKalorisi));
    }

    private static IntSummaryStatistics calculateMenuStatistics() {
        return menu.stream().collect(summarizingInt(Yemek::getKalorisi));
    }


}
