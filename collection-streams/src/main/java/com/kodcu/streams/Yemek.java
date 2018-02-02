package com.kodcu.streams;

import java.util.Arrays;
import java.util.List;

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

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return ismi;
    }

    public static final List<Yemek> menu =
            Arrays.asList( new Yemek("rosto", false, 800, Yemek.Type.MEAT),
                           new Yemek("biftek", false, 700, Yemek.Type.MEAT),
                           new Yemek("tavuk", false, 400, Yemek.Type.MEAT),
                           new Yemek("kizarmis patates", true, 530, Yemek.Type.OTHER),
                           new Yemek("pilav", true, 350, Yemek.Type.OTHER),
                           new Yemek("meyve", true, 120, Yemek.Type.OTHER),
                           new Yemek("pizza", true, 550, Yemek.Type.OTHER),
                           new Yemek("kalamar", false, 400, Yemek.Type.FISH),
                           new Yemek("somon", false, 450, Yemek.Type.FISH));
}