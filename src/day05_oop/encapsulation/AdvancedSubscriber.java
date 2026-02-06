package day05_oop.encapsulation;
public class AdvancedSubscriber {

    private String subscriberName;
    private int balance = 120;
    private String city;

    public AdvancedSubscriber(String name, int balance, String city) {

        this.subscriberName = name;

        if (balance >= 0 && balance <= 120) {
            this.balance = balance;
        }

        this.city = city;
    }

    public void useNaturalGas(int amount) {

        if ((this.balance - amount) < 0) {
            System.out.println("Insufficient balance.");
        }
        else {
            this.balance -= amount;

            if (this.balance <= 0) {
                System.out.println(
                        "Your balance has run out. Please visit the nearest subscriber center to load credit. "
                                + "Credit Limit = 120 TL"
                );
            }
            else {
                System.out.println("New Balance = " + balance);
            }
        }
    }

    public void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}
