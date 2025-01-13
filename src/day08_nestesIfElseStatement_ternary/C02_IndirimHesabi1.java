package day08_nestesIfElseStatement_ternary;

import java.util.Scanner;

public class C02_IndirimHesabi1 {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                     10 urun veya daha az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                     10 urun veya daha az alirsa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);

        System.out.println("urun adedini girin");
        int urunAdedi = scanner.nextInt();

        System.out.println("Indirimsiz urun fiyatini girin");
        double urunfiyat = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi E : Evet, H : Hayir");
        char kart = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat = urunfiyat*urunAdedi;

        //Ana degisken kart olup olmamasi

        if(kart == 'E'){
            if(urunAdedi < 0 || urunfiyat <= 0){
                System.out.println("Urun adedi veya fiyat yanlis");
            }else if (urunAdedi == 0){
                System.out.println("Bizi tercih ettiginiz icin tesekkur ederis: Yine bekleriz");
            }else if (urunAdedi > 10){
                System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat * 80 / 100);
            }else{
                System.out.println("%15 toplam indirimli fiyat : " + indirimsizToplamFiyat * 85 / 100);
            }

        }else if (kart == 'H'){
            if(urunAdedi < 0 || urunfiyat <= 0){
                System.out.println("Urun adedi veya fiyat yanlis");
            }else if (urunAdedi == 0){
                System.out.println("Bizi tercih ettiginiz icin tesekkur ederis: Yine bekleriz");
            }else if (urunAdedi > 10){
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85 / 100);
            }else{
                System.out.println("%10 toplam indirimli fiyat : " + indirimsizToplamFiyat * 90 / 100);
            }
        }else{
            System.out.println("Kart varmı sorusuna cevap olarak E veya H girmelisiniz...");
        }




    }
}
