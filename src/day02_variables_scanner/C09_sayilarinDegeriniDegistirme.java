package day02_variables_scanner;

import java.util.Scanner;

public class C09_sayilarinDegeriniDegistirme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 1. tamsayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen 2. tamsayiyi giriniz");
        int sayi2 = scanner.nextInt();

        int temp = 0 ;

        temp = sayi2;

        sayi2 = sayi1;

        sayi1 = temp;







        System.out.println("Son durum sayi1 : " + sayi1 + "ve sayi2 : " + sayi2);
    }
}
