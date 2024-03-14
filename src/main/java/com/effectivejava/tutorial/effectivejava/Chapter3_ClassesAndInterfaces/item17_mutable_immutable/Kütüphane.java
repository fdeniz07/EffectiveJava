package com.effectivejava.tutorial.effectivejava.Chapter3_ClassesAndInterfaces.item17_mutable_immutable;

import java.util.List;

public class Kütüphane {

    private final List<Kitap> kitaplar;

    public Kütüphane(List<Kitap> kitaplar) {
        // TODO Auto-generated constructor stub
        this.kitaplar = kitaplar;
    }

    public List<Kitap> kütüphanedekiTümKitaplar() {
        return kitaplar;
    }
}
