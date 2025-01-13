package day07_IfElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {



        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // 20 yasdan kucuk veya 80 yasdan buyukler icin hata mesaji verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasınızı gırınız...");

        double yas = scanner.nextDouble();

        System.out.println("Cinsiyetinizi giriniz... K: kadın, E: erkek");
        char cinsiyet = scanner.nextLine().toUpperCase().charAt(0);

        if (yas < 20 || yas > 80) {
            System.out.println("Girilen yas ıcın emeklılık hesaplanamaz");
        } else if (cinsiyet == 'K' & yas >= 60) {
            System.out.println("60 Yasından buyuk kadınlar emekşi olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Emekli olmak ıcın " + (60 - yas) + "yıl daha calısmalısın");
        } else if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("65 yasından buyuk erkekler emekli olabilir");
        } else if (cinsiyet == 'E' && yas < 65)
        {
            System.out.println("Emekli olmak ıcın " + (65 - yas) + "yıl daha calısmalısın");
        }
        else
        {
            System.out.println("Girilen degerler hatalı");
        }




    }
}
