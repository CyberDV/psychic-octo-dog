package com.company;

public class Seaturtles extends Turtles {
    int age;
    int shellvolume;

    Seaturtles(String n, int w, int a, int sv) {
        super(n, w);
        age = a;
        shellvolume = sv;
    }
}