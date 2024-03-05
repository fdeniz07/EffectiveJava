package com.effectivejava.tutorial.effectivejava.Chapter2and3_CommonMethodsToAllObjects.item12_equals_hashCode;

public class Virus {

    public String virus() {
        String virusUrl = "kötühaberler.com";
        GuvenliKod.ANLASMALI_SITELER[0] = virusUrl;
        GuvenliKod.haberleriAl(virusUrl);

        return "";
    }
}
