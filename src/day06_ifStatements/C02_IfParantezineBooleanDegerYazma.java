package day06_ifStatements;

import java.util.Scanner;

public class C02_IfParantezineBooleanDegerYazma {
    public static void main(String[] args) {

        // kullanıcıdan yasını alın
        // yasın 65'e esit ya sa buyuk oldugunu kontrol edin
        // olusturdugunuz sonuc varabklına bu sonucu kaydedin
        // sonuc degerinin degeri true ise emekli olabilirsin, degilse emekli olamazsı yazdıralım


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen yasınız gırın...");
        double yas = scanner.nextDouble();

        boolean sonuc = yas >= 65; // true veya false

        if (sonuc) // sonuc == true
        {
            System.out.println("Emekli olabilirsin");
        }

        if (!sonuc) //sonuc == false
        {
            System.out.println("emekli olamazsın");
        }



    }
}
