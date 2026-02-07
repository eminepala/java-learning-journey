package day06_collections.string;
public class Main {

    public static void main(String[] args) {

        // System.out.println(text);

        /*
        System.out.println("Character Count: " + text.length());

        System.out.println("Index 0: " + text.charAt(0));
        System.out.println("Index 2: " + text.charAt(2));
        System.out.println("Last character: " + text.charAt(text.length() - 1));
        */

        /*
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
        */

        /*
        System.out.println(text.startsWith("Mu"));
        System.out.println(text.endsWith("CO"));
        */

        // System.out.println(text.indexOf('a'));
        // System.out.println(text.lastIndexOf('a'));

        /*
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        */

        /*
        String strNumber = "1923";
        int number = Integer.parseInt(strNumber);
        System.out.println(number - 42);
        */

        /*
        int number = 1923;
        String strNumber = String.valueOf(number);
        System.out.println(strNumber);
        */

        /*
        String s1 = "Emine";
        String s2 = "Emine";

        if (s1 == s2) {
            System.out.println("Equal");
        }
        */

        String s1 = new String("Emine");
        String s2 = new String("Emine");

        if (s1.equals(s2)) {
            System.out.println("Equal");
        }

        // String text = new String("Emine");
    }
}
