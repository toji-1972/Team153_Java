package day13_forLoop;

import java.util.Scanner;

public class C06_SayilarinRakamlarToplaminiBulma {
    public static void main(String[] args) {

        // Kullancıdan pozitif bir tamsayı alıp rakamlar toplamını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lufen pozitif bır tamsayı gırınız");
        int sayi = scanner.nextInt();

        int basamakSayisi = (sayi+"").length();
        int rakamlarToplami = 0;

        for (int i = 0; i <basamakSayisi ; i++) {

            rakamlarToplami += sayi % 10;

            sayi /= 10;

        }
        System.out.println("Verilen " +sayi+ "sayisinin rakamlar toplami: " +rakamlarToplami);

    }
}
