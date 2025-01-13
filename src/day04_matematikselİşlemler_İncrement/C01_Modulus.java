package day04_matematikselİşlemler_İncrement;

import java.util.Scanner;

public class C01_Modulus {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı alıp çift olup olmadıgını bulalım


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi girin...");

        int girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi % 2);  // 1 ise tek, 0 ise çift


        // girilen sayının birler basamagını yszdırın

        System.out.println("girilen sayının birler basamagı : " + (girilenSayi % 10));

        // girilen sayının 29 un katı olup olmadıgına bakın

        System.out.println("29 ile bolumundenm kalan : " + (girilenSayi % 29));




    }
}
