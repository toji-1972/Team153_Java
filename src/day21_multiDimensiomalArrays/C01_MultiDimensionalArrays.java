package day21_multiDimensiomalArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {

        int a = 34;

        int[] b = {3,4,5};

        int[][] arr = {{2,3},{3,6,8}, {1,4,9,5},{1}};

        System.out.println(arr.length); // arr nin içerisnde kaç tane iniger array oldugunu gosterir = 4

        System.out.println();

        System.out.println(arr[0][1]); // 3
        System.out.println(arr[1][2]); // 8
        System.out.println(arr[2][1]); // 4
        System.out.println(arr[3]); //[I@4c203ea1

        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[3]));

        /*
        MultiDimensionalArray'lerde yazdirma islemi yapmadan once ne yazdırmak istedigimizi iyi bilmeliyiz

        - EGER yazdıracagımız sey en içindeki elementlerden biri ise
         System.out.println(arr[1][2]); direkt yazdırabiliriz

         -EGER inner array'lerden birini yazdırmak istiyorsak array yazdırmak istedigimiz icin
         System.out.println(Arrays.toString(arr[1])); kullanmalıyız

         -butun array'i tek seferde yazdırmak istersek
         System.out.println(Arrays.deepToString(arr)); kullanmalıyız

         */


        System.out.println(Arrays.toString(arr));
        // [[I@1d251891, [I@48140564, [I@58ceff1, [I@27f674d]


        System.out.println(Arrays.deepToString(arr));
        //[[2, 3], [3, 6, 8], [1, 4, 9, 5], [1]]













    }
}
