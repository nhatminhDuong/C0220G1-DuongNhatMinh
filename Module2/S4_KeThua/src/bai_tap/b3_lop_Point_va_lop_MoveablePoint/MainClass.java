package bai_tap.b3_lop_Point_va_lop_MoveablePoint;

public class MainClass {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());

        point = new Point(6.0f, 4.3f);
        System.out.println(point.toString());

        MovablePoint movablePoint = new MovablePoint();
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
