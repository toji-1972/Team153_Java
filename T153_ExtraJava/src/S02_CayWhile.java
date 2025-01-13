import java.util.Scanner;

public class S02_CayWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Günde kaç bardak çay içiyorsunuz?");
        double bardak = scanner.nextDouble();



        while (bardak<=0){
            System.out.println("Sktrgit lan pezevenk negatif bardagı göötüne sok. Adam gibi sayı gir");
            bardak = scanner.nextDouble();

        }
        System.out.println("Her bardak için kaç adet şker kullanıyorsunuz");
        double seker = scanner.nextDouble();


        while (seker<0){
            System.out.println("Orospu evladı negatif şekeri götüne sok. Adam gibi sayiş girmiyeceksen sktrgit");
            seker = scanner.nextDouble();
        }
        if(seker==0){
            System.out.println("Aferim böyle devam");
        }else {
            double yillikSekerTuketimi =(bardak * seker+2.77)*365/1000;
            double KirkyillikSekerTuketimi =yillikSekerTuketimi * 40;

            System.out.println("Yillik seker tuketiminiz " + yillikSekerTuketimi);
            System.out.println(" 40 Yillik seker tuketiminiz " + KirkyillikSekerTuketimi);
        }




    }
}
