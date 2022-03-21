abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getPerimeter() {
        return a + b + c;
    }


    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


}


class Rectangle extends Shape {
    double x, y;

    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getPerimeter() {
        return 2 * (x + y);
    }

    ;

    double getArea() {
        return x * y;
    }


}

class Circle extends Shape {
    static final double PI = Math.PI;
    double r;

    public Circle(double r) {
        this.r = r;
    }

    double getPerimeter() {
        return 2 * PI * r;
    }


    double getArea() {
        return PI * r * r;
    }


}