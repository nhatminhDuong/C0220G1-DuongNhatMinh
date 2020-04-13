package bai_tap;

public class b2c_Rectangle implements b2a_Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public b2c_Rectangle() {
    }

    public b2c_Rectangle(double width, double height) {
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

//    @Override
    public String toString() {
        return "A Rectangle with width = " + width + ", height = " + height;
    }

    @Override
    public void resize(double percent) {
        this.width *= (1 + percent / 100);
        this.height *= (1 + percent / 100);
    }
}
