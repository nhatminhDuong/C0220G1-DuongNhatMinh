package BaiTap;

import java.util.Scanner;

public class b5_HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    final int width = 7;
                    final int height = 3;
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            if (j == 0) {
                                System.out.print("*");
                            } else {
                                System.out.print(" *");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle (The corner is square at 4 different angles)");
                    final int triangleHeight = 6;
                    for (int i = 1; i <= triangleHeight; i++) {
                        for (int j = 1; j < i; j++) {
                            if (j == 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" *");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = triangleHeight; i > 0; i--) {
                        for (int j = 1; j < i; j++) {
                            if (j == 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" *");
                            }
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= triangleHeight; i++) {
                        for (int j = triangleHeight - i; j > 0; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= i; k++) {
                            if (k == i) {
                                System.out.print("*");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = triangleHeight; i > 0; i--) {
                        for (int j = triangleHeight - i; j > 0; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= i; k++) {
                            if (k == i) {
                                System.out.print("*");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    final int triangleWidth = 9; // Odd numbers
                    int m = triangleWidth / 2 + 1;
                    for (int i = 0; i < m; i++) {
                        for (int j = 1; j <= triangleWidth; j++) {
                            if (j < (m - i) || j > (m + i)) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
