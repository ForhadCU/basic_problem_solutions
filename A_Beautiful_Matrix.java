import java.util.Scanner;

/**
 * A_Beautiful_Matrix
 */
public class A_Beautiful_Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] inputMatrix = new int[5][5];
        int swapCounter;

        // get input
        outer: for (int row = 0; row < inputMatrix.length; row++) {
            inner: for (int column = 0; column < inputMatrix.length; column++) {
                inputMatrix[row][column] = scanner.nextInt();
                if (inputMatrix[row][column] == 1) {

                    // get the position number where 1 is held and 
                    // calculate how many times, the 1 should be swap
                    swapCounter = Math.abs((row + 1) - 3) + Math.abs((column + 1) - 3);
                    mOutput(swapCounter);

                    // terminate outer loop
                    break outer;
                }
            }

        }

    }

    private static void mOutput(int swapCounter) {
        System.out.println(swapCounter);
    }
}