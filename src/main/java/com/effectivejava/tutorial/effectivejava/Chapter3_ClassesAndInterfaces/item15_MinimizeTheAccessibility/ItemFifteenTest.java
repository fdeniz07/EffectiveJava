package com.effectivejava.tutorial.effectivejava.Chapter3_ClassesAndInterfaces.item15_MinimizeTheAccessibility;

public class ItemFifteenTest {

    public static void main(String[] args) {

        Futbol fb = new Futbol("FenerBahce", 35);

        fb.setTakımOyuncuSayısı(-35);


        Time t = new Time(10, 11);

    }
}
