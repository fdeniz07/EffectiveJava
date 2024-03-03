package com.effectivejava.tutorial.effectivejava.Chapter1_Object.item7_MemoryManagement;

public class GarbageCollection {

    public void finalize()
    {
        System.out.println("Çöpler temizlendi.");
    }

    public static void main(String[] args) {
        GarbageCollection ali = new GarbageCollection();
        GarbageCollection mehmet = new GarbageCollection();
        GarbageCollection sıla = new GarbageCollection();

        ali = null;
        sıla = mehmet;
        System.gc();
    }
}
