package Chapter1_Object.item5_DependencyInjection;

import java.util.function.Supplier;

public class Item5Test {

    public static void main(String[] args) {

        //Utility Secenegi
        System.out.println("Utility metot: " + YaziAnaliziUtility.isValid());

        //Singleton Secenegi
        System.out.println("Singleton: " + YaziAnaliziSingleton.INSTANCE.isValid());

        //DependencyInjection Secenegi
        YaziAnaliziDependencyInjection asd = new YaziAnaliziDependencyInjection(new Sozluk("Türkce"));
        System.out.println("Dependency Injection: " + asd.isValid());

        System.out.println("-------------------------------------------");

        //LAMBDA FUNCTION KULLANIMLARI

        //Lambda Funktion Secenegi
        Supplier<String> fs = () -> "Furkan";
        System.out.println(fs.get());

        //DI ve Lambda Secenegi
        Supplier<Sozluk> turkce = () -> new Sozluk("Türkce");
        YaziAnaliziDI_Lambda asd2 = new YaziAnaliziDI_Lambda(turkce);
        System.out.println("DI + Lambda: "+asd2.isValid());

        System.out.println("-------------------------------------------");

        // Uzun metod ismini uzun olarak cagirma
        System.out.println(YaziAnaliziUtility.upUzunBirMetodYaziyorumSuandaAklimaGelenKelimelerle());

        // Uzun metod ismini kisa olarak cagirma
        Supplier<String> dahaKisa = () -> YaziAnaliziUtility.upUzunBirMetodYaziyorumSuandaAklimaGelenKelimelerle();
        System.out.println(dahaKisa.get());

        System.out.println("-------------------------------------------");

        double randomSayi = Math.random();
        System.out.println("Ayni deger döner");
        System.out.println(randomSayi);
        System.out.println(randomSayi);

        System.out.println("-------------------------------------------");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Farkli degerler döner");
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
    }
}
