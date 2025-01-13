package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_MethodOlarak {
    public static void main(String[] args) {


    }

    // verilewn pozitif bir n tamsayısını larak
    // bize ilk n tane Fibonacci sayısın bir list olarak donduren bir method olusturun

    public static List<Integer> ilkFibonacciSayisi(int n){

        List<Integer> fibonacciSerisi = new ArrayList<>();
        if (n<=0){
            return fibonacciSerisi;
        } else if (n == 1) {
            fibonacciSerisi.add(0);
            return fibonacciSerisi;
        }else {// n 2 veya daha buyuk bir sayi
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            for (int i = 2; i < n ; i++) {

                fibonacciSerisi.add( fibonacciSerisi.get(i-2) + fibonacciSerisi.get(i-1) );
            }
            return fibonacciSerisi;
        }

    }








}
