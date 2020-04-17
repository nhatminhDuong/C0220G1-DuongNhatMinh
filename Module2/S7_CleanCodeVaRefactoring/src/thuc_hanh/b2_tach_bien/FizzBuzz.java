package thuc_hanh.b2_tach_bien;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        String output = number + "";

        if (isFizz) output += "Fizz";
        if (isBuzz) output += "Buzz";

        return output;
    }
}
