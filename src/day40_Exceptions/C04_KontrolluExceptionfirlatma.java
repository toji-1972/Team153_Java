package day40_Exceptions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_KontrolluExceptionfirlatma {
    public static void main(String[] args) {

        // Kullanıcıdan yasını, yasadigi sehrin plakasını
        // ve posta kodunu isteyin

        //  girilen yas 40-60 arasi (sinirlar dahil)
        // yasadigi sehrin plakası 40-60 arasi (sinirlar dahil)
        // ve posta kodu 40000-69999 arasi(sinirlar dahil) ise
        // "Cok sanslisin yazdirin
        // eger kullanıcıdan aldıgımızz degerlerden uygun olmayan varsa
        // "Sanslı degilsin" yazdirsin

        // ve geriye kalan soruları sormasın

        Scanner scanner = new Scanner(System.in);

        int yas  = 0;
        int plaka =0;
        int postaKodu = 0;

        try {


        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }









    }
}
