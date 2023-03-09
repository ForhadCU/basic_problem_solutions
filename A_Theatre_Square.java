import java.util.Scanner;

/**
 * A_Theatre_Square
 */
public class A_Theatre_Square {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a = scanner.nextInt();

            double numOfflagstoneForWidth;
            double numOfflagstoneForLength;

            if (n >= 1 && m >= 1 && a >= 1) {
                numOfflagstoneForWidth = Math.ceil((double) n / a);
                numOfflagstoneForLength = Math.ceil((double) m / a);

                // System.out.println((long) numOfflagstoneForWidth);
                // System.out.println((long) numOfflagstoneForLength);
                // System.out.println(numOfflagstoneForLength);

                long numOfflagstoneNeeded = (long) numOfflagstoneForLength * (long) numOfflagstoneForWidth;

                mOutput(numOfflagstoneNeeded);
            }

        }

    }

    private static void mOutput(long i) {
        System.out.println(i);
    }
}