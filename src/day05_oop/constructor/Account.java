package day05_oop.constructor;
public class Account {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {

        this("No Information", 0.0, "No Information", "No Information", "No Information");

    }

    public Account(String name, String email, String phoneNumber) {

        this("No Information", 0.0, name, email, phoneNumber);
    }

    public Account(String accountNumber, double balance, String name, String email, String phoneNumber) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {

        balance += amount;
        System.out.println("New Balance = " + balance);
    }

    public void showInformation() {

        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phoneNumber);
    }

    public void withdraw(double amount) {

        if (amount > 1500) {
            System.out.println("You cannot withdraw more than 1500 TL per day.");
        }

        if (balance - amount < 0) {
            System.out.println("Insufficient balance. Balance = " + balance);
        } else {
            balance -= amount;
            System.out.println("New balance = " + balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
