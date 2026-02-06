package day05_oop.constructor;
public class Test {

    public static void main(String[] args) {

        Account account1 = new Account();

        Account account2 = new Account("Ahmet Can", "example@gmail.com", "87987897");


        account2.showInformation();
    }
}
