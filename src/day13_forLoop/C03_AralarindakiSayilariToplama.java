package day13_forLoop;

import java.util.Scanner;

public class C03_AralarindakiSayilariToplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lufen baslangıc ıcın pozitif bır tamsayı gırın");
        int baslangic = scanner.nextInt();

        System.out.println("Lufen bitis ıcın pozitif bır tamsayı gırın");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if(baslangic<0 || bitis<0){
            System.out.println("Baslangic ve bitis degerleri pozitif tamsayi olmalı");
        }else if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {

                toplam+= i;

            }
        }else{
            for (int i = bitis; i <=baslangic ; i++) {
                toplam+=i;

            }
        }
        System.out.println(baslangic + "ile" + bitis + "arasındaki sayilarin toplami:" + toplam);

    }
}
