package day05_operatorler_BasıtİfCumleleri;

import java.util.Scanner;

public class C05_DikkatEdilecekler2 {
    public static void main(String[] args) {

        //kullancıdan bir sayı isteyin
        // kullanıcı 3 basmaklı pozitif bir sayi girerse true
        // 3 basamaklı pozitif bir tam sayi girmezse false yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi >= 100 && girilenSayi < 1000);

        // girilen sayi iki basamakli pozitif bir tamsyı degilse true
        // 2 basamaklı pozitif bir tamsayi ise false yazdirin

        System.out.println(girilenSayi < 10 || girilenSayi>=100);


        





    }
}
