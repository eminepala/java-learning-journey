package day06_collections.linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void printList(LinkedList<String> placesToVisit) {

        ListIterator<String> iterator = placesToVisit.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void addInOrder(LinkedList<String> placesToVisit, String newPlace) {

        ListIterator<String> iterator = placesToVisit.listIterator();

        while (iterator.hasNext()) {

            int comparison = iterator.next().compareTo(newPlace);

            if (comparison == 0) {
                // Two values are equal
                System.out.println("This element already exists in the list...");
                return;
            }
            else if (comparison < 0) {
                // New value is greater than the current element
                // Continue
            }
            else if (comparison > 0) {
                // New value is smaller, insert before
                iterator.previous();
                iterator.add(newPlace);
                return;
            }
        }

        // If the list is empty or the new element is the largest
        iterator.add(newPlace);
    }

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Post Office");
        addInOrder(placesToVisit, "Market");
        addInOrder(placesToVisit, "Home");

        printList(placesToVisit);
    }
}
