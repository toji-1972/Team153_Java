import java.util.Scanner;

public class S03_KahveMakinasi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz? "+"\n1-Türk Kahvesi"+"\n2-Filtre Kahve"+"Espresso");
        System.out.println("İçmek istediginiz kahvenin sadece adedini yazınız");

        String Hangikahve = scanner.nextLine();


        if(Hangikahve.equalsIgnoreCase("Türk Kahvesi")||Hangikahve.equalsIgnoreCase("Filtre Kahve")||Hangikahve.equalsIgnoreCase("Espresso")){
            System.out.println(Hangikahve + "hazirlanıyor");
        }









    }
}
