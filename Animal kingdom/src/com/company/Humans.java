package com.company;

public class Humans extends Viviparous {
    int numberofteeth;
    String haircolour;
    String skintone;

    Humans(String n, int w, int nt, String hc, String st) {
        super(n, w);
        numberofteeth = nt;
        haircolour = hc;
        skintone = st;
    }
}
