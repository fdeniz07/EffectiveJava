package com.effectivejava.tutorial.effectivejava.Chapter1_Object.item5_DependencyInjection;

public class Sozluk {

    private String dil;

    public Sozluk(String dil) {
        this.dil = dil;
    }

    @Override
    public String toString() {
        return dil;
    }
}
