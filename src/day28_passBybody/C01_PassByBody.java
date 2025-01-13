package day28_passBybody;

public class C01_PassByBody {
    public static void main(String[] args) {

        int sayi = 20;

        kareYazdir(sayi); // kare yazdir method'unda 400 yazdiridi

        int a = 10;
        kareYazdir(a);

    }

    public static void kareYazdir(int sayi) {

        sayi = sayi*sayi;

        System.out.println(sayi);

    }
}
