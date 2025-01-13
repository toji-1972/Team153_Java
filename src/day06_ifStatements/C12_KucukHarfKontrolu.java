package day06_ifStatements;

import java.util.Scanner;

public class C12_KucukHarfKontrolu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir karakter girin");
        char karakter = scanner.next().charAt(0);


        // 1. yontem : Wraper class kullanarak
        if (Character.isLowerCase(karakter))
        {
            System.out.println(Character.toUpperCase(karakter));
        }
        else
        {
            System.out.println(karakter);
        }

        // 2. yontem ASCII table degerini kullanalım

        if (karakter>= 'a' && karakter <= 'z')
        {
            System.out.println( (char) (karakter -32));
        }
        else
        {
            System.out.println(karakter);
        }





    }
}
