package day06_ifStatements;

import java.util.Scanner;

public class C08_FlagMethodu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tamsyı gırın");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int flag = 24;


        if (sayi1 < sayi2)
        {
            System.out.println("1. sayi daha kucuk");
            flag =34;
        }

        if (sayi1 > 0)
        {
            System.out.println("1. sayı sıfırda buyuk");
            flag =34;
        }

        if (sayi2 >50)
        {
            System.out.println("2. sayi 50 den buyuk");
            flag = 34;
        }

        if (sayi2 % 5 == 0)
        {
            System.out.println("2. sayı 5'in kati");
            flag = 34;
        }
        // En sona gelindiginde flag hangi degerleri alabilir
        // 24 ==> hic bir if body calismadi
        // 34 ==> if body'lerinden bazilari calisti, ama kac tanesi calisti bilmiyoruz

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        if (flag == 24){
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        }


    }
}
