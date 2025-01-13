package day21_multiDimensiomalArrays;

public class C06_InnerArraySonElementToplami {
    public static void main(String[] args) {

        // verilen 2 katlı bir array de
        // her bir inner array in son elementlerinin toplamini yazdirin

        int [][] arr = {{2,3}, {3,6,8}, {1,4,9}, {1}};

        sonElementlerinToplaminiYazdir(arr);


    }
    // verilenn 2 katli bir array'de er bir inner array in
    // son elementlerinin toplamını yazdıran bir method olusturun
    public static void sonElementlerinToplaminiYazdir(int[][] arr){

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i][arr[i].length-1];
        }
        System.out.println(toplam);
    }





}
