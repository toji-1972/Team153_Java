package day12_stringManipulations_ForLoop;

import java.util.Scanner;

public class C03_MetniDuzenle {
    public static void main(String[] args) {
        // Kullanıcdan bir string alın
        // stringin uzunlugu cift sayı ise tam ortasına :) ekleyin.
        // stringin uzunlugu tek sayi ise ortadaki harfi silin ve yerine:( yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        if (metin.length() % 2 == 0){

            System.out.println(

                    metin.substring(0, metin.length()/2) +
                            ":)" +
                            metin.substring(metin.length()/2)
            );

        }else{

            System.out.println(

                    metin.substring(0, metin.length()/2)+
                            ":("+
                            metin.substring(1+metin.length()/2)


            );



        }

    }
}
