package day10_stringManipulation;

public class C06_contains {
    public static void main(String[] args) {

        String str ="Bugun cok ama cok mutluyum";

        System.out.println(str.contains("u")); // true

        System.out.println(str.contains("b")); // true


        //System.out.println(str.contains('g'));


        /* CharSequance : char dizilimi
        *                   char'larin yan yana gelmesiyle olusan nesne
        *                   yaaaaaannnniii bildigimiz String*/


        System.out.println(str.contains("cok ama")); // true

        System.out.println(str.contains("n a")); // false
        // yan yana 3 karakter olarak "n a" arar

        System.out.println(str.contains(""));


        // "Bugun cok ama cok mutluyum"

        // verilen str metninin case sensetive omadan B icerdigini kontrol edelim

        // containsIgnoreCase() diye bir method olmadıgından
        // hem ana metni hem de aranan metni toLowercase() veya toUoppercase() yapip
        //case farklılıklarından kurtuluruz


        System.out.println(str.toUpperCase().contains("B")); // true
        System.out.println(str.toLowerCase().contains("b")); // true











    }
}
