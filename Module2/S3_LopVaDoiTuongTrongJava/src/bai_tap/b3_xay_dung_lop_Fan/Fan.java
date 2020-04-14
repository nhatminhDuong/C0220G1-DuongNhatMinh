package bai_tap.b3_xay_dung_lop_Fan;

public class Fan {
    final byte SLOW = 1;
    final byte MEDIUM = 2;
    final byte FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getStatus() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(String speed) {
        switch (speed) {
            case "slow":
                this.speed = SLOW;
                break;
            case "medium":
                this.speed = MEDIUM;
                break;
            case "fast":
                this.speed = FAST;
                break;
        }
    }

    public void setStatus(boolean status) {
        this.on = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "{speed = " + this.speed + ", color = " + this.color + ", radius = " + this.radius + "} Fan is on.";
        } else {
            return "{color = " + this.color + ", radius = " + this.radius + "} Fan is off.";
        }
    }
}
