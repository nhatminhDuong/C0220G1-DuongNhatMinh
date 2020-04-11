package thuc_hanh;

import java.util.Scanner;

public class b8_KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.print("CHECK LEAP YEAR. Enter a year: ");
        year = scanner.nextInt();

        boolean isDividedByFour = (year % 4 == 0);
        boolean isDividedByOneHundred = (year % 100 == 0);
        boolean isDividedByFourHundred = (year % 400 == 0);

        if (isDividedByFourHundred || (isDividedByFour && !isDividedByOneHundred)) {
            System.out.printf(year + " is a leap year.");
        } else {
            System.out.printf(year + " is not a leap year.");
        }
    }
}
