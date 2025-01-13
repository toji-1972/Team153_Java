package day36_overriding_pollymorphism;

public class C02_Child extends C01_Parent{

    /*
    Overriding parent_child iliskisi olan class'lardan olusur

    Eger parent class'da var olan bir method
    Child class'da olusturulursa
    buna overriding(gecersiz kılma) denir

    bu durumda parrent class'daki method overriding(gecersiz kilinan)
    child class'daki ise Overriding method(gecersiz kilan)
    olarak adlandirilir
     */






    public void method(){
        // Overrides:method in class C01_Parent
        // gecersiz kılar


    }
    public void methhod2(){
        // bir method un override edebilmesi icin
        // safece isminin aynı olması yetmez
        // sıgnature'ı da ayni olmalıdır
        // method signeture = method isim + parametrelerin data
        // signature ==> method2

    }
    public void method3(int a, String b){
        // signature ==> method3 int String
        System.out.println(a);

    }
    @Override
    public int method4(int a){
        // @Override'a notasyon denir
        // ve kucuk bir goreve sahiptir
        // sinirli miktarda kod icerir

        // @Override notasyonu
        // parent class'daki overriding method'lari takip eder
        // ve override etmeyi engelleyen bir durum olusurs CTE verir
        // tekrar override edebilene kadar CTE gitmez
        return 4*a;
    }

    public String method5(String b){
        //@Override notasyonu kullanmak zorunlu degildir
        // ancak @Override kullnamzsak
        // overriding kullanıldıgında java CTE vermez
        // bu iki method yollarını ayırır
        // ve bagimsiz olarak hayatlarını devam ettirirler
        return b.toLowerCase();
    }
    public static void method6(){
        // static methodlar override edilemez
        // ayni isimde ve aynı signature da method olusturabiliriz
        // ama java bunları overriding method olarak kabul etmez
        // birbirinden bagımsıxz metthod'lar kabul eder

        // parent class'daki method static olarak isaretlenmisse
        // Child class'daki static olöak zorundadır
        // static olmazzsa CTE olusur
    }
    private void method7(){
        // parent class'daki method private oldugundan
        // o methodu goremez ve dogal olarak
        // override edemez
    }


    public final void method8(String a){
        // overridden method is final
        // overridden method final oldugundan degistirilemez
        // yani override edilemez
        // parametreyi CTE'yi eklemek icin yazdik
    }

    @Override
    public double method9(double a) {
        // her ne kadar signature'a dahil olmasa da
        // access modifier da overriding icin onemlidir
        // Psrent class daki method pubkic oldugunda
        // sadece public olabilir
        // cunku child parent i kısıtlayamaz
        return a-4;
    }




    void method10(){
        // parent class daki method
        // defaoult access modifier a sahip oldugundan
        // Child class daki  defaoult acc.mod, projected veya public ola...
    }





    public void methof11(){
        // her ne kadar signature'a dahil olmasa da
        // return type da overriding icin onemlidir
        // parent class'daki methodun return type'i
        //  void veya pirimitive ise
        // child classs daki method aynı return type a sahip OLMALIDIR


    }
    public int method12(){
        return 10;
    }

    public String method13(){
        // parent class daki return type non-primitive ise
        // child class daki return type
        // <<prent class daki ile ayni veya
        // o class'in child class ı olabilir
        return "";
    }
    public Object method14(){
        // parent class daki method'un return type'ı Object
        // Child class'daki methood'un reurn type'ı
        // Object veya Object'in child class'i olabilir
        // yani String Character,Integer, List<>...
        return 5;
    }


    @Override
    public void method15(){
        // overriding ve overridden method ikisi birden calismaz
        // olusturulan objenin constructor ve data type'ina gore
        // ikisiniden SADECE biri calisir

        // Eger ikisinin de calismasini isterseniz
        // child class'daki method'dan parent class'daki method
        // call edilebilir
        super.method15();
    }
}
