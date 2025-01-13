package day31_strinBuilder_accessModifier;

public class C03_StringMethodlari {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candir");

        /*
            1- StringBuilder'da olmayan ama String'de olan method'lari kullanmak icin
            toString() ile String'e cevirebiliriz

            2- Kullandıgımız hazır methodlar string builder donduruyorsa yapılan degisiklik kalıcı olur
            (append, )
            ANCAKKK baska data turunde bir deger donduruyorsak yapılan deger kalıcı olmaz
         */


        // sb'de "a" harfi varmı ?

        System.out.println(sb.toString().contains("a")); // true

        System.out.println(sb.substring(4)); //  Candir

        System.out.println(sb); // Java Candir

        System.out.println(sb.length()); // 11

        System.out.println(sb.indexOf("a")); // 1
        System.out.println(sb.lastIndexOf("a")); // 6


    }
}
