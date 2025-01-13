package day37_abstractClasses;

public abstract class C07_Toyota extends C05_Car{

    public void motor(){
        System.out.println("toyota Motor");
    }

    public void tekerlek(){
        System.out.println("Pirelli teker");
    }

    public void marka(){
        System.out.println("Toyota");
    }

    public abstract void guvenlik();

    public abstract void cevrecilik();


}
