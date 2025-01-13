package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayolusturma {

    public static void main(String[] args) {

        // Kullanıcıdan array in boyutunu ve elementlerini alıp
        // arrayi olusturan ve bize donduren bir method olusturun


        int[] kullaniciArrayi = intArrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));

        // Kullanıcı array'indeki tamsayıların toplamını yazdırın


        System.out.println(C04_PozitifSayilariToplama.pozitifSayilariTopla(kullaniciArrayi));

    }
    public static int[]  intArrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Arrayde kac sayi olacagini giriniz...");
        int arrayLenght = scanner.nextInt(); // 5

        int[] arr = new int[arrayLenght]; // [0,0,0,0,0]

        for (int i = 0; i <arrayLenght ; i++) {
            System.out.println("Array'in " + i + "İndex'i icin bir deger giriniz..." );
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static String[]  stringArrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'de kac sayi olacagini giriniz...");
        int arrayLength = scanner.nextInt(); // 5

        String[] arr = new String[arrayLength]; // [null, null, null, null, null]

        for (int i = 0; i <arrayLength ; i++) {

            System.out.println("Array'in " + i + ".index'i icin bir deger giriniz...");
            arr[i] = scanner.nextLine();

        }

        return arr;
    }

}

