package day11_stringManipulations;

public class C06_replace {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        System.out.println( str.replace('a','A'));

        System.out.println(str.replace("zevkli", "eglenceli"));

        str = str.replace("J", "j");
        System.out.println(str);


        // butun e'leri silin

        System.out.println(str.replace("e", ""));

        //

    }
}
