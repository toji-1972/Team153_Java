package day04_matematikselİşlemler_İncrement;

import java.util.Scanner;

public class C02_Matematikselİslemler {
    public static void main(String[] args) {

        int sayi = 423;

        System.out.println(sayi % 10); // 3

        System.out.println(sayi / 10); // 42.3 ==> 42



        // kullanıcıdan 3 basamaklı poszitif
        // bir tam sayi alın ve sayinin rakamlar
        // toplamını bulun


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tamsayı girin...");

        int girilenSayi = scanner.nextInt();

        int toplam = 0;

        int birlerBasamagi = girilenSayi % 10;

        toplam = toplam + birlerBasamagi;

        girilenSayi = girilenSayi / 10;

        birlerBasamagi = girilenSayi % 10;

        toplam = toplam + birlerBasamagi;

        girilenSayi = girilenSayi / 10;

        toplam = toplam + girilenSayi;

        System.out.println("rakamlar toplamı : " + toplam);















    }
}
