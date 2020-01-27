package coding_dojo_java.puzzling;

import java.util.Arrays;

/**
 * PuzzleJavaTest
 */
public class PuzzleJavaTest {

    public static void main(String[] args) {
        PuzzleJava pj = new PuzzleJava();
        System.out.println(Arrays.toString(pj.puzzle01()));
        System.out.println(Arrays.toString(pj.puzzle02()));
        pj.puzzle03();
        System.out.println(Arrays.toString(pj.puzzle04()));
        System.out.println(Arrays.toString(pj.puzzle05()));
        System.out.println(pj.puzzle06());
        System.out.println(Arrays.toString(pj.puzzle07()));
    }
}