package day09_switchStatement_stringManipulation;

import java.util.Locale;

public class C05_String_toUppercase_toLowercase {
    public static void main(String[] args) {

        String str ="Java candir";

        System.out.println(str.toUpperCase());

        System.out.println(str);


        /*string de method ile yapılan degisiklikler sadece o satıra aittir
        * stringde kalıcı degısıklilk yapmaz
        *
        * Eger method ile yapılan degıdıklıgın kalıcı omasını ıstıyorsak ATAMA yapmaliyiz
        * */

        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR

        /* eger bir dilde bir harfin kucuk veya buyuk harfi ingilizceden farklıysa (orngin I yi ingilizce olarak kucuk yazarsak i,
        ama Turkce yazparsak ı olur)

         */

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));

        str = str.toLowerCase();

        System.out.println(str); // java candir

        System.out.println(str.toUpperCase());// JAVA CANDIR

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // JAVA CANDİR






    }
}
