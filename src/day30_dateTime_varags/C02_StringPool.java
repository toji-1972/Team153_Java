package day30_dateTime_varags;

public class C02_StringPool {
    public static void main(String[] args) {

        String str1 = "Ali"; //
        String str2 = "Ali"; //
        String str3 = new String("Ali"); //
        String str4 = "A" + "li"; //
        String s = "A"; //
        String t = "li"; //
        String str5 = s + t ; //
        String r = "ali"; //

        String str6 = r.substring(0,1).toUpperCase()+ r.substring(1); // 2
        System.out.println(str1.equals(str2)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str3)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str5)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str6)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali  ==> true
        System.out.println("======================");


        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false
        System.out.println(str1 == str6); // false
        System.out.println(str1 == "Ali"); // true


        /*
        equals() sadece metinlere bakar,
        metinler aynı ise true, metinlerde farklılık varsa false verir

        == ise hem metin hem de referansa bakar
        hem metin hem de referans aynı ise false olur

         */














    }
}
