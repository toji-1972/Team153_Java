package day05_operatorler_BasıtİfCumleleri;

import java.util.Scanner;

public class C04_DikkatEdilecekler {
    public static void main(String[] args) {

        // kullanıcıdan bir karakter alın
        // girilen karakter kucuk harf ise true, buyuk harf ise false yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir karakter girinzi...");
        char girilenKarakter = scanner.next().charAt(0);

        // istenen islemi 2 turlu yapabiliriz
        //girilen karakete kucuk harf ise true, kucuk harf degilse false yazdırın


        System.out.println(Character.isLowerCase(girilenKarakter));

        // 2. yontemde ASCII table ve karsılastırma operatoru kullanabiliriz
        // istenen durum 2 degerin arası ise AND kullanilir


        System.out.println( girilenKarakter >= 'a' && girilenKarakter<= 'z');

        //istenen durum bir aralıgın disinda kalan kisim ise OR kullanılır
        //girilen karakter buyuk harf degilse true
        // girilen harf ise false yazdirin

        System.out.println(girilenKarakter < 'A' || girilenKarakter> 'Z');







    }
}
