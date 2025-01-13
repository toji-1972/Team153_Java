package day30_dateTime_varags;

import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime LocalTime = java.time.LocalTime.now();
        // calistigi satırda sistemden saat bilgisini alır
        System.out.println(LocalTime);



        LocalTime localTimeSaniye = java.time.LocalTime.ofSecondOfDay(24567);
        System.out.println(localTimeSaniye);

        LocalTime localTimeJaponya = java.time.LocalTime.now(ZoneId.of("Japan"));
        System.out.println(localTimeJaponya);


        // ...get(); zamandan istenen bolumunu alır.
        System.out.println(LocalTime.getHour());

        // plus...() zamanı ileri alır, minus...() zamanı geri alır
        System.out.println(LocalTime.plusHours(234).plusMinutes(23));
        System.out.println(LocalTime.minusMinutes(25000));
        // with...() elde edilen saatin istenen bolumunu istenen deeger ile getirir
        System.out.println(LocalTime.withSecond(0).withNano(0));



    }
}
