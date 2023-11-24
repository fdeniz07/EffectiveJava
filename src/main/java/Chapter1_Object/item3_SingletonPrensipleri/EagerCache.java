package Chapter1_Object.item3_SingletonPrensipleri;

import java.util.HashMap;

public class EagerCache implements Cache {

    private static final EagerCache instance = new EagerCache();
    private HashMap<Object, Object> map;

    private EagerCache() {
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

    // Eager daha olusmadan implemente eder, lazy ise sadece cagrildigi zaman instance olusturur.
    public static EagerCache getInstance() {
        return instance;
    }
}
