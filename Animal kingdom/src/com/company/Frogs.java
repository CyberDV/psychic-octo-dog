package com.company;

public class Frogs extends Oviparous {
    int leglength;
    int tonguelength;

    Frogs(String n, int w, int ll, int tl) {
        super(n, w);
        tonguelength = tl;
        leglength = ll;
    }
}
