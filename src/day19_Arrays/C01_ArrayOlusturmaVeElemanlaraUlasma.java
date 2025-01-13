package day19_Arrays;

import java.util.Arrays;

public class C01_ArrayOlusturmaVeElemanlaraUlasma {
    public static void main(String[] args) {

        int[] arr= {5, 6, 7}; // Java arnin lngh ti olarak yazılan eleman sayısını kabul eder
        String[] isimler = new String[5]; // [null, null, null, null, null ]

        // arr nin data türü array dir
        // önüne yazdıgımız intiger, arrayin içine konacak elemankarın data türüdür

        // 9'u yazdirin

        System.out.println(arr[2]); // 7

        // arr'nin ilk elemanını yazdırın
        System.out.println(arr[0]);

        // arr nin 1. ve 2. index indeki sayıların toplamını yazdırın
        System.out.println(   arr[1] + arr[2]); // 13



        /*
        Olusturlmus bir array in uzunlugu sonradan degistirilemez
         */


        int[] sayilar = {10, 11, 45};

        // sayılar array'in 2. indexindeki elemanı yazdırin

        System.out.println(sayilar[2]);  //45

        //sayılar arryın 1. index'ine 40 degerini atayın
        sayilar[1] = 40;

        // sayilar arry 'ine 4. element olarak 20 degerini atayin

        //sayilar[3] = 20;  // ArrayIndexOfBoundsException


        // Sayılar array'ini yazdırın

        System.out.println(sayilar); // [I@4c203ea1

        // Array'i direkt yazdırmak isterseniz, Java array'i degeri yazdirir.
        // Array'i yazdirmak icin Arrays class'indan toString() kullanmalisiniz

        System.out.println(Arrays.toString(sayilar)); // [10, 40, 45]
        // array'i bir butun olarak yazdirirsaniz, elementlerin arasina ", " birakir


        String str = "Java Candır";
        String[] harfler = {"e","r","t"};

        System.out.println(str.length()); // 11
        System.out.println(harfler.length); // 3


























    }
}
