package day03_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C06_WrapperClasses {
    public static void main(String[] args) {

        String str = "Java Candir";

        int sayi = 20;

        /* pirimitive data turundekı variable
         lar sadece deger barindirtabilir
         non-pirimitive turundeki varible'lar
          ise hem deger hem hair mthod lar barindirirlar*/


        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


        /*
        * java pirimitive data turundeki
        * variable lar için de bazi methodlar
        * kullanabilmemiz icin Wrapper class
        * ları olusturmustur
        *
        * Boolean, Character, Byte, Short, Integer, Long, Float, Double
        * */

        //parseInt veya parseDouble

        String fiyat1 = "23.44";
        String fiyat2 = "45.18";

        //bu fiyatların toplamını buun

        System.out.println(fiyat1+fiyat2); //23.4445.18

        System.out.println(Double.parseDouble(fiyat1) + Double.parseDouble(fiyat2));

        // sadece sayılardan veya . lardan olusuyorsa
        // String sayilari, matematiksel islem yapabişecegşmşz
        //sayılara parse eder


        fiyat1 = "34";
        fiyat2 = "41";

        System.out.println(Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2));



        char k1 ='d';

        //k1 i buyuk harf olarak yazdirin

        // 1- casting ile yaparsak

        System.out.println((char)(k1 - 32)); // a 97, A 65 aralarında 32 fark var


        // 2- Chararcer wrapper classında method ile yapılır

        System.out.println(Character.toUpperCase(k1)); // H


        // Kullanıcıdan bir karakter isteyin
        // kullanıcının girdigi karakter harf ise true, harf degil ise false yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bır karakter gırıniz...");
        char girilenKarakter = scanner.next().charAt(0);

        System.out.println(Character.isLetter(girilenKarakter)); //


        // aynı karakter sayı ise true degıl ıse false yazdırın
        System.out.println(Character.isDigit(girilenKarakter));

        //aynı karakter buyuk harf ise true, kucuk harf ise false
        System.out.println(Character.isUpperCase(girilenKarakter));

        System.out.println(Character.isAlphabetic(girilenKarakter));




    }
}
