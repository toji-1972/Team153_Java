package day30_dateTime_varags;

public class C07_Varargs {
    public static void main(String[] args) {

        // Kac tane argüment yazarsak yazalım
        // İlk argument harici gaeriye kalanları toplayıp
        // bulunan toplam ile ilk argumanın carpimini yzdiran bir method olusturun


        islem(1,2,3,4,5,6,7); // 27
        islem(1,2,3,4,5); // 14
        islem(1,2,3); // 5
        islem(1); // 0





    }
    public static void islem (int ilkEleman, int...geriyeKalanlar){

        int toplam = 0;

        for (int i = 0; i < geriyeKalanlar.length; i++) {
            toplam += geriyeKalanlar[i];
        }
        System.out.println("islem sonucu : " + ilkEleman*toplam);

    }
}
