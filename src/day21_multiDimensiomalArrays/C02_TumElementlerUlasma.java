package day21_multiDimensiomalArrays;

public class C02_TumElementlerUlasma {
    public static void main(String[] args) {


        int[] sayilar = {3,8,0,2,6,1};

        // sayılar array'indeki tum elementlerin toplamını yazdırın


        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];

        }
        System.out.println("Sayılar arry'indeki elementlerin toplamı: " + toplam);




        int[][] arr = {{2,3},{3,6,8}, {1,4,9,5},{1}};

        // arr'deki tum elementlerin toplamını yazdırın


        toplam = 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

               toplam += arr[i][j];

            }

        }
        System.out.println("Arr arrayindeki tum elementlarin toplamı: " + toplam);




    }
}
