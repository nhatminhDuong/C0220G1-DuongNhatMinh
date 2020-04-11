package bai_tap;

import java.util.Scanner;

public class b6_DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar;
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println("The given string: " + str);
        System.out.print("Enter a char to count: ");
        inputChar = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == inputChar) {
                count++;
            }
        }
        if (count <= 1) {
            System.out.print("The char '" + inputChar + "' appears " + count + " time.");
        } else {
            System.out.print("The char '" + inputChar + "' appears " + count + " times.");
        }
    }
}
