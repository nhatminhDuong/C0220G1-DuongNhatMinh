package bai_tap;

public class b4c_MainClass {
    public static void main(String[] args) {
        b4b_Triangle triangle = new b4b_Triangle();
        System.out.println(triangle.toString());

        triangle = new b4b_Triangle(3, 4, 5);
        System.out.println(triangle.toString());

        triangle = new b4b_Triangle("blue", false, 3, 3, 5);
        System.out.println(triangle.toString());
    }
}
