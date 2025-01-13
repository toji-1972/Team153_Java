package day11_stringManipulations;

public class C05_nullPointer {
    public static void main(String[] args) {

        String ogr1 = "Yahya Guksoy";
        String ogr2 = "Elif Evsen";

        String ogr3;


        /*
        * bir kod blogunun icinde deger atamadan variable deklare edebilir
        * ANCAAKKKK deger atamadan KULLANILMAZ.
        *
        * PEKİ "" atasak
        *
        *
        * ""veya   "" otmatik variable kullanabilmek icin guzel olur
        * ANCAKKK Java bunları da ism gibi
        *
        * */

        String ogr4= "";
        String ogr5 = "  ";
        String ogr6 = "      ";

        System.out.println(ogr4);


        String ogr7 = null;
        System.out.println(ogr7);
        System.out.println("ogrenci1 : " + ogr1);
        System.out.println("ogrenci2 : " + ogr2);
        System.out.println("ogrenci3 : " + ogr7);






    }
}
