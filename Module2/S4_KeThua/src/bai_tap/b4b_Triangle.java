package bai_tap;

public class b4b_Triangle extends b4a_Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public b4b_Triangle() {
    }

    public b4b_Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public b4b_Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        // Based on Heron's formula
        double p = getPerimeter() / 2;
        return Math.pow(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()), 0.5);
    }

    @Override
    public String toString() {
        return (isFilled() ? "A filled" : "An unfilled") + " triangle with color of " + getColor()
                + ", perimeter = " + getPerimeter() + " and area = " + getArea() + ".";
    }
}
