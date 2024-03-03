package com.effectivejava.tutorial.effectivejava.Chapter1_Object.item1_ConstructorYerineStaticKullan;

public class Barcelona {

    private String newPlayer;
    private int age;

    public Barcelona(String newPlayer, int age) {
        this.newPlayer = newPlayer;
        this.age = age;
    }

    public Barcelona(String newDirector) {
        this.newPlayer = newPlayer;
    }
    public static Barcelona produceNewPlayer(String newPlayer) {

        return new Barcelona(newPlayer, 22);
    }
}
