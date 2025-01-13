package day08_nestesIfElseStatement_ternary;

import java.util.Scanner;

public class C08_NestedTernary {
    public static void main(String[] args) {


        // kullanıcıdan bir tamsayı isteyin sayı pozitifse cift sayi olup olmadıgını yazdırin
        // sayı pozitif degilse 3 un kati olup olmadıgını yzadırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsay gırın");
        int sayi = scanner.nextInt();

        System.out.println(

                sayi > 0
                ?
                sayi % 2 == 0 ? "cift sayi" : "tek sayi"
                :
                sayi % 3 == 0 ? "3 ün katı" : "3 ün katı degil"
        );


    }

}
