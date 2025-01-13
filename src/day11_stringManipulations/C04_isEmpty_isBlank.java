package day11_stringManipulations;

public class C04_isEmpty_isBlank {
    public static void main(String[] args) {
        String str1 = "Java";

        System.out.println(str1.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty());



        String str3 = " ";
        System.out.println(str3.isEmpty());
        System.out.println(str3.length());


        String str4 = "     ";
        System.out.println(str4.isEmpty());
        System.out.println(str4.length());


        System.out.println(str4.isBlank()); // true

        System.out.println(str1.isBlank());


        // Returns true if the string is empty
        // or contains only white space codepaints, otherwise false.





    }
}
