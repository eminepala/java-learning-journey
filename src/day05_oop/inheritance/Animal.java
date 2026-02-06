package day05_oop.inheritance;
public class Animal {

    private String name;
    private int weight;
    private int height;
    private int numberOfLegs;

    public Animal(String name, int weight, int height, int numberOfLegs) {

        this.name = name;
        this.weight = weight;
        this.height = height;
        this.numberOfLegs = numberOfLegs;
    }

    public void eat() {
        System.out.println("The animal is eating...");
    }

    public void move(int speed) {
        System.out.println("The animal is moving at speed " + speed + "...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
