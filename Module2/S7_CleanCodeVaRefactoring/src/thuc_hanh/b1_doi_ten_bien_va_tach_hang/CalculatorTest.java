package thuc_hanh.b1_doi_ten_bien_va_tach_hang;

public class CalculatorTest {
    public static void main(String[] args) {
        int sum = Calculator.calculate(5, 55, '+');
        int difference = Calculator.calculate(50, 5, '-');
        int product = Calculator.calculate(2, 500, '*');
//        int quotient = Calculator.calculate(7, 0, '/');
        int quotient = Calculator.calculate(7, 2, '/');

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
    }
}
