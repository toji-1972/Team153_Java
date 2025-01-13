package day40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_MultipleExceptions_ParentChild {


    /*
        Eger birden cok exception olasılıgı varsa
        3 yontemle handle edebiliriz
        1- bagımsız try-catch blokları
        2- tek try birden fazla catch blogu
        3- tek try ve kapsamlı tek catch


     */


    public static void main(String[] args) throws IOException {
        try {
            String dosyayolu = "src/day40_Exceptions/Notlar.txt";

            FileInputStream fileInputStream = new FileInputStream(dosyayolu);

            int k ='a';

            while((k= fileInputStream.read()) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolunda hata var, dosya bulunamadı");

        }catch (IOException e){
            System.out.println("Dosyadaki bilgiler okunamadı");
        }
    }
}
