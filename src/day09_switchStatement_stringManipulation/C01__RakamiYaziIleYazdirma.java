package day09_switchStatement_stringManipulation;

import java.util.Scanner;

public class C01__RakamiYaziIleYazdirma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz..");
        int rakam = scanner.nextInt();
        if (rakam == 0) {System.out.println("Sifir");
        } else if (rakam == 1) {System.out.println("Bir");
        } else if (rakam == 2) {System.out.println("iki");
        } else if (rakam == 3) {System.out.println("uc");
        } else if (rakam == 4) {System.out.println("dort");
        } else if (rakam == 5) {System.out.println("bes");
        } else if (rakam == 6) {System.out.println("alti");
        } else if (rakam == 7) {System.out.println("yedi");
        } else if (rakam == 8) {System.out.println("sekiz");
        } else if (rakam == 9) {System.out.println("dokuz");
        } else System.out.println( rakam + " Bir rakam degildir. 10 tane rakam vardır: 0-9.");



        switch (rakam) {

            case 0:
                System.out.println("Sifir");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
            default:
                System.out.println("Girilen sayi 0-9 arasında olmalıdır");

        }


    }
}
