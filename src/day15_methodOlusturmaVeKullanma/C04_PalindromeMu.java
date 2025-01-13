package day15_methodOlusturmaVeKullanma;

public class C04_PalindromeMu {
    public static void main(String[] args) {
        // Verine bir meni incelsryip, metin plindrome ise true,
        // degilse false yazdıran bir mod olusturun.




    }

    public static void isPolindrome(String metin){


    }
    // Verilen metni terse cevitrip donduren bir method oludturun
    public static String metninTersiniDondur(String metin){

        String tersMetin = "";

        for(int i = metin.length()-1; i >= 0 ; i--){
            tersMetin += metin.charAt(i);

        }
        return tersMetin;
    }
}
