package day08_nestesIfElseStatement_ternary;

import java.util.Scanner;

public class C06_AtamaOlursa {
    public static void main(String[] args) {

        /*Ternary operatoru bir sonuc uretir
        * bu sonuc ya yazdırılmalıdır YA DA bir variable a atanmalıdır*/

        // kullanıcıdan bir tamsayı isteyin
        // sayi pozitif ise iki katina cıkarın
        // sayi negatif ise degerini yuz arttirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bır tamsayı gırınız");
        int sayi = scanner.nextInt();

        // sayi pozitif ise 2 katına cıkarın, sayi pozitif degilse degerini 100 arttirin

        sayi = sayi >0 ? 2*sayi : sayi+100;

        System.out.println("Sayinin yeni degeri : " + sayi);

        // sayinin yeni degeri cift ise yarıya indirin. Tek ise degerini iki katına cıkarın

        sayi = sayi % 2 == 0 ? sayi/2 : sayi*2;
        System.out.println("sayinin degeri : " + sayi);










    }
}
