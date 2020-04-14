package bai_tap.b2_trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class Rectangle implements Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + ", height = " + height + " and area = " + getArea();
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
