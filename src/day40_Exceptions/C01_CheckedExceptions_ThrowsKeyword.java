package day40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions_ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException {

        String dosyayolu = "src/day40_Exceptions/Notlar.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyayolu);

        /*
             Unhandled exception: java. io. FileNotFoundException
             ya dosyayı bulamazsam, bana bir yol goster diyor

             Bir exception olasılıgı varsa
             bunu kontrol altına almanın(handle) en iyi yolu try-catch'dir

             Ama dosyaya ulasamazsak da kıdun calısması bir anlam ifade etmeycekse
             try-catch ile handle edip yola devam etmek anlamsız olur

             EGER sadece kodlatımızı calıstırmak
              ve exception olursa mudahale etmek istersek
              metod deklerasyonuna throws keyword ile muhtemel exceptions'u yazarız

              throws FileNoFoundException
              bu yazimin iki amcı var
              1-Java'ya bu risdkiin farkında oldugumuzu
              ve bir sorun olursa
        */

        //String str = 20;
        // Required type = String
        // Provided int

        // String str = ""; // Cannot resolve symbol 'String'

        // String str= ""; Not a statement


    }
}
