package day23_arrayList;

public class C05_AraliktakiAsalSayilariBulma {
    public static void main(String[] args) {

        // verilen baslangıc ve bitis sayilari (sinirlar dahil) arasındaki
        // asal sayilari yazdırın
        // Asal sayi : 1 ve kendisinden basa hicbir tamsayiya bolunemeyen sailadir
        // C04'deki method kullanılabilir

        int baslangic = 124;
        int bitis = 456;

        for (int i = 124; i <=456 ; i++) {

            // 124 asal mi?
           // for (C04_TamBplenlerListesi.pozitifTamBolenlerListesi(i).size()== 2)

            int tamBolenSayisi = C04_TamBplenlerListesi.pozitifTamBolenlerListesi(i).size();

            if (tamBolenSayisi == 2){
                System.out.print(i + " ");
            }
        }
    }
}
