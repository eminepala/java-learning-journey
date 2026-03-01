package day07_interfaces_and_abstraction.abstraction;
public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println("This object is a " + name + " object.");
    }

    abstract void calculateArea();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}