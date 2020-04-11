package thuc_hanh;

import java.util.Scanner;

public class b5_UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter number of students: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("The number of students should not exceed 30. Try again!");
            }
        } while (size > 30);
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a mark for the student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Input array of marks:");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.println();
        System.out.print("The number of students passing the exam is: " + count);
    }
}
