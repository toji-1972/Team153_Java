package day40_Exceptions;

import java.sql.SQLOutput;
import java.util.List;

public class C03_BaziExceptionTurleri {
    public static void main(String[] args) {

        // 1-StringIndexOutOfBoundsException
        // 2-ArrayIndexOutOfBoundsException

        // 3-NullPointerException

        String str = null;
        System.out.println(str); // null
        System.out.println("Ali" + str); // Alinull
        System.out.println(str.length()); // NullPointerException
        System.out.println(str.toUpperCase()); // NullPointerException

        List<Integer> sayilar = null;
        System.out.println(sayilar); // null
        System.out.println(sayilar.size()); // MullPointerException

        // 4- AritmeticException

        //System.out.println(9 / 0); // AithmeticException

        //5- Run time Exception
        //6- Exception
        //      Butun Exceptionların parentidir

        // 7- FileNotFoundException
        //      bir dosyaya ulasmak istedigimizde, dosya yolu hatalı oldugunda olusur

        // 8- IOException
        // Dosya okuma ve dosya yazma ile ilgili tum exception'larin parentidir


        // 9- InputMissmatchException :
        // Scanner ile deger alınırken, kullanılan method ile girilen deger
        // uyumlu olmadıgında olusur

        // 10- NumberFormatException

        String fiyat1 = "23";
        String fiyat2 = "45";

        System.out.println("Fiyatlar toplamı : " + Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2));

        // Fiyatların toplamı : 68

        // 11-

        String s = "Ali";

        Object obj =s;

        Integer a = 45;

        obj = a;

        Object c = 56;

        Integer d = (Integer) c;

        System.out.println(d); // 56

        String tt = (String) c; // c'nin data turu Object oldugu icin
        // String Object'e cast edilebilir ammmmaaa degeri 56
        System.out.println(tt);

        //String k = 56;

    }
}
