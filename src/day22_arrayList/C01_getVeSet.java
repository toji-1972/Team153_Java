package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_getVeSet {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,2,3,6));

       // Sayılar listesindeki tum sayıların toplamını yazdıralım

       int toplam =0;

        for (int i = 0; i < sayilar.size(); i++) {

            toplam += sayilar.get(i);      // array'deki arr[i] 'nin yerine

        }
        System.out.println("Listedeki elementlerin toplamı: " + toplam); // 38


        // sayilar arrayindeki 2. ve 5. index'deki elementlerin carpimini yazdirin


        System.out.println(sayilar.get(2) * sayilar.get(5));  // 4 * 7 ==> 28


        System.out.println("Sayilar listesi : " + sayilar);


        // sayilar listesi : [2,3,4,5,6,7,2,3,6]

        // sayilar listesindeki 4 ve 5 arasına 13 ekleyin


        sayilar.add(3,15);

        System.out.println("Sayılar listesi : " + sayilar);
        // Sayılar listesi : [2, 3, 4, 15, 5, 6, 7, 2, 3, 6]


        // 5. index'deki elementi 20 olarak update edin


        sayilar.set(5,20);
        System.out.println("Sayılar listesi: " + sayilar);
        //Sayılar listesi: [2, 3, 4, 15, 5, 20, 7, 2, 3, 6]



        /*
        add() araya eleman ekler,
        eklenen elemandan sonraki elementler bir geriye kaydırılır
        ve List'in uzunlugu 1 artar

        set() var olan bir elementi update eder
        yeni element eklendigi icin Listenin uzunlugu degismez


       JAVA'DA GENEL OLARAK

       get........: bize bilgi getirir
       set........: genelde var olan bilgiyi update eder

         */


        System.out.println(sayilar.indexOf(2)); //0
        System.out.println(sayilar.lastIndexOf(2)); // 7

        System.out.println(sayilar.indexOf(13)); // -1
        System.out.println(sayilar.lastIndexOf(13)); // -1

















    }
}
