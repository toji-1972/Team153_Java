package day34_inheritence;

public class C05_Child extends C04_Parent {
    String str = "Child class";
    String t = "Hamza";
    String k = "Ahmet";

    public static void main(String[] args) {
        C05_Child obj = new C05_Child();
        obj.method1();
    }
    public void method1(){

        String str = "Child class";
        String t = "Cansu";
        String z = "Oguzhan";


        /*
        1Herhangi bir scope da herhangi bir variable kullanmak istedigimizde Java ilk once scope a bakar.
        2-Scope da bulamazsa class level a bakar
        3- Class level da da bulamazsa parent class veya parent class lar a bakar

        Kullanıcı isterse bu sıralamayı baypas edebilir
        Eger scope'u byPass edip direkt class level'ı kullanmak isterse this...
        Eger scope'u ve class level'i byPass edip
        direkt parent class'a gitmek isterse super.....kullanılabilir

        baslangic seviyesi soylendiginde
        o seviyeden aramaya baslar
        bulamazsa ileriye dogru gider
        ama asla geri donusu olmaz

        
         */


        System.out.println(str); // Child class method ==> scope'da buldu ve kullandı
        System.out.println(this.str); // Child class ==> class level'dan aramayı baslatır
                                        //               bulur ve kullanır
        System.out.println(super.str); // Java candir ==>






        System.out.println(z); // Oguzhan ==> scope'da bulur ve yazar
        //System.out.println(this.z); // direkt class level'a gider,
                                    // bulamayınca parent'a da bakar
                                    // orada da yok CTE
        //System.out.println(super.z); //aramaya parent'dan baslar
                                        //parent'da z yok CTE



        System.out.println(t); // Cansu ==> scope'da buldu ve kullandı
        System.out.println(this.t); // Hamza  scope'u pass gecti, direkt class level a baktı
        //System.out.println(super.t); // aramaya parent'dan baslar
                                      // bulamadıgı icin CTE olur

        System.out.println(k); // Ahmet ==> scope'da bulamadı ve class level'a gitti
        System.out.println(this.k); // Ahmet scope'u pass gecip direkt class'da arar
        //System.out.println(super.k); // Aramaya parent'dan baslar, bulamadıgı icin CTE olur


        System.out.println(s); // Anil ==> scope'da ve class level'da da bulamadı
                                // Parent class'a gider
        System.out.println(this.s); // Anil ==> class da bulamayınca parent'a gider
        System.out.println(super.s); // Anil ==>


    }

}
