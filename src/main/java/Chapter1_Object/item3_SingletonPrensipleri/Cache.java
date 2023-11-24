package Chapter1_Object.item3_SingletonPrensipleri;

public interface Cache<F, S> {

    public void put(F key, S value);

    public S get(F key);
}
