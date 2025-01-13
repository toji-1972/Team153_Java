package day20Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_harfleriSiraliOlarakYazdir {
    public static void main(String[] args) {

        // kullnaıcıdan bir cumle isteyin,
        // cumleden sadece harflei alıp
        // harfleri naturalOrder a uygun olarak sıralı sekilde yaxdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");

        String cumle = scanner.nextLine();

        cumle = cumle.replaceAll("\\W", ""); // w==> harf, rakam ve
        cumle = cumle.replaceAll("\\d", ""); // d==> sayilar
        cumle = cumle.replaceAll("_", "");

        //elimizde sadece harflerden olusan bir cumle kaldı

        //System.out.println(cumle);

        // sıralama yapabilmek icin array e cevirelim ve sonrta sort methodunu kullanalım

        String[]  harfler = cumle.split("");

        Arrays.sort(harfler);

        System.out.println(Arrays.toString(harfler));


        for (int i = 0; i < harfler.length; i++) {
            System.out.print (harfler[i]);
        }

    }
}
