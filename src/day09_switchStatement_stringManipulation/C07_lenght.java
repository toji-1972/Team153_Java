package day09_switchStatement_stringManipulation;

public class C07_lenght {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        // str'in karakter sayısını yazdırın

        System.out.println(str.length()); // 30

        // str'in son karakterini yazdırın

        System.out.println(str.charAt(str.length()-1)); //dinamik olaerak son elementi verir

        // sondan 3. karakteri yazdırın

        System.out.println(str.charAt(str.length()-1));


        System.out.println(str.charAt(str.length()));//

        // son harfın ındexının str.Lenght() -1 oldugunu bılıyoruz
        // bu index ten buyuk olan her index icin java IndexOutOfBounds hatası verir



    }
}
