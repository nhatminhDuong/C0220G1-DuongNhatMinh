package bai_tap;

public class b3c_Circle implements b3b_Shape {
    private double radius = 1.0;

    public b3c_Circle() {
    }

    public b3c_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + " and area = " + getArea();
    }
}
