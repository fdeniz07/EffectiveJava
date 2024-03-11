package com.effectivejava.tutorial.effectivejava.Chapter3_ClassesAndInterfaces.item16_Encapsulation;

public class Immutable {

    private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    // read only
}
