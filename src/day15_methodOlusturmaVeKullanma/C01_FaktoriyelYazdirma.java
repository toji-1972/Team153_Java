package day15_methodOlusturmaVeKullanma;

public class C01_FaktoriyelYazdirma {
    public static void main(String[] args) {

        // Kullanıcıdan 17 den kucuk bir pozit if tamsayı parametre olarak  alıp
        // Faktoriyel degerlerini yazdıran bir method olusturun


        faktoriyelYazdir(5);
        faktoriyelYazdir(7);



    }

   public static void faktoriyelYazdir(int sayi){

        long carpim = 1;

       for (int i = sayi; i >=1 ; i--) {

           carpim *= i;


       }
       System.out.println(sayi + "! = " + carpim);
   }

}
