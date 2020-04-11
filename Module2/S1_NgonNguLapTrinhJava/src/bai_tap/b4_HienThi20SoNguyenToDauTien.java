package BaiTap;

public class b4_HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        final int n = 20;
        int i = 2;
        int count = 0;

        System.out.println(n + " số nguyên tố đầu tiên:");
        while (count != n) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    static boolean isPrime(int x) {
        if (x < 2) return false;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
