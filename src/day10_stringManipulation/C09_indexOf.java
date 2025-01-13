package day10_stringManipulation;

public class C09_indexOf {
    public static void main(String[] args) {
        String str = "Java bana cok mantıklı gelıyor";

        System.out.println(str.contains("cok")); // true
        System.out.println(str.startsWith("cok")); // false
        System.out.println(str.endsWith("cok"));// false
        System.out.println(str.equals("cok")); // false
        System.out.println(str.equalsIgnoreCase("cok")); // false

        // verilen metinde "cok" oldugunu biliyoruz ama yerini bilmiyoruz
        // indexof(arananMetin) aranana metnin cumlrdeki ilk kullanımını bulur ve indexini bize getirir

        System.out.println(str.contains("a")); // true

        System.out.println(str.indexOf("a")); // a nın ındex olarak yerini soyler "1"

        //JAva bana cok mantıklı geıyor

        System.out.println(str.indexOf("cok")); // 10

        System.out.println(str.indexOf("mantık")); //14

        // a'nin ilk kullanın index'inin 1 oldugu bilindigine gore
        // a'nin ikinci kullanım ındex'ini yazdırın

        System.out.println(str.indexOf('a',1)); // 1

        System.out.println(str.indexOf('a',2)); // 3

        // a'nin 2. kullanım index'inin 3 oldugunu biliyorsak
        // 3. kullanım index'ini yazdirin

        System.out.println(str.indexOf("a",4)); // 6

        System.out.println(str.indexOf("B")); // -1 olmayan bir element varsa -1 diye bir index yokmus (yani yok digrcgiz)



    }
}
