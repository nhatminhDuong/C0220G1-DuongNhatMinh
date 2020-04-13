package bai_tap;

public class b2d_Square implements b2a_Resizeable {
    private double side = 1.0;

    public b2d_Square() {
    }

    public b2d_Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side = " + side;
    }

    @Override
    public void resize(double percent) {
        this.side *= 1 + (percent / 100);
    }
}
