package thuc_hanh;

import java.util.Scanner;

public class b11_UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();

        System.out.println("Enter number of months: ");
        month = scanner.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();

        double total = money;

        for (int i = 1; i <= month; i++) {
            total = total + total * (interestRate / 100) / 12;
        }

        System.out.println("Total: " + total);
    }
}
