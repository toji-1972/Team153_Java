package day03_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_İstedigimizDataTuruneCast {
    public static void main(String[] args) {


        int a = 23;
        int b = 5;
        System.out.println(a / b);

        /* java da bir bolme islemi
         yapıldiginda bolunen ve bolen
          ınt ise sonuc ta int olut*/

        double c = a / b;

        System.out.println(c);

        // a / b islemini yapip sonucu ondalikli olarak bulup yazdirin

        System.out.println( (double)(a / b) );

        System.out.println(((double) a / b));
        System.out.println((a/ (double) b));
        System.out.println(((double)a/(double)b));






        //kullanıcıdan bir karakter girmesini isteyin
        //ascii table da girilen karakterin sonraki 3 karakteri
        //sirasiyla yanyana yazin

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Lutfen bir karakter giriniz....");
//
//        char girilenKarakter = scanner.next().charAt(0);
//
//        System.out.println("girilen karakterden 1 sonraki karakter : " + (char)(girilenKarakter+1) );
//        System.out.println("girilen karakterden 2 sonraki karakter : " + (char)(girilenKarakter+2) );
//        System.out.println("girilen karakterden 3 sonraki karakter : " + (char)(girilenKarakter+3) );



    }
}
