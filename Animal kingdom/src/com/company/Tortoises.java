package com.company;

public class Tortoises extends Turtles {
    int age;
    int shellvolume;
    Tortoises(String n, int w, int a, int sv) {
        super(n, w);
        age = a;
        shellvolume = sv;
    }
}
