package Chapter1_Object.item2_BuilderPattern;

public class KahveDunyasi {

    //Gerekli
    private String kahveBoyutu;

    //Secime göre degisir
    private String laktozsuzSutMiktari;
    private String yumusatici;


    // Telescope Pattern
    //Not: Bu pattern Constructor'lar üzerinden overload yöntemi ile gider ama clean kod icin iyi degildir.

//    public KahveDunyasi(String kahveBoyutu) {
//        this.kahveBoyutu = kahveBoyutu;
//    }
//
//    public KahveDunyasi(String kahveBoyutu, String laktozsuzSutMiktari) {
//        this.kahveBoyutu = kahveBoyutu;
//        this.laktozsuzSutMiktari = laktozsuzSutMiktari;
//    }
//
//    public KahveDunyasi(String kahveBoyutu, String laktozsuzSutMiktari, String yumusatici) {
//        this.kahveBoyutu = kahveBoyutu;
//        this.laktozsuzSutMiktari = laktozsuzSutMiktari;
//        this.yumusatici = yumusatici;
//    }


    // Java Beans Pattern
    //Not: Bu pattern bos bir constructor olusturulup, ilgili parametreler setter olarak gecilmektedir. Clean kod icin iyi degildir.
//    public KahveDunyasi() {
//    }
//
//    public void setKahveBoyutu(String kahveBoyutu) {
//        this.kahveBoyutu = kahveBoyutu;
//    }
//
//    public void setLaktozsuzSutMiktari(String laktozsuzSutMiktari) {
//        this.laktozsuzSutMiktari = laktozsuzSutMiktari;
//    }
//
//    public void setYumusatici(String yumusatici) {
//        this.yumusatici = yumusatici;
//    }

    // Builder Pattern
    // Bu pattern icin ilgili sinif icerisinde bir ic class olusturulur. Bu kod tek satirda bircok secenegin secilmesine olanak saglar, kod güvenligini ve okurnurlugunu arttirir.
    // Bu patterni kullanmak icin cok fazla opsiyonel parametrenin cok olmasi ve constructor icerisindeki parametrelerin cok olmasi gerekir. Komplex olmayan siniflarda kullanmaya gerek yoktur.
    public static class Builder {

        //Gerekli
        private final String kahveBoyutu;

        //Secime göre degisir
        private String laktozsuzSutMiktari;
        private String yumusatici;

        public Builder(String kahveBoyutu) {
            super();
            this.kahveBoyutu = kahveBoyutu;
        }

        public Builder laktozsuzSutSecenegi(String laktozsuz) {
            laktozsuzSutMiktari = laktozsuz;
            return this;
        }

        public Builder yumusaticiSecenegi(String yumusaklikDegeri) {
            yumusatici = yumusaklikDegeri;
            return this;
        }

        public KahveDunyasi build() {
            return new KahveDunyasi(this);
        }
    }

    public KahveDunyasi(Builder builder) {
        kahveBoyutu = builder.kahveBoyutu;
        laktozsuzSutMiktari = builder.laktozsuzSutMiktari;
        yumusatici = builder.yumusatici;
    }
}
