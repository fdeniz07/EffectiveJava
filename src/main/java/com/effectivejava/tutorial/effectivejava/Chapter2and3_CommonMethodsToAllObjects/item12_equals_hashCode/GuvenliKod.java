package com.effectivejava.tutorial.effectivejava.Chapter2and3_CommonMethodsToAllObjects.item12_equals_hashCode;

public abstract class GuvenliKod {

    public static final String[] ANLASMALI_SITELER = new String[] { "http://hızlıguvenlitemizhaber.com",
            "http://engercekciharikahaberler.com" };

    // this method allows untrusted code to connect to allowed sites (only)
    public static void haberleriAl(String url) {
        for (String haberler : ANLASMALI_SITELER) {
            if (url.equals(haberler)) {
                // Yap bişeyler
            }
        }
    }

    public static final String a = "a";

    public abstract void mesaj();

}
