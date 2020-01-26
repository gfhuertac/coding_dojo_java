public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number == 3) {
            return "Fizz";
        } else if (number == 15) {
            return "Buzz";
        } else if (number == 15) {
            return "FizzBuzz";
        } else {
            return Integer.toString(number);
        }
    }
}
