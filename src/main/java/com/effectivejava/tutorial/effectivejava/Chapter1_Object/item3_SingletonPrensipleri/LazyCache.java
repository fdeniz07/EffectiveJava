package com.effectivejava.tutorial.effectivejava.Chapter1_Object.item3_SingletonPrensipleri;

import java.util.HashMap;

public class LazyCache implements Cache {

    private static LazyCache instance;

    private HashMap<Object, Object> map;

    private LazyCache() {
        map = new HashMap<Object, Object>();
    }


    @Override
    public void put(Object key, Object value) {
        map = new HashMap<Object, Object>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    // Lazy tembel oldugu icin sadece cagrildiginda üretilir.
    public static LazyCache getInstance() {
        if (instance == null) {
            instance = new LazyCache();
        }
        return instance;
    }
}
