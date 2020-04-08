package ThucHanh;

import java.util.Scanner;

public class b4_SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;

        System.out.println("The area is: " + area);
    }
}
