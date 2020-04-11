package bai_tap;

import java.util.Scanner;

public class b1b_QuadraticEquationClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        System.out.println("CALCULATE ROOTS OF A QUADRATIC EQUATION: a*x^2 + b*x + c = 0");
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        System.out.println("Given equation: " + a + "*x^2 + " + b + "*x + " + c + " = 0");

        b1a_QuadraticEquation quadraticEquation = new b1a_QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
