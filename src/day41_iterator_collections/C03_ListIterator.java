package day41_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,6,2,8,1,2,5,3,8,1,9));

        // LıstIterator kullanarak
        // sayilar Listesindeki elemanları 1 arttırın

        ListIterator listIterator = sayilar.listIterator();

        while (listIterator.hasNext()){

            int eskiDeger = (Integer) listIterator.next();

            listIterator.set(eskiDeger+1);

            System.out.println(sayilar);

            

        }
    }
}
