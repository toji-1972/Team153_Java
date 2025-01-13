package day20Arrays;

import day19_Arrays.C05_EnKisaEnUzunKelime;

import java.util.Scanner;

public class C04_MultiDimentionalArrays {
    public static void main(String[] args) {

        // Kullanıcıdan bir cümle isteyin ve cumledeki en uzun kelıneyi yazdirin

        //Ali okula gitti, ögleden sonra saat 3'te gelecegini soyledi

        // , kelime uzunlugunu etkiledig için virgulden kurtlalım

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lıutfen bir cumle girirniz");

        String str = scanner.nextLine();


       str= str.replace(",", "");
       str= str.replace(".", "");
       str= str.replace("-", "");

        String[] kelmimelerr = str.split(" ");

        C05_EnKisaEnUzunKelime.enUzunEnKisayiYazdir(kelmimelerr);







    }
}
