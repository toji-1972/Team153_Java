package day13_forLoop;

import java.util.Scanner;

public class C04_FaktoriyelHesaplama {
    public static void main(String[] args) {

        // Kullanıcıdan 18 den kucuk bir sayı alın
        // Bu sayının faktorıyel degerini hesaplayın
        // 5! = 5 * 4 * 3 * 2 * 1 => 120


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 18 den kucuk pozitif bır tamsayı gırınız... ");
        int sayi = scanner.nextInt();

        int carpim = 1;

        for (int i = sayi; i >= 1 ; i--) {
            carpim *=i;

        }
        System.out.println(sayi + "! =" + carpim );




    }
}
