package Chapter1_Object.item1_ConstructorYerineStaticKullan;

public class Yemek {

    String name;

//    public Yemek(boolean soguk) {
//
//    }

    public static Yemek sogukYemek(String name) {
        //Soguk Yemek
        return new Meze();
    }

    public static Yemek sicakYemek(String name) {
        //Sicak Yemek
        return new Pide();
    }
}
