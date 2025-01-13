package day41_iterator_collections;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,6,2,8,1,2,5,3,8,1,9));

        int toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {

            toplam += sayilar.get(i);

        }

        System.out.println("Elamanların toplamı for loop : " + toplam);

        // INDEX kullanmadan ekemanların toplamini bulun

        toplam = 0;

        for (Integer each : sayilar){
            toplam += each;
        }

        System.out.println("Elemanların toplamı for each loop : " + toplam);

        // sayilar listesindeki her elemanı 1 arttırın


        for (int i = 0; i < sayilar.size(); i++) {

            int eskiDeger = sayilar.get(i);

            sayilar.set(i, eskiDeger+1);

        }

        //                              3,4,6,2,8,1,2,5,3,8,1,9
        System.out.println(sayilar); // [4, 5, 7, 3, 9, 2, 3, 6, 4, 9, 2, 10]



        // INDEX kullanmadan sayilar listesindeki elemanları 1 arttirin


        // Collections da bazi yapilar INDEX desteklemez
        // Bu durumda index olmadan arraylist vb. yapilardaki elemanları
        //tek-tek bize getiren for each loop var ama o da atama yapamaz


        for (Integer each : sayilar){
            each +=1;
            System.out.print(each + " ");
        }//5 6 8 4 10 3 4 7 5 10 3 11

        System.out.println(" ");

        System.out.println(sayilar); //

        // eger index olmadan sayiları gozden gecirmek
        // ve gerekrse degistirmek icin alternatif olarak
        // Iterator veya ListIterator kullanabiliriz

        List<Integer> nymaralar = new ArrayList<>(Arrays.asList(4,5,7,3,9));

        System.out.println(nymaralar); // [4, 5, 7, 3, 9]

        Iterator iterator = nymaralar.iterator();

        System.out.println(iterator.hasNext());// True  iterator a daha eleman varmi diye sorar

        System.out.println(iterator.next()); // 4 iterator'i bir saonraki konuma getirir

        iterator.remove(); // uzerine atladıgı elementi ister


        System.out.println(nymaralar);//[5, 7, 3, 9]







    }
}
