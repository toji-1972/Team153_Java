package day30_dateTime_varags;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String isim = "Canan";

        isim.toUpperCase();
        isim.substring(1,3); // onb >== consol'da goremeyiz cunku yazdırımdık
                            //   ==> kaydetmedigimiz icin sonra da yazdıramayız
                            // kod calıstı ama bırseye yaramadı


        // String 'de hazır method ile olusturulan degisiklikel kalıcı olmaz


        System.out.println(isim); //toUppercase Canan: stringde methodla yapılan degisiklikler kalıcı olmaz

        List<String > isimler = new ArrayList<>(Arrays.asList("Sumeyra", "Yusuf", "Faig", "Canan"));

        System.out.println(isimler);  // [Sumeyra, Yusuf, Faig, Canan]

        System.out.println(isimler.remove(1)); // Yusuf
        System.out.println(isimler.remove("Canan")); // true

        System.out.println(isimler); //[Sumeyra, Faig]





    }
}
