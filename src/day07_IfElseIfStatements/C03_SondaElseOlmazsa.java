package day07_IfElseIfStatements;

import java.util.Scanner;

public class C03_SondaElseOlmazsa {
    public static void main(String[] args) {


        /*eger if else if... yazdıgımızda en sonda else yoksa java itiraz etmez
        *
        * ANCAKKK else olmadan biten if else-if  cumlelerinde bazı durumlarda
        *
        * Hoca tam bunu yazarken contains i daha anlatmadıgını farketti :))))
        *
        * */

        // kullanıcdan bır cumle isteyın
        // Cumlede ev gecıyorsa "Ev gıbısı yok"
        // Cumlede if gecıyorsa "Calısmadan olmaz"
        // Cumlede hem ev hem ıs gecıyorsa "Senden kralı yok" yazdırın



        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz..");
        String cumle = scanner.nextLine().toLowerCase();
        if (cumle.contains("ev") && (cumle.contains("is")) ){
            System.out.println("senden krali yok");
        } else if (cumle.contains("is")) {
            System.out.println("calismadan olmaz.");
        } else if (cumle.contains("ev")) {
            System.out.println("Ev gibisi yok.");
        }






    }
}
