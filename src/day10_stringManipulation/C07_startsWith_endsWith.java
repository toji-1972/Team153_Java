package day10_stringManipulation;

public class C07_startsWith_endsWith {
    public static void main(String[] args) {

        String str = "Java cok guzel, cok.";

        System.out.println(str.contains("cok")); // true

        System.out.println(str.startsWith("cok")); // false

        System.out.println(str.endsWith("cok")); // false

        System.out.println(str.endsWith("cok.")); // true

        System.out.println(str.endsWith("ok.")); // true

        System.out.println(str.endsWith(".")); // true


        // "Java cok guzel, cok."

        System.out.println(str.startsWith("java")); // false

        System.out.println("Java cok guzel, cok."); // true
        System.out.println(str.endsWith("Java cok guzel, cok.")); // true

        System.out.println(str.startsWith("guzel")); // false
        System.out.println(str.endsWith("guzel")); // false;
        System.out.println(str.equals("guzel")); // false
        System.out.println(str.equalsIgnoreCase("guzel")); // false
        System.out.println(str.contains("guzel")); // true


        System.out.println(str.startsWith("cok")); // false
        System.out.println(str.startsWith("cok",5));
        // 5. index ve sonrası olan "cok guzel, cok." metin parcası "cok" ile mi baslıyor?









    }
}
