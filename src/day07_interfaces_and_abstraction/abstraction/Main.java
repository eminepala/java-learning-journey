package day07_interfaces_and_abstraction.abstraction;
public class Main {
    public static void main(String[] args) {

        // Using a Shape reference to hold a Square
        Shape shape;
        shape = new Square("Square2", 6);

        shape.calculateArea();
        // shape.calculatePerimeter(); // Cannot call, reference type is Shape

        Square square1 = new Square("Square1", 5);
        Circle circle1 = new Circle("Circle1", 3);

        square1.calculateArea();
        circle1.calculateArea();
        square1.calculatePerimeter();
    }
}