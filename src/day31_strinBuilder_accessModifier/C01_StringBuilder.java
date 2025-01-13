package day31_strinBuilder_accessModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 lenght : " + sb1.length()); // 0
        System.out.println("sb1 capacity : " + sb1.capacity()); // 16

        StringBuilder sb2 = new StringBuilder(5);
        System.out.println("sb2 lenght : " + sb2.length()); // 0
        System.out.println("sb2 capacity : " + sb2.capacity()); // 5

        StringBuilder sb3 = new StringBuilder("Ali");
        System.out.println("sb3 lenght : " + sb3.length()); // 3
        System.out.println("sb3 capacity : " + sb3.capacity()); // 16 + 3 ==> 19


        sb3.append("Yanbakar ama geri kalkar");
        System.out.println(sb3);
        System.out.println("sb3 lenght : " + sb3.length());



    }
}
