package day39_exceptions;

import java.util.Scanner;

public class C04_MultipleException_MultipleTryCatch {

    public static void main(String[] args) {


        String str = "Java Candir";
        int[] arr = {2, 3, 4, 5, 3, 4, 5, 4, 5, 6, 5, 4, 3, 4, 5, 6, 7, 6, 5, 4, 6, 7};

        // Kullanıcdan index olarak 0 veya pozitif bir tamsayi alın
        // (Kullanıcının sayi girme konusunda giciklik hakkini kullanmadıgını jabul edelim
        // str ve arr'de o index'deki karakteri veya sayiyi yazdirin
        //eger sinirin disinda ise en buyuk index'i yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen index olarak 0 veya pozitif bir tamsyaı gırınız");

        int index = scanner.nextInt();

        try {
            System.out.println("Ar'deki elemean : " +arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array icin en buyuk index degeri : " + (arr.length-1));
        }
        try {
            System.out.println("Str'daki karakter : " + str.charAt(index));
        }catch(StringIndexOutOfBoundsException e){

        }



    }
}

