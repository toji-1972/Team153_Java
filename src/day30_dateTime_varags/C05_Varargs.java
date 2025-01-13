package day30_dateTime_varags;

public class C05_Varargs {
    public static void main(String[] args) {

        topla(5,7);
        topla(1,3,5);
        topla(3,4,5,6);
        topla(3,4,5,6,7,8,9);




    }

    public static void topla(int... a){
        int toplam = 0;

        for (int i = 0; i <a.length ; i++) {

            toplam += a[i];
        }
        System.out.println("verilen " + a.length + " adet sayısınn toplamı : " + toplam);
    }

    public static void topla (int a, int b){
        System.out.println("iki tamsayinin toplami : "+ (a+b));
    }

    public static void topla (int a, int b, int c){
        System.out.println("Uc sayinin toplami : " +  (a+b+c));
    }
}
