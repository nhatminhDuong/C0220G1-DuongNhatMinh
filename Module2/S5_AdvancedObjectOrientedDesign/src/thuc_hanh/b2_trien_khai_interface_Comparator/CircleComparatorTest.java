package thuc_hanh.b2_trien_khai_interface_Comparator;

import javafx.scene.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(6.5);
        circles[1] = new Circle();
        circles[2] = new Circle(3.3);

        System.out.println("Pre-sorted");
        for (Circle circle: circles) {
            System.out.println(circle);
//            System.out.println(circle.toString());
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted");
        for (Circle circle: circles) {
//            System.out.println(circle);
            System.out.println(circle.toString());
        }
    }
}
