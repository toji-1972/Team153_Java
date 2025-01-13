package day30_dateTime_varags;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class C03_LocalDate {
    public static void main(String[] args) {

        // LocalDate clası'da LocalTime() class'ina benzer ozelliklere sahiptir

        LocalDate LocalDate = java.time.LocalDate.now();
        System.out.println(LocalDate);

        // Japonyadaki tarihi yazdıralım

        LocalDate JaponyaTarihi = java.time.LocalDate.now(ZoneId.of("Japan"));
        System.out.println(JaponyaTarihi);

        LocalDate dogumtarihi1 = java.time.LocalDate.of(1990,10,15);
        System.out.println(dogumtarihi1);
        LocalDate dogumtarihi2 = java.time.LocalDate.ofYearDay(1990,234);
        System.out.println(dogumtarihi2);


        // dogumtarihi1 de dogan kisinin yasını yazdırın
        System.out.println(Period.between(dogumtarihi1, LocalDate));

        System.out.println(dogumtarihi1.isBefore(dogumtarihi2)); // false

        // 1990 artık yıl mı ?

        System.out.println(dogumtarihi1.isLeapYear()); // false


        // 2024 artık yıl mı ?
        System.out.println(LocalDate.isLeapYear());


        // 2000 yılı leap year mı?

        System.out.println(LocalDate.getDayOfWeek()); // MONDAY

        System.out.println(LocalDate.withMonth(1)); // 2024-01-25

        System.out.println(LocalDate.lengthOfMonth()); // 30


    }
}
