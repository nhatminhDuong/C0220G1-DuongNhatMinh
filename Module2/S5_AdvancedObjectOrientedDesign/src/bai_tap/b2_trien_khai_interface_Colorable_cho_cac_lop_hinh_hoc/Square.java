package bai_tap.b2_trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class Square implements Shape, Colorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
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
