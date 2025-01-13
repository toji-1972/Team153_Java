package day13_forLoop;

import java.util.Scanner;

public class C02_AradakiSayilariToplama {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
// sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
// Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lufen baslangıc ıcın pozitif bır tamsayı gırın");
        int baslangic = scanner.nextInt();

        System.out.println("Lufen bitis ıcın pozitif bır tamsayı gırın");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if(bitis>baslangic){
            System.out.println("Bitis degeri baslangıc degerinden fazla olamaz");
        }else{
            for (int i = baslangic; i <= bitis ; i++) {
                toplam += i;

            }

            System.out.println(baslangic + " ile " + bitis +" arasındaki sayıların toplamı");



        }




    }
}
