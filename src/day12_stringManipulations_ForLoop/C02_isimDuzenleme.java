package day12_stringManipulations_ForLoop;

import java.util.Scanner;

public class C02_isimDuzenleme {
    public static void main(String[] args) {
        // Kullanıcıdan isim ve soyismini ayri ayri alin
        //-isim daha uzun ise
        //isim ve sayismin ilk harfi buyuk, kalanları klucuk sekilde yazın,
        //-soyisim daha uzun ise
        //


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz.");
        String isim =scanner.nextLine();

        System.out.println("Lütfen soyadınızı giriniz.");
        String soyisim = scanner.nextLine();

        if(isim.length()>soyisim.length()){
            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                    " "+
                    soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1).toLowerCase()


            );
        }else if(soyisim.length() > isim.length()){
            System.out.println(




            );


        }



    }

}
