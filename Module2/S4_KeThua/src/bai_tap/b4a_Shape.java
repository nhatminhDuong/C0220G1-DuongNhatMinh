package bai_tap;

public class b4a_Shape {
    private String color = "green";
    private boolean filled = true;

    public b4a_Shape() {
    }

    public b4a_Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled") + ".";
    }
}
