package com.effectivejava.tutorial.effectivejava.Chapter1_Object.item2_BuilderPattern;

public class Item2Test {

    public static void main(String[] args) {

        // Telescope Pattern Örnekleri
//        KahveDunyasi kd1 = new KahveDunyasi("büyük boy");
//        KahveDunyasi kd2 = new KahveDunyasi("büyük boy","az");
//        KahveDunyasi kd3 = new KahveDunyasi("büyük boy", "cok","olsun");


        // Java Beans Pattern Örnekleri
//        KahveDunyasi kd1 = new KahveDunyasi();
//        kd1.setKahveBoyutu("kücük");
//        kd1.setLaktozsuzSutMiktari("az");
//        int x = 10;
//        kd1.setYumusatici("olmasin");

        // Builder Pattern Örnekleri
        KahveDunyasi kd1 = new KahveDunyasi.Builder("kücük").build();
        KahveDunyasi kd2 = new KahveDunyasi.Builder("orta").laktozsuzSutSecenegi("az").build();
        KahveDunyasi kd3 = new KahveDunyasi.Builder("kücük").yumusaticiSecenegi("olsun").build();
        KahveDunyasi kd4 = new KahveDunyasi.Builder("büyük").yumusaticiSecenegi("olsun").laktozsuzSutSecenegi("az").build();
    }
}
