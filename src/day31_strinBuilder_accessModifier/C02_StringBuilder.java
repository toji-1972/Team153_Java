package day31_strinBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ali");

        sb.append(" Can");

        sb.append(" Yataruyumaz");

        // StringBuilder mutable dir ysani degeri degistirilebilir
        // method la yapılan degisiklikler atama olmadan da kalic olur

        System.out.println(sb); // Ali Can Yataruyumaz

        String str = "Java candir";
        sb.append(str,4,11);

        System.out.println(sb); //Ali Can Yataruyumaz candir

        sb.deleteCharAt(20);
        System.out.println(sb); // Ali Can Yataruyumaz andir

        sb.delete(20,24);
        System.out.println(sb); // Ali Can Yataruyumaz r

        sb.insert(7,"er");
        System.out.println(sb); // Ali Caner Yataruyumaz r

        sb.insert(9,str,4,5);
        System.out.println(sb); //Ali Caner  Yataruyumaz r

        System.out.println(sb.reverse()); //r zamuyurataY  renaC ilA
        System.out.println(sb); // r zamuyurataY  renaC ilA

        System.out.println(sb.reverse());
        System.out.println(sb); // Ali Caner  Yataruyumaz r

       str= str.replace("c","C");
        System.out.println(str); // string immutable oldugu icin str a atama yapmalıyız //str= str.replace("c","C");
                                // Java Candır

        sb.replace(0,10,"Tugba");
        System.out.println(sb); //Tugba Yataruyumaz r




    }
}
