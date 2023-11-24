package Chapter1_Object.item1_ConstructorYerineStaticKullan;

public class Item1 {

    /* Item1

        Ön Soru:
            Neden constructor yerine static factory method?
                * Constructorlarda istediginiz ismi vermek gibi bir seceneginiz olmaz.
                * Durmadan yeni instance ürettigimizde cachleme gibi bir mekanizma kurma sansimiz yok
                * Constructorlar ile alt tipte veya farkli tipte bir obje üretemiyoruz.

            Static factory method nedir?
                *  Boolean Örnegi

         Akis:
            1. String value of ve Boolean value of
            2. Constructor'a karsi default parametre atama avantaji

         Özet:
            * Static factory method ile isim secme özelligi kazaniyoruz
            * Hangi instance'yi döndürecegimiz ile ilgili tüm kontrolü elimize aliyoruz
            * Hangi tipte obje döneceksek bunun kontrolünü de ele aliyoruz
     */


    public static void main(String[] args) {

        Barcelona bc1 = new Barcelona("Ronaldo", 22);
        Barcelona bc2 = Barcelona.produceNewPlayer("Ronaldinho");
        Barcelona bc3 = new Barcelona("Pep Guardiola");

    }
}
