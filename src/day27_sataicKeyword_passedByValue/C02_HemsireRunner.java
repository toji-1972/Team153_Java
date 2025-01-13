package day27_sataicKeyword_passedByValue;

public class C02_HemsireRunner {

    public static void main(String[] args) {




        C01_Hemsire hensire1 = new C01_Hemsire();
        System.out.println(hensire1.perisim); // isim atanmamis
        System.out.println(hensire1.hastaneIsmi); //

        System.out.println(C01_Hemsire.hastaneIsmi); //

        hensire1.perisim = "Yildiz";

        hensire1.peradres = "Balgat";

        hensire1.pertel = "05523801298";

        C01_Hemsire hemsire2 = new C01_Hemsire();

        hemsire2.perisim = "Tugma";
        hemsire2.peradres = "Yenimahalle";
        hemsire2.hastaneAdresi = "Yenimahalle";
        hemsire2.bashekim = "Dr Yigit";

        System.out.println(hensire1.peradres);
        System.out.println(hemsire2.peradres);
        System.out.println(hensire1.hastaneAdresi);
        System.out.println(hemsire2.hastaneAdresi);
        System.out.println(C01_Hemsire.hastaneAdresi);

        /*
        Bir variable i static olarak isaretlemek
        variabl'a ersimi cok kolaylastirir

        static variable'lara classIsmi.variableIsmi
        seklinde static yolla erismek mumkun oldugu gibi

        objeIsmi.staticVariableIsmi seklinde de ulasilabi,lir

        ulasım acısında bu kolaylık
         */


        C01_Hemsire hemsire3 = new C01_Hemsire();

        hemsire3.peradres = "Altındag";
        hemsire3.hastaneAdresi = "Mamak";
        hemsire3.bashekim = "Dr Ahmet";

        System.out.println(hensire1.peradres); // Balgat
        System.out.println(hemsire2.peradres); // Yenimahalle
        System.out.println(hemsire3.peradres); // Altindag
        System.out.println(hensire1.hastaneAdresi); // Mamak
        System.out.println(hemsire2.hastaneAdresi); // Mamak
        System.out.println(hemsire3.hastaneAdresi); // Mamak
        System.out.println(C01_Hemsire.hastaneAdresi); // Mamak
        System.out.println(hensire1.bashekim); // Dr Ahmet
        System.out.println(hemsire2.bashekim); // Dr Ahmet
        System.out.println(hemsire3.bashekim); // Dr Ahmet
        System.out.println(C01_Hemsire.bashekim); // Dr Ahmet

        System.out.println(C01_Hemsire.hastaneIsmi);
        System.out.println(hensire1.hastaneIsmi);

       // C01_Hemsire.hastaneIsmi =  "Java Hastanesi";








    }
}
