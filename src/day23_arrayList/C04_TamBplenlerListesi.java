package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_TamBplenlerListesi {
    public static void main(String[] args) {
        // verilen pozitif bir tamsyaiyi,
        // tam bolebilen tum tamsayıları
        // bir liste olarak yazdırınız
        //

        System.out.println(pozitifTamBolenlerListesi(30));

        System.out.println(pozitifTamBolenlerListesi(90));





    }

    public static List<Integer> pozitifTamBolenlerListesi(int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi % i == 0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }

}
