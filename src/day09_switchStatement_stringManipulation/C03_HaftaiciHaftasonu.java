package day09_switchStatement_stringManipulation;

import java.util.Scanner;

public class C03_HaftaiciHaftasonu {
    public static void main(String[] args) {

        //kullanıcıdan gun numarasını alın, girilen gun numarası hafta ici ise
        // hafta sonuna kadar kalan gunleri yazfırın
        // en sonuna "veee haftsonu yazın"
        // gırılen gunu hastsonu ise "bugun haftasonu, yangeeelll yat yazdırın"


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir gün numarası giriniz...");
        int gun = scanner.nextInt();

        switch (gun){

            case 1:
                System.out.println("Pazartesi");
            case 2:
                System.out.println("Sali");
            case 3:
                System.out.println("Carsamba");
            case 4:
                System.out.println("Persembe");
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Girilen dun numarası 1-7 arasında olmalıdır");

        }




    }
}
