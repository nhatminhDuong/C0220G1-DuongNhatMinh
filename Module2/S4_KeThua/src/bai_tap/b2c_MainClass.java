package bai_tap;

public class b2c_MainClass {
    public static void main(String[] args) {
        b2a_Point2D point2D = new b2a_Point2D();
        System.out.println(point2D.toString());

        point2D = new b2a_Point2D(5.2f, 3.3f);
        System.out.println(point2D.toString());

        b2b_Point3D point3D = new b2b_Point3D();
        System.out.println(point3D.toString());

        point3D = new b2b_Point3D(6.6f, 4.8f, 1.0f);
        System.out.println(point3D.toString());
    }
}
