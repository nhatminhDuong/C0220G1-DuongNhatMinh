package bai_tap.b2_trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class Circle implements Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
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
