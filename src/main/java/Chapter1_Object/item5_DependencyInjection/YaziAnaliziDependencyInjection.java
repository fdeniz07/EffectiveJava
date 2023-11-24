package Chapter1_Object.item5_DependencyInjection;

public class YaziAnaliziDependencyInjection {

    private final Sozluk sozluk_;

    public YaziAnaliziDependencyInjection(Sozluk sozluk) {
        //this.sozluk = sozluk;
        sozluk_ = sozluk; //this.sozluk kullanimi yerine sozluk_ yazilabilir.
    }

    public boolean isValid() {
        return true;
    }
}
