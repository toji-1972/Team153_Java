package day12_stringManipulations_ForLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        // 1'den 10 a kadar(sınırlar da dahil ) olan sayıları yan yana
        // aralarında bir bosluk bırakarak yazdırın

        System.out.println("1 2 3 4 5 6 7 8 9 10");

        // 2 basamaklı tamsayıları yan yana
        // aralarında bir bosluk bırakarak yazdırnın

        for (int i = 10; i < 100; i++) {
            // int i = 10 ile bir variable olusturulmus olur
            // i<= 99 olusturulan ı variable'i bu sartı sagladıkca loop devam eder
            // i++ her loop tekrarında i nasl degısecek

            System.out.println(i + " ");

        }

        int toplam = 0;


        for (int i = 1; i < 5; i++) {
            toplam +=i;


            for (int j = 1220; j <1446 ; j++) {

                toplam +=i;

            }
            System.out.println(toplam);

            for (int k = 100; i <=250 ; i+=5 ) {
                System.out.println(i + " ");
            }
            System.out.println("");

        }

        for (int i = 100; i > 0 ; i-=3) {
            System.out.println(i + " ");

        }
        System.out.println("");

        // 3 basamaklı sayılardan 137 ile bolunebilenleri yazdırın


        for (int i = 100; i <=999  ; i++) {
            if(i % 137 == 0) {

                System.out.println(i + " ");
            }
            System.out.println("");


            for (int j = 23457; j <=26234 ; j++) {

                if(j % 113 == 0){
                    System.out.println(j + " ");
                }


            }
            System.out.println("");



        }









    }
}
