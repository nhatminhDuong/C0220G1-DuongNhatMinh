package ThucHanh;

import java.util.Scanner;

public class b1_TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student: ");
        String inputName = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the student " + inputName + " in the list is: " + (i + 1));
                isFound = true;
                break;
            }
        }
        if (!isFound)
            System.out.println("Not found " + inputName + " in the list.");
    }
}
