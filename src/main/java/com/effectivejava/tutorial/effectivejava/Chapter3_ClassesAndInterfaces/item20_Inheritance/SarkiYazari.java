package com.effectivejava.tutorial.effectivejava.Chapter3_ClassesAndInterfaces.item20_Inheritance;

public interface SarkiYazari {

    public void sarkiYaz();

    default boolean siirYazabiliyormusun()
    {
        return true;
    }
}
