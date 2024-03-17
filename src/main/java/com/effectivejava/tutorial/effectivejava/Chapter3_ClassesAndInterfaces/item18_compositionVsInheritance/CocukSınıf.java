package com.effectivejava.tutorial.effectivejava.Chapter3_ClassesAndInterfaces.item18_compositionVsInheritance;

public class CocukSınıf extends AnaSinif{

    final int deger;

    public CocukSınıf(int deger) {
        this.deger = deger;
    }

    @Override
    void overrideMe() {
        // TODO Auto-generated method stub
        System.out.println(deger);
    }

    public static void main(String[] args) {

        CocukSınıf cocuk = new CocukSınıf(42);

    }
}