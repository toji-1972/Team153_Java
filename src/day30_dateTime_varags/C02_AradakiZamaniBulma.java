package day30_dateTime_varags;

import java.time.Duration;
import java.time.LocalTime;

public class C02_AradakiZamaniBulma {
    public static void main(String[] args) {

        // asagıdaki loop un calısma suresini bulunuz

        LocalTime baslangic = LocalTime.now();

        String str = "";
        for (int i = 0; i <100000 ; i++) {
            str +=i;
        }

        LocalTime bitis = LocalTime.now();


        System.out.println("baslangıc zamanı : " + baslangic);
        System.out.println("Bitis zamanı : " + bitis);

        // 1. yontem duratiion ile aradaki zamanı bulabiliriz
        System.out.println(Duration.between(baslangic, bitis));

        // 2. yontem ile saniye olarak aradaki farkı bulmak isterseniz

        System.out.println(baslangic.toSecondOfDay());
        // gece 00:00'dan baslangıc anna kadar gecen zamanı sanıye olarak verir

        System.out.println(bitis.toSecondOfDay() - baslangic.toSecondOfDay()); // 4


        // 3. yontem nanaosanaiye olarak farkı bulabiliriz

        System.out.println(bitis.toNanoOfDay() - baslangic.toNanoOfDay()); //4164587800



    }
}
