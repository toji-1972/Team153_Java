package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_OrtalamaninUstundekiElemanSayisi {
    public static void main(String[] args) {
        // verilen bir not listesinde
        // ortalama notu ve ortalamanın altındai not sayisinı yazdırın

        List<Double> notlar = new ArrayList<>(Arrays.asList(23.4, 67.8, 98.0, 87.5, 78.3));

        System.out.println(notlar);

        double toplam = 0;

        for (Double w : notlar){
            toplam += w;

        }

        double ortalama = toplam / notlar.size();

        // artık ortalamanın altıdaki not sayısını bılabiliriz

        int sayac = 0;

        for ( Double each :notlar){
            if (each< ortalama){
                sayac++;
            }
        }
        System.out.println("Ortalam not olan " + ortalama + "Nın altında" + sayac + "adet ogrenci var");


    }
}
