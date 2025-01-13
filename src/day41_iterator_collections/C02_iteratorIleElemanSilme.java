package day41_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_iteratorIleElemanSilme {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,6,2,8,1,2,5,3,8,1,9));

        // iterator ille tum elemanları gpzden gecirin
        // cift sayiları siln


        Iterator iterator = sayilar.iterator();

        while (iterator.hasNext()){ // yanıda leman oldugu surece isleme devam et

            int sayi = (Integer) iterator.next();

            if (sayi%2==0){
                    iterator.remove();
            }
        }
        System.out.println(sayilar); // [3, 1, 5, 3, 1, 9]

        // iterator kullanarak
        // 4'den buyuk sayiları silin

        // Iterator biz demeden hicbir hareket yapaz
        // Yukarıdaki islemi dusunecek olursak
        // iterator su anda
        // yeni bir islem yapmak istersek
        // iterator'a yeniden deger atamalıyız


        iterator = sayilar.iterator();

        while (iterator.hasNext()) { // yanında eleman olduğu sürece devam et

            int sayi = (Integer)  iterator.next();

            if (sayi > 4){
                iterator.remove();
            }

        }
        System.out.println(sayilar);



    }
}
