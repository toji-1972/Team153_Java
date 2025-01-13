package day05_operatorler_BasıtİfCumleleri;

import java.util.Scanner;

public class C01_KarsilastirmaOperatorleri {
    public static void main(String[] args) {

        //kullancıdan bir tamsayı isteyin
        //girilen tamsayı cift ise true, tek ise false yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz...");
        int girilenSayi = scanner.nextInt();


        System.out.println(girilenSayi % 2 == 0);


        // girilen sayi 23 un katı ise true degilse false yazdırın

        System.out.println(girilenSayi % 23 == 0);

        




    }
}
