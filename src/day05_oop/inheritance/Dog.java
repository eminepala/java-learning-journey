package day05_oop.inheritance;
public class Dog extends Animal {

    private int numberOfTeeth;

    public Dog(String name, int weight, int height, int numberOfLegs, int numberOfTeeth) {

        super(name, weight, height, numberOfLegs);
        this.numberOfTeeth = numberOfTeeth;
    }

    @Override
    public void move(int speed) {
        System.out.println("The dog is moving at speed " + speed + "...");
    }

    public void run(int speed) {

        System.out.println("The dog is running...");
        move(speed);
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }
}
