package bai_tap;

import java.util.Scanner;

public class b7_TinhTongCacSoDuongCheoChinhMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        System.out.print("Enter size of the square matrix: ");
        size = scanner.nextInt();

        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Input matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sumOfMainDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumOfMainDiagonal += matrix[i][i];
        }
        System.out.println();
        System.out.println("The sum of elements on main diagonal is: " + sumOfMainDiagonal);
    }
}
