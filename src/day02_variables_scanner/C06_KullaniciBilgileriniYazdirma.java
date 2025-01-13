package day02_variables_scanner;

import java.util.Scanner;

public class C06_KullaniciBilgileriniYazdirma {
    public static void main(String[] args) {

        // kullanicidan ismini, soyismini va ysini alip, asagıdaki formatta yazdırın
        //    Isminiz : John
        //



        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yasınızı giriniz");
        double yas =scanner.nextDouble();



        System.out.println(
                "isminiz : " + isim +
                "\nSoyisminiz : " + soyisim +
                "\nYasiniz : " + yas +
                "\n İsleminiz basarıyla tamamlanmıstır"

        );

    }

}
