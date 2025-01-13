package day24_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        Random rnd = new Random();

        C02_Hemsire hemsire1 = new C02_Hemsire();

        hemsire1.isim = "Canan";
        hemsire1.adres = "Balgat";


        System.out.println(hemsire1.isim); // Canan
        System.out.println(hemsire1.adres); // Balgat
        System.out.println(hemsire1.telefon); // Telefon Atanmadı


           C02_Hemsire    hemsire2      =     new       C02_Hemsire();
        // class ismi     obje ismi   atama  keyword     Constructor
        // Bir class'dan obje olusşturulup ilk deger ataması
        // MUTLAKA bir constructor CALISMALIDIR


        hemsire2.isim = "Sumeyra";

        System.out.println( new C02_Hemsire().isim );
        //41, satırda new keyword'u ile yeni bir obje olusturulur
        // sadece o satırda bu obje kullanılabilir
        // ama bir variable'a kaydedilmedigi icin
        // (esitligin sol tarfı omadıgı ıcın)
        // bu obje o stırda kullanılır vesonra cop olur


        C02_Hemsire hemsire3;

        // System.out.println(hemsire3.isim);
        // Varible hemsire might not have been isitialized
        // Constuructor calismadıgi icin
        // ilk deger atamsnı(initialize) yapilmamıstir


        // Localde olusturulan variable lar
        // deger atanmadan olusturlabilir
        // ama deger atanmadan KULLANILAMAZ


        C02_Hemsire hemsire4 = null;
        // Constuructor calismadıgi icin
        // ilk deger atamsnı(initialize) yapilmamıstir
        //System.out.println(hemsire4.isim); // NullPointerException

        String str;

        //System.out.println(str);


        

    }
}
