package bai_tap;

public class b3b_FanClient {
    public static void main(String[] args) {
        b3a_Fan fan1 = new b3a_Fan();
        fan1.setSpeed("fast");
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        b3a_Fan fan2 = new b3a_Fan();
        fan2.setSpeed("medium");

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
