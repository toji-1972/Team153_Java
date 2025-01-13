package day13_forLoop;

import java.util.Scanner;

public class C07_FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir sayı girin: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
