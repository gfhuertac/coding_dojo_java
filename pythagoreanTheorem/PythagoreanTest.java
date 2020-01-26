import java.lang.Math;

public class PythagoreanTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        Pythagorean p = new Pythagorean();
        System.out.println(
            "The hypotenuse of a triangle with sides " + a + " and " + b + " is " + p.calculateHypotenuse(a, b)
        );

    }
}