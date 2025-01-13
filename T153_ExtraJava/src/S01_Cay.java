import java.util.Scanner;

public class S01_Cay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Günde kaç bardak çay içiyorsunuz?");
        double bardak = scanner.nextDouble();

        System.out.println("Her bardak için kaç şeker atıyorsunuz");
        double seker = scanner.nextDouble();


        // şeker kullanmıyorsalar

        if(seker == 0){
            System.out.println("Aferim, böyle devam et");
        }

        // şeker kullananlar

        if(seker > 0){
            double yillikSekerTuketimi =(bardak * seker+2.77)*365/1000;
            double KirkyillikSekerTuketimi =yillikSekerTuketimi * 40;

            System.out.println("Yillik seker tuketiminiz " + yillikSekerTuketimi);
            System.out.println(" 40 Yillik seker tuketiminiz " + KirkyillikSekerTuketimi);
            }
        }



    }

