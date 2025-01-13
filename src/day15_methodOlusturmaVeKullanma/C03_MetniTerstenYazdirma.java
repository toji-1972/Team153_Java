package day15_methodOlusturmaVeKullanma;

public class C03_MetniTerstenYazdirma {
    public static void main(String[] args) {
        // Verilen metni tersten olusturran bir method olusturun

        terstenMetinYazdirma("Java bu isi biliyor");

    }

    public static void terstenMetinYazdirma(String metin){

        for (int i = metin.length()-1; i >=0 ; i--) {

            System.out.print(metin.charAt(i));
        }

    }
}
