package bai_tap;

public class b3e_Square implements b3b_Shape, b3a_Colorable {
    private double side = 1.0;

    public b3e_Square() {
    }

    public b3e_Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "A Square with side = " + side + " and area = " + getArea();
    }

    @Override
    public void howToColor() {
        System.out.print(" => The way to color: Color all four sides.");
    }
}
