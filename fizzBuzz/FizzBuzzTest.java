public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.fizzBuzz(3);
        if ("Fizz".equals(result)) {
            System.out.println("OK!");
        } else {
            System.out.println("Not OK :(");
        }
        // or
        assert "Fizz".equals(result);
    }
}
