package BaiTap;

import java.util.Arrays;

public class b3_HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        final int n = 100;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);

        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (arr[i]) {
                int j = i + i;
                while (j < n) {
                    arr[j] = false;
                    j += i;
                }
            }
            i++;
        }

        System.out.println("Các số nguyên tố nhỏ hơn " + n + ":");
        for (int k = 2; k < n; k++) {
            if (arr[k]) {
                System.out.print(k + " ");
            }
        }
    }
}
