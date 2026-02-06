package day05_oop.encapsulation;
public class Main {

    public static void main(String[] args) {

        AdvancedSubscriber subscriber =
                new AdvancedSubscriber("Mustafa Murat Coskun", 200, "Ankara");

        subscriber.checkBalance();
    }
}
