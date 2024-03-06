package com.effectivejava.tutorial.effectivejava.Chapter2and3_CommonMethodsToAllObjects.item14_ShallowCopy;

import java.util.Comparator;

public class IsımKıyaslama  implements Comparator<Kitap> {

    public int compare(Kitap m1, Kitap m2) {
        return m1.getIsim().compareTo(m2.getIsim());
    }
}
