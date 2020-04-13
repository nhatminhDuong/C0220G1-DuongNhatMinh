package bai_tap;

public class b2b_Circle implements b2a_Resizeable{
    private double radius = 1.0;

    public b2b_Circle() {
    }

    public b2b_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius();
    }

    @Override
    public void resize(double percent) {
        this.radius *= (1 + percent / 100);
    }
}
