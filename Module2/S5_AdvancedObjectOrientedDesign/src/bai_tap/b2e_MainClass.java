package bai_tap;

public class b2e_MainClass {
    public static void main(String[] args) {
        b2a_Resizeable[] resizeableShapes = new b2a_Resizeable[3];
        resizeableShapes[0] = new b2b_Circle(10);
        resizeableShapes[1] = new b2c_Rectangle(10, 20);
        resizeableShapes[2] = new b2d_Square(10);

        System.out.println("Before resize:");
        for (b2a_Resizeable resizeableShape : resizeableShapes) {
            System.out.println(resizeableShape);
        }

        byte[] factors = new byte[3];
        byte i = 0;
        for (b2a_Resizeable resizeableShape : resizeableShapes) {
            resizeableShape.resize(factors[i] = (byte) Math.round(Math.random() * 100 + 1));
            i++;
        }

        i = 0;
        System.out.println("After resize:");
        for (b2a_Resizeable resizeableShape : resizeableShapes) {
            System.out.print(resizeableShape);
            System.out.println(", the resizing factor was " + factors[i] + ".");
            i++;
        }
    }
}
