package day06_ifStatements;

import java.util.Scanner;

public class C05_SusluParantezKullanimi {
    public static void main(String[] args) {
        // kullanıcıdan pozitif bir tam sayı alın
        // sayı uc e bolunuyorsa, "sayı uc un tam katı yadırın"
        // sayı bes e bolunuyorsa sayı bes ın ta katı ayzın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pzıtıf bır tamsayı gırın");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0)
        {
            System.out.println("sayi uc un tam katı");
        }

        if (sayi % 5 == 0)
        {
            System.out.println("bes in tam katı");
        }

        /* eger bir if statement ta {} kullanılmazsa
         ilk ; ' a kadar olan kismi if body si olarak kabul eder
         sonuc: eger if body sadece bir satir ise {} kullanmasak da olur
         eger 1 satırdan fazalaysa {} kullanmak zorundayız
         */

//        if (sayi % 3 == 0) System.out.println("sayi uc un tam katı");
//
//        if (sayi % 5 == 0) System.out.println("bes in tam katı");

        // sayi 7'ye boluuyorsa iki farkli sout icinde
        //"7 ile bolunuyor" "guzel sayi"


        if (sayi % 7 == 0)

            System.out.println("7 ile bolunuyor");// if body buraya kadar olan kısım olur
            System.out.println("guzel sayi");// bu satır if cumlesinden ayrıdır
                                             //HER DURUMDA calısır





    }
}
