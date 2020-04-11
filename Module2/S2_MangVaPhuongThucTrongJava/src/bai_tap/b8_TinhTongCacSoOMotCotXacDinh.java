package bai_tap;

import java.util.Scanner;

public class b8_TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;

        System.out.print("Enter rows of the matrix: ");
        rows = scanner.nextInt();
        System.out.print("Enter columns of the matrix: ");
        columns = scanner.nextInt();

        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println();
        System.out.println("Input matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.print("Enter column j to calculate sum (0 <= j <= " + columns + "): ");
        int j = scanner.nextInt() - 1;
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][j];
        }
        System.out.println();
        System.out.println("The sum of elements on the column " + (j + 1) + " is: " + sum);
    }
}
