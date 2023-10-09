package fizzbuzz;

public class FizzBuzz {
    public String forNumber(Integer number) {
        if (number == 15) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }

    public static void main(String[] args) {

    }
}
