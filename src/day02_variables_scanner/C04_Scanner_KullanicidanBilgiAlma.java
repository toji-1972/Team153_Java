package day02_variables_scanner;

import java.util.Scanner;

public class C04_Scanner_KullanicidanBilgiAlma {
    public static void main(String[] args) {

        // kullanıcıdan ismini isteyip
        // girilen ismi büyük harfle yazin

        // 1. adim scanner objesi oluşturma

        Scanner scanner = new Scanner(System.in);

        // 2. adim : Kullanicidan ne istediğimizi soyleme

        System.out.println("Lütfen isminizi giriniz");

        // 3. adım : uygun metod kullanrak, kullanıcının girdigi degeri alip
        //    bilginin icerigine uygun bir variable a kaydetme


       // String girilenIsim = scanner.next();  // kullanıcının girdigi metnin ilk space a oln kısmını alır
                                              // Al mert canli ==> sadece Ali yi alır

        String girilenIsim = scanner.nextLine(); // kullanicinin girdigi metnin tamamini alir

        System.out.println("Girilen ismin büyük harflerle yazılmış hali : ") ;

    }
}
