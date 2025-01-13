package day06_ifStatements;

import java.util.Scanner;

public class C09_IfElseStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("uckenın kenar zunlukalrını gırın");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 >0)
        {
            System.out.println("Eskenar ucken");
        }
        else
        {
            System.out.println("Eskenar ucken degil");
        }



    }
}
