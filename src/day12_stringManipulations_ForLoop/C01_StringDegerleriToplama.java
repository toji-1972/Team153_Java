package day12_stringManipulations_ForLoop;

public class C01_StringDegerleriToplama {
    public static void main(String[] args) {




        String input1 = "15.30 £";
        String input2 = "11.45 £";
        System.out.println(input1 + input2);//15.30£11.45£

        // once para birimini alıp kaydedelim

        int spaceIndex = input1.indexOf(" ");
        String praBirimi = input1.substring(spaceIndex);

        // Artık sayı olmayan herseyden kurtulabiliriz

        input1 = input1.replaceAll("\\D", "");
        input2 = input2.replaceAll("\\D", "");


        double fiyat1 = Double.parseDouble(input1);// 15.30
        double fiyat2 = Double.parseDouble(input2);// 11.45

        double toplam = (fiyat1 + fiyat2) / 100;

        System.out.println("Verilen fiyatların toplamı: " + toplam + praBirimi);






    }
}
