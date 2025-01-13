package day37_abstractClasses;

public abstract class C05_Car {
    /*
    Dünyda araba diye bir obje yok
    o zaman bu class obje olusturmak icin degil
    child class ları duzenlemek icin olusturulmustur

    o zaman bu class'i abstract yapmak iyi bir tercih olabilir

     */

    public abstract void motor();

    public abstract void sanzuman();

    public abstract void tekerlek();

    public abstract void direksiyon();

    public abstract void marka();

    public abstract void model();

    // child class'larin isterlerse bulundurabileceklri method'lar

    public void klima(){}
    public void sunroof(){}
    public void otopilot(){}
}
