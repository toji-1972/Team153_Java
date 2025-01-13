package day06_ifStatements;

import java.util.Scanner;

public class C10_SinifGecme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir not giriniz");
        int not = scanner.nextInt();


        if (not >= 50)
        {
            System.out.println("Sınıfı gectin");
        }
        else
        {
            System.out.println("Sınıfı gecemedın");
        }


    }
}
