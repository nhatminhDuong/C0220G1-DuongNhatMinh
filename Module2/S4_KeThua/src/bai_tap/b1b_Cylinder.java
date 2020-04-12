package bai_tap;

public class b1b_Cylinder extends b1a_Circle {
    private double height = 8.0;

    public b1b_Cylinder() {
    }

    public b1b_Cylinder(double radius, double height, String color) {
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
