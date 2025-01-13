package day21_multiDimensiomalArrays;

public class C03_CiftelementAdediniBulma {
    public static void main(String[] args) {

        int[][] arr = {{2,3},{3,6,8}, {1,4,9,5},{1}};

        // arr'deki elementlerin kac tanesinin cift oldugunu yazdırın


        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] % 2 == 0){
                    sayac++;
                }
            }

        }
        System.out.println("Array'deki cift sayi adedi: " +sayac);



        // terk sayı adedini yazdırın
        sayac = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

              if (arr[i][j] % 2 !=0){
                  sayac++;
              }
            }
        }
        System.out.println("Arraydeki tek sayi adedi: " + sayac);





    }
}
