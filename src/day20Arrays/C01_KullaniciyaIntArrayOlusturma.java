package day20Arrays;

import day19_Arrays.C08_ArreyeElemanEkleme;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KullaniciyaIntArrayOlusturma {
    public static void main(String[] args) {

        // Kullanıcıdan array'in boyutunu ve elemrntlerini alıp
        // C08'deki method'u kullanarak array'i olusturun ve yazdırın


        Scanner scaanner = new Scanner(System.in);

        System.out.println("Lutfen olusturmak isdtediginiz array in uzunlugunu giriniz");

        int arrayLenght = scaanner.nextInt(); // 5

        int[] arr = new int[1];

        System.out.println("lutfen arraayin ilk elemanını gırınız");

        arr[0] = scaanner.nextInt();


        for (int i = 0; i < arrayLenght; i++) {
            System.out.println("array'e eklemek uzere bir tamsayı giriniz");

            int eklenecekSayi = scaanner.nextInt();

            arr = C08_ArreyeElemanEkleme.arrayeElemanEkle(arr,eklenecekSayi);
        }
        System.out.println("Olusturdugunuz arr : " + Arrays.toString(arr));



    }
}
