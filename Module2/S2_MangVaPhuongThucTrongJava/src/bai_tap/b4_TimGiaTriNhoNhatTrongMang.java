package bai_tap;

import java.util.Scanner;

public class b4_TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[]{3, 4, 1, 9, 2, 5};
        System.out.print("The given array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int min = arr[0];
        int indexOfMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;
            }
        }
        System.out.print("The smallest element in array is " + min + ", at position " + indexOfMin + ".");
    }
}
