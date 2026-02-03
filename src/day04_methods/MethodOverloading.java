package day04_methods;

public class MethodOverloading {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println(multiply(2, 3));
        System.out.println(multiply(2, 3, 4));
    }
}
