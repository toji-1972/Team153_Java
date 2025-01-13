package day20Arrays;

import java.util.Arrays;

public class C02_ArrayHafizaKullanimi {
    public static void main(String[] args) {
        // Arrayler hafizada pirimitive data turlerindeki dataların degerlerini
        // non-pirimitive data turlerindeki datalarin ise referanslarını barındırır


        String[] isimler = {"Yusuf", "Yigit", "Seyyid"};

        int[] sayilar = {4, 5, 6, 7};

        isimler[0] = "Sumeyra";

        System.out.println(Arrays.toString(isimler));


        /*

         */

        String[] srr = {"Metin", "Mehmet", "mahmut", "Faig", "elif"};

        Arrays.sort(srr);

        System.out.println(Arrays.toString(srr));
        // [Faig, Mehmet, Metin, Mustafa, Elif, mahmut]




    }
}
