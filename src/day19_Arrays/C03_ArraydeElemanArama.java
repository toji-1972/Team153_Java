package day19_Arrays;

public class C03_ArraydeElemanArama {
    public static void main(String[] args) {

        // Verilen bir arrayde istenen bir eleman olup olmadıgını
        // ve varsa kec kere kullanıldıgını yazdırın

        int[] sayilar = {3,4,5,7,3,4,6,8,3,9,7,3,5,4};

        int aranansayi = 3;

        int sayac = 0;



    // Verilen br arrey e istenilen elaemanın olup olmadıgını
    // ve varsa kac kere kullamıldıgını yazdıran bir method olusturun



    }



    public  static void elemanAra(int[] sayilar, int arananSayi){

        int sayac = 0;

        for (int i = 0; i <sayilar.length ; i++) {

            if (sayilar[i] == arananSayi){
                sayac++;
            }
        }
        System.out.println(
                sayac == 0 ?
                        "Array de aranan sayı bulunmuyor" :
                        "Aranan sayi array de" + sayac + "adet bulunuyor"

        );

    }


}
