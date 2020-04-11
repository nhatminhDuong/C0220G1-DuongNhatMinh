package bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class b9_SuDungLopIllegalTriangleException {
    public static void main(String[] args) {
        boolean isLegal = true;
        try {
            double side1 = enterTriangleSide();
            System.out.println("side1 = " + side1);
            double side2 = enterTriangleSide();
            System.out.println("side2 = " + side2);
            double side3 = enterTriangleSide();
            System.out.println("side3 = " + side3);
            checkTriangleSides(side1, side2, side3);
        } catch (EnterTriangleSideException e) {
            e.printStackTrace();
            isLegal = false;
        } catch (IllegalTriangleException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            isLegal = false;
        } finally {
            if (isLegal) {
                System.out.println("You just enter a triangle successfully!");
            } else {
                System.out.println("Failed to enter a triangle!");
            }
        }
        System.out.println("Program finished!");
    }

    private static double enterTriangleSide() throws EnterTriangleSideException {
        Scanner scanner = new Scanner(System.in);
        double side = 0;
        try {
            System.out.print("Enter a triangle side: ");
            side = scanner.nextDouble();
            if (side <= 0) throw new EnterTriangleSideException("A triangle side must be greater than 0.");
        } catch (InputMismatchException e) {
            throw new EnterTriangleSideException("A triangle side must be a number.");
        }
        return side;
    }

    private static void checkTriangleSides(double side1, double side2, double side3) throws IllegalTriangleException {
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            throw new IllegalTriangleException();
        }
    }
}
