package day08_nestesIfElseStatement_ternary;

import java.util.Scanner;

public class C04_TernaryOperatoru {
    public static void main(String[] args) {

        /*basit bir if else ile yapabilecegimiz if-else bodysinin*/


        //kullanıcıdan biir tam sayı isteyin

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        // sayının tek veya cıft oldugunu yazınız

        if(sayi % 2 == 0){
            System.out.println("Sayi cift");
        }else{
            System.out.println("Sayi tek");
        }

        System.out.println(sayi % 2 == 0 ? "Sayi cift" : "Sayi tek");




        // sayinin 3 basamakli pozitif bir sayi oşup olmadıgını yazın

        if (sayi >= 100 && sayi <= 999){
            System.out.println("Sayı 3 basamaklı pozitif sayi");
        }else{
            System.out.println("Sayi 3 basamaklı pozitif sayi degil");
        }

        System.out.println(sayi >= 100 && sayi <= 999 ? "Sayi 3 basamakli pozitif sayi " : "sayi 3 basamakli pozitif sayi degil");





    }
}
