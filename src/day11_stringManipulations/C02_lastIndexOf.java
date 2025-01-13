package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String metin ="Bu java halledilecek";

        // ilk a'nin index'i

        System.out.println(metin.indexOf('a'));


        // cumlede gecen son a nın index i

        System.out.println(metin.lastIndexOf("a"));


        // a'nin 2. kullanimin index'i
        int birinciIndexa = metin.indexOf('a');
        System.out.println(metin.lastIndexOf('a', metin.indexOf('a')+1));

        //a'nin sondan 2. kullaniminin index'i
        int aninSonİndexi = metin.lastIndexOf("a");
        System.out.println(metin.lastIndexOf("a", aninSonİndexi-1));


        // Java'nin ilk kullanımının index'i
        System.out.println(metin.indexOf("Java"));

        // java nin son kullanımını index i
        System.out.println(metin.lastIndexOf("Java"));

        // Nu java halledilecek

        // h'nin ilk kullanaımın ındex i

        System.out.println('h'); // 8

        // h'nin son kullanımınnın index'i

        System.out.println(metin.lastIndexOf("h")); //

        // Java'nin ilk kullanımnın index i
        System.out.println(metin.lastIndexOf("Java"));

    }
}
