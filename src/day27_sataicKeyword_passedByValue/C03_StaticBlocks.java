package day27_sataicKeyword_passedByValue;

public class C03_StaticBlocks {

    C03_StaticBlocks() {
        System.out.println("constructor calisti");

    }

    static {
        System.out.println("satatic blok2 calisti");

    }

    public static void main(String[] args) {
        System.out.println("main method calisti");


    }


    static {

        System.out.println("static blok1 calisti");

        /*
        static bock class taki herseyden hatta main methoddan bile once calisir

        EGER class calismay abaslamadan once yapılamsı gereken bir islem varsa
        (ornegin database baglantıs yapmak)


         */
    }


    public static void method(){

        System.out.println("method calisti");

    }




}
