package day19_Arrays;

public class C02_ArrayinTumElemanlarinaUlasma {
    public static void main(String[] args) {

        int[] sayilar = {3,4,5,7,4,6,8,9,7,5,4};

        // sayılar arry'indeki tum elemanların toplamını yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {


             toplam += sayilar[i];

        }
        System.out.println("Tüm elemanların toplamı:" + toplam);


        // sayilar arry'inde kaç adet cift sayı vardır?

        int sayac = 0;

        for (int i = 0; i < sayilar.length; i++) {

          if( sayilar[i] % 2 == 0){
              sayac++;
          }

        }
        System.out.println("Arraylerdeki cift sayi adedi: " + sayac); // 8

        // sayilar arry'indeki tek sayilarin toplamini yazdirin
        // {3,4,5,7,4,6,8,9,7,5,4}
        toplam = 0;

        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i] % 2 != 0){
                toplam += sayilar[i];
            }

        }
        System.out.println("Arraydaki tek sayilarin toplami: " + toplam); // 32

        // Array'daki en buyuk sayiyi yazdirin
        // {3,4,5,7,4,6,8,9,7,5,4}


        int enBuyuksayi = sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {

            if (sayilar[i] > enBuyuksayi){
                enBuyuksayi =sayilar[i];
            }

        }
        System.out.println("Array'deki en buyuk sayi: " + enBuyuksayi);


    }
}
