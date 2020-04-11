package bai_tap;

import java.util.Scanner;

public class b2_TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;

        System.out.print("Enter rows of the matrix: ");
        rows = scanner.nextInt();
        System.out.print("Enter columns of the matrix: ");
        columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Input matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int max = matrix[0][0];
        int rowIndexOfMax = 0;
        int columnIndexOfMax = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowIndexOfMax = i;
                    columnIndexOfMax = j;
                }
            }
        }
        System.out.println();
        System.out.println("The greatest element: matrix[" + rowIndexOfMax + "][" + columnIndexOfMax + "] = " + max);
    }
}
