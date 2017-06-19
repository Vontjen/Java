package be.vdab.oefcursus;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class NumberPyramid {
    public static final int MAX_DEPTH = 8;

    public static void main(String[] args) {

        printPyramid();

    }

    private static void printPyramid() {
        for (int d = 0; d < MAX_DEPTH; d++) {

            for (int s = 0; s < MAX_DEPTH - d; s++) {
                System.out.print("\t");
            }


            for (int w = 0; w <= d; w++) {

                printPowerOf(2, w);

            }
            for (int w = d - 1; w >= 0; w--) {
                printPowerOf(2, w);
            }
            System.out.println();
        }
    }

    public static void printPowerOf(int base, int exponent) {

        int val = (int) Math.pow(base, exponent);
        System.out.print(val + "\t");

    }
}
