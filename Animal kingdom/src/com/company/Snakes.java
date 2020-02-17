package com.company;

public class Snakes extends Oviparous {
    int fanglength;
    int bodylength;
    String patterncolour;

    Snakes(String n, int w, int fl, int bl, String pc) {
        super(n, w);
        fanglength = fl;
        bodylength = bl;
        patterncolour = pc;
    }
}
