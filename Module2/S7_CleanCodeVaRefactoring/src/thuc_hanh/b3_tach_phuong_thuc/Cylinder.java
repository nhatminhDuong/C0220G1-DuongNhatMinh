package thuc_hanh.b3_tach_phuong_thuc;

public class Cylinder {
    public static double getSurfaceArea(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double surfaceArea = perimeter * height + 2 * baseArea;
        return surfaceArea;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}