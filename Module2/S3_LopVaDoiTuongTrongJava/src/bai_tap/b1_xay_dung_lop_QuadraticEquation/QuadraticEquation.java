package bai_tap.b1_xay_dung_lop_QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) return 0;
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) return 0;
        return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
