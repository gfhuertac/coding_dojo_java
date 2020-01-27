import java.util.Arrays;

/**
 * BasicJavaTest
 */
public class BasicJavaTest {

    public static void main(String[] args) {
        BasicJava bj = new BasicJava();
        bj.print1To255();
        bj.printOddNumbers1To255();
        bj.printAccumulativeSum0To255();
        Integer a[] = {1,3,5,7,9,13};
        bj.iterate(a);
        System.out.println(bj.max(a));
        bj.average(new int[]{2, 10, 3});
        int[] on = bj.oddNumbers1To255();
        System.out.println(bj.greaterThanY(on, 127));
        bj.squares(on);
        int[] mix = new int[]{1, 5, 10, -2};
        bj.eliminateNegatives(mix);
        System.out.println(Arrays.toString(mix));
        System.out.println(Arrays.toString(bj.maxMinAvg(mix)));
        System.out.println(Arrays.toString(bj.shift(on)));
    }
}