package day20Arrays;

import java.util.Arrays;

public class C03_BinarrySearch {

    public static void main(String[] args) {

        int[] arr = {3, 11, 5, 0, 8, 2, 9};

        System.out.println(Arrays.binarySearch(arr, 3)); // -7
        System.out.println(Arrays.binarySearch(arr, 11));// -8
        System.out.println(Arrays.binarySearch(arr, 5));// -7
        System.out.println(Arrays.binarySearch(arr, 0));// 3 OK
        System.out.println(Arrays.binarySearch(arr, 8));// -7
        System.out.println(Arrays.binarySearch(arr, 2));// 5 OK
        System.out.println(Arrays.binarySearch(arr, 9));// 6 OK


        // ONEMLİ NOT : binary search kullandıgı ozel algoritma ile daha az karsılastırma yaparak
        // istenilen elemente ulasmayı hedefler. ANCAKK algoritması gergi array'in mutlaka sırlanmıs olması gerkir.
        // Sırlaam yapilmadan binary search calıstırılırsa sonucun ne olacagını bilemeyiz.
        // Dogru da olabilir yanlıs da

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 3));// 0
        System.out.println(Arrays.binarySearch(arr, 11));// 1
        System.out.println(Arrays.binarySearch(arr, 5));// 2
        System.out.println(Arrays.binarySearch(arr, 0));// 3
        System.out.println(Arrays.binarySearch(arr, 8));// 4
        System.out.println(Arrays.binarySearch(arr, 2));// 5
        System.out.println(Arrays.binarySearch(arr, 9));// 6


        String[] srr = {"K", "Q", "C", "Y", "N"};

        // srr'de "C" var mi ?


        Arrays.sort(srr);
        System.out.println(Arrays.toString(srr)); // [C, K, N, Q, Y]

        // array'de olmayan elementler için
        // olmadıgını belirleyecek
        // ve olsaydı kacıncı SIRADA olacagını yazdırır

        System.out.println(Arrays.binarySearch(srr, "C"));//0
        System.out.println(Arrays.binarySearch(srr,"Q"));// 3
        System.out.println(Arrays.binarySearch(srr, "B"));//-1
        System.out.println(Arrays.binarySearch(srr, "L"));//-3
        System.out.println(Arrays.binarySearch(srr, "T"));//-5
        System.out.println(Arrays.binarySearch(srr, "Z"));//-6



        



    }


}
