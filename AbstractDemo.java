public class AbstractDemo {

    // Abstract class
    static abstract class Shape {

        // Abstract method
        abstract void area();

        // Concrete method
        void display() {
            System.out.println("This is a Shape");
        }
    }

    // Rectangle class
    static class Rectangle extends Shape {
        double length, width;

        Rectangle(double l, double w) {
            length = l;
            width = w;
        }

        @Override
        void area() {
            System.out.println("Area of Rectangle: " + (length * width));
        }
    }

    // Circle class
    static class Circle extends Shape {
        double radius;

        Circle(double r) {
            radius = r;
        }

        @Override
        void area() {
            System.out.println("Area of Circle: " + (3.14159 * radius * radius));
        }
    }

    public static void main(String[] args) {

        Shape shapeRef;

        shapeRef = new Rectangle(5.0, 3.0);
        shapeRef.display();
        shapeRef.area();

        shapeRef = new Circle(4.0);
        shapeRef.display();
        shapeRef.area();

        // Shape s = new Shape(); // Error: Cannot instantiate an abstract class
    }
}