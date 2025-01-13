package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_AlinanSayilariToplama {
    public static void main(String[] args) {

        // kullanıcıdan istedigi kadar sasyi girmesini isteyin

        // kullanıcı islemi bitirmek icin Q'ya bsdmslıdır
        // kullanıcı Q veya q ya bastıgında
        // girilen sayi adedini ve girilen sayiların toplamını yazdırın

        Scanner scanner = new Scanner(System.in);

        double girilenSayi = 0;
        double toplam = 0;
        String girilenMetin ="";
        int sayiAdedi = 0;

        do{
            System.out.println("Lutfen toplamak icin sayi giriniz,\nbitirmek icin Q!ya basiniz...");

            try {
                girilenSayi = scanner.nextDouble(); // kullanıcı q veya istenmeyen bir imput girerse
                                                    //InputMismatchException olusur
                toplam += girilenSayi;
                sayiAdedi++;
            }catch (InputMismatchException e){
                // Kod buraya geldiyse kullanici Q/q yada gecersiz bir deger girmistir
                girilenMetin = scanner.nextLine();

                if(girilenMetin.equalsIgnoreCase("Q")){
                    break;
                }else { // gecersiz bir deger girilmis demektir
                    System.out.println("Ya sayi igr ya da Q'ya bas");
                }
            }



        }while(! girilenMetin.equalsIgnoreCase("q"));

        System.out.println("Girilen" + sayiAdedi + " adet sayisinin toplami : " + toplam);




    }
}
