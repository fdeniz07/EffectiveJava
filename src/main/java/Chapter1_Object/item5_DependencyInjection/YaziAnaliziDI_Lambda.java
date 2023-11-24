package Chapter1_Object.item5_DependencyInjection;

import java.util.function.Supplier;

public class YaziAnaliziDI_Lambda {

    private final Sozluk sozluk_;

    public YaziAnaliziDI_Lambda(Supplier<Sozluk> sozluk) {
        //this.sozluk = sozluk;
        sozluk_ = sozluk.get(); //this.sozluk kullanimi yerine sozluk_ yazilabilir.
    }

    public boolean isValid() {
        return true;
    }
}
