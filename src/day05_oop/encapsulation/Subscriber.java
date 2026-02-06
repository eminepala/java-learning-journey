package day05_oop.encapsulation;
// Natural Gas Subscriber
public class Subscriber {

    public String name;
    public int balance;
    public String city;

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
