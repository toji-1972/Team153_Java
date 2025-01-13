package day21_multiDimensiomalArrays;

public class C04_EnUzunKelime {
    public static void main(String[] args) {

        // Verilen 2 katli string bir arraydeki en uzun kelimeyi yazdırın
        // Aynı uzunluktakı kelimelerde herhangi biri olabilir

        String[][] isimler = {{"Yusuf", "Emre", "Faig"},{ "Yigit", "Sumeyra", "Ahmet"}, {"Murat", "Emre"}};

        String enUzunKelime = isimler[0][0];

        for (int i = 0; i < isimler.length; i++) {

            for (int j = 0; j <isimler[i].length ; j++) {


                if(isimler[i][j].length()> enUzunKelime.length()){
                    enUzunKelime = isimler[i][j];
                }


            }
        }
        System.out.println("Array'deki en uzun kelime: " + enUzunKelime);


    }
}
