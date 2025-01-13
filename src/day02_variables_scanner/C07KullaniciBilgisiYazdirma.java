package day02_variables_scanner;

import java.util.Scanner;

public class C07KullaniciBilgisiYazdirma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yasınızı giriniz");
        double yas =scanner.nextDouble();

        System.out.println("girilen bilgiler : " +isim.toUpperCase());



    }
}
