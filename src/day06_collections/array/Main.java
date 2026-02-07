package day06_collections.array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] fillArray(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }
    }

    public static void sortArray(int[] array) {

        // Arrays class
        Arrays.sort(array);
        printArray(array);
    }

    public static void main(String[] args) {


        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1, 2, 3, 4, 5, 6};

        if (Arrays.equals(a1, a2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
