package com.effectivejava.tutorial.effectivejava.Chapter1_Object.item5_DependencyInjection;

public class YaziAnaliziSingleton {

    private static final Sozluk turkce = new Sozluk("Türkce");
    public static final YaziAnaliziSingleton INSTANCE = new YaziAnaliziSingleton();

    private YaziAnaliziSingleton() {
    }

    public static boolean isValid() {
        return true;
    }
}
