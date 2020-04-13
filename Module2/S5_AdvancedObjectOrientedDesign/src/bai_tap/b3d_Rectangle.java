package bai_tap;

public class b3d_Rectangle implements b3b_Shape {
    private double width = 1.0;
    private double height = 1.0;

    public b3d_Rectangle() {
    }

    public b3d_Rectangle(double width, double height) {
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
