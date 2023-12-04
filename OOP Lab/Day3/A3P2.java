class Shape {
    double calcPerimeter() {
        return 0.0;
    }

    double calcArea() {
        return 0.0;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
    double calcArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double calcPerimeter() {
        return 2 * (length + breadth);
    }
    double calcArea() {
        return length * breadth;
    }
}
class A3P2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Perimeter: " + circle.calcPerimeter());
        System.out.println("Circle Area: " + circle.calcArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Perimeter: " + rectangle.calcPerimeter());
        System.out.println("Rectangle Area: " + rectangle.calcArea());
    }
}
