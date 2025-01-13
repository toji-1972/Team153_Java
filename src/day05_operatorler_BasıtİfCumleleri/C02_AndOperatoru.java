package day05_operatorler_BasıtİfCumleleri;

public class C02_AndOperatoru {
    public static void main(String[] args) {


        boolean deger1 = true;
        boolean deger2 = false;
        boolean deger3 = true;
        boolean deger4 = false;

//        int a = 10;
//        int b = 15;
//
//        boolean genelSonuc = (deger1 = a<b) && (deger2 = a>0) && (deger3 = b<0) && (deger4 = b>10);
//
//        System.out.println("Genel Sonuc : " + genelSonuc); // false
//        System.out.println("deger4 : " + deger4); // false

        // islem sırasında son atama yapılmadıgı ıcın ıslem
        // kısmen hızlı olur AMA son atamadaki islem onemli
        // ise o islem yapilmamıs oldu.



        deger1 = true;
        deger2 = false;
        deger3 = true;
        deger4 = false;

        int a = 10;
        int b = 15;

        boolean genelSonuc = (deger1 = a<b) & (deger2 = a>0) & (deger3 = b<0) & (deger4 = b>10);

        System.out.println("Genel Sonuc : " + genelSonuc); // false
        System.out.println("deger4 : " + deger4); // true

        //  islem odaklı oldugu icin & operatoru 4 islemi de yapar
        // 4 islemi de kontrol ettigi icin && operatorune gore biraz yavas olut
        // tum islemleri yaptıgı icin deger4 e dogru degerin atamasını saglar





    }
}
