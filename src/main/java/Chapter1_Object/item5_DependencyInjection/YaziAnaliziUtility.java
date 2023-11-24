package Chapter1_Object.item5_DependencyInjection;

public class YaziAnaliziUtility {

    private static final Sozluk turkce= new Sozluk("Türkce");

    //Utility metotlarda constructor private yapilir ve metot üzerinden class'a erisilir.
    private YaziAnaliziUtility() {
    }

    public static boolean isValid() {
        return true;
    }

    public static String upUzunBirMetodYaziyorumSuandaAklimaGelenKelimelerle(){
        return "selam";
    }
}
