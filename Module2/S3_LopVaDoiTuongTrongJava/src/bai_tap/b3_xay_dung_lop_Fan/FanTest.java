package bai_tap.b3_xay_dung_lop_Fan;

public class FanTest {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed("fast");
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        Fan fan2 = new Fan();
        fan2.setSpeed("medium");

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
