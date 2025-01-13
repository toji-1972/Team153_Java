package day10_stringManipulation;

public class C04_substring_ikiParametreli {
    public static void main(String[] args) {

        String str = "Java Candir";

        /*javada genel olarak baslangıc ındexleri dahil (inclusive)
        * bitis index'leri haric (exclusive) dir*/

        System.out.println(str.substring(2, 8));

        System.out.println(str.substring(5, 9));

        System.out.println(str.substring(0, 7));

        System.out.println(str.substring(0, 3));

        System.out.println(str.substring(1 ,2));

        System.out.println(str.substring(0,1));

        System.out.println(str.substring(7,8).toUpperCase());

        System.out.println(str.charAt(7));


        /*str.substring(7,8) ve str.charAt(7) ikisi de bize n getirir.
        *
        * ANCAKKK
        *
        * str.substring(7,8) n'yi string olarak getirir
        * str.charAt(7) n'yi char olarak getirir
        * */

        // "Java Candir"
        System.out.println(str.substring(2,2));
        System.out.println("Deneme");


        System.out.println(str.substring(5,2));//StringIndexOutOfBoundsException: begin 5, end 2, length 11 (java geri vites yapmaz)
                                               // baslangıc ındex'i bitis index'inden buyuk olamaz.





    }

}

