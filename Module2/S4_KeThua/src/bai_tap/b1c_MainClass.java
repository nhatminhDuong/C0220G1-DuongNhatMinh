package bai_tap;

public class b1c_MainClass {
    public static void main(String[] args) {
        b1a_Circle circle = new b1a_Circle();
        System.out.println(circle.toString());

        circle = new b1a_Circle(10, "red");
        System.out.println(circle.toString());

        b1b_Cylinder cylinder =  new b1b_Cylinder();
        System.out.println(cylinder.toString());

        cylinder =  new b1b_Cylinder(12, 10, "green");
        System.out.println(cylinder.toString());
    }
}
