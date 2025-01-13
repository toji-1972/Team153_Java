package day12_stringManipulations_ForLoop;

import java.util.Scanner;

public class C04_sifreKontrol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

        int sayac = 0;


        // ilk harf kucuk harf olmalı

        char ilkharf = sifre.charAt(0);

        if (Character.isLowerCase(ilkharf)){
            System.out.println("ilk harf buyuk harf olmalı");
            sayac++;


        }

        char sonKarakter = sifre.charAt(sifre.length()-1);

        if(sonKarakter >= '0' && sonKarakter <= '9'){
            System.out.println("son karakter rakam olmalı");
            sayac++;

        }
        // sifre bosluk icermemeli

        if(sifre.contains("  ")){

            System.out.println("sifre bosluk icermemeli");
            sayac++;

        }

        if(sifre.length() <= 10){
            System.out.println("Uzunlugu en az 10 karakter olmalı");
            sayac++;

        }








    }
}
