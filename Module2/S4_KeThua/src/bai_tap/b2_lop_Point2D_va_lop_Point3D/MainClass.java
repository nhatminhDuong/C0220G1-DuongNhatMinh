package bai_tap.b2_lop_Point2D_va_lop_Point3D;

public class MainClass {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D.toString());

        point2D = new Point2D(5.2f, 3.3f);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D();
        System.out.println(point3D.toString());

        point3D = new Point3D(6.6f, 4.8f, 1.0f);
        System.out.println(point3D.toString());
    }
}
