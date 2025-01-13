package day27_sataicKeyword_passedByValue;

public class C04_StaticOlmayanBlok {
    C04_StaticOlmayanBlok() {
        System.out.println("constructor calisti");

    }

    {
        System.out.println("satatic blok2 calisti");

    }

    public static void main(String[] args) {
        System.out.println("main method calisti");

        C04_StaticOlmayanBlok obj1 = new C04_StaticOlmayanBlok();
        C04_StaticOlmayanBlok obj2 = new C04_StaticOlmayanBlok();
        C04_StaticOlmayanBlok obj3 = new C04_StaticOlmayanBlok();

    }


     {

        System.out.println("static blok1 calisti");

        /*
        statcic olmasyan bloklar ise
        EGER bir obje olusturmadan once yapılması gerken ayarlar varsa
        bu ayarları yapmak üzere kullanılır
         */
    }


    public static void method(){

        System.out.println("method calisti");



    }
}
