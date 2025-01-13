package day03_dataCasting_wrapperClasses;

public class C03_ExplicitNarrowing {
    public static void main(String[] args) {

        /* Explicit narrowing yaptigimizde
        * Java atamas yaptıgımız değeri,
        * atama yapılan variable in data türüne uyacak sekilde daraltir*/

        int sayi1 = 50;

        byte byt1 = (byte)sayi1;

        System.out.println("50 nin byte olarak degeri : " + byt1);

        int sayi2 = 130;

        byte byt2 = (byte)sayi2;

        System.out.println("130' nin byte olarak degeri : " + byt2); // -126

        int sayi3 = 140;

        byte byt3 = (byte)sayi3;

        System.out.println("140' nin byte olarak degeri : " + byt3);

        int sayi4 = 260;

        byte byt4 = (byte)sayi4;

        System.out.println("260' nin byte olarak degeri : " + byt4);

        int sayi5 = 780;

        byte byt5 = (byte)sayi5;

        System.out.println("780' nin byte olarak degeri : " + byt5);

        double dbl1 = 34.45;

        byte byt6 = (byte)dbl1;

        System.out.println("34.45 'nin byte olarak degeri : " + byt6);


        int a = 43;

        int b = a;  // bildigimiz atamadir
                    //aout widening veya expilicit narrowing degildir.





    }
}
