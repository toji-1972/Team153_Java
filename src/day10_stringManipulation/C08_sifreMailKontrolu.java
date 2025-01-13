package day10_stringManipulation;

import java.util.Scanner;

public class C08_sifreMailKontrolu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mailinizi giriniz");

        String email =scanner.nextLine();



        if (!email.contains("@")){
            System.out.println("gecersiz mail");
        }

        if(!email.contains("@gmail.com")){
            System.out.println("email gmail olmalı");
        }

        if(!email.endsWith("@gmail.com")){
            System.out.println("mailde yazım hatası var");
        }

        if(email.endsWith("@gmail.com")){
            System.out.println("sifrenizi giriniz");
        }

    }
}
