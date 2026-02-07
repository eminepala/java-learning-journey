package day06_collections.arraylist;
import java.util.Scanner;

public class Test {

    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);

    public static void printOperations() {

        System.out.println("\t 0- Show Operations");
        System.out.println("\t 1- Show Singers");
        System.out.println("\t 2- Add Singer");
        System.out.println("\t 3- Update Singer");
        System.out.println("\t 4- Remove Singer");
        System.out.println("\t 5- Search Singer");
        System.out.println("\t 6- Exit Application");
    }

    public static void showSingers() {
        singers.printSingers();
    }

    public static void addSinger() {

        System.out.println("Enter the name of the singer you want to add:");
        String name = scanner.nextLine();
        singers.addSinger(name);
    }

    public static void updateSinger() {

        System.out.println("Enter the position to update (1,2,3...)");
        int position = scanner.nextInt();
        scanner.nextLine();

        String newName = scanner.nextLine();
        singers.updateSinger(newName, position - 1);
    }

    public static void remove() {

        System.out.println("Enter the position to remove (1,2,3...)");
        int position = scanner.nextInt();
        singers.removeSinger(position - 1);
    }

    public static void search() {

        System.out.println("Enter the singer name to search:");
        String name = scanner.nextLine();
        singers.searchSinger(name);
    }

    public static void main(String[] args) {

        System.out.println("\t Welcome to the Singer Application...");

        printOperations();

        boolean exit = false;
        int operation;

        while (!exit) {

            System.out.println("Select an operation:");
            operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 0:
                    printOperations();
                    break;
                case 1:
                    showSingers();
                    break;
                case 2:
                    addSinger();
                    break;
                case 3:
                    updateSinger();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the application...");
                    break;
            }
        }
    }
}
