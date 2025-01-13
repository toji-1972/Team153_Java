package day09_switchStatement_stringManipulation;

import java.util.Scanner;

public class C02_GunIsminiYazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir gün numarası giriniz...");
        int gun = scanner.nextInt();
        if (gun ==1) {
            System.out.println("pazartesi");
        } else if (gun ==2) {
            System.out.println("salı");
        } else if (gun == 3) {
            System.out.println("çarşamba");
        } else if (gun == 4) {
            System.out.println("perşembe");
        } else if (gun == 5) {
            System.out.println("cuma");
        }else if (gun == 6){
            System.out.println("cumartesi");
        } else if (gun == 7) {
            System.out.println("pazar");
        }



        switch (gun){

            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Girilen dun numarası 1-7 arasında olmalıdır");

        }



    }

}
