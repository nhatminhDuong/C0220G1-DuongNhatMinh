package BaiTap;

import java.util.Scanner;

public class b1_ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.printf("%-40s%s", "Given array: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.print("Enter a number to insert: ");
        int x = scanner.nextInt();
        int index;
        do {
            System.out.print("Enter the wanted index to insert: ");
            index = scanner.nextInt();
            if (index < 1 || index >= arr.length) {
                System.out.println("Invalid index value. Try again!");
            }
        } while (index < 1 || index >= arr.length);
        for (int i = arr.length - 2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = x;
        System.out.printf("%-40s%s", "The array after the insertion: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
