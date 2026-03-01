public class Circle extends Shape {

    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println(getName() + " area is " + (Math.PI * radius * radius));
    }
}