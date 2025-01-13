package day38_Interfaces;

public interface I01_Interface {

    public abstract void method1();

  //  public void method2(){ //Interface abstract methods cannot have body
    // }

    /*
    Interface'ler full abstraction saglar
        method deklarasyonuna public veya abstract yazsaniz da yazmasaniz da
        butun method'lar public ve abstractir.

        Interface'lerdeki class level variable'lar da
        yazilsa da yazilmasa da public, static ve final'dir.
        Class level variable'lara deger atama mecburiyeti yoktur
        ANNNNCCCCAAAAKKK Interface'deki variable'lar dogustan final olduklarindan
        sonradan deger atama olasiligi yoktur, bu sebeple
        Interface'de olusturulan variable'lara deger atamak ZORUNLUDUR

        Bir class interface'i parent edinmek isterse
        extends keyword yerine implements keyword kullanmalidir.
     */


    void method2(); // public ve abstrct'tır
    public int method3();// public ve abstrct'tır
    abstract String method4();// public ve abstrct'tır
    public abstract boolean method5();// public ve abstrct'tır


    int sayi1 = 10;
    public int sayi2 = 20;
    static int sayi3 = 30;
    final int sayi4 = 40;
    public static final int sayi5 = 50;


    public static final int getSayi5 = 50;

   // public static final int sayi6;
   // Variable 'sayi6' might not have been initialized



}
