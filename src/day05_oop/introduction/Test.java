package day05_oop.introduction;
public class Test {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("Renault");
        System.out.println("Car model: " + car1.getModel());

        Car car2 = new Car();
        car2.setDoors(10);

    }
}
