package bai_tap;

public class b3f_MainClass {
    public static void main(String[] args) {
        b3b_Shape[] shapes = new b3b_Shape[3];
        shapes[0] = new b3c_Circle(5);
        shapes[1] = new b3e_Square(2);
        shapes[2] = new b3d_Rectangle(5,10);

        for (b3b_Shape shape: shapes) {
            System.out.print(shape);
            if (shape instanceof b3e_Square) {
                ((b3e_Square) shape).howToColor();
            }
            System.out.println();
        }
    }
}
