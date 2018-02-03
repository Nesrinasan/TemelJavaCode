package com.kodcu.streams;

import java.util.Arrays;
import java.util.List;

import static com.kodcu.streams.Yemek.Type.BALIK;
import static com.kodcu.streams.Yemek.Type.DIGER;
import static com.kodcu.streams.Yemek.Type.ET;

public class Yemek {

    private final String ismi;
    private final boolean vegetarian;
    private final int kalorisi;
    private final Type tipi;

    public Yemek(String ismi, boolean vegetarian, int kalorisi, Type tipi) {
        this.ismi = ismi;
        this.vegetarian = vegetarian;
        this.kalorisi = kalorisi;
        this.tipi = tipi;
    }

    public String getIsmi() {
        return ismi;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getKalorisi() {
        return kalorisi;
    }

    public Type getTipi() {
        return tipi;
    }

    public enum Type {ET, BALIK, DIGER}

    @Override
    public String toString() {
        return ismi;
    }

    public static final List<Yemek> menu =
            Arrays.asList( new Yemek("rosto", false, 800, ET),
                           new Yemek("biftek", false, 700, ET),
                           new Yemek("tavuk", false, 400, ET),
                           new Yemek("kizarmis patates", true, 530, DIGER),
                           new Yemek("pilav", true, 350, DIGER),
                           new Yemek("meyve", true, 120, DIGER),
                           new Yemek("pizza", true, 550, DIGER),
                           new Yemek("kalamar", false, 400, BALIK),
                           new Yemek("somon", false, 450, BALIK));
}