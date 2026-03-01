package day07_interfaces_and_abstraction.abstraction;
public class Square extends Shape {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    void calculateArea() {
        System.out.println(getName() + " area is " + (side * side));
    }

    public void calculatePerimeter() {
        System.out.println(getName() + " perimeter is " + (4 * side));
    }
}