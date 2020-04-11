package thuc_hanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class b7a_SuDungLopArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        b7b_ArrayExample arrayExample = new b7b_ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of any element: ");
        int i;
        try {
            i = scanner.nextInt();
            System.out.print("Value of element at index " + i + " is: " + arr[i]);
        } catch (InputMismatchException e) {
            System.err.println("You did not enter a number!");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Out of range!");
        }
    }
}
