package bai_tap;

public class b3c_MainClass {
    public static void main(String[] args) {
        b3a_Point point = new b3a_Point();
        System.out.println(point.toString());

        point = new b3a_Point(6.0f, 4.3f);
        System.out.println(point.toString());

        b3b_MovablePoint movablePoint = new b3b_MovablePoint();
        System.out.println(movablePoint.toString());

        movablePoint.setSpeed(2.0f, 2.5f);
        System.out.println(movablePoint.toString());

        movablePoint.move();
        System.out.println(movablePoint.toString());

        movablePoint.setXSpeed(-1.0f);
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
