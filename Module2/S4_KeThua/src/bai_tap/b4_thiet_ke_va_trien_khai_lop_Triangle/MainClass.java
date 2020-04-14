package bai_tap.b4_thiet_ke_va_trien_khai_lop_Triangle;

public class MainClass {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());

        triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.toString());

        triangle = new Triangle("blue", false, 3, 3, 5);
        System.out.println(triangle.toString());
    }
}
