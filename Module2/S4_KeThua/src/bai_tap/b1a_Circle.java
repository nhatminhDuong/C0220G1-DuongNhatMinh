package bai_tap;

public class b1a_Circle {
    private double radius = 5.0;
    private String color = "yellow";

    public b1a_Circle() {
    }

    public b1a_Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + " and color of " + this.color + ".";
    }
}
