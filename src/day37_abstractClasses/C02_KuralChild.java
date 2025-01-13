package day37_abstractClasses;

public class C02_KuralChild extends C01_KuraliOlmayanParent{

    /*
    Klasik inheritence'da
    Child class kraldir


    1_İstedigi class i parent ediinebilir
    2- parent classs daki ozellikleri direkt kullanabilir
    3- parent class'da var olan methodlari isterse kendine uyarlayabilir
    4-isterse parent class da olmayan yeni ozellikler ekleyebilir
     */

    public static void main(String[] args) {}

    public void maethod7(){
        method1();
    }

    @Override
    public int method2() {
        return 40;
    }

    public String method3(){
        return "Ali Koç";
    }
}
