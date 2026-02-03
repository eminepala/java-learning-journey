package day03_loops;

public class LoopExercises {
    public static void main(String[] args) {

        // 1–10 toplamı
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        // Çift sayılar
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}
