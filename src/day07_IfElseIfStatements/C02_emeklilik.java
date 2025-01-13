package day07_IfElseIfStatements;

import java.util.Scanner;

public class C02_emeklilik {
    public static void main(String[] args) {

        // kullanıcıdan yasını ısteyin
        // yas 65 ten buyukse "emaklı olabılırsın"
        // yas 65 ten kucukse "emekli olmak icin daha ... yıl calısmalısın"
        // kullanıcı 20 den buyuk bır yas veya 80 den buyuk bır yas gırerse, gırılen yas ıcın emeklılık hesaplanamaz


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasınızı gırınız");

        double yas = scanner.nextDouble();

        if (yas < 20 || yas > 80)
        {
            System.out.println("Gırılen yas ıcın emeklılık saglanamaz");
        }
        else if (yas <= 65)
        {
            System.out.println("Emekli olabılırsın");
        }
        else
        {
            System.out.println("Emekli olmak ıcın daha " + (65-yas) + "yıl daha calısmalısın");
        }


    }
}
