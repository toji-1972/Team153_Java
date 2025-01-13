package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C02_FibonacciSerisi2 {
    public static void main(String[] args) {
        // Kullanıdan bir pozirtif tamsyaı alıp
        // o tamsayıdan kucuk fibonacci sayılarını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci serisinden kac tane sayi yazdirmak istersiniz...");
        int ustSinir = scanner.nextInt(); // 400

        List<Integer> fibonacciSerisi = new ArrayList<>(Arrays.asList(0,1,1));

        if (ustSinir < 0){
            System.out.println("Fibonacci sayilari pozitif tamsayilardir...");
        }else if (ustSinir == 0){
            System.out.println("[0]");

        } else if (ustSinir == 1) {
            System.out.println("[0, 1, 1]");

        }else {// ust sinir birden buyuk bir tamsyı
            int enNuyukFibonacciSayisi = 1;
            int siradakiIndex = 3;

            while (enNuyukFibonacciSayisi < ustSinir){
                enNuyukFibonacciSayisi = fibonacciSerisi.get(siradakiIndex-2) +
                                         fibonacciSerisi.get(siradakiIndex-1);

                if (enNuyukFibonacciSayisi <=ustSinir){
                    fibonacciSerisi.add(enNuyukFibonacciSayisi);
                }
                siradakiIndex++;
            }
            System.out.println(fibonacciSerisi);
        }


    }
}
