package day06_ifStatements;

import java.util.Scanner;

public class C11_BuyukHarf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir karakter girin");
        char karakter = scanner.next().charAt(0); // Berkay Can ==> B

        // 1. yontem Character Wrapper class
        if (Character.isUpperCase(karakter))
        {
            System.out.println("Girilen Karakter Buyuk Harf");
        }
        else
        {
            System.out.println("Girilen Karakter Buyk Harf degil");
        }


        // 2. yontem :ASCII Table degerlerini kullanabiliriz

        if (karakter>='A' && karakter<='Z')
        {
            System.out.println("Girilen Karakter Buyuk");
        }
        else
        {
            System.out.println("Girilen karakter buyuk degil");
        }
    }
}
