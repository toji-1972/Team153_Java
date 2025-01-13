package day11_stringManipulations;

public class C01_odev {


    public static void main(String[] args) {

     /*
            1- Kullanicidan aldigimiz metinde 3 'den fazla a harfi oldugunu biliyorsak
               3.a'nin index'ini yazdirin

            2- Kullanicidan aldigimiz bir metinde
               3 veya daha fazla e olup olmadigini yazdirin

            3- Kullanicidan bir cumle ve aranan bir metin parcasi isteyin
               kullanicinin verdigi metinlere gore asagidaki 3 cumleden birini yazdirin
                 - cumle aranan metni icermiyor
                 - cumle aranan metni sadece 1 adet iceriyor
                 - cumle aranan metni birden fazla iceriyor
         */



        String metin ="Ali topu at, at Ali at.";

        // Kullanicidan aldigimiz metinde 3 'den fazla a harfi oldugunu biliyorsak
        //3.a'nin index'ini yazdirin

        int birinciIndex = metin. indexOf('a'); // 9
        int ikinciIndex = metin.indexOf("a", birinciIndex+1);//13
        int ucuncuIndex = metin.indexOf("a", ikinciIndex+1); // 16


        System.out.println("ucuncu a nın ındexi :" + ucuncuIndex);

            // 2- Kullanicidan aldigimiz bir metinde
        //               3 veya daha fazla e olup olmadigini yazdirin


        metin ="karadenize yelken actık";

         birinciIndex = metin. indexOf('e'); // 9
         ikinciIndex = metin.indexOf("e", birinciIndex+1);//13
         ucuncuIndex = metin.indexOf("e", ikinciIndex+1);


         if (birinciIndex >= 0 && ikinciIndex >0 && ucuncuIndex>0){
             System.out.println("Metinde uc veya daha fazla ev var");
         }else{
             System.out.println("Metinde 3 veya daha fazla e yok");
         }


//        Kullanicidan bir cumle ve aranan bir metin parcasi isteyin
//        kullanicinin verdigi metinlere gore asagidaki 3 cumleden birini yazdirin
//                - cumle aranan metni icermiyor
//                - cumle aranan metni sadece 1 adet iceriyor
//        - cumle aranan metni birden fazla iceriyor


        String cumle = "Java sen mi buyuksun, ben mi? Elbette sen buyuksun";
        String arananMetin = "han";

        birinciIndex = cumle.indexOf(arananMetin);//-1
        ikinciIndex = cumle.indexOf(arananMetin, birinciIndex+1);//-1


        if(birinciIndex == -1){
            System.out.println("Cumle aranan metni icermiyor");
        }else if(birinciIndex >=0 && ikinciIndex == -1){
            System.out.println("cumle aranan metnı sadece 1 adet iceriyor");
        }else{
            System.out.println();
        }




    }
}
