package day04_matematikselİşlemler_İncrement;

public class C05_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        /* eger yazıldıkları satırda tek basına iseler
         ++sayı ıle sayı++ ve --sayi ile sayi-- aynı islemi
          yaparlar ve aralarında bir fark olmaz

          bu islemlerin oldugu satırda yazdırma veya baska
           bir isşlem olursa aralarında bir fark olur*/

        int sayi = 20;

        sayi++;

        System.out.println(sayi); // 21

        ++sayi;

        System.out.println(sayi); //22


        sayi--;
        System.out.println(sayi); // 21

        --sayi;
        System.out.println(sayi);
    }
}
