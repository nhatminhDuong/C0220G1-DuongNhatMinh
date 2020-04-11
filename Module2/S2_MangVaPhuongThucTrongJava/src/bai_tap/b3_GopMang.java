package bai_tap;

import java.util.Scanner;

public class b3_GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[3];

        System.out.println("The array1 has " + arr1.length + " elements.");
        System.out.println("The array2 has " + arr2.length + " elements.");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter the element " + (i + 1) + " of array1: ");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter the element " + (i + 1) + " of array2: ");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[i - arr1.length];
        }
        System.out.println();
        System.out.println("array3 = array1 + array2.");
        System.out.print("array3:   ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
