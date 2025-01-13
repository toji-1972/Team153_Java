package day15_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C02_SayiniRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // verilen pozitif bir tamsayinin rakamalr toplamını yazdiran
        // bir method olusturun

        rakamlarToplaminiYazdir(521);
        rakamlarToplaminiYazdir(10002);


    }
        public static void rakamlarToplaminiYazdir(int verilenSayi){


            int sayi = verilenSayi;

            int basamakSayisi = (sayi +"").length();
            int rakamlartoplami = 0;

            for (int i = 0; i <basamakSayisi ; i++) {

                rakamlartoplami += sayi%10;
                sayi /= 10;

            }
            System.out.println("Verilen " + verilenSayi + " sayinin rakamlar toplami : " + rakamlartoplami);
    }
}
