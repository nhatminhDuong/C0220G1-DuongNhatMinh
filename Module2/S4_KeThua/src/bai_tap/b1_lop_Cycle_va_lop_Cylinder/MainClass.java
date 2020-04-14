package bai_tap.b1_lop_Cycle_va_lop_Cylinder;

public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());

        circle = new Circle(10, "red");
        System.out.println(circle.toString());

        Cylinder cylinder =  new Cylinder();
        System.out.println(cylinder.toString());

        cylinder =  new Cylinder(12, 10, "green");
        System.out.println(cylinder.toString());
    }
}
