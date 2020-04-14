package bai_tap.b1_trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class Square implements Resizeable {
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
    public String toString() {
        return "A Square with side = " + side;
    }

    @Override
    public void resize(double percent) {
        this.side *= 1 + (percent / 100);
    }
}
