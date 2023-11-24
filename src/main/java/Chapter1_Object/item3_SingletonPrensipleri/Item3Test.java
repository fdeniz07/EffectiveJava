package Chapter1_Object.item3_SingletonPrensipleri;

public class Item3Test {
    public static void main(String[] args) {

        DefineSingleton ds = DefineSingleton.ds;
        DefineSingleton ds2 = DefineSingleton.getInstance();

        System.out.println(ds.hashCode());
        System.out.println(ds2.hashCode());

        // Not: 2 Thread ayni anda devreye girdiginde Lazy de singleton prensibi korunamiyor. Ancak Eager ve Enum da korunuyor.
        // Not: Eager ile daha kullanilmasa bile olusma asamasinda hafizada(Heapde) yer kapliyor. Enum ise hem temiz hem de hizli

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {

                }
                System.out.println("HashCode of Lazy:" + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager:" + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum:" + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("HashCode of Lazy:" + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager:" + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum:" + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();
    }
}
