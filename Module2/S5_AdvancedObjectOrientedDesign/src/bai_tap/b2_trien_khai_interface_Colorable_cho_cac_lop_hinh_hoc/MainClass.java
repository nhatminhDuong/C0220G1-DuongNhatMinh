package bai_tap.b2_trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class MainClass {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(2);
        shapes[2] = new Rectangle(5,10);

        for (Shape shape: shapes) {
            System.out.print(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            System.out.println();
        }
    }
}
