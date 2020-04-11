package thuc_hanh;

public class b4_TimGiaTriNhoNhatTrongMangSuDungPhuongThuc {
    public static void main(String[] args) {
        int[] arr = {4, 12, -3, 1, 7, -1, 9};
        System.out.print("Given array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int index = minValue(arr);
        System.out.println("The smallest element in the array is " + arr[index] + ", at position " + index + ".");
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int indexOfMin = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}
