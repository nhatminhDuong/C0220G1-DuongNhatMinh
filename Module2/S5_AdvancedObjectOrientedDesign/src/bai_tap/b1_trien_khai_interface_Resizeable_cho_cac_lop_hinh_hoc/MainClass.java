package bai_tap.b1_trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class MainClass {
    public static void main(String[] args) {
        Resizeable[] resizeableShapes = new Resizeable[3];
        resizeableShapes[0] = new Circle(10);
        resizeableShapes[1] = new Rectangle(10, 20);
        resizeableShapes[2] = new Square(10);

        System.out.println("Before resize:");
        for (Resizeable resizeableShape : resizeableShapes) {
            System.out.println(resizeableShape);
        }

        byte[] factors = new byte[resizeableShapes.length];
        byte i = 0;
        for (Resizeable resizeableShape : resizeableShapes) {
            resizeableShape.resize(factors[i] = (byte) Math.round(Math.random() * 100 + 1));
            i++;
        }

        i = 0;
        System.out.println("After resize:");
        for (Resizeable resizeableShape : resizeableShapes) {
            System.out.print(resizeableShape);
            System.out.println(", the resizing factor was " + factors[i] + ".");
            i++;
        }
    }
}
