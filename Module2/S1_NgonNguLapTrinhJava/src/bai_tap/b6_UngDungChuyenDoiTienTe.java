package BaiTap;

import java.util.Scanner;

public class b6_UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        final int rate = 23000;
        double usd;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD to convert:");
        usd = scanner.nextDouble();
        System.out.println(usd + "$ = " + usd * rate + "vnd");
    }
}
