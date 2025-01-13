package day06_ifStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi igriniz...");

        int sayi = scanner.nextInt();

        if (sayi % 5 == 0)
        {
            System.out.println("Sayı besin kati");
        }


    }
}
