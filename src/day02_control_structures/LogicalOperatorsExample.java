package day02_control_structures;

public class LogicalOperatorsExample {
    public static void main(String[] args) {

        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You can enter.");
        } else {
            System.out.println("Entry denied.");
        }

        boolean isStudent = false;

        if (age < 18 || isStudent) {
            System.out.println("Discount applied.");
        } else {
            System.out.println("No discount.");
        }
    }
}
