package com.effectivejava.tutorial.effectivejava.Chapter3_ClassesAndInterfaces.item21_abstractVsInterface;

public interface SarkiYazari {

    public void sarkiYaz();

    default boolean siirYazabiliyormusun()
    {
        return true;
    }
}
