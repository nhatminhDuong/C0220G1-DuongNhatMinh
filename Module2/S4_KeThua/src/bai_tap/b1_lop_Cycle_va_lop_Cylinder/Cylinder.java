package bai_tap.b1_lop_Cycle_va_lop_Cylinder;

public class Cylinder extends Circle {
    private double height = 8.0;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = " + height + ", which is a subclass of " + super.toString();
    }
}
