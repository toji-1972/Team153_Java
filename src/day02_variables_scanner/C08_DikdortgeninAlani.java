package day02_variables_scanner;

import java.util.Scanner;

public class C08_DikdortgeninAlani {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dikdortgenin kenar uzunluklarini giriniz...");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdörtgenin alanı : " + (kenar1*kenar2) );



    }
}
