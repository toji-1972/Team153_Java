package day06_ifStatements;

import java.util.Scanner;

public class C01_bagimsizIfCumleleri {
    public static void main(String[] args) {


        int a = 23;
        int b = 45;

        //q b' den büyukse "a daha buyuk" yazdırın

        // kullanıcıdan iki tamsayı alın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki adet tamsayı gırınız");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1 > sayi2)
        {
            System.out.println("birinci sayı daha buyuk");
        }

        // ikinci sayi çift ise "ilinci sayi cift yazdırın"

        if (sayi2 % 2 == 0)
        {
            System.out.println("ikinci sayi cift");
        }



        //birinci sayi 100 den buyukse sayıla cok guzel yazdirin

        if (sayi1 > 100)
        {
            System.out.println("Sayılar cok guzel");
        }


        // ikinci sayı negatifse "negatif sayıları sevfmem " yazdıralım


        if (sayi2 <0)
        {
            System.out.println("Negatif sayıları sevmem");
        }








    }

}
