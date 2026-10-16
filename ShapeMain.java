class Shape {
    protected String name;
    Shape(String name) { this.name = name; }
    void displayName() { System.out.println("Shape: " + name); }
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) { super("Circle"); this.radius = radius; }
    double area() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
    private double length, width;
    Rectangle(double length, double width) {
        super("Rectangle"); this.length = length; this.width = width;
    }
    double area() { return length * width; }
}
class ShapeManager {
    void displayAreas(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.displayName();
            if (shape instanceof Circle) System.out.println("Area: " + ((Circle) shape).area());
            else if (shape instanceof Rectangle) System.out.println("Area: " + ((Rectangle) shape).area());
        }
    }
}
public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(7), new Rectangle(10, 5)};
        new ShapeManager().displayAreas(shapes);
    }
}
