package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {3,6,7,8};

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];

        }
        System.out.println(toplam); //24


        List<String> isimler = new ArrayList<>(Arrays.asList("yigit", "Elif", "Yusuf","tugba"));


        toplam = 0;
        for (int i = 0; i <isimler.size() ; i++) {

            toplam += isimler.get(i).length();

        }

        System.out.println("islemlerdeki toplam harf sayisi: " + toplam);


        // List sorusunu for-each loop ile yapalim

        System.out.println(Arrays.toString(arr));


        toplam = 0;
        for (int each :arr){ // arr'deki herbir int'i bana getir
                             // artık bizim oglan : each
            toplam += each;

        }
        System.out.println("Array'deki sayiların toplamı: " + toplam);

        System.out.println(isimler);
        toplam = 0;

        for (String each: isimler){ // isimler listesindeki herbir string i bana getir
            toplam += each.length();

        }


    }
}
