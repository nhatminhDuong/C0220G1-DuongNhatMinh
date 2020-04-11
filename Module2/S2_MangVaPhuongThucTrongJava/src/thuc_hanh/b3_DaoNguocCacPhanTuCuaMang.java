package ThucHanh;

import java.util.Scanner;

public class b3_DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < size / 2; i++) {
            arr[i] = arr[i] ^ arr[size - 1 - i];
            arr[size - 1 - i] = arr[i] ^ arr[size - 1 - i];
            arr[i] = arr[i] ^ arr[size - 1 - i];
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
